package config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import repository.MemberRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner loadData(MemberRepository repository) {
		return (args) -> {
			// save a couple of customers
			// repository.save(new Member("홍길동", "홍길동입니다"));
			// repository.save(new Member("AAA", ""));
			// repository.save(new Member("zdfdsf adfsdf", "sdfsf"));
			// repository.save(new Member("1", "Palmer"));
			// repository.save(new Member("2", "Dessler"));

			// // fetch all customers
			// log.info("Customers found with findAll():");
			// log.info("-------------------------------");
			// for (Member customer : repository.findAll()) {
			// log.info(customer.toString());
			// }
			// log.info("");
			//
			// // fetch an individual customer by ID
			// Member customer = repository.findOne(1L);
			// log.info("Customer found with findOne(1L):");
			// log.info("--------------------------------");
			// log.info(customer.toString());
			// log.info("");
			//
			// // fetch customers by last name
			// log.info("Customer found with findByLastNameStartsWithIgnoreCase('홍길동'):");
			// log.info("--------------------------------------------");
			// for (Member bauer : repository.findByNameStartsWithIgnoreCase("홍길동")) {
			// log.info(bauer.toString());
			// }
			// log.info("");
		};
	}

}
