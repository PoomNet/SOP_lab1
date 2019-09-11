package maven.web.lab01;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRes extends JpaRepository<Mobile, Long> {

}
