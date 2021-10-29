package one.digitalinnovation.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

/*
      É criado esse DTO na intenção de emitir uma menssagem agradável (no quesito de fácil compreensão)
                            ao usuário quando uma operação for realizada.
 */

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
