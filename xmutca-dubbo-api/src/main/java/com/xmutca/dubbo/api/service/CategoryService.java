/**
 * Copyright 2015 Software innovation and R & D center. All rights reserved.
 * File Name: CategoryService.java
 * Encoding UTF-8
 * Version: 0.0.1
 * History:	06 Jan,2016
 */
package com.xmutca.dubbo.api.service;

import com.xmutca.dubbo.api.entity.Category;

/**
 * 
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 06 Jan,2016
 */
public interface CategoryService {

	int create(Category Category);
	
	int update(Category Category);
	
	int delete(Category Category);
}
