package com.douzone.smartchecker.exception;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.douzone.dto.JSONResult;
import com.fasterxml.jackson.databind.ObjectMapper;


//@Slf4j lombok
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Log LOG = LogFactory.getLog( GlobalExceptionHandler.class );
	
	@ExceptionHandler(Exception.class)
	public void handlerException(HttpServletRequest request,HttpServletResponse response,Exception e) throws Exception {
		
		//1.로깅 작업
		//errors를 string 으로 바꾸는 작업 printwriter 연결이 메모리로 되있음.
		StringWriter errors = new StringWriter();
		e.printStackTrace(new PrintWriter(errors));
		//System.out.println(errors.toString());
		
		
		//서비스할때는 log 찍어줘야함 -> 에러내용 파일저장
		LOG.error(errors.toString());
		
		
		
		//2.시스템 오류 안내 화면 
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("errors",errors.toString());
//		mav.setViewName("error/exception");
//		
//		return mav;
		
		String accept = request.getHeader("accept");
		if(accept.matches(".*application/json.*")) {
			//json 응답
			response.setStatus(HttpServletResponse.SC_OK);
		    //get Writer 로 써도 됨. 예시라서 outputstream 으로
			OutputStream out = response.getOutputStream();
			JSONResult jsonResult = JSONResult.fail(errors.toString());
			
			out.write(new ObjectMapper().writeValueAsString(jsonResult).getBytes("utf-8"));
			out.flush();
			out.close();
			
		}else {
			//html 응답
			request.setAttribute("uri", request.getRequestURI());
			request.setAttribute("exception", errors.toString());
				request.getRequestDispatcher("/WEB-INF/views/error/exception.jsp").forward(request, response);
		}
	}
	
	
}
