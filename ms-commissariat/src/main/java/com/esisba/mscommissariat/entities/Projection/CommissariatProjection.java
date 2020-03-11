package com.esisba.mscommissariat.entities.Projection;

import com.esisba.mscommissariat.entities.Commissariat;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="pr",types=Commissariat.class)
public interface CommissariatProjection {



}
