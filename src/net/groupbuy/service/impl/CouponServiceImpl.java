/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.service.impl;

import javax.annotation.Resource;

import net.groupbuy.Page;
import net.groupbuy.Pageable;
import net.groupbuy.dao.CouponDao;
import net.groupbuy.entity.Coupon;
import net.groupbuy.service.CouponService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service - 优惠券
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("couponServiceImpl")
public class CouponServiceImpl extends BaseServiceImpl<Coupon, Long> implements CouponService {

	@Resource(name = "couponDaoImpl")
	private CouponDao couponDao;

	@Resource(name = "couponDaoImpl")
	public void setBaseDao(CouponDao couponDao) {
		super.setBaseDao(couponDao);
	}

	@Transactional(readOnly = true)
	public Page<Coupon> findPage(Boolean isEnabled, Boolean isExchange, Boolean hasExpired, Pageable pageable) {
		return couponDao.findPage(isEnabled, isExchange, hasExpired, pageable);
	}

}