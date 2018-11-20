package com.leyoujia.bigdata.entity.kcr.dto;

import com.leyoujia.bigdata.util.SystemConstant;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @功能描述: 意向模型表
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.kcr.dto.KCustomerRecommendModel.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月19日 下午8:57:20
 */ 
public class KCustomerRecommendModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	/** 意向 1-一手楼2-二手楼3-租房 */
	private Integer type;
	/** 最近一次预约的楼盘 id */
	private String houseId;
	/** 预约名称 */
	private String yyName;
	private String userId;
	private Integer orderCt;
	private Integer favoritesCt;
	private Integer browseCt;
	private String searchKey;
	private String cityArea;
	private String hslName;
	private Double minPrice;
	private Double maxPrice;
	private Double minShInArea;
	private Double maxShInArea; 
	/** 楼层 */
	private String sellHouse;
	private String estate;
	private String shOrientation;
	private String managerUse;
	private String otherUse;
	private String phone;
	private Integer sex;
	
	private final String match = "[0-9]*";
	
	
	/**
	 * ID     
	 * @return
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * 用户ID        
	 * @return
	 */
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * 预约记录数      
	 * @return
	 */
	public Integer getOrderCt() {
		return orderCt;
	}
	public void setOrderCt(Integer orderCt) {
		this.orderCt = orderCt;
	}
	
	/**
	 * 收藏记录数
	 * @return
	 */
	public Integer getFavoritesCt() {
		return favoritesCt;
	}
	public void setFavoritesCt(Integer favoritesCt) {
		this.favoritesCt = favoritesCt;
	}
	
	
	/**
	 * 浏览记录数
	 * @return
	 */
	public Integer getBrowseCt() {
		return browseCt;
	}
	public void setBrowseCt(Integer browseCt) {
		this.browseCt = browseCt;
	}
	
	/**
	 * 用户搜索关键词  （样例：花园，地铁，低价)
	 * @return
	 */
	public String getSearchKey() {
		return getString(searchKey);
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	
	/**
	 * 地段(片区)1-3 (样例：深圳市&福田&八卦岭,深圳市&，深圳市&福田)
	 * @return
	 */
	public String getCityArea() {
		return getString(cityArea);
	}
	public void setCityArea(String cityArea) {
		this.cityArea = cityArea;
	}
	
	/**
	 * 楼盘1-3 (样例：十二橡树庄园,徽王府,城市明珠一期)
	 * @return
	 */
	public String getHslName() {
		if(StringUtils.isNotEmpty(hslName)&&hslName.split(",").length>3){
			String[] names = hslName.split(",");
			hslName = "";
			for (int i=0;i<3;i++) {
				hslName += ","+names[i];
			}
			hslName = hslName.substring(1);
		}
		return getString(hslName);
	}
	public void setHslName(String hslName) {
		this.hslName = hslName;
	}
	
	/**
	 * 最小价格 (样例：1000.00)
	 * @return
	 */
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	
	
	/**
	 * 最大价格 (样例：100000.00)
	 * @return
	 */
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	/**
	 * 最小面积 (样例：80)
	 * @return
	 */
	public Double getMinShInArea() {
		return minShInArea;
	}
	public void setMinShInArea(Double minShInArea) {
		this.minShInArea = minShInArea;
	}
	
	/**
	 * 最大面积 (样例：100)
	 * @return
	 */
	public Double getMaxShInArea() {
		return maxShInArea;
	}
	public void setMaxShInArea(Double maxShInArea) {
		this.maxShInArea = maxShInArea;
	} 
	
	public String getMaxPriceStr() {
		if(maxPrice!=null){
			if (type != null && type == 1) {
				if (maxPrice!=null&&maxPrice > 30000) {
					//return  "3万以上";
					return  "不限";
				} 
			}
			if (type != null && type == 2) {
				if (maxPrice!=null&&maxPrice > 1000) {
					//return  "1000万以上";
					return  "不限";
				} 
			}
			if (type != null && type == 3) {
				if (maxPrice!=null&&maxPrice > 10000) {
					//return  "10000元以上";
					return  "不限";
				} 
			}
			return maxPrice.intValue()+"";
		}else {
			return "";
		}
	}
	
	public String getMaxMianji() {
		if(maxShInArea!=null){
			if (maxShInArea > 300) {
				return  "不限";
			} 		 
			return maxShInArea.intValue()+"";
		}else{
			return "";
		}
	}
	
	/**
	 * 户型 (样例：五室,二室) 注意：getEstateStr()调用此方法获取 
	 * @return
	 */
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	
	/**
	 * 朝向 (样例：南,北) 注意：getShOrientationStr()调用此方法获取
	 * @return
	 */
	public String getShOrientation() {
		return shOrientation;
	}
	public void setShOrientation(String shOrientation) {
		this.shOrientation = shOrientation;
	}
	
	/**
	 * 购房目的 (样例：自住,投资)
	 * @return
	 */
	public String getManagerUse() {
		return managerUse;
	}
	public void setManagerUse(String managerUse) {
		this.managerUse = managerUse;
	}
	
	/**
	 * 其他意向(样例：拎包入住,新上) 注意：getOtherUseStr()调用此方法获取
	 * @return
	 */
	public String getOtherUse() {
		return otherUse;
	}
	public void setOtherUse(String otherUse) {
		this.otherUse = otherUse;
	}
	
	/**
	 * 手机号码
	 * @return
	 */
	public String getPhone() {
		return getString(phone);
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 类型
	 * @return
	 */
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	/**
	 * 最近一次预约的楼盘 id
	 * @return
	 */
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	
	/**
	 * 楼层 (样例：低,中,高)  注意：getSellHouseStr调用此方法获取
	 * @return
	 */
	public String getSellHouse() {
		return sellHouse;
	}
	public void setSellHouse(String sellHouse) {
		this.sellHouse = sellHouse;
	}
	
	/**
	 * 楼层(样例：低,中,高)
	 * @return
	 */
	public String getSellHouseStr() {
		String result = "";
		if (StringUtils.isNotEmpty(this.sellHouse)) {
			String[] item = this.sellHouse.split(",");
			if(item!=null){
				if(item.length>=3) return "不限";
				if(item.length==2) {
					List<String> sellHouses = Arrays.asList(item);
					if(sellHouses.contains("2")&&sellHouses.contains("3"))
						return "中层以上";
					if(sellHouses.contains("1")&&sellHouses.contains("2"))
						return "中低层";
				}
				for (String index : item) {
					if(Integer.valueOf(index)<SystemConstant.LOUCENG_ARRAY.length) 
						result+=","+SystemConstant.LOUCENG_ARRAY[Integer.valueOf(index)];
				}
			}
			if (StringUtils.isNotEmpty(result)) {
				result = result.substring(1);
			}
		} 
		return getString(result);
	}
	
	/**
	 * 其他意向(样例：拎包入住,新上)
	 * @return
	 */
	public String getOtherUseStr() {
		String result = ""; 
		if (StringUtils.isNotEmpty(this.otherUse)) {
			String[] item = this.otherUse.split(",");
			if(item!=null){
				/*String gl = "";
				//去除重复
				for (String index : item) {
					if (index != null && index.indexOf("&") > -1) {
						String str [] = index.split("&");
						if (str != null && str.length > 0) {
							for (String s : str) {
								if (gl.indexOf(s) < 0) {
									gl += "&"+s;
								}
							}
						}
					}
				}
				String itemStr [] = null;
				if (StringUtils.isNotEmpty(gl)) {
					gl = gl.substring(1);
					itemStr = gl.split("&");
				} else {
					itemStr = item;
				}*/
				
				for (String index : item) {
					if (index != null && index.matches(match)) {
						if(type != null && !"不限".equals(index) && 1==this.type){
							if (index != null && Integer.valueOf(index) == 10) {
								result+=","+SystemConstant.TESE_ESF_ARRAY[Integer.valueOf(index)];
							}
						}else if(type != null && !"不限".equals(index) && 2==this.type){
							if(Integer.valueOf(index)<SystemConstant.TESE_ESF_ARRAY.length)  {
								result+=","+SystemConstant.TESE_ESF_ARRAY[Integer.valueOf(index)];
							}
						} else if (this.type != null && !"不限".equals(index) && 3==this.type) {
							if(Integer.valueOf(index)<SystemConstant.TESE_ZF_ARRAY.length) 
								result+=","+SystemConstant.TESE_ZF_ARRAY[Integer.valueOf(index)];
							}
					} else {
						 if(type != null && !"不限".equals(index) && 2==this.type){
							if (!"不限".equals(index) && result.indexOf(index) < 0) {
								for (int i = 0,len=SystemConstant.TESE_ESF_ARRAY.length;i < len; i++) {
									if (SystemConstant.TESE_ESF_ARRAY[i].equals(index)){
										result+=","+index;
									}
								}
							}
						} else if (this.type != null && !"不限".equals(index) && 3==this.type) {
							for (int i = 0,len=SystemConstant.TESE_ZF_ARRAY.length;i < len; i++) {
								if (SystemConstant.TESE_ZF_ARRAY[i].equals(index)){
									result+=","+index;
								}
							}
						}
						
					}
				} 
			}
			if (StringUtils.isNotEmpty(result)) {
				result = result.substring(1);
			} 
		} 
		return getString(result);
	}
	
	public String getPriceStr() {
		if(minPrice!=null && maxPrice !=null){
			if (minPrice == 0 && "不限".equals(getMaxPriceStr())) {
				return "不限";
			}
			if (minPrice == 0 && !"不限".equals(getMaxPriceStr())) {
				return getMaxPriceStr()+getDWStr()+"以下";
			}
			if (minPrice > 0 && "不限".equals(getMaxPriceStr())) {
				return minPrice.intValue()+getDWStr()+"以上";
			}
			if (minPrice > 0 && !"不限".equals(getMaxPriceStr())) {
				return minPrice.intValue()+"-"+getMaxPriceStr()+getDWStr();
			}
		}
		return "";
	}
	
	public String getMianjiStr() {
		if(minShInArea!=null && maxShInArea!=null){
			if (minShInArea == 0 && "不限".equals(getMaxMianji())) {
				return "不限";
			}
			if (minShInArea == 0 && !"不限".equals(getMaxMianji())) {
				return getMaxMianji()+"平米以下";
			}
			if (minShInArea > 0 && "不限".equals(getMaxMianji())) {
				return minShInArea.intValue()+"平米以上";
			}
			if (minShInArea > 0 && !"不限".equals(getMaxMianji())) {
				return minShInArea.intValue()+"-"+getMaxMianji()+"平米";
			}
		}
		return "";
	}
	
	/**
	 * 朝向 (样例：南,北)
	 * @return
	 */
	public String getShOrientationStr() {
		String result = "";
		if (StringUtils.isNotEmpty(this.shOrientation)) {
			String[] item = this.shOrientation.split(",");
			if(item!=null){
				if(item.length>3) return "不限";
				for (String index : item) {
					if (index != null && index.matches(match)) {
						if(!"0".equals(index) && !"不限".equals(index) && Integer.valueOf(index)<SystemConstant.CHAOXIANG_ARRAY.length) {
							result+=","+SystemConstant.CHAOXIANG_ARRAY[Integer.valueOf(index)];
						}
					} else {
						if (!"不限".equals(index)) {
							result+=","+index;
						}
					}
				}
			}
			if (StringUtils.isNotEmpty(result)) {
				result = result.substring(1);
			}
		} 
		return getString(result);
	}
	
	/**
	 * 户型(样例：五室,二室)
	 * @return
	 */
	public String getEstateStr() {
		String result = "";
		if (StringUtils.isNotEmpty(this.estate)) {
			String[] item = this.estate.split(",");
			if(item!=null){
				Integer min=null;
				Integer max=null;
		        for (String obj : item) {
		        	if (obj.matches(match)) {
			        	Integer hx = Integer.valueOf(obj);
			        	if(min==null)min=hx;
			        	if(max==null)max=hx;
			        	if(hx<=min){
			        		min=hx;
			        	}
			        	if(hx>=max){
			        		max=hx;
			        	}
			        	if(min==max){
							if(max==6){
								result = "5房以上";
							}else
								result = min+"房";
						}else {
							if(max==6){
								result = min+"-5房以上";
							}else
								result = min+"-"+max+"房";
						}
			        }
					
		        }
			}
		}
		return getString(result);
	}
	
	/**
	 * 价格单位
	 * @return
	 */
	public String getDWStr() {
		if(type != null){
			if (type == 1) {
				return "元/㎡";
			}
			if (type == 2) {
				return "万";
			}
			if (type == 3) {
				return "元/月";
			}
		}
		return "万";
	}
	
	/**
	 * 预约名称
	 * @return
	 */
	public String getYyName() {
		return getString(yyName);
	}
	public void setYyName(String yyName) {
		this.yyName = yyName;
	}
	
	/**
	 * 性别
	 * @return
	 */
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public String getString(String args) {
		if (args == null || "".equals(args) || "null".equals(args)) {
			return "";
		}
		return args;
	}
	
}
