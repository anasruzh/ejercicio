package mail.project.mailapp.restdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import mail.project.mailapp.restdemo.properties.RestProperties;
import mail.project.mailapp.restdemo.service.InfoService;


@Configuration
@EnableJpaRepositories("mail.project.mailapp.restdemo.repository")
@EnableTransactionManagement
public class Config {
	
	@Bean
    public InfoService infoService(RestProperties restProperties) {
        return new InfoService(restProperties);
    }

}
