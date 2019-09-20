package pruebasquery;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.itinajero.app.repository.IArpfoeRepository;

public class AppKeywordFindBy {
	public static void main(String[] args) {	 
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
	 IArpfoeRepository repo = context.getBean("arpRepo",IArpfoeRepository.class);
	 
	 context.close();
	 
	 
	}
}
