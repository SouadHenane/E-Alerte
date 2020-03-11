package com.esisba.msalerte.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(exclude={"students"})
public class Alerte {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAlerte;

    private AlerteType alerteType;


    @Embedded
    private Localisation localisation;

    @Lob
    private byte[] doc;


    @ManyToOne
    private Citoyen citoyen;


    private Long commissariatId;


}
