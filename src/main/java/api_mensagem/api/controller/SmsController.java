package api_mensagem.api.controller;

import api_mensagem.api.api.dto.SmsDTO;
import api_mensagem.api.business.SmsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sms")
@RequiredArgsConstructor
public class SmsController {

    private final SmsService smsService;


    @PatchMapping
    public ResponseEntity<SmsDTO> atualizaStatusSms(@RequestBody SmsDTO dto) {
        return ResponseEntity.ok(smsService.atualizaStatusSms(dto));
    }


    @GetMapping("/status")
    public ResponseEntity<List<SmsDTO>> buscaSmsPorStatus(@RequestParam("status") String status)
    {
        return ResponseEntity.ok(smsService.buscaSmsPorStatus(status));
    }

    }

