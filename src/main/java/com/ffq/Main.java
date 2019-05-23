package com.ffq;

import com.ffq.util.BaseConfig;
import com.jfinal.server.undertow.UndertowServer;

/**
 * @ClassName: Main   
 * @Description: 服务启动文件  
 * @version: V1.0
 * @date: 2019年5月23日 下午1:45:36
 */
public class Main {
	public static void main(String[] args) {
		UndertowServer.start(BaseConfig.class);
	}
}
