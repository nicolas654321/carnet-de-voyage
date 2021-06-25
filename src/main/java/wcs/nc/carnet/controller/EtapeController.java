package wcs.nc.carnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import wcs.nc.carnet.dto.EtapeDto;
import wcs.nc.carnet.service.EtapeService;

@Controller
public class EtapeController {

    @Autowired 
    private EtapeService etapeSrv;
    
    @PostMapping("/createetape/{idDestination}")
    public String createEtape(@ModelAttribute EtapeDto etapeDto, @PathVariable(name = "idDestination") Integer idDestination) {
        etapeSrv.save(etapeDto, idDestination);
        return "redirect:/editdestination/" + idDestination;
    }
    
    
    
    
    
}
