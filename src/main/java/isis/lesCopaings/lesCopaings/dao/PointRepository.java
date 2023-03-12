package isis.lesCopaings.lesCopaings.dao;

import isis.lesCopaings.lesCopaings.entity.Point;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PointRepository extends JpaRepository<Point, Integer> {

    /**
     * Recherche le point par son idpoint (unique)
     * @param idpoint L'id du point recherché
     * @return le point ayant idpoint comme id
     */
    Point findByIdpoint(int idpoint);

    /**
     * Recherche le point ayant un nom donné
     * @param nom le nom recherché
     * @return Le Point ayant ce nom
     */
    Point findByNom(String nom);

    /**
     * Recherche les points dont le nom contient une sous-chaine donnée
     * @param substring la sous-chaine à rechercher dans le nom
     * @return la liste des Points dont le nom contient substring
     */
    List<Point> findByNomContaining(String substring);

    /**
     * Recherche le point ayant une adresse donné
     * @param adresse l'adresse du point recherché
     * @return Le Point ayant cette adresse
     */
    Point findByAdresse(String adresse);

    /**
     * Recherche les points dont l'adresse contient une sous-chaine donnée
     * @param substring la sous-chaine à rechercher dans l'adresse
     * @return la liste des Points dont l'adresse contient substring
     */
    List<Point> findByAdresseContaining(String substring);
}
