package cz.inventi.kpj.docker.app.dockerexampleapp.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author marek.rasocha (marek.rasocha@inventi.cz) on 09.05.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
    private Integer id;
    private String message;
}
