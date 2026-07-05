package api_mensagem.api.infrastructure.mapper;


import api_mensagem.api.api.dto.SmsDTO;
import api_mensagem.api.infrastructure.entities.Sms;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsConverter {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "phonenumber", target = "phonenumber")
    @Mapping(source = "sentat", target = "sentat")
    SmsDTO toDTO(Sms entity);

    Sms toEntity(SmsDTO dto);
    List<SmsDTO>toListSmsDto(List<Sms> sms);
    List<Sms>toListSms(List<SmsDTO> smsDTOS);



}

