/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.dao.impl;

import javax.persistence.FlushModeType;
import javax.persistence.NoResultException;

import net.groupbuy.dao.SeoDao;
import net.groupbuy.entity.Seo;
import net.groupbuy.entity.Seo.Type;

import org.springframework.stereotype.Repository;

/**
 * Dao - SEO设置
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("seoDaoImpl")
public class SeoDaoImpl extends BaseDaoImpl<Seo, Long> implements SeoDao {

	public Seo find(Type type) {
		if (type == null) {
			return null;
		}
		try {
			String jpql = "select seo from Seo seo where seo.type = :type";
			return entityManager.createQuery(jpql, Seo.class).setFlushMode(FlushModeType.COMMIT).setParameter("type", type).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}