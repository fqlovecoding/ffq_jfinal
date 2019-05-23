package com.ffq.util;

import com.ffq.model.BlogModel;
import com.jfinal.config.Plugins;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;

/**
 * @ClassName: ModelConfig   
 * @Description: 连接数据库配置  
 * @version: V1.0
 * @date: 2019年5月23日 下午1:44:39
 */
public class ModelConfig {
	public static void cfg(Plugins me) {
		//读取配置文件
		Prop prop = loadConfigFile();
		
		//druid数据库配置
		DruidPlugin druidPlugin = new DruidPlugin(prop.get("url"),prop.get("name"),prop.get("pwd"));
		me.add(druidPlugin);
		
		//dao层映射
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
		addMapping(arp);
		me.add(arp);
	}
	
	/**
	 * @MethodName loadConfigFile
	 * @Description 读取配置文件
	 * @return
	 */
	private static Prop loadConfigFile() {
		return PropKit.use("config.properties");
	}
	
	/**
	 * @MethodName addMapping
	 * @Description TODO 所有的数据库关系映射配置
	 * @param arp
	 */
	private static void addMapping(ActiveRecordPlugin arp) {
		arp.addMapping("blog", BlogModel.class);
	}
}
