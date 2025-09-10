package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "information-collector", url = "http://localhost:8100")
public interface InformationCollectorProxy {
    @PostMapping("/historico")
    void salvar(@RequestBody CurrencyConversion conversion);
}
