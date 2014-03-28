/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.dao;

import net.groupbuy.entity.Seo;
import net.groupbuy.entity.Seo.Type;

/**
 * Dao - SEO设置
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
public interface SeoDao extends BaseDao<Seo, Long> {

	/**
	 * 查找SEO设置
	 * 
	 * @param type
	 *            类型
	 * @return SEO设置
	 */
	Seo find(Type type);

}