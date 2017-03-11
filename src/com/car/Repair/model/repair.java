/**
 * 
 */
package com.car.Repair.model;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午5:56:59 
 */
public class repair {
	private int id;
	private int userId;
	//订单状态
	private int orderState;
	//商店logo
	private String shopIconUrl;
	//商店名称
	private String shopName;
	//商店地址
	private String shopAddress;
	//服务类型
	private String shopType;
	//订单时间
	private String orderTime;
	//订单金额
	private int money;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
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
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public String getShopIconUrl() {
		return shopIconUrl;
	}
	public void setShopIconUrl(String shopIconUrl) {
		this.shopIconUrl = shopIconUrl;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	/**
	 * @param id
	 * @param userId
	 * @param orderState
	 * @param shopIconUrl
	 * @param shopName
	 * @param shopAddress
	 * @param shopType
	 * @param orderTime
	 * @param money
	 */
	public repair(int id, int userId, int orderState, String shopIconUrl,
			String shopName, String shopAddress, String shopType,
			String orderTime, int money) {
		super();
		this.id = id;
		this.userId = userId;
		this.orderState = orderState;
		this.shopIconUrl = shopIconUrl;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopType = shopType;
		this.orderTime = orderTime;
		this.money = money;
	}
	/**
	 * 
	 */
	public repair() {
		super();
	}
	
}
