package wcs.nc.carnet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcs.nc.carnet.dto.DestinationDto;
import wcs.nc.carnet.entity.Destination;
import wcs.nc.carnet.repository.DestinationRepository;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepo;

    public List<DestinationDto> findAll() {
        List<DestinationDto> lstDto = new ArrayList<DestinationDto>();
        List<Destination> lstDest = destinationRepo.findAll();
        for (Destination dest : lstDest) {
            lstDto.add(convDestinationToDestinationDto(dest));
        }
        return lstDto;
    }

    public void save(DestinationDto aDestination) {
        destinationRepo.save(convDestinationDtoToDestination(aDestination));
    }
    
    public Destination convDestinationDtoToDestination(DestinationDto destDto) {
        
        Destination dest = new Destination(destDto.getNom(),destDto.getPays(), destDto.getDateDebut(), 
                destDto.getDateFin(), destDto.getLstEtapes());
        System.out.println("convDto to Dest : ");
        if (destDto.getId() != null ) {
            System.out.println("Id found : " + destDto.getId());
            dest.setId(destDto.getId());
        } else {
            System.out.println("Id not found!");
        }
        return dest;
    }
    
    public DestinationDto convDestinationToDestinationDto(Destination dest) {
        return new DestinationDto(dest.getId(),dest.getNom(), dest.getPays(), dest.getDateDebut(), dest.getDateFin(), dest.getLstEtapes());
    }

    public DestinationDto findById(Integer aId) {
        Optional<Destination> optDest = destinationRepo.findById(aId);
        if (optDest.isPresent()) {
            return convDestinationToDestinationDto(optDest.get());
        }
        return null;
    }

}
