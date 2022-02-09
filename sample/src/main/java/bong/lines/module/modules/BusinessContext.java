package bong.lines.module.modules;

import bong.lines.customannotations.SampleAnnotations;
import bong.lines.jpa.JPAConfigurationAnnotations;
import bong.lines.sample.StarterAnnotations;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SampleAnnotations
@StarterAnnotations
@JPAConfigurationAnnotations
@EnableAutoConfiguration
public class BusinessContext {
}
