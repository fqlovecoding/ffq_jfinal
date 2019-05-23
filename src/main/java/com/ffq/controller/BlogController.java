package com.ffq.controller;

import com.ffq.model.BlogModel;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * @ClassName: BlogController   
 * @Description: 使用dao层存储数据示例  
 * @version: V1.0
 * @date: 2019年5月23日 下午1:46:34
 */
public class BlogController extends Controller{
	private static BlogModel blogDao = new BlogModel().dao();
	
	@ActionKey("/hi")
	public void hi() {
		renderJson(blogDao.findAll());
	}
}
