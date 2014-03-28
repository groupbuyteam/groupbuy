/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.service.impl;

import javax.annotation.Resource;

import net.groupbuy.Page;
import net.groupbuy.Pageable;
import net.groupbuy.dao.DepositDao;
import net.groupbuy.entity.Deposit;
import net.groupbuy.entity.Member;
import net.groupbuy.service.DepositService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service - 预存款
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("depositServiceImpl")
public class DepositServiceImpl extends BaseServiceImpl<Deposit, Long> implements DepositService {

	@Resource(name = "depositDaoImpl")
	private DepositDao depositDao;

	@Resource(name = "depositDaoImpl")
	public void setBaseDao(DepositDao depositDao) {
		super.setBaseDao(depositDao);
	}

	@Transactional(readOnly = true)
	public Page<Deposit> findPage(Member member, Pageable pageable) {
		return depositDao.findPage(member, pageable);
	}

}