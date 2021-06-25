package wcs.nc.carnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wcs.nc.carnet.entity.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Integer> {

    
}
