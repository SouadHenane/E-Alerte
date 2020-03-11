package com.esisba.msalerte.entities.Projection;


import com.esisba.msalerte.entities.Citoyen;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="pr1",types=Citoyen.class)
public interface CitoyenProjection  {
   @Value("#{target.id}")
     Long getId();
     public String getSexe();
    @Value("#{target.getAdresse().getWilaya()}")
    String getWilaya();

}
