package com.ffq.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.kit.HttpKit;

/**
 * @ClassName: AuthController   
 * @Description: 使用第三方远程接口查询示例  
 * @version: V1.0
 * @date: 2019年5月23日 下午1:46:59
 */
public class AuthController extends Controller{
	@ActionKey("/sign")
	public void sign() {
		renderJson(HttpKit.get("http://163.53.170.114/v1.0/auth/generate/sign"));
	}
}
