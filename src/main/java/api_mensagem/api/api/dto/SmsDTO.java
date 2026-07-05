package api_mensagem.api.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class SmsDTO implements Serializable {

    private Long id;
    private String phonenumber;
    private String status; // ENVIADO,RECEBIDO,ERRO DE ENVIO

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime sentat;

}
