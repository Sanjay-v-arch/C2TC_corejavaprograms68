//program to define interface for CRUD operation
package DayTwentyThree.v1.Service;
import java.sql.SQLException;
import java.util.List;
import DayTwentyThree.v1.Employee;
public interface IEmployeeService {
	List<Employee> getAllEmployees() throws SQLException;
	Employee getEmployeeById(int empId) throws SQLException;
	void addEmployee(Employee e)throws SQLException;
	boolean deleteEmployee(int empId) throws SQLException;
	boolean updateEmployee(int empId, Employee e) throws SQLException;
	

}
