package wcs.nc.carnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcs.nc.carnet.repository.DestinationRepository;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepo;
    
    
}
