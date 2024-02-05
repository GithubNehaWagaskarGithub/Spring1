package Spring2WithDataBase.Spring2WithDataBase.Service;

import Spring2WithDataBase.Spring2WithDataBase.Model.Student;
import Spring2WithDataBase.Spring2WithDataBase.REpository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class StudService {
    @Autowired
    private StudRepository studRepository;

    public List<Student> displayData()
    {
        return studRepository.findAll();
    }
    //------------------------------------------------------------------
    public void addData(Student s)
    {
        studRepository.save(s);
    }
    //------------------------------------------------------------------
    public void updateData(Student s)
    {
        studRepository.save(s);
    }
    //-----------------------------------------------------------------------
    public void deleteData(int id)
    {
        studRepository.deleteById(id);
    }
    //--------------------------------------------------------------------------
}
