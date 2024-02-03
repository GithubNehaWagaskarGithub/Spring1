package Spring2.Spring2.Service;

import Spring2.Spring2.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class StudService {

    @Autowired
    private Student student;

    List<Student> data=new ArrayList<Student>();
    {
        Student s1=new Student(101,"Neha","A",85.78);
        Student s2=new Student(102,"Ayush","B",98.99);
        Student s3=new Student(103,"Piu","C",81.99);
        Student s4=new Student(104,"Aaku","D",88.09);
        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
    }
    //-------------------------------------------------------------------------------
    public List<Student> displayData()
    {
        return data;
    }
    //-------------------------------------------------------------------------------
    public String addData(Student s)
    {
        if(data.add(s))
        {
            return "Data Added Successfully";
        }
        else
        {
            return "Data Not Added";
        }
    }
    //------------------------------------------------------------------------------------
    public String updateData(int id,String name)
    {
        boolean status=true;
        Student s1=null;
        for(Student s:data)
        {
            if(id==s.getSId())
            {
                s.setSName(name);
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
    //-------------------------------------------------------------------------------------------------
    public String deleteData(int id)
    {
        boolean status=true;
        Student s1=null;
        for(Student s:data)
        {
            if(id==s.getSId())
            {
                data.remove(s);
                status=false;
                break;
            }
        }
        if(status=false)
        {
            return "Data Deleted";
        }
        else {
            return "Data Not Deleted";
        }
    }
}
