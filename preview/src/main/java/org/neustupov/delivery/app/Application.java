package org.neustupov.delivery.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main( String[] args ) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
  }
}
