package org.olo;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Sample {

	/**
	 * http://www.irem.univ-mrs.fr/IMG/pdf/methode_de_newton.pdf
	 * @return
	 */
		@RequestMapping("/")
			String home() {
						return "Hello World!";
							}

			public static void main(String[] args) throws Exception {
						SpringApplication.run(Sample.class, args);
							}

}