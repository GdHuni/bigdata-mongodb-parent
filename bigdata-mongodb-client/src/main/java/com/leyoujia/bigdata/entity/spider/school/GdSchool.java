package com.leyoujia.bigdata.entity.spider.school;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 广东省学校数据
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.GdSchool.java
 * @创建作者: 张丽洪
 * @问题反馈: 1248069229@qq.com
 * @创建日期: 2017年2月10日 16:36:04
 */
public class GdSchool extends CommonMongo {

    private String schoolName;

    private String schoolAddr;

    private String contactNumber;

    private String schoolNature;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSchoolNature() {
        return schoolNature;
    }

    public void setSchoolNature(String schoolNature) {
        this.schoolNature = schoolNature;
    }
}
