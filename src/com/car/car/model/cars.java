/**
 * 
 */
package com.car.car.model;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:26:29 
 */
public class cars {
	/**
	 * 
	 */
	public cars() {
		super();
	}
	/**
	 * @param id
	 * @param carNumber
	 * @param carId
	 * @param carIconUrl
	 * @param carFrameNum
	 * @param carEngineNum
	 * @param time
	 * @param carBrand
	 * @param carSpecificModel
	 * @param nickNameid
	 */
	public cars(int id, String carNumber, int carId, String carIconUrl,
			String carFrameNum, String carEngineNum, String time,
			String carBrand, String carSpecificModel, int nickNameid) {
		super();
		this.id = id;
		this.carNumber = carNumber;
		this.carId = carId;
		this.carIconUrl = carIconUrl;
		this.carFrameNum = carFrameNum;
		this.carEngineNum = carEngineNum;
		this.time = time;
		this.carBrand = carBrand;
		this.carSpecificModel = carSpecificModel;
		this.nickNameid = nickNameid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarIconUrl() {
		return carIconUrl;
	}
	public void setCarIconUrl(String carIconUrl) {
		this.carIconUrl = carIconUrl;
	}
	public String getCarFrameNum() {
		return carFrameNum;
	}
	public void setCarFrameNum(String carFrameNum) {
		this.carFrameNum = carFrameNum;
	}
	public String getCarEngineNum() {
		return carEngineNum;
	}
	public void setCarEngineNum(String carEngineNum) {
		this.carEngineNum = carEngineNum;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarSpecificModel() {
		return carSpecificModel;
	}
	public void setCarSpecificModel(String carSpecificModel) {
		this.carSpecificModel = carSpecificModel;
	}
	public int getNickNameid() {
		return nickNameid;
	}
	public void setNickNameid(int nickNameid) {
		this.nickNameid = nickNameid;
	}
	//记录的id号
	private int id;
	//车牌号
	private String carNumber;
	//车主的第几辆车
	private int carId;
	//用户的车的图标地址
	private String carIconUrl;
	//当前车辆的车架号
	private String carFrameNum;
	//发动机号
	private String carEngineNum;
	//注册日期
	private String time;
	//车品牌
	private String carBrand;
	//具体车型
	private String carSpecificModel;
	//用户的id
	private int nickNameid;

}
