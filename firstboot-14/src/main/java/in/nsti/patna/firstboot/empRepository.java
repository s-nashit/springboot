package in.nsti.patna.firstboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empRepository extends JpaRepository<Employee, Long> {
}