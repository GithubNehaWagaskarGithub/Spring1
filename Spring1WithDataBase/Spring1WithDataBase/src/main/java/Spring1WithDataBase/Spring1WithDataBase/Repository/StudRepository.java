package Spring1WithDataBase.Spring1WithDataBase.Repository;

import Spring1WithDataBase.Spring1WithDataBase.Model.StudModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepository extends JpaRepository<StudModel,Integer> {
}
