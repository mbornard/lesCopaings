package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Utilisateur;
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
