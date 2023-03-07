package dao;
import org.springframework.data.jpa.repository.JpaRepository;
import entity.Passagers;
public interface PassagersRepository extends JpaRepository<Passagers, Long>{
}
