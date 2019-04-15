package com.douzone.smartchecker.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.userdetails.UserDetails;


@Entity
@Table(name = "t_user")
public class UserVo {
	
	@Column(name="user_no", nullable = false, unique = true)
	private long no;
	
	
	@Id
	@NotEmpty
	@Length(min= 2,max=8)
	@Column(name="id", nullable = false, unique = true)
	private String username;
	
	@NotEmpty
	@Length(min= 2,max=8)
	@Column(name="name", nullable = false, unique = true)
	private String name;
	
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String role;
	private String updateTime;
	private String insertTime;
	private String updateUserId;
	private String insertUserId;
	
	 public UserVo() {
	    }

	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	public String getInsertUserId() {
		return insertUserId;
	}
	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId;
	}
	@Override
	public String toString() {
		return "UserVo [no=" + no + ", username=" + username + ", name=" + name + ", password=" + password + ", role="
				+ role + ", updateTime=" + updateTime + ", insertTime=" + insertTime + ", updateUserId=" + updateUserId
				+ ", insertUserId=" + insertUserId + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

	
	
}
