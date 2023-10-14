package cz.inventi.kpj.docker.app.dockerexampleapp.configuration;

import cz.inventi.kpj.docker.app.dockerexampleapp.controller.ApplicationRestController;
import cz.inventi.kpj.docker.app.dockerexampleapp.jpa.repository.MessageRepository;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author marek.rasocha (marek.rasocha@inventi.cz) on 09.05.2022
 */
@Configuration
@Import({
        ApplicationRestController.class
})
@EnableJpaRepositories(basePackageClasses = MessageRepository.class)
@EnableConfigurationProperties(DockerAppConfigurationProperties.class)
public class DockerAppConfiguration {
}
