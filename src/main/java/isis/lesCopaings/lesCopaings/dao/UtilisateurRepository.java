package isis.lesCopaings.lesCopaings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import isis.lesCopaings.lesCopaings.entity.Utilisateur;
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}
