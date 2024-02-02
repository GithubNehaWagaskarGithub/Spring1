package HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HqlCrudOperationWithDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HqlCrudOperationWithDataBaseApplication.class, args);
	}

}
//select max(sal),deptno from emp where deptno!=10 group by deptno;
//select mas(sal),deptno from emp where deptno!=20 group by deptno having max(sal)>2000;
//select ename,dname from emp e inner join dept d on e.deptno=d.deptno;
//select ename.dname from emp e natural join dept d;
//select ename,dname from emp e cross join dept d;
//select e1.ename as "EmpName",e2.ename as "MGR" from e1.emp,e2.emp on e1.mgr=e2.empno;
//select ename,dname from emp e left join dept d on e.deptno=d.deptno;