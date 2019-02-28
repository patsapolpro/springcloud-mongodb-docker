package com.volkspace.proxyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableSwagger2
public class ProxyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyserviceApplication.class, args);
	}

}
