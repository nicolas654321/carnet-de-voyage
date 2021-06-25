package wcs.nc.carnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

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
    public String pageAdmin(Model model) {
        List<DestinationDto> destinations = destinationSrv.findAll();
        model.addAttribute("lstdestination", destinations);
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
        destinationSrv.save(destination);
        return "redirect:/admin";
    }

    @GetMapping("/editdestination/{id}")
    public String editDestination(Model model, @PathVariable(name = "id") Integer id) {
        DestinationDto destinationDto = destinationSrv.findById(id);
        if (destinationDto == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Destination ID not found "+id);
        }
        model.addAttribute("destination", destinationDto);
        return "editdestination";
    }
    
    @PostMapping("/updatedestination")
    public String updateDestination(@ModelAttribute DestinationDto destinationDto) {
        destinationSrv.save(destinationDto);
        return "redirect:/admin";
    }
    
}
