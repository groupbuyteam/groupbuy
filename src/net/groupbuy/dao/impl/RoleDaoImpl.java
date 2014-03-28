/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.dao.impl;

import net.groupbuy.dao.RoleDao;
import net.groupbuy.entity.Role;

import org.springframework.stereotype.Repository;

/**
 * Dao - 角色
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("roleDaoImpl")
public class RoleDaoImpl extends BaseDaoImpl<Role, Long> implements RoleDao {

}