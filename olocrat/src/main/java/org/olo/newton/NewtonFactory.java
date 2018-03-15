package org.olo.newton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewtonFactory {

	@Bean
	public NewtonBean get() {
		return new NewtonBean();
	}
}
