package hibernate;
import org.junit.Ignore;
import org.junit.Test;
import com.skillstorm.beans.Person;
import com.skillstorm.data.PersonDAO;

public class PersonDAOTest {
	
	PersonDAO dao = new PersonDAO();
	
	@Test
	@Ignore
	public void testInsert() {
		Person p = new Person();
		p.setName("Reese");
		p.setAge(50);
		dao.insert(p);
	}
	
	@Test
	@Ignore
	public void findByName() {
		System.out.println(dao.findByName("Steven"));
	}
	
	@Test
	@Ignore
	public void testFindAll() {
		dao.findAll();
	}
	
	@Test
	public void testFindById() {
		System.out.println(dao.findById(2));
	}
	
}
