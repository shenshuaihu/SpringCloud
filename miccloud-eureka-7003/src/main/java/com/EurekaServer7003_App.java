package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/28 17:06
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer    // EurekaServer  服务端启动类，接受其他服务注册进来
public class EurekaServer7003_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}
