package pruebasjpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.itinajero.app.model.Arpfoe;
import net.itinajero.app.repository.IArpfoeRepository;

public class AppConexion {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		IArpfoeRepository repo = context.getBean("arpRepo",IArpfoeRepository.class);
		//repo.findAll();
		
		for (Arpfoe arp : repo.findAll()) {
			System.out.println(arp);
		}
		
		context.close();

	}

}
