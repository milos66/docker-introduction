package cz.inventi.kpj.docker.app.dockerexampleapp.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author marek.rasocha (marek.rasocha@inventi.cz) on 09.05.2022
 */
@Getter
@Setter
@Entity
@Table(name = "message")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "message")
    private String message;
}
