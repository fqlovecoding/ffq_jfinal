package com.ffq.util;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;

/**
 * @ClassName: BaseConfig   
 * @Description: 全局配置  
 * @version: V1.0
 * @date: 2019年5月23日 下午1:45:25
 */
public class BaseConfig extends JFinalConfig {
	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	@Override
	public void configRoute(Routes me) {
		RouteConfig.cfg(me);
	}

	@Override
	public void configEngine(Engine me) {
		//只需要后端接口,故这里不需要配置任何模板相关
	}

	@Override
	public void configPlugin(Plugins me) {
		ModelConfig.cfg(me);
	}

	@Override
	public void configInterceptor(Interceptors me) {
		//拦截器一般与权限相关暂不需要
	}

	@Override
	public void configHandler(Handlers me) {
		//拦截器一般与权限相关暂不需要
	}
}
