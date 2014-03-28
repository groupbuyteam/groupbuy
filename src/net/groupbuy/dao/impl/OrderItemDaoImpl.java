/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.dao.impl;

import net.groupbuy.dao.OrderItemDao;
import net.groupbuy.entity.OrderItem;

import org.springframework.stereotype.Repository;

/**
 * Dao - 订单项
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("orderItemDaoImpl")
public class OrderItemDaoImpl extends BaseDaoImpl<OrderItem, Long> implements OrderItemDao {

}