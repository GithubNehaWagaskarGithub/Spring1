package HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Repository;

import HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Model.StudModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Repository
public interface StudRepository extends JpaRepository<StudModel,Integer> {

    //@Query("from Student s where s.sName=:name")
    //public List<Student> displayByName(@Param("name") String name);
    //------------------------------------------------------------------

    @Query("from StudModel")
    public List<StudModel> displayData1();
    //---------------------------------------

    @Query("from StudModel s where s.sName=:name")
    public List<StudModel> displayDataByName(String name);

    //---------------------------------------------------------

    @Modifying
    @Transactional
    @Query("update StudModel set sName=:name where sId=:id")
    public void updateData1(@Param("name") String name,@Param("id") int id);

    //------------------------------------------------------------------------

    @Modifying
    @Transactional
    @Query("delete from StudModel where sId=:id")
    public void deleteData1(@Param("id") int id);
    //-----------------------------------------------------
    @Modifying
    @Transactional
    @Query("insert into StudModel (sName,sContNo,sMarks) values(:name,:contNo,:marks)")
    public void addData1(@Param("name") String name,@Param("contNo") long contNo,@Param("marks") double marks);
    //---------------------------------------------------------------

    @Query("from StudModel s where s.sName like 'K%'")
    public List<StudModel> displayDataWithKChar();
    //-----------------------------------------------------

    @Query("select distinct s.sName from StudModel s")
    public List<String> displayDistinctName();
    //--------------------------------------------------------

    @Query("from StudModel where sName=:name and sMarks>:marks")
    public List<StudModel> displayStudentWhoseNameAndMarks(@Param("name") String name,@Param("marks") double marks);
}
