package wcs.nc.carnet.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "etape")
public class Etape {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String ville;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateVenue;
    private String resume;
    
    @OneToMany (mappedBy="etape")
    @Column(columnDefinition="int")
    private List<Lien> liens;
    
    @ManyToOne
    @JoinColumn(name="destination_id", columnDefinition="int")
    private Destination destination;
    
    public Etape(String aVille, LocalDate aDateVenue, String aResume, List<Lien> aLiens, Destination aDestination) {
        this.ville = aVille;
        this.dateVenue = aDateVenue;
        this.resume = aResume;
        this.liens = aLiens;
        this.destination = aDestination;
    }

    public Etape(Integer aId, String aVille, LocalDate aDateVenue, String aResume, List<Lien> aLiens, Destination aDestination) {
        this.id = aId;
        this.ville = aVille;
        this.dateVenue = aDateVenue;
        this.resume = aResume;
        this.liens = aLiens;
        this.destination = aDestination;
                
    }
    public int getId() {
        return id;
    }
    public void setId(int aId) {
        id = aId;
    }
    public Destination getDestination() {
        return destination;
    }
    public void setDestination(Destination aDestination) {
        destination = aDestination;
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
    
    
}
