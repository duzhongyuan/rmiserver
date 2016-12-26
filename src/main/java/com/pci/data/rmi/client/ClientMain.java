/**   
 * Copyright © 2016 广州佳都数据服务有限公司. All rights reserved.
 * Company 广州佳都数据服务有限公司	常用工具类项目
 *
 * @Title: ClientMain.java 
 * @Prject: rmiserver
 * @Package: com.pci.data.rmi.client 
 * @Description: TODO
 * @author: dzy   
 * @date: 2016年12月26日 下午4:25:53 
 * @version: V1.0   
 */
package com.pci.data.rmi.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pci.data.rmi.service.ISayHelloService;

/**
 * @ClassName: ClientMain
 * @Description: TODO
 * @since: TODO
 * @author: dzy
 * @date: 2016年12月26日 下午4:25:53
 */
public class ClientMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"classpath:applicationContext-client.xml");
//			System.setProperty("java.rmi.server.hostname","172.20.10.189");
			ISayHelloService object = applicationContext.getBean("chinaSayHelloServiceRmi", ISayHelloService.class);
			System.out.println(object.doSayHello("张三"));
			applicationContext.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
