package HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Controller;

import HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Model.StudModel;
import HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudController {

    @Autowired
    private StudService studService;

    @PostMapping("/addData")
    public void addData(@RequestBody StudModel s)
    {
        studService.addData(s);
    }
//-------------------------------------------

    @PutMapping("/updateData")
    public void updateData(@RequestBody StudModel s)
    {
        studService.updateData(s);
    }
    //------------------------------------------
    @DeleteMapping("/deleteData/{id}")
    public void deleteData(@PathVariable int id)
    {
        studService.deleteData(id);
    }
    //--------------------------------------------
    @GetMapping("/displayData")
    public List<StudModel> displayData()
    {
        return studService.displayData();
    }
    //-------------------------------------------

    @GetMapping("/displayData1")
    public List<StudModel> displayData1()
    {
        return studService.displayData1();
    }
    //--------------------------------------------
    @GetMapping("/displayDataByName/{name}")
    public List<StudModel> displayDataByName(@PathVariable String name)
    {
        return studService.displayDataByName(name);
    }
    //--------------------------------------------------------------------
    @PutMapping("/updateData1")
    public void updateData1(@RequestParam String name,int id)
    {
        studService.updateData1(name,id);
    }
    //--------------------------------------------------------------------
    @DeleteMapping("/deleteData1")
    public void deleteData1(@RequestParam int id)
    {
        studService.deleteData1(id);
    }
    //-------------------------------------------------------------------
    @PostMapping("/addData1")
    public void addData1(@RequestBody String name,long contNo,double marks)
    {
        studService.addData1(name,contNo,marks);
    }
    //----------------------------------------------------------------------
    @GetMapping("/displayDataWithKChar")
    public List<StudModel> displayDataWithKChar()
    {
        return studService.displayDataWithKChar();
    }
    //----------------------------------------------------------------------
    @GetMapping("/displayDistinctName")
    public List<String> displayDistinctName()
    {
        return studService.displayDistinctName();
    }
    //----------------------------------------------------------------------
    @GetMapping("/displayStudentWhoseNameAndMarks")
    public List<StudModel> displayStudentWhoseNameAndMarks(@RequestParam String name,double marks)
    {
        return studService.displayStudentWhoseNameAndMarks(name,marks);
    }
}
