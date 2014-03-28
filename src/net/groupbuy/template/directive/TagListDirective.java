/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.groupbuy.template.directive;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.groupbuy.Filter;
import net.groupbuy.Order;
import net.groupbuy.entity.Tag;
import net.groupbuy.service.TagService;

import org.springframework.stereotype.Component;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 模板指令 - 标签列表
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Component("tagListDirective")
public class TagListDirective extends BaseDirective {

	/** 变量名称 */
	private static final String VARIABLE_NAME = "tags";

	@Resource(name = "tagServiceImpl")
	private TagService tagService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		List<Tag> tags;
		boolean useCache = useCache(env, params);
		String cacheRegion = getCacheRegion(env, params);
		Integer count = getCount(params);
		List<Filter> filters = getFilters(params, Tag.class);
		List<Order> orders = getOrders(params);
		if (useCache) {
			tags = tagService.findList(count, filters, orders, cacheRegion);
		} else {
			tags = tagService.findList(count, filters, orders);
		}
		setLocalVariable(VARIABLE_NAME, tags, env, body);
	}

}