package wcs.nc.carnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import wcs.nc.carnet.dto.DestinationDto;
import wcs.nc.carnet.service.DestinationService;

@Controller
public class DestinationController {

    @Autowired
    private DestinationService destinationSrv;
    
    @GetMapping("/")
    public String findAll(Model model) {
        List<DestinationDto> destinations = destinationSrv.findAll();
        model.addAttribute("lstdestination", destinations);
        return "index";
    }

    @GetMapping("/admin")
    public String pageAdmin() {
        return "admin";
    }
    
    
    @GetMapping("/createdestination")
    public String createDestination(Model model) {
        DestinationDto destinationDto = new DestinationDto();
        model.addAttribute("destination", destinationDto);
        return "createdestination";
    }
    
    @PostMapping("/createdestination")
    public String createDestination(@ModelAttribute DestinationDto destination) {
        destinationSrv.create(destination);
        return "admin";
    }

    
    
    
}
