package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.ramazan.mvc101.core.model.mapping.Employee;

public class App {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		session.beginTransaction();
		Employee employee = new Employee();
		employee.setEmpName("Ramazan ASLAN");
		employee.setBranch("IT");
		session.save(employee);
		
		Employee employee2 = new Employee();
		employee2.setEmpName("Mert TOLON");
		employee2.setBranch("IT");
		session.save(employee2);
		
		session.getTransaction().commit();
	}

}
