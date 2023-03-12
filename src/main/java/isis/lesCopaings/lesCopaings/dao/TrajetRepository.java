package isis.lesCopaings.lesCopaings.dao;

import isis.lesCopaings.lesCopaings.entity.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrajetRepository extends JpaRepository<Trajet, Integer> {
    /**
     * Recherche les trajets qui ont pour point d'arrivee, un id de point donné
     * @param idpointarrivee l'id du point d'arrivee recherché
     * @return Les trajet avec ce point d'arrivee
     */
    List<Trajet> findByIdpointarrivee(int idpointarrivee);


    /**
     * Recherche les trajets ayant pour date de depart un date donnée
     * @param datedepart la date de depart recherché
     * @return Les trajets qui parte à cette date
     */
    List<Trajet> findByDatedepart(int datedepart);

    /**
     * Recherche les trajets ayant pour conducteur, un utilisateur de userid donné
     * @param userid l'id de l'utilsateur ayant proposé ce trajet
     * @return Les trajets proposé par l'utilisateur d'id userid
     */
    List<Trajet> findByUserid(int userid);

    /**
     * Recherche un trajet par son numero de trajet (unique)
     * @param numtrajet de numero du trajet recherché
     * @return Le trajet ayant pour numtrajet le numero de trajet
     */
    Trajet findByNumtrajet(int numtrajet);
}
