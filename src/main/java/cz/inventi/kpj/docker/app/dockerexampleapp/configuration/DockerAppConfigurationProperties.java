package cz.inventi.kpj.docker.app.dockerexampleapp.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author marek.rasocha (marek.rasocha@inventi.cz) on 09.05.2022
 */
@Data
@ConfigurationProperties(prefix = "properties")
public class DockerAppConfigurationProperties {
    private String helloMessage;
}
