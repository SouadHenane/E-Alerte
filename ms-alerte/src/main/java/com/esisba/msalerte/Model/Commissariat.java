package com.esisba.msalerte.Model;

import com.esisba.msalerte.entities.Adresse;
import com.esisba.msalerte.entities.Localisation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commissariat {

    private Long id;

    private String nom;


    @Embedded
    private Localisation localisation;

    @Embedded
    private Adresse adresse;


}
