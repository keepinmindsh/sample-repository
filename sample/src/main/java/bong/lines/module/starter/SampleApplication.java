package bong.lines.module.starter;

import bong.lines.module.modules.BusinessContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SampleApplication {
	public static void main(String[] args) {
		//SpringApplication.run(SampleApplication.class, args);
		new SpringApplicationBuilder()
				.sources(SampleApplication.class)
				.child(BusinessContext.class)
				.web(WebApplicationType.SERVLET)
				.run(args);
	}
}
