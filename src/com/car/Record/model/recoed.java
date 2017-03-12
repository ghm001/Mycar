/**
 * 
 */
package com.car.Record.model;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午5:49:00 
 */
public class recoed {

private int id;
private int userId;
//消费类型
private String cumType;
//消费金额
private String cumTime;
//消费时间
private int cumMoney;
/**
 * @param id
 * @param userId
 * @param cumType
 * @param cumTime
 * @param cumMoney
 */
public recoed(int id, int userId, String cumType, String cumTime, int cumMoney) {
	super();
	this.id = id;
	this.userId = userId;
	this.cumType = cumType;
	this.cumTime = cumTime;
	this.cumMoney = cumMoney;
}
/**
 * 
 */
public recoed() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getCumType() {
	return cumType;
}
public void setCumType(String cumType) {
	this.cumType = cumType;
}
public String getCumTime() {
	return cumTime;
}
public void setCumTime(String cumTime) {
	this.cumTime = cumTime;
}
public int getCumMoney() {
	return cumMoney;
}
public void setCumMoney(int cumMoney) {
	this.cumMoney = cumMoney;
}




}
