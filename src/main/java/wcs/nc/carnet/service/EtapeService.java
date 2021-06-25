package wcs.nc.carnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcs.nc.carnet.dto.DestinationDto;
import wcs.nc.carnet.dto.EtapeDto;
import wcs.nc.carnet.entity.Etape;
import wcs.nc.carnet.repository.EtapeRepository;

@Service
public class EtapeService {

    @Autowired
    private EtapeRepository etapeRepo;

    @Autowired
    private DestinationService destinationSrv;
    
    public void save(EtapeDto aEtapeDto, Integer aIdDestination) {
        DestinationDto dest = destinationSrv.findById(aIdDestination);
        Etape etape = convEtapeDtoToEtape(aEtapeDto);
        etape.setDestination(destinationSrv.convDestinationDtoToDestination(dest));
        etapeRepo.save(etape);
    }
    
    
    private Etape convEtapeDtoToEtape(EtapeDto etapeDto) {
        if (etapeDto.getId() == null) {
            return new Etape(etapeDto.getVille(), etapeDto.getDateVenue(), etapeDto.getResume(), etapeDto.getLiens(), etapeDto.getDestination());
        } else {
            return new Etape(etapeDto.getId(), etapeDto.getVille(), etapeDto.getDateVenue(), etapeDto.getResume(), etapeDto.getLiens(), etapeDto.getDestination());
        }
    }
    
    
}
