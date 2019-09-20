package pruebasquery;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;

import net.itinajero.app.repository.IArpfoeRepository;

/**
 * @author Robin-PC
 *
 */
public class UnoMuchos {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		IArpfoeRepository repo = context.getBean("arpRepo",IArpfoeRepository.class);
		
		//OBTENER TODAS LAS ENTIDADES POR PAGINACION
	    repo.findAll(PageRequest.of(0, 10)).stream().forEach(p -> System.out.println(p));

	}

}
