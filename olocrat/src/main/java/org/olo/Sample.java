package org.olo;
import org.olo.newton.NewtonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Sample {

	/**
	 * http://www.irem.univ-mrs.fr/IMG/pdf/methode_de_newton.pdf
	 * @return
	 */

		//@RequestMapping("/")
			String home() {
					return "Hello";
							}

			public static void main(String[] args) throws Exception {
						SpringApplication.run(Sample.class, args);
							}

}