package com.thanks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	/**
	 *启动入口
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

/**
 * 设置war包发布
 */
@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

	/**
	 * 设置报错页面
	 * @return
	 */
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {

		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {

				configurableEmbeddedServletContainer.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "error/404.html"));
				configurableEmbeddedServletContainer.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "error/400.html"));
				configurableEmbeddedServletContainer.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "error/500.html"));


			}
		};


	}

}
