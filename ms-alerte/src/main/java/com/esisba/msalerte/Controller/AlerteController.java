package com.esisba.msalerte.Controller;

import com.esisba.msalerte.Model.Commissariat;
import com.esisba.msalerte.dao.AlerteRepository;
import com.esisba.msalerte.dao.CitoyenRepository;
import com.esisba.msalerte.entities.Alerte;
import com.esisba.msalerte.entities.Citoyen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AlerteController {

    @Autowired
    private AlerteRepository alerteRepository;

    @Autowired
    private CitoyenRepository citoyenRepository;

    @Autowired
    MsCommissariatProxy msCommissariatProxy;

    @GetMapping("/alertes")
    public List <Alerte> lesAlertes() {
        return alerteRepository.findAll( );
    }

    @PostMapping("/alertes")
    public Alerte AddAlerte(@RequestBody Alerte alerte) {
        Citoyen c = citoyenRepository.findById(alerte.getCitoyen( ).getId( )).get( );
        alerte.setCitoyen(c);
        return alerteRepository.save(alerte);
    }

    @GetMapping("/commissariat/{id}")
    public Commissariat getCommissariatByAlerteId(@PathVariable("id") Long idAlerte) {
        Long idCommissariat = alerteRepository.findById(idAlerte).get( ).getCommissariatId( );

        return msCommissariatProxy.CommissariatById(idCommissariat);
    }
}
