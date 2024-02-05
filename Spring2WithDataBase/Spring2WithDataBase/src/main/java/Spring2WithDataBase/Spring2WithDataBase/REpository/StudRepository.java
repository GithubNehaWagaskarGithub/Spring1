package Spring2WithDataBase.Spring2WithDataBase.REpository;

import Spring2WithDataBase.Spring2WithDataBase.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepository extends JpaRepository<Student,Integer>
{

}
