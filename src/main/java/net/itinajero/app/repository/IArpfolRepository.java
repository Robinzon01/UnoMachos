package net.itinajero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.app.model.Arpfol;
import net.itinajero.app.model.IdArpfol;

@Repository("arpfolRepo")
public interface IArpfolRepository extends JpaRepository<Arpfol, IdArpfol> {

}
