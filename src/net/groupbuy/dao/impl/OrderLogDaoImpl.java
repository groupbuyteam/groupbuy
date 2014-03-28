/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.dao.impl;

import net.groupbuy.dao.OrderLogDao;
import net.groupbuy.entity.OrderLog;

import org.springframework.stereotype.Repository;

/**
 * Dao - 订单日志
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("orderLogDaoImpl")
public class OrderLogDaoImpl extends BaseDaoImpl<OrderLog, Long> implements OrderLogDao {

}