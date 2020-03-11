package com.esisba.mscommissariat;

import com.esisba.mscommissariat.dao.CommissariatRepository;
import com.esisba.mscommissariat.entities.Adresse;
import com.esisba.mscommissariat.entities.Commissariat;
import com.esisba.mscommissariat.entities.Localisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsCommissariatApplication implements CommandLineRunner {

    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    CommissariatRepository commissariatRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsCommissariatApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Commissariat.class);
        commissariatRepository.save(new Commissariat(null, "Com4899", new Localisation(12.5,1.3), new Adresse("sba","sba","sba")));

    }
}
