package com.douzone.dto;

public class CalendarDto {
	
	private String name;
	private String id;
	private long user_no;
	private long commute_no;
	private String day;
	private String commute; //출퇴근코드
	private String state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getUser_no() {
		return user_no;
	}
	public void setUser_no(long user_no) {
		this.user_no = user_no;
	}
	public long getCommute_no() {
		return commute_no;
	}
	public void setCommute_no(long commute_no) {
		this.commute_no = commute_no;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getCommute() {
		return commute;
	}
	public void setCommute(String commute) {
		this.commute = commute;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "CalendarDto [name=" + name + ", id=" + id + ", user_no=" + user_no + ", commute_no=" + commute_no
				+ ", day=" + day + ", commute=" + commute + ", state=" + state + "]";
	} 

	

}
