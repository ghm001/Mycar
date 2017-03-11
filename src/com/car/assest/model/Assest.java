/**
 * 
 */
package com.car.assest.model;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:51:28 
 */
public class Assest {
	private int id;
	private int userId;
	//修理花费
	private int carRepair;
	//保养花费
	private int carMaintain;
	//保险花费
	private int carInsurance;
	//所有的花费
	private int allmoney;
	//购物花费
	private int shopping;
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
	public int getCarRepair() {
		return carRepair;
	}
	public void setCarRepair(int carRepair) {
		this.carRepair = carRepair;
	}
	public int getCarMaintain() {
		return carMaintain;
	}
	public void setCarMaintain(int carMaintain) {
		this.carMaintain = carMaintain;
	}
	public int getCarInsurance() {
		return carInsurance;
	}
	public void setCarInsurance(int carInsurance) {
		this.carInsurance = carInsurance;
	}
	public int getAllmoney() {
		return allmoney;
	}
	public void setAllmoney(int allmoney) {
		this.allmoney = allmoney;
	}
	public int getShopping() {
		return shopping;
	}
	public void setShopping(int shopping) {
		this.shopping = shopping;
	}
	/**
	 * @param id
	 * @param userId
	 * @param carRepair
	 * @param carMaintain
	 * @param carInsurance
	 * @param allmoney
	 * @param shopping
	 */
	public Assest(int id, int userId, int carRepair, int carMaintain,
			int carInsurance, int allmoney, int shopping) {
		super();
		this.id = id;
		this.userId = userId;
		this.carRepair = carRepair;
		this.carMaintain = carMaintain;
		this.carInsurance = carInsurance;
		this.allmoney = allmoney;
		this.shopping = shopping;
	}
	/**
	 * 
	 */
	public Assest() {
		super();
	}
	
	

}
