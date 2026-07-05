package api_mensagem.api.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Data
@Table(name = "SMS")
public class Sms implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "phonenumber", length = 13)
            private String phonenumber;

            @Column(name = "status", length = 13)
            private String status;

            // ENVIADO,RECEBIDO,ERRO DE ENVIO
            @Column(name = "sentat")
    private LocalDateTime sentat;

}
