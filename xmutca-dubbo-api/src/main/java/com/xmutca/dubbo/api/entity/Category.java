/**
 * Copyright 2015 Software innovation and R & D center. All rights reserved.
 * File Name: Category.java
 * Encoding UTF-8
 * Version: 0.0.1
 * History:	06 Jan,2016
 */
package com.xmutca.dubbo.api.entity;

import java.io.Serializable;

/**
 * 
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 06 Jan,2016
 */
public class Category implements Serializable {

	private static final long serialVersionUID = -213489844614029071L;

	private Integer id;
	
	private String name;

	/**
	 * @author: weihuang.peng
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @author: weihuang.peng
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @author: weihuang.peng
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @author: weihuang.peng
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
