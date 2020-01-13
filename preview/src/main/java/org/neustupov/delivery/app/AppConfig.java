package org.neustupov.delivery.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ServiceContextConfig.class, RepositoryContextConfig.class})
@Configuration
@ComponentScan
public class AppConfig {

}
