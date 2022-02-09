package bong.lines.jpa;


//import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
//@Import(JPAConfiguration.class)
public @interface JPAConfigurationAnnotations {
}
