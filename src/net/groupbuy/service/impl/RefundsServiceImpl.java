/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.service.impl;

import javax.annotation.Resource;

import net.groupbuy.dao.RefundsDao;
import net.groupbuy.entity.Refunds;
import net.groupbuy.service.RefundsService;

import org.springframework.stereotype.Service;

/**
 * Service - 退款单
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("refundsServiceImpl")
public class RefundsServiceImpl extends BaseServiceImpl<Refunds, Long> implements RefundsService {

	@Resource(name = "refundsDaoImpl")
	public void setBaseDao(RefundsDao refundsDao) {
		super.setBaseDao(refundsDao);
	}

}