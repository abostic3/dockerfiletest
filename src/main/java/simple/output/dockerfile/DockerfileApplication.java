package simple.output.dockerfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerfileApplication {

	public static void main(String[] args) {
		System.out.println("I just ran");
		SpringApplication.run(DockerfileApplication.class, args);
	}

}
