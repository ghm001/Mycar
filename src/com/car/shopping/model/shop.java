/**
 * 
 */
package com.car.shopping.model;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午6:00:35 
 */
public class shop {

	private int id;
	private int userId;
	
	//商品名称
	private String shopName;
	//商品详情
	private String shopDetail;
	//商品价格
	private String shopMoney;
	//商品数量
	private String shopNum;
	//订单时间
	private String shopTime;
	/**
	 * @param id
	 * @param userId
	 * @param shopName
	 * @param shopDetail
	 * @param shopMoney
	 * @param shopNum
	 * @param shopTime
	 */
	public shop(int id, int userId, String shopName, String shopDetail,
			String shopMoney, String shopNum, String shopTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.shopName = shopName;
		this.shopDetail = shopDetail;
		this.shopMoney = shopMoney;
		this.shopNum = shopNum;
		this.shopTime = shopTime;
	}
	/**
	 * 
	 */
	public shop() {
		super();
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
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopDetail() {
		return shopDetail;
	}
	public void setShopDetail(String shopDetail) {
		this.shopDetail = shopDetail;
	}
	public String getShopMoney() {
		return shopMoney;
	}
	public void setShopMoney(String shopMoney) {
		this.shopMoney = shopMoney;
	}
	public String getShopNum() {
		return shopNum;
	}
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}
	public String getShopTime() {
		return shopTime;
	}
	public void setShopTime(String shopTime) {
		this.shopTime = shopTime;
	}
	
}
