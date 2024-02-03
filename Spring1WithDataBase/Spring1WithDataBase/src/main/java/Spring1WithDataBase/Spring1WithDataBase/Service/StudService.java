package Spring1WithDataBase.Spring1WithDataBase.Service;

import Spring1WithDataBase.Spring1WithDataBase.Model.StudModel;
import Spring1WithDataBase.Spring1WithDataBase.Repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class StudService {

    @Autowired
    private StudRepository studRepository;

    public List<StudModel> displayData()
    {
        return studRepository.findAll();
    }
    //------------------------------------------------

    public void addData(StudModel s)
    {
        studRepository.save(s);
    }
    //------------------------------------------------

    public void updateData(StudModel s)
    {
        studRepository.save(s);
    }
    //-------------------------------------------------

    public void deleteData(int id)
    {
        studRepository.deleteById(id);
    }
}
