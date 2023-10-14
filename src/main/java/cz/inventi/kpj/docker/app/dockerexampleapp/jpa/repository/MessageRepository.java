package cz.inventi.kpj.docker.app.dockerexampleapp.jpa.repository;

import cz.inventi.kpj.docker.app.dockerexampleapp.jpa.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author marek.rasocha (marek.rasocha@inventi.cz) on 09.05.2022
 */
public interface MessageRepository extends JpaRepository<MessageEntity, Integer> {
}
