package backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EntityScan
@SpringBootApplication
@EnableFeignClients
public class PaiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaiBackendApplication.class, args);

	}

}

