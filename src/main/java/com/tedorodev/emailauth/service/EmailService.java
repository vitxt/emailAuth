package com.tedorodev.emailauth.service;

import com.tedorodev.emailauth.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class EmailService {
    private static HashSet<String> emailDomains = new HashSet<String>();
    static {
            // Major Federal and State Universities
            emailDomains.add("usp.br");      // Universidade de São Paulo
            emailDomains.add("unicamp.br");  // Universidade Estadual de Campinas
            emailDomains.add("ufrj.br");     // Universidade Federal do Rio de Janeiro
            emailDomains.add("ufmg.br");     // Universidade Federal de Minas Gerais
            emailDomains.add("ufrgs.br");    // Universidade Federal do Rio Grande do Sul
            emailDomains.add("unb.br");      // Universidade de Brasília
            emailDomains.add("ufsc.br");     // Universidade Federal de Santa Catarina
            emailDomains.add("ufpr.br");     // Universidade Federal do Paraná
            emailDomains.add("ufpe.br");     // Universidade Federal de Pernambuco
            emailDomains.add("ufba.br");     // Universidade Federal da Bahia
            emailDomains.add("uem.br");      // Universidade Estadual de Maringá
            // Major Private Universities
            emailDomains.add("pucrs.br");    // PUC Rio Grande do Sul
            emailDomains.add("pucminas.br"); // PUC Minas
            emailDomains.add("puc-rio.br");  // PUC Rio
            emailDomains.add("mackenzie.br");// Universidade Presbiteriana Mackenzie

    }

    public final boolean validateEmail(UserDTO user) {
        if( !user.email().contains("@")){
            return false;
        };
        String[] domain = user.email().split("@");
        if (emailDomains.contains(domain)) {
            return true;
        } else {
        return false;
        }
    }
}