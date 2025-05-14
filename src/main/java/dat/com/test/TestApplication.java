package dat.com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World!");
		}
	}

}
