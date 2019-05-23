package com.ffq.util;

import com.ffq.controller.AuthController;
import com.ffq.controller.BlogController;
import com.jfinal.config.Routes;

/**
 * @ClassName: RouteConfig   
 * @Description: TODO 全局路由配置文件  
 * @version: V1.0
 * @date: 2019年5月23日 下午1:44:08
 */
public class RouteConfig {
	public static void cfg(Routes me) {
		me.add("/hi", BlogController.class);
		me.add("/sign", AuthController.class);
	}
}
