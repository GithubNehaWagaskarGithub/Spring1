package Spring2WithDataBase.Spring2WithDataBase.Controller;

import Spring2WithDataBase.Spring2WithDataBase.Model.Student;
import Spring2WithDataBase.Spring2WithDataBase.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudController {
    @Autowired
    private StudService studService;

    @GetMapping("/displayData")
    public List<Student> displayData()
    {
        return studService.displayData();
    }
    //----------------------------------------------------------------------------------
    @PostMapping("/addData")
    public void addData(@RequestBody Student s)
    {
        studService.addData(s);
    }
    //----------------------------------------------------------------------------------
    @PutMapping("/updateData")
    public void updateData(@RequestBody Student s)
    {
        studService.updateData(s);
    }
    //-----------------------------------------------------------------------------------
    @DeleteMapping("/deleteData/{id}")
    public void deleteData(@PathVariable int id)
    {
        studService.deleteData(id);
    }
    //---------------------------------------------------------------------------------
}
