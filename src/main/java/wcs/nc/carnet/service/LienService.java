package wcs.nc.carnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcs.nc.carnet.repository.LienRepository;

@Service
public class LienService {

    @Autowired
    private LienRepository lienRepo;
    
    
    
}
