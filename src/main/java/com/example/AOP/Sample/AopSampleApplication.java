package com.example.AOP.Sample;

import com.example.AOP.Sample.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO) {
		return runner ->{
			//System.out.println("Hello world");

			demoTheBeforeAdvice(accountDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO){
		//call the business method
		accountDAO.addAccount();

		//do it again!
		System.out.println("\n let's call it again!\n");

		// call the business method again
		accountDAO.addAccount();
	}
}

