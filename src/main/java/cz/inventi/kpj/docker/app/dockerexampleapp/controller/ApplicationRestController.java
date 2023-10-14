package cz.inventi.kpj.docker.app.dockerexampleapp.controller;

import cz.inventi.kpj.docker.app.dockerexampleapp.configuration.DockerAppConfigurationProperties;
import cz.inventi.kpj.docker.app.dockerexampleapp.controller.dto.CreateMessageDTO;
import cz.inventi.kpj.docker.app.dockerexampleapp.controller.dto.MessageDTO;
import cz.inventi.kpj.docker.app.dockerexampleapp.jpa.entity.MessageEntity;
import cz.inventi.kpj.docker.app.dockerexampleapp.jpa.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author marek.rasocha (marek.rasocha@inventi.cz) on 09.05.2022
 */
@RequiredArgsConstructor
@org.springframework.web.bind.annotation.RestController
public class ApplicationRestController {
    private final DockerAppConfigurationProperties properties;
    private final MessageRepository repository;


    @RequestMapping(
            method = RequestMethod.GET,
            value = "/helloWorld",
            produces = {"application/json"}
    )
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok(properties.getHelloMessage());
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/message",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<MessageDTO> createMessage(@RequestBody CreateMessageDTO message) {
        MessageEntity entity = new MessageEntity();
        entity.setMessage(message.getMessage());
        final var save = repository.save(entity);
        return ResponseEntity.ok(mapToDTO(save));
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/message",
            produces = {"application/json"}
    )
    public ResponseEntity<List<MessageDTO>> getMessage() {
        final var collect = repository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(collect);
    }

    private MessageDTO mapToDTO(MessageEntity entity) {
        return MessageDTO.builder()
                .message(entity.getMessage())
                .id(entity.getId())
                .build();
    }
}
