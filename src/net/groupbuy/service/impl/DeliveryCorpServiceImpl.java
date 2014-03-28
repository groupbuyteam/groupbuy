/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.service.impl;

import javax.annotation.Resource;

import net.groupbuy.dao.DeliveryCorpDao;
import net.groupbuy.entity.DeliveryCorp;
import net.groupbuy.service.DeliveryCorpService;

import org.springframework.stereotype.Service;

/**
 * Service - 物流公司
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("deliveryCorpServiceImpl")
public class DeliveryCorpServiceImpl extends BaseServiceImpl<DeliveryCorp, Long> implements DeliveryCorpService {

	@Resource(name = "deliveryCorpDaoImpl")
	public void setBaseDao(DeliveryCorpDao deliveryCorpDao) {
		super.setBaseDao(deliveryCorpDao);
	}

}