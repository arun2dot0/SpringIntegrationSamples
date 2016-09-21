package hello;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ComponentScan({"controller,services.api"}) // search the com.company package for @Component classes
@ImportResource("classpath:/hello/integration.xml") // XML with DataSource bean
public class WebAppConfig {
}
