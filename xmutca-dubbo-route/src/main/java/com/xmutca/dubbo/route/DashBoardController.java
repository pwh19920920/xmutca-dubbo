/**
 * Copyright 2015 Software innovation and R & D center. All rights reserved.
 * File Name: DashBoardController.java
 * Encoding UTF-8
 * Version: 0.0.1
 * History:	06 Jan,2016
 */
package com.xmutca.dubbo.route;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 06 Jan,2016
 */
@Controller
@RequestMapping("/")
public class DashBoardController {

	@RequestMapping
	public String dashBoard() {
		return "index";
	}
}
