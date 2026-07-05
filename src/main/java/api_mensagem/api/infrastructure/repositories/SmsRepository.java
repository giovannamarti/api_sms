package api_mensagem.api.infrastructure.repositories;

import api_mensagem.api.infrastructure.entities.Sms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SmsRepository extends JpaRepository<Sms,Long> {


        List<Sms> findByStatus(String status);

    }
