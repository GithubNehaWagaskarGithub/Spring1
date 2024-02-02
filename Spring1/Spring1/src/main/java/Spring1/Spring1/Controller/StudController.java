package Spring1.Spring1.Controller;

import Spring1.Spring1.Model.StudModel;
import Spring1.Spring1.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.StringJoiner;


@RestController
public class StudController {

    @Autowired
    private StudService studService;

    @GetMapping("/displayAllData")
    public List<StudModel> displayData()
    {
        return studService.displayData();
    }
    //----------------------------------------------------------------------
    @PostMapping("/addData")
    public String addData(@RequestBody StudModel s)
    {
        return studService.addData(s);
    }

    //-------------------------------------------------------------------------------------------------
    @PutMapping("/updateData")
    public String updateData(@RequestParam int id, String name)
    {
        return studService.updateData(id,name);
    }
    //-----------------------------------------------------------------------------------------------
    @DeleteMapping("/deleteData/{id}")
    public String deleteData(@PathVariable int id)
    {
        return studService.deleteData(id);
    }
    //---------------------------------------------------------------------------------------------
}
