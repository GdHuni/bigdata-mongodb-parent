package com.leyoujia.analytics.modle;

import java.io.Serializable;

/**
 * yeconglin on 2015/8/21 13:48
 */
public class MobInfo implements Serializable {

    //手机设备码
    public String uDID;
    //用户ID
    public String distinct_id;
    //手机品牌
    public String mobileBrand;
    //手机型号
    public String mobileModel;
    //版本号
    public String versionsCode;
    //联网模式
    public String network_type;
    //网络供应商
    public String carriers;
    //经度
    public String longitude;
    //纬度
    public String latitude;
    //来源渠道
    public String channel;
    //手机号码
    public String PHONE;
    //浏览器名称
    public String BROWSER;
    //IP地址
    public String REMOTEADDRESS;
    //手机操作系统
    public String USER_AGENT;

//    private static final long serialVersionUID = 1L;
//    private String uuid;//	手机IMEI/MEID（唯一标示）
//    private String userId;//	注册ID或帐户名
//    private String mobileNo;//	用户手机号
//    private String mobileModel;//	设备终端（iPhone 5、HTC、iPad air等）
//    private String mobileBrand;//手机品牌
//    private String area;//地域
//    private String longitude;//	经度
//    private String latitude;//	X坐标值
//    private String source;//	渠道来源【百度/360】
//    private String versionsCode;//	版本号
//
//    private String oSType;//	操作系统类型 1.android 2ios3.windws
//    private String oSVersion;//	操作系统版本
//    private String buildNo;//	建置版本号 --android 不传
//    private String jailbroken;//	是否越狱设备 --android 不传
//    private String space;//设备存储空间
//    private String proximity;//	是否使用代理
//    private String bundleIdentifier;//	应用ID --android为包名
//    private String appName;//应用名称
//    private String deviceToken;//设备Token--android 不传.
//    private String network;//联网方式:wifi 3g 4g
//    private String carriers;//运营商
//
//
//    public MobInfo() {
//        super();
//    }
//
//
//
//    public String getMobileBrand() {
//        return mobileBrand;
//    }
//
//    public void setMobileBrand(String mobileBrand) {
//        this.mobileBrand = mobileBrand;
//    }
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public String getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getMobileNo() {
//        return mobileNo;
//    }
//
//    public void setMobileNo(String mobileNo) {
//        this.mobileNo = mobileNo;
//    }
//
//    public String getMobileModel() {
//        return mobileModel;
//    }
//
//    public void setMobileModel(String mobileModel) {
//        this.mobileModel = mobileModel;
//    }
//
//    public String getArea() {
//        return area;
//    }
//
//    public void setArea(String area) {
//        this.area = area;
//    }
//
//    public String getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(String longitude) {
//        this.longitude = longitude;
//    }
//
//    public String getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(String latitude) {
//        this.latitude = latitude;
//    }
//
//    public String getSource() {
//        return source;
//    }
//
//    public void setSource(String source) {
//        this.source = source;
//    }
//
//    public String getVersionsCode() {
//        return versionsCode;
//    }
//
//    public void setVersionsCode(String versionsCode) {
//        this.versionsCode = versionsCode;
//    }
//
//    public String getoSType() {
//        return oSType;
//    }
//
//    public void setoSType(String oSType) {
//        this.oSType = oSType;
//    }
//
//    public String getoSVersion() {
//        return oSVersion;
//    }
//
//    public void setoSVersion(String oSVersion) {
//        this.oSVersion = oSVersion;
//    }
//
//    public String getBuildNo() {
//        return buildNo;
//    }
//
//    public void setBuildNo(String buildNo) {
//        this.buildNo = buildNo;
//    }
//
//    public String getJailbroken() {
//        return jailbroken;
//    }
//
//    public void setJailbroken(String jailbroken) {
//        this.jailbroken = jailbroken;
//    }
//
//    public String getSpace() {
//        return space;
//    }
//
//    public void setSpace(String space) {
//        this.space = space;
//    }
//
//    public String getProximity() {
//        return proximity;
//    }
//
//    public void setProximity(String proximity) {
//        this.proximity = proximity;
//    }
//
//    public String getBundleIdentifier() {
//        return bundleIdentifier;
//    }
//
//    public void setBundleIdentifier(String bundleIdentifier) {
//        this.bundleIdentifier = bundleIdentifier;
//    }
//
//    public String getAppName() {
//        return appName;
//    }
//
//    public void setAppName(String appName) {
//        this.appName = appName;
//    }
//
//    public String getDeviceToken() {
//        return deviceToken;
//    }
//
//    public void setDeviceToken(String deviceToken) {
//        this.deviceToken = deviceToken;
//    }
//
//    public String getNetwork() {
//        return network;
//    }
//
//    public void setNetwork(String network) {
//        this.network = network;
//    }
//
//    public String getCarriers() {
//        return carriers;
//    }
//
//    public void setCarriers(String carriers) {
//        this.carriers = carriers;
//    }
}
