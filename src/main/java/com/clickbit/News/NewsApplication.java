package com.clickbit.News;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;

@SpringBootApplication
public class NewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);
		String ip = InetAddress.getLoopbackAddress().getHostAddress();
		System.out.println(ip);

	}
}
