/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.service.impl;

import javax.annotation.Resource;

import net.groupbuy.dao.DeliveryTemplateDao;
import net.groupbuy.entity.DeliveryTemplate;
import net.groupbuy.service.DeliveryTemplateService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service - 快递单模板
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("deliveryTemplateServiceImpl")
public class DeliveryTemplateServiceImpl extends BaseServiceImpl<DeliveryTemplate, Long> implements DeliveryTemplateService {

	@Resource(name = "deliveryTemplateDaoImpl")
	private DeliveryTemplateDao deliveryTemplateDao;

	@Resource(name = "deliveryTemplateDaoImpl")
	public void setBaseDao(DeliveryTemplateDao deliveryTemplateDao) {
		super.setBaseDao(deliveryTemplateDao);
	}

	@Transactional(readOnly = true)
	public DeliveryTemplate findDefault() {
		return deliveryTemplateDao.findDefault();
	}

}