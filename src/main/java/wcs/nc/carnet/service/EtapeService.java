package wcs.nc.carnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcs.nc.carnet.repository.EtapeRepository;

@Service
public class EtapeService {

    @Autowired
    private EtapeRepository etapeRepo;
    
    
}
