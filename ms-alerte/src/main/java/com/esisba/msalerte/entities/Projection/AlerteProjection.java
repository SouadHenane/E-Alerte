package com.esisba.msalerte.entities.Projection;


import com.esisba.msalerte.entities.Alerte;
import com.esisba.msalerte.entities.Citoyen;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="pr1",types= Alerte.class)

public interface AlerteProjection {

    @Value("#{target.id}")
    Long getId();
    public Date getDateAlerte();

    String getAlerteType();

    @Value("#{target.getAdresse().getWilaya()}")
    String getWilaya();
}
