package pruebasquery;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;

import net.itinajero.app.repository.IArpfolRepository;

public class MuchosUno {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		IArpfolRepository repo = context.getBean("arpfolRepo",IArpfolRepository.class);		
		//OBTENER TODAS LAS ENTIDADES POR PAGINACION
	    repo.findAll(PageRequest.of(0, 10)).stream().forEach(p -> System.out.println(p));

	}

}
