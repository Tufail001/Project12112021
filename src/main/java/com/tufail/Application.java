package com.tufail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	int b=200;

	int j=20;

	public static void main(String[] args) {
		int i=10;
		SpringApplication.run(Application.class, args);
	}
	
	public void doProcess(){

}
}
