package wcs.nc.carnet.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import wcs.nc.carnet.entity.Destination;
import wcs.nc.carnet.entity.Lien;

public class EtapeDto {

    private Integer id;
    private String ville;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateVenue;
    private String resume;
    private List<Lien> liens;
    private Destination destination;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer aId) {
        id = aId;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String aVille) {
        ville = aVille;
    }
    public LocalDate getDateVenue() {
        return dateVenue;
    }
    public void setDateVenue(LocalDate aDateVenue) {
        dateVenue = aDateVenue;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String aResume) {
        resume = aResume;
    }
    public List<Lien> getLiens() {
        return liens;
    }
    public void setLiens(List<Lien> aLiens) {
        liens = aLiens;
    }
    public Destination getDestination() {
        return destination;
    }
    public void setDestination(Destination aDestination) {
        destination = aDestination;
    }

    
}
