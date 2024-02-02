package Spring1.Spring1.Service;

import Spring1.Spring1.Model.StudModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class StudService {

    @Autowired
    private StudModel studModel;

    List<StudModel> studList=new ArrayList<>();
    {
        StudModel s1=new StudModel(101,"Neha",987654321);
        StudModel s2=new StudModel(102,"Ayush",987654321);
        StudModel s3=new StudModel(103,"Aishu",987654321);
        StudModel s4=new StudModel(104,"Anki",987654321);
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
    }
//-----------------------------------------------------------------------------------------
    public List<StudModel> displayData()
    {
        return studList;
    }
    //--------------------------------------------------------------

    public String addData(StudModel s)
    {
        if(studList.add(s))
        {
            return "Data Added";
        }
        else {
            return "Data Not Added";
        }
    }

    //----------------------------------------------------------------
    public String updateData(int id,String name)
    {
        boolean status=true;
        StudModel s1=null;
        for(StudModel s:studList)
        {
            if(id==s.getsId())
            {
                s.setsName(name);
                status=false;
                break;
            }
        }
        if(status=false)
        {
            return "Data Updated";
        }
        else {
            return "Data Not Updated";
        }
    }
    //----------------------------------------------------------------------------------------------

    public String deleteData(int id)
    {
        boolean status=true;
        StudModel s1=null;
        for(StudModel s:studList)
        {
            if(id==s.getsId())
            {
                studList.remove(s);
                status=false;
                break;
            }
        }
        if(status=true)
        {
            return "Data Deleted";
        }
        else {
            return "Data Not Deleted";
        }
    }
    //---------------------------------------------------------------------------------------------------------
}
