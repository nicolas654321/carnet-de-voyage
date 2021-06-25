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

@Entity
@Table(name = "etape")
public class Etape {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String ville;
    private LocalDate dateVenue;
    private String resume;
    
    @OneToMany (mappedBy="etape")
    @Column(columnDefinition="int")
    private List<Lien> liens;
    
    @ManyToOne
    @JoinColumn(name="destination_id", columnDefinition="int")
    private Destination destination;
    
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
