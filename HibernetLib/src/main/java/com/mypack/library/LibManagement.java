package com.mypack.library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibManagement {

	@Id
	private int mId;
	@Column
	private String memName;
	@Column
	private String btitle;
	@Column 
	private String authName;
	public int getmId()
	{
		return mId;
	}
	//getter setter
	public int getId()
	{
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	
	
}
