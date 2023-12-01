package com.example.AOP.Sample;

import com.example.AOP.Sample.dao.AccountDAO;
import com.example.AOP.Sample.dao.MembershipDAO;
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
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO) {
		return runner ->{
			//System.out.println("Hello world");

			demoTheBeforeAdvice(accountDAO,membershipDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO){
		//call the business method
		accountDAO.addAccount();

		//call the membership DAO method
		membershipDAO.addAccount();
	    membershipDAO.addSillyMember();
		membershipDAO.deleteSillyMember();
//		//do it again!
//		System.out.println("\n let's call it again!\n");
//
//		// call the business method again
//		accountDAO.addAccount();
	}
}

