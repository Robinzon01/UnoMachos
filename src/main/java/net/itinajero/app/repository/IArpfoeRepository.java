package net.itinajero.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.app.model.Arpfoe;

@Repository("arpRepo")
public interface IArpfoeRepository extends CrudRepository<Arpfoe, Integer> {

}
