package wcs.nc.carnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import wcs.nc.carnet.entity.Destination;
import wcs.nc.carnet.service.DestinationService;

@Controller
public class DestinationController {

    @Autowired
    private DestinationService destinationSrv;
    
    @GetMapping("/")
    public String getAll(Model model) {
        List<Destination> destinations = destinationSrv.findAll();
        model.addAttribute("lstdestination", destinations);
        return "index";
    }

    
    
}
