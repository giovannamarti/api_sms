package api_mensagem.api.business;

import api_mensagem.api.api.dto.SmsDTO;
import api_mensagem.api.infrastructure.entities.Sms;
import api_mensagem.api.infrastructure.exception.ResourceNotFoundException;
import api_mensagem.api.infrastructure.mapper.SmsConverter;
import api_mensagem.api.infrastructure.repositories.SmsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SmsService {
    private final SmsRepository smsRepository;
    private final SmsConverter smsConverter;

    @Transactional
    public SmsDTO atualizaStatusSms(SmsDTO dto) {
        Sms entity = smsRepository.findById(dto.getId()).orElseThrow(() ->
                new ResourceNotFoundException("Id não encontrado" + dto.getId()));

        entity.setStatus(dto.getStatus());
        Sms newEntity = smsRepository.save(entity);
        return smsConverter.toDTO(newEntity);
    }


    public List<SmsDTO> buscaSmsPorStatus(String status) {

        status = status.trim().toUpperCase();
        List<Sms> listaSms = smsRepository.findByStatus(status);
        return smsConverter.toListSmsDto(listaSms);


    }

}