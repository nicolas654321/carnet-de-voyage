package wcs.nc.carnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wcs.nc.carnet.entity.Etape;

@Repository
public interface EtapeRepository extends JpaRepository<Etape, Integer> {

    
}
