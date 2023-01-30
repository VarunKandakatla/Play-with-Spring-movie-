package Try.Annotations.Checking.Annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckingAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckingAnnotationsApplication.class, args);
		System.out.println("Hello Spring!");
	}

}
