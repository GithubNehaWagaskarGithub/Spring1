package Spring1WithDataBase.Spring1WithDataBase.Controller;



import Spring1WithDataBase.Spring1WithDataBase.Model.StudModel;
import Spring1WithDataBase.Spring1WithDataBase.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudController {

    @Autowired
    private StudService studService;

    @GetMapping("/displayAllData")
    public List<StudModel> displayData()
    {
        return studService.displayData();
    }

    //-------------------------------------------

    @PostMapping("/addData")
    public void addData(@RequestBody StudModel s)
    {
        studService.addData(s);
    }
    //-----------------------------------------------
    @PutMapping("/updateData")
    public void updateData(@RequestBody StudModel s)
    {
        studService.addData(s);
    }

    //-------------------------------------------------
    @DeleteMapping("/deleteData/{id}")
    public void deleteData(@PathVariable int id)
    {
        studService.deleteData(id);
    }

}
