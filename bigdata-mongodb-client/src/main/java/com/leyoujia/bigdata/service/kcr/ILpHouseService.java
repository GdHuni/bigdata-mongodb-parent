package com.leyoujia.bigdata.service.kcr;

import com.leyoujia.bigdata.entity.kcr.dto.LpInfoDto;
import com.leyoujia.bigdata.entity.kcr.param.LpParam;

import java.util.List;

public interface ILpHouseService {
	public List<LpInfoDto> queryLpInfo(LpParam kcrm);
}
