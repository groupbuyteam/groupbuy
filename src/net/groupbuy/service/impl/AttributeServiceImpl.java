/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.service.impl;

import javax.annotation.Resource;

import net.groupbuy.dao.AttributeDao;
import net.groupbuy.entity.Attribute;
import net.groupbuy.service.AttributeService;

import org.springframework.stereotype.Service;

/**
 * Service - 属性
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("attributeServiceImpl")
public class AttributeServiceImpl extends BaseServiceImpl<Attribute, Long> implements AttributeService {

	@Resource(name = "attributeDaoImpl")
	public void setBaseDao(AttributeDao attributeDao) {
		super.setBaseDao(attributeDao);
	}

}