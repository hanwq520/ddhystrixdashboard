package com.hanwq;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Description: ddhystrixdashboard
 * Created by hanwq on 2019/5/20 14:50
 */
@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixDashboardApplication {
    //http://localhost:1301/hystrix
    //http://localhost:2101/hystrix.stream
    public static void main(String[] args){
        SpringApplication.run(HystrixDashboardApplication.class,args);
    }
}
