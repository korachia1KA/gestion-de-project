package com.example.gestionprojet;

import com.example.gestionprojet.dao.model.Role;
import com.example.gestionprojet.dao.model.User;
import com.example.gestionprojet.dao.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class GestionprojetApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionprojetApplication.class, args);
    }

    @Bean
    CommandLineRunner initMembreEquipe(UserRepository userRepository,
                                       PasswordEncoder passwordEncoder) {
        return args -> {
            String email = "membre@eple.com";

            if (userRepository.findByEmail(email).isEmpty()) {
                User membre = User.builder()
                        .nom("Alaoui")
                        .prenom("Youssef")
                        .email(email)
                        .password(passwordEncoder.encode("Membre@123"))
                        .telephone("0600000000")
                        .poste("Développeur")
                        .departement("IT")
                        .role(Role.ADMIN)
                        .firstLogin(false)
                        .build();

                userRepository.save(membre);
                System.out.println("Membre d'équipe créé : " + email);
            } else {
                System.out.println("Membre d'équipe déjà existant : " + email);
            }
        };
    }
}