/**
 * Copyright 2015 Software innovation and R & D center. All rights reserved.
 * File Name: CategoryService.java
 * Encoding UTF-8
 * Version: 0.0.1
 * History:	06 Jan,2016
 */
package com.xmutca.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmutca.dubbo.api.entity.Category;
import com.xmutca.dubbo.api.service.CategoryService;

/**
 * 
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 06 Jan,2016
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Override
	public int create(Category Category) {
		return 0;
	}

	@Override
	public int update(Category Category) {
		return 0;
	}

	@Override
	public int delete(Category Category) {
		return 0;
	}
}
