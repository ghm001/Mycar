/**
 * 
 */
package com.car.user.model;

/**
 * @author gaohongming
 * 创建时间：2017年2月13日 下午2:37:36 
 */
public class userinfo {
	private int id;
	//用户账号
	private String username;
	//用户昵称
	private String nickName;
	//用户密码
	private String passWord;
	//用户生日
	private String birthday;
	//用户电话号码
	private String phoneNumber;
	//用户qq号
	private String qq;
	//用户性别
	private String sex;
	//用户新浪账号
	private String Sina;
	//用户地址
	private String address;
	//用户邮箱
	private String email;
	//用户头像地址
	private String headImageUrl;
	//用户登陆状态0代表未登录，1代表已经登陆
	private int loginflag;
	//用户最后一次的登陆时间
	private String time;
	//用户最新的动态的id
	private int dynamicId;
	//用户最新的故障id
	private int faultId;
	//用户最新的订单id
	private int orderid;
	//用户的最新的服务id
	private int serviceid;
	//用户的标志1代表用户2代表商家0代表还未进行填写
	private int flag;
	//用户的车辆id
	private int carid;
	public userinfo() {
		super();
	}
	/**
	 * @param id
	 * @param username
	 * @param nickName
	 * @param passWord
	 * @param birthday
	 * @param phoneNumber
	 * @param qq
	 * @param sex
	 * @param sina
	 * @param address
	 * @param email
	 * @param headImageUrl
	 * @param loginflag
	 * @param time
	 * @param dynamicId
	 * @param faultId
	 * @param orderid
	 * @param serviceid
	 * @param flag
	 */
	public userinfo(int id, String username, String nickName, String passWord,
			String birthday, String phoneNumber, String qq, String sex,
			String sina, String address, String email, String headImageUrl,
			int loginflag, String time, int dynamicId, int faultId,
			int orderid, int serviceid, int flag,int carid) {
		super();
		this.id = id;
		this.username = username;
		this.nickName = nickName;
		this.passWord = passWord;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.qq = qq;
		this.sex = sex;
		Sina = sina;
		this.address = address;
		this.email = email;
		this.headImageUrl = headImageUrl;
		this.loginflag = loginflag;
		this.time = time;
		this.dynamicId = dynamicId;
		this.faultId = faultId;
		this.orderid = orderid;
		this.serviceid = serviceid;
		this.flag = flag;
		this.carid=carid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSina() {
		return Sina;
	}
	public void setSina(String sina) {
		Sina = sina;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHeadImageUrl() {
		return headImageUrl;
	}
	public void setHeadImageUrl(String headImageUrl) {
		this.headImageUrl = headImageUrl;
	}
	public int getLoginflag() {
		return loginflag;
	}
	public void setLoginflag(int loginflag) {
		this.loginflag = loginflag;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getDynamicId() {
		return dynamicId;
	}
	public void setDynamicId(int dynamicId) {
		this.dynamicId = dynamicId;
	}
	public int getFaultId() {
		return faultId;
	}
	public void setFaultId(int faultId) {
		this.faultId = faultId;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "userinfo{" +
                "id=" + id +
                ", username=" + username +
                ", nickName=" + nickName +
                ", passWord='" + passWord + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", qq=" + qq +
                ", sex=" + sex +
                ", Sina='" + Sina + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", headImageUrl='" + headImageUrl + '\'' +
                ", loginflag=" + loginflag +
                ", dynamicId=" + dynamicId +
                ", faultId=" + faultId +
                ", orderid=" + orderid +
                ", serviceid=" + serviceid +
                ", time=" + time +
                ", flag="+flag+
                ", carid="+carid+
                '}';
	}
}
