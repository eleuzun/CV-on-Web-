package cv.onweb.ro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionalSkillsRepository extends JpaRepository<ProfessionalSkills, Long>{

}
