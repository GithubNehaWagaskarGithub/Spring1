package Spring2.Spring2.Controller;

import Spring2.Spring2.Model.Student;
import Spring2.Spring2.Service.StudService;
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
    //-----------------------------------------------------------------------------------------
    @PostMapping("/addData")
    public String addData(@RequestBody Student s)
    {
        return studService.addData(s);
    }
    //------------------------------------------------------------------------------------------
    @PutMapping("/updateData")
    public String updateData(@RequestParam int id,String name)
    {
        return studService.updateData(id,name);
    }
    //-------------------------------------------------------------------------------------------
    @DeleteMapping("/deleteData/{id}")
    public String deleteData(@PathVariable int id)
    {
        return studService.deleteData(id);
    }
    //------------------------------------------------------------------------------------------
}
