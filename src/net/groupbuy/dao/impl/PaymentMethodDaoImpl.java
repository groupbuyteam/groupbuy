/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.dao.impl;

import net.groupbuy.dao.PaymentMethodDao;
import net.groupbuy.entity.PaymentMethod;

import org.springframework.stereotype.Repository;

/**
 * Dao - 支付方式
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("paymentMethodDaoImpl")
public class PaymentMethodDaoImpl extends BaseDaoImpl<PaymentMethod, Long> implements PaymentMethodDao {

}