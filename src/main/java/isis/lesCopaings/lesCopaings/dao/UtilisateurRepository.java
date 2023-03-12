package isis.lesCopaings.lesCopaings.dao;

import isis.lesCopaings.lesCopaings.entity.Trajet;
import jdk.jshell.execution.Util;
import org.springframework.data.jpa.repository.JpaRepository;
import isis.lesCopaings.lesCopaings.entity.Utilisateur;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    /**
     * Recherche les utilisateur portant un nom donné
     * @param nom le nom recherché
     * @return Les ultilisateurs portant ce nom
     */
    List<Utilisateur> findByNom(String nom);

    /**
     * Recherche les utilisateurs dont le nom contient une sous-chaine donnée
     * @param substring la sous-chaine à rechercher dans le nom
     * @return la liste des utilisateurs dont le nom contient substring
     */
    List<Utilisateur> findByNomContaining(String substring);

    /**
     * Recherche les utilisateur portant un prenom donné
     * @param prenom le prenom recherché
     * @return Les ultilisateurs portant ce prenom
     */
    List<Utilisateur> findByPrenom(String prenom);

    /**
     * Recherche les utilisateurs dont le prenom contient une sous-chaine donnée
     * @param substring la sous-chaine à rechercher dans le prenom
     * @return la liste des utilisateurs dont le prenom contient substring
     */
    List<Utilisateur> findByPrenomContaining(String substring);



    /**
     * Recherche un utilisateurs par son id (unique)
     * @param userid la date de depart recherché
     * @return L'utilisateur ayant userid comme identifiant
     */
    Utilisateur findByUserid(int userid);
}
