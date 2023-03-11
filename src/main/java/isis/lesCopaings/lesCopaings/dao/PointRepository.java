package isis.lesCopaings.lesCopaings.dao;

import isis.lesCopaings.lesCopaings.entity.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Integer> {
}
