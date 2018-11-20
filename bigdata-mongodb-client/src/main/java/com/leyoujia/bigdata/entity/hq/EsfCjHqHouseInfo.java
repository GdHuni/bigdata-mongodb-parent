package com.leyoujia.bigdata.entity.hq;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;
import com.leyoujia.bigdata.util.CalculationUtils;
import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 成交楼盘信息表
 * User: 谢银艳
 * Date: 15-03-01
 */
public class EsfCjHqHouseInfo extends BaseQueryBean {
    private static final long serialVersionUID = 5487519684734735469L;
    /** id*/
    private Integer id;
    /** 楼盘ID*/
    private Integer lpId;
    /** 楼盘名称*/
    private String lpName;
    /** 楼盘名称首字母拼音*/
    private String lpNameSpell;
    /** 楼盘名称全拼拼音*/
    private String lpNameFull;
    /** 房源ID*/
    private Integer fyID;
    /** 房源名称*/
    private String fyName;
    /** 房号ID*/
    private Integer fhId;
    /** 房源编号*/
    private String houseNo;
    /** 城市编码*/
    private String cityCode;
    /** 区域编码*/
    private String areaCode;
    /** 片区编码*/
    private String placeCode;
    /** 城市名称*/
    private String cityName; 
    /** 区域名称*/
    private String areaName;
    /** 片区名称*/
    private String placeName;
    /** 图片路径*/
    private String imgUrl;
    /** 标题*/
    private String title;
    /** 室*/
    private Integer room;
    /** 厅*/
    private Integer hall;
    /** 卫*/
    private Integer toilet;
    /** 挂牌价（登盘价）*/
    private Double salePrice;
    /** 建筑面积*/
    private Double buildArea;
    /** 朝向*/
    private Integer forword;
    /** 总楼层*/
    private Integer totalFloor;
    /** 楼层*/
    private Integer floor;
    /** 装修情况*/
    private Integer fitment;
    /** 户型结构（建造类型）*/
    private Integer structure;
    /** 标签（可上网，拎包入住）*/
    private String tags;
    /** 建造年代*/
    private Date houseBuildTime;
    /** 登盘时间*/
    private Date regDate;
    /** 是否有地铁*/
    private Integer isDitie;
    /**楼盘地址 */
    private String comAddr;
    /** */
    private String comLng;
    /** */
    private String comLat;
    /** 装修名称*/
    private String fitmentName; 
    /** 朝向名称*/
    private String forwordName; 
    
    /**
     * 成交信息
     */
    /** 成交信息表Id*/
    private String cjId;
    /** 成交时间*/
    private Date cjDate;
    /** 成交天数*/
    private Integer cjDays;
    /** 成交套数*/
    private Integer cjCount;
    /** 成交价*/
    private Double cjPrice;
    /** 成交单价*/
    private Double cjUnitPrice;
    /** 成交经纪人ID*/
    private String cjWId;
    /** 成交经纪人*/
    private String cjWName;
    /** 成交经纪人电话*/
    private String cjWPhone;
    /** 成交数据来源（乐有家内部系统，国土局）*/
    private String cjType;
    /** 产权性质*/
    private Integer cqXz;
    
    public String getComLng() {
		return comLng;
	}
	public void setComLng(String comLng) {
		this.comLng = comLng;
	}
	
	public String getComLat() {
		return comLat;
	}
	public void setComLat(String comLat) {
		this.comLat = comLat;
	}
	public Integer getCjCount() {
		return cjCount;
	}
	public void setCjCount(Integer cjCount) {
		this.cjCount = cjCount;
	}
	/**
     * 
     * 搜索字段
     */
	/** 关键字搜索*/
    private String context;
    /** 最小面积*/
    private double minBuild;
    /** 最大面积*/
    private double maxBuild;
    /** */
    private String urlNum;
    /** */
	private String urlStr;
	/** 房龄搜索*/
	private Integer houseAge;
	/** 起始房龄*/
	private Date houseAgeBegin;	
	/** 终止房龄*/
	private Date houseAgeEnd;	
	/** 排序字段  1，成交日期降序；2，成交日期升序；3，总价升序；4总价降序；5单价升序；6，总价降序；默认日期降序*/
	private Integer sortType = 1;	
	private int tjType;
	/** 搜索范围*/
	private int searchArea; 
	/** 查询结束日期*/
	private String cjDateEnd;
	/** 查询开始日期*/
	private String cjDateStart;
	/** */
	private double minPrice;
	/** */
	private double maxPrice;
	/** */
	private String esfUrlStr;
	/** 是否登录，未登录只能获取三个月前数据，1未登录，2已登录*/
	private Integer isLogin = 1;
	
