/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.service;

import net.groupbuy.Page;
import net.groupbuy.Pageable;
import net.groupbuy.entity.Deposit;
import net.groupbuy.entity.Member;

/**
 * Service - 预存款
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
public interface DepositService extends BaseService<Deposit, Long> {

	/**
	 * 查找预存款分页
	 * 
	 * @param member
	 *            会员
	 * @param pageable
	 *            分页信息
	 * @return 预存款分页
	 */
	Page<Deposit> findPage(Member member, Pageable pageable);

}