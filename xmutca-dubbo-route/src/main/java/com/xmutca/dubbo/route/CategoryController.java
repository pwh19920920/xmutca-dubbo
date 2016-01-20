/**
 * Copyright 2015 Software innovation and R & D center. All rights reserved.
 * File Name: CategoryController.java
 * Encoding UTF-8
 * Version: 0.0.1
 * History:	06 Jan,2016
 */
package com.xmutca.dubbo.route;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xmutca.dubbo.api.entity.Category;
import com.xmutca.dubbo.api.service.CategoryService;

/**
 * 
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 06 Jan,2016
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

	@Reference
	CategoryService categoryService;
	
	@RequestMapping
	public void test() {
		Category category = new Category();
		System.out.println(categoryService.create(category ));
	}
}
