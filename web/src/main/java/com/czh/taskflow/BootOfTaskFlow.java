package com.czh.taskflow;

import com.czh.taskflow.config.MyTypeExcludeFilterApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Title: BootOfRocketMq.java Description: Copyright: Copyright (c) 2018
 * Company: www.chenzhehao.com
 * 
 * @author chenzhehao
 * @date 2018年5月24日
 * @version 1.0
 */
@SpringBootApplication
public class BootOfTaskFlow {
	public static void main(String[] args) throws Exception {
//		SpringApplication.run(BootOfTaskFlow.class, args);

		SpringApplication springApplication = new SpringApplication(BootOfTaskFlow.class);
		springApplication.addInitializers(new MyTypeExcludeFilterApplicationContextInitializer());
		springApplication.run(args);

	}
}
