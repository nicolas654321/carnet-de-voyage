package wcs.nc.carnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wcs.nc.carnet.entity.Lien;

@Repository
public interface LienRepository extends JpaRepository<Lien, Integer> {

    
}
