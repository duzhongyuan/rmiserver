/**   
 * Copyright © 2016 广州佳都数据服务有限公司. All rights reserved.
 * Company 广州佳都数据服务有限公司	常用工具类项目
 *
 * @Title: ServerMain.java 
 * @Prject: rmiserver
 * @Package: com.pci.data.rmi.server 
 * @Description: TODO
 * @author: dzy   
 * @date: 2016年12月26日 下午4:15:35 
 * @version: V1.0   
 */
package com.pci.data.rmi.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @ClassName: ServerMain 
 * @Description: TODO
 * @since: TODO
 * @author: dzy
 * @date: 2016年12月26日 下午4:15:35  
 */
public class ServerMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext-server.xml"}, true);
		
		System.out.println("==================服务启动成功===================");
	}
	
}
