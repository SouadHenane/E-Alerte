package com.esisba.msalerte.Controller;


import com.esisba.msalerte.Model.Commissariat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name="microservice-commissariats", url = "localhost:8083")
public interface MsCommissariatProxy {

    @GetMapping("/commissariats")
    List <Commissariat> lesCommissariats();

    @GetMapping("/commissariats/{id}")
    Commissariat CommissariatById(@PathVariable("id") Long id);
}
