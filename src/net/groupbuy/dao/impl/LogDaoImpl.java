/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.dao.impl;

import javax.persistence.FlushModeType;

import net.groupbuy.dao.LogDao;
import net.groupbuy.entity.Log;

import org.springframework.stereotype.Repository;

/**
 * Dao - 日志
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("logDaoImpl")
public class LogDaoImpl extends BaseDaoImpl<Log, Long> implements LogDao {

	public void removeAll() {
		String jpql = "delete from Log log";
		entityManager.createQuery(jpql).setFlushMode(FlushModeType.COMMIT).executeUpdate();
	}

}