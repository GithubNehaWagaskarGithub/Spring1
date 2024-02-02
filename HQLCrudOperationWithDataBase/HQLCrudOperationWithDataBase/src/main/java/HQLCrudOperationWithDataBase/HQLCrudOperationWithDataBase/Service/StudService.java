package HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Service;

import HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Model.StudModel;
import HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class StudService {

    @Autowired
    private StudRepository studRepository;

    public void addData(StudModel s)
    {
        studRepository.save(s);
    }
    //---------------------------------------

    public void updateData(StudModel s)
    {
        studRepository.save(s);
    }
    //-------------------------------------
    public void deleteData(int id)
    {
        studRepository.deleteById(id);
    }
    //-------------------------------------
    public List<StudModel> displayData()
    {
        return studRepository.findAll();
    }
    //--------------------------------------
    public List<StudModel> displayData1()
    {
        return studRepository.displayData1();
    }
    //------------------------------------------
    public List<StudModel> displayDataByName(String name)
    {
        return studRepository.displayDataByName(name);
    }
    //-------------------------------------------------
    public void updateData1(String name,int id)
    {
        studRepository.updateData1(name,id);
    }
    //------------------------------------------------
    public void deleteData1(int id)
    {
        studRepository.deleteData1(id);
    }
    //-------------------------------------------------
    public void addData1(String name,long contNo,double marks)
    {
        studRepository.addData1(name,contNo,marks);
    }
    //--------------------------------------------------------
    public List<StudModel> displayDataWithKChar()
    {
        return studRepository.displayDataWithKChar();
    }
    //--------------------------------------------------------
    public List<String> displayDistinctName()
    {
        return studRepository.displayDistinctName();
    }
    //-----------------------------------------------------------
    public List<StudModel> displayStudentWhoseNameAndMarks(String name,double marks)
    {
        return studRepository.displayStudentWhoseNameAndMarks(name,marks);
    }
    //----------------------------------------------------------------------------------
}
