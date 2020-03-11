package com.esisba.msalerte.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data @NoArgsConstructor @AllArgsConstructor
public class Localisation {

    private Double log;
    private Double lat;
}