	public Integer getIsLogin() {
		return isLogin;
	}
	public void setIsLogin(Integer isLogin) {
		this.isLogin = isLogin;
	}
	public double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}
	public double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Integer getSortType() {
		return sortType;
	}
	public void setSortType(Integer sortType) {
		this.sortType = sortType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLpId() {
		return lpId;
	}
	public void setLpId(Integer lpId) {
		this.lpId = lpId;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
	public String getLpNameSpell() {
		return lpNameSpell;
	}
	public void setLpNameSpell(String lpNameSpell) {
		this.lpNameSpell = lpNameSpell;
	}
	public String getLpNameFull() {
		return lpNameFull;
	}
	public void setLpNameFull(String lpNameFull) {
		this.lpNameFull = lpNameFull;
	}
	public Integer getFyID() {
		return fyID;
	}
	public void setFyID(Integer fyID) {
		this.fyID = fyID;
	}
	public String getFyName() {
		return fyName;
	}
	public void setFyName(String fyName) {
		this.fyName = fyName;
	}
	
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPlaceCode() {
		return placeCode;
	}
	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	public Integer getHall() {
		return hall;
	}
	public void setHall(Integer hall) {
		this.hall = hall;
	}
	public Integer getToilet() {
		return toilet;
	}
	public void setToilet(Integer toilet) {
		this.toilet = toilet;
	}
	public Double getSalePrice() {
		if(cjPrice != null && cjPrice > 50000){
			if((salePrice == null || salePrice < 0) || (CalculationUtils.div(salePrice*10000,cjPrice,2) > 1.5)
					|| (CalculationUtils.div(salePrice*10000,cjPrice,2) < 0.5)){
				salePrice = CalculationUtils.div((cjPrice - 50000),10000,1);
			}
		}
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	public Double getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(Double buildArea) {
		this.buildArea = buildArea;
	}
	public Integer getForword() {
		return forword;
	}
	public void setForword(Integer forword) {
		this.forword = forword;
	}
	public String getForwordStr(){
    	String value = "";
		if (null != forword){
			switch (forword) {
			case 1:
				value = "朝东";
				break;
			case 2:
				value = "朝南";
				break;
			case 3:
				value = "朝西";
				break;
			case 4:
				value = "朝北";
				break;
			case 5:
				value = "东南";
				break;
			case 6:
				value = "东北";
				break;
			case 7:
				value = "西南";
				break;
			case 8:
				value = "西北";
				break;
			case 9:
				value = "南北通透";
				break;
			case 10:
				value = "东西向";
				break;
			default:
				value = "";
				break;
			}
		}
		return value;
    }
	public Integer getTotalFloor() {
		return totalFloor;
	}
	public void setTotalFloor(Integer totalFloor) {
		this.totalFloor = totalFloor;
	}
	public Integer getFloor() {
		if (floor == null){
			return 0;
		}
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	public String getFloorStr() {
		if(totalFloor != null && floor != null){
			float tempFloor = totalFloor;
			if (tempFloor <= 3) {
				return "低楼层";
			} else if ((floor / tempFloor) <= (1 / 3F)) {
				return "低楼层";
			} else if ((floor / tempFloor) > (1 / 3F) && (floor / tempFloor) <= (2 / 3F)) {
				return "中楼层";
			} else if ((floor / tempFloor) > (2 / 3F)) {
				return "高楼层";
			}
		}
		return "";
	}
	
	public String getFloorValue(){
		String value = "-";
		if(totalFloor == null || floor == null){
			value = "-";
		}else if(totalFloor <= 13){
			if(floor <= 3){
				value = "低楼层";
			}else if(floor <= 6){
				value = "中楼层";
			}else{
				value = "高楼层";
			}
		}else if(totalFloor > 13){
			if(floor <= 5){
				value = "低楼层";
			}else if(floor <= 9){
				value = "中楼层";
			}else{
				value = "高楼层";
			}
		}
		return value;
	}
	
	public List<String> getTagVals() {
        if (StringUtils.isEmpty(tags)) {
            return null;
        }
        List<String> list = new ArrayList<String>();
        if (StringUtils.contains(tags, ";")) {
            String[] strs = StringUtils.split(tags, ";");
            for (String tt : strs) {
                list.add(tt);
            }
        } else {
            list.add(tags);
        }
        return list;
    }
	
	public Integer getFitment() {
		return fitment;
	}
	public void setFitment(Integer fitment) {
		this.fitment = fitment;
	}
    public String getFitmentStr(){
    	String value = "";
		if (null != fitment){
			switch (fitment) {
			case 1:
				value = "毛坯";
				break;
			case 2:
				value = "普装";
				break;
			case 3:
				value = "简装";
				break;
			case 4:
				value = "精装";
				break;
			case 5:
				value = "豪装";
				break;
			default:
				value = "";
				break;
			}
		}
		return value;
    }
	public Integer getStructure() {
		return structure;
	}
	public void setStructure(Integer structure) {
		this.structure = structure;
	}
	public int getTjType() {
		return tjType;
	}
	public void setTjType(int tjType) {
		this.tjType = tjType;
	}
	
	public int getSearchArea() {
		return searchArea;
	}
	public void setSearchArea(int searchArea) {
		this.searchArea = searchArea;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Date getHouseBuildTime() {
		return houseBuildTime;
	}
	public void setHouseBuildTime(Date houseBuildTime) {
		this.houseBuildTime = houseBuildTime;
	}
	public String getHouseBuildYear() {
		String result = "";
		if(houseBuildTime != null){
			try{
				result = new SimpleDateFormat("yyyy").format(houseBuildTime);
			}catch(Exception e){
				result = "";
			}
		}
		return result;
	}
	public String getFromCjDate() {
		if(cjDate != null){
			Calendar now = Calendar.getInstance();  
			now.setTime(new Date());
			Calendar befor = Calendar.getInstance(); 
			befor.setTime(cjDate);
			long time1 = now.getTimeInMillis();                   
	        long time2 = befor.getTimeInMillis();         
	        long between_days=(time1-time2)/(1000*3600*24);  
			return between_days+"";
		}
		return null;
	}
	public Date getRegDate() {
		int days = (cjDays == null || cjDays < 1) ? 30 : cjDays;
		if((regDate == null && cjDate != null) || (regDate != null && cjDate != null && regDate.compareTo(cjDate) >= 0)){
			Calendar now = Calendar.getInstance();  
			now.setTime(cjDate);
			now.set(Calendar.DATE,now.get(Calendar.DATE)-days);
			regDate = now.getTime();
		}
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Integer getIsDitie() {
		return isDitie;
	}
	public void setIsDitie(Integer isDitie) {
		this.isDitie = isDitie;
	}
	public String getComAddr() {
		return comAddr;
	}
	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}
	
	public Double getCjPrice() {
		return cjPrice;
	}
	public void setCjPrice(Double cjPrice) {
		this.cjPrice = cjPrice;
	}
	public Double getCjPriceShow() {
		Double result = 0.0;
		if(cjPrice != null){
			result = CalculationUtils.div(cjPrice, 10000, 1);
		}
		return result;
	}
	public String getCjWPhone() {
		return cjWPhone;
	}
	public void setCjWPhone(String cjWPhone) {
		this.cjWPhone = cjWPhone;
	}
	public String getCjType() {
		return cjType;
	}
	public void setCjType(String cjType) {
		this.cjType = cjType;
	}
	public Integer getCqXz() {
		return cqXz;
	}
	public void setCqXz(Integer cqXz) {
		this.cqXz = cqXz;
	}
	public String getCjId() {
		return cjId;
	}
	public void setCjId(String cjId) {
		this.cjId = cjId;
	}
	public Date getCjDate() {
		return cjDate;
	}
	public void setCjDate(Date cjDate) {
		this.cjDate = cjDate;
	}
	public String getCjDateStr() {
		String result = "";
		if(cjDate != null){
			try{
				result = new SimpleDateFormat("yyyy-MM-dd").format(cjDate);
			}catch(Exception e){
				result = "";
			}
		}
		return result;
	}
	public void setCjDateEnd(String cjDateEnd) {
		this.cjDateEnd = cjDateEnd;
	}
	public String getCjDateEnd() {
		return cjDateEnd;
	}
	public Integer getCjDays() {
		if (cjDays == null || cjDays < 1){
			if(cjDate != null){
				Calendar now = Calendar.getInstance();  
				now.setTime(cjDate);
				Calendar befor = Calendar.getInstance(); 
				befor.setTime(getRegDate());
				long time1 = now.getTimeInMillis();                   
		        long time2 = befor.getTimeInMillis();         
		        long between_days=(time1-time2)/(1000*3600*24);
		        if((time1-time2)%(1000*3600*24) > 0){
		        	between_days = between_days+1;
		        }
				return (int)between_days;
			}
			return 37;
		}
		return cjDays;
	}
	public void setCjDays(Integer cjDays) {
		this.cjDays = cjDays;
	}
	public Double getCjUnitPrice() {
		return cjUnitPrice;
	}
	public void setCjUnitPrice(Double cjUnitPrice) {
		this.cjUnitPrice = cjUnitPrice;
	}
	public String getCjWId() {
		return cjWId;
	}
	public void setCjWId(String cjWId) {
		this.cjWId = cjWId;
	}
	public String getCjWName() {
		return cjWName;
	}
	public void setCjWName(String cjWName) {
		this.cjWName = cjWName;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	public double getMinBuild() {
		return minBuild;
	}
	public void setMinBuild(double minBuild) {
		this.minBuild = minBuild;
	}
	public double getMaxBuild() {
		return maxBuild;
	}
	public void setMaxBuild(double maxBuild) {
		this.maxBuild = maxBuild;
	}
	public Integer getBuildNum(){
		Integer buildNum = null;
		if(minBuild < 50 && maxBuild == 50){
			buildNum = 1;
		}else if(minBuild == 50 && maxBuild == 70){
			buildNum = 2;
		}else if(minBuild == 70 && maxBuild == 90){
			buildNum = 3;
		}else if(minBuild == 90 && maxBuild == 110){
			buildNum = 4;
		}else if(minBuild == 110 && maxBuild == 130){
			buildNum = 5;
		}else if(minBuild == 130 && maxBuild == 150){
			buildNum = 6;
		}else if(minBuild == 150 && maxBuild == 200){
			buildNum = 7;
		}else if(minBuild == 200 && maxBuild > 200){
			buildNum = 8;
		}
		return buildNum;
	}
	public String getUrlNum() {
		return urlNum;
	}
	public void setUrlNum(String urlNum) {
		this.urlNum = urlNum;
	}
	public String getUrlStr() {
		return urlStr;
	}
	public void setUrlStr(String urlStr) {
		this.urlStr = urlStr;
	}
	public Integer getHouseAge() {
		return houseAge;
	}
	public void setHouseAge(Integer houseAge) {
		this.houseAge = houseAge;
		int bAge = 0;
		int eAge = 0;
		if(houseAge == 1){
			bAge = 0;
			eAge = 2;
		}
		if(houseAge == 2){
			bAge = 2;
			eAge = 5;
		}
		if(houseAge == 3){
			bAge = 5;
			eAge = 10;
		}
		if(houseAge == 4){
			bAge = 10;
			eAge = 1000;
		}
		Calendar minNow = Calendar.getInstance();
		Calendar maxNow = Calendar.getInstance();
		maxNow.setTime(new Date());
		maxNow.add(Calendar.YEAR, -bAge);
		
		minNow.setTime(new Date());
		minNow.add(Calendar.YEAR, -eAge);
		this.setHouseAgeBegin(minNow.getTime());
		this.setHouseAgeEnd(maxNow.getTime());
		
	}
	public Date getHouseAgeBegin() {
		return houseAgeBegin;
	}
	public void setHouseAgeBegin(Date houseAgeBegin) {
		this.houseAgeBegin = houseAgeBegin;
	}
	public Date getHouseAgeEnd() {
		return houseAgeEnd;
	}
	public void setHouseAgeEnd(Date houseAgeEnd) {
		this.houseAgeEnd = houseAgeEnd;
	}
	public String getCjDateStart() {
		return cjDateStart;
	}
	public void setCjDateStart(String cjDateStart) {
		this.cjDateStart = cjDateStart;
	}
	public Integer getFhId() {
		return fhId;
	}
	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getEsfUrlStr() {
		return esfUrlStr;
	}
	public void setEsfUrlStr(String esfUrlStr) {
		this.esfUrlStr = esfUrlStr;
	}
	public String getFitmentName() {
		return fitmentName;
	}
	public void setFitmentName(String fitmentName) {
		this.fitmentName = fitmentName;
	}
	public String getForwordName() {
		return forwordName;
	}
	public void setForwordName(String forwordName) {
		this.forwordName = forwordName;
	}
	
	
	
}
