package pruebasjpa;


import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;

import net.itinajero.app.model.IdArpfoe;
import net.itinajero.app.repository.IArpfoeRepository;

public class AppConexion {

	public static void main(String[] args) {
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		IArpfoeRepository repo = context.getBean("arpRepo",IArpfoeRepository.class);
        
		List<IdArpfoe> listaIdArp = new LinkedList<IdArpfoe>();
		listaIdArp.add(new IdArpfoe("01","9320014142"));
		// BUSCAR CON LAS CLAVES PRIMARIAS
		repo.findAllById(listaIdArp).stream().forEach(p -> System.out.println(p));
		System.out.println("-----------------------------------------------------------");

		//OBTENER TODAS LAS ENTIDADES POR PAGINACION
		repo.findAll(PageRequest.of(0, 10)).stream().forEach(p -> System.out.println(p));

        context.close();
      
	}

}
