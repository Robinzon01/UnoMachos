package net.itinajero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.app.model.Arpfoe;
import net.itinajero.app.model.IdArpfoe;


@Repository("arpRepo")
public interface IArpfoeRepository extends JpaRepository<Arpfoe,IdArpfoe> {
    //extends CrudRepository<Arpfoe, Integer>
   
}
