/**   
 * Copyright © 2016 广州佳都数据服务有限公司. All rights reserved.
 * Company 广州佳都数据服务有限公司	常用工具类项目
 *
 * @Title: SayHelloServiceImpl.java 
 * @Prject: rmiserver
 * @Package: com.pci.data.rmi.service.impl 
 * @Description: TODO
 * @author: dzy   
 * @date: 2016年12月26日 下午4:11:33 
 * @version: V1.0   
 */
package com.pci.data.rmi.service.impl;

import java.util.Date;

import com.pci.data.rmi.service.ISayHelloService;

/** 
 * @ClassName: SayHelloServiceImpl 
 * @Description: TODO
 * @since: TODO
 * @author: dzy
 * @date: 2016年12月26日 下午4:11:33  
 */
public class SayHelloServiceImpl implements ISayHelloService {

	/* (non Javadoc) 
	 * @Title: doSayHello
	 * @Description: TODO
	 * @param name
	 * @return 
	 * @see com.pci.data.rmi.service.ISayHelloService#doSayHello(java.lang.String) 
	 */
	@Override
	public String doSayHello(String name) {
		// TODO Auto-generated method stub
		
		System.out.println(new Date() + ":hello " + name);
		
		return "hello " + name;
	}

}
