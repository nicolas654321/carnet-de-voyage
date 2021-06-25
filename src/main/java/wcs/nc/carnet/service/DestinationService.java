package wcs.nc.carnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcs.nc.carnet.entity.Destination;
import wcs.nc.carnet.repository.DestinationRepository;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepo;

    public List<Destination> findAll() {
        return destinationRepo.findAll();
    }
    
    
}
