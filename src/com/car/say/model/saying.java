/**
 * 
 */
package com.car.say.model;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:34:15 
 */
public class saying {
	private int id;
	private int userid;
	private String url2;
	private String url3;
	private String url4;
	private String url5;
	private String url1;
	private String url6;
	private String time;
	private String description;
	/**
	 * @param id
	 * @param userid
	 * @param url2
	 * @param url3
	 * @param url4
	 * @param url5
	 * @param url1
	 * @param url6
	 * @param time
	 * @param description
	 */
	public saying(int id, int userid, String url2, String url3, String url4,
			String url5, String url1, String url6, String time,
			String description) {
		super();
		this.id = id;
		this.userid = userid;
		this.url2 = url2;
		this.url3 = url3;
		this.url4 = url4;
		this.url5 = url5;
		this.url1 = url1;
		this.url6 = url6;
		this.time = time;
		this.description = description;
	}
	/**
	 * 
	 */
	public saying() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUrl2() {
		return url2;
	}
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	public String getUrl3() {
		return url3;
	}
	public void setUrl3(String url3) {
		this.url3 = url3;
	}
	public String getUrl4() {
		return url4;
	}
	public void setUrl4(String url4) {
		this.url4 = url4;
	}
	public String getUrl5() {
		return url5;
	}
	public void setUrl5(String url5) {
		this.url5 = url5;
	}
	public String getUrl1() {
		return url1;
	}
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
	public String getUrl6() {
		return url6;
	}
	public void setUrl6(String url6) {
		this.url6 = url6;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
