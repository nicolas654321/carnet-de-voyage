package wcs.nc.carnet.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "destination")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nom;
    private String pays;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    
    @OneToMany (mappedBy="destination")
    @Column(columnDefinition="int")
    private List<Etape> lstEtapes;

    public Destination(int aId, String aNom, String aPays, LocalDate aDateDebut, LocalDate aDateFin, List<Etape> aLstEtapes) {
        this.id = aId;
        this.nom = aNom;
        this.pays = aPays;
        this.dateDebut = aDateDebut;
        this.dateFin = aDateFin;
        this.lstEtapes = aLstEtapes;
    }
    
    
    public Destination(String aNom, String aPays, LocalDate aDateDebut, LocalDate aDateFin, List<Etape> aLstEtapes) {
        this.nom = aNom;
        this.pays = aPays;
        this.dateDebut = aDateDebut;
        this.dateFin = aDateFin;
        this.lstEtapes = aLstEtapes;
    }
    
    public Destination() {
        
    }
    
    public int getId() {
        return id;
    }
    public void setId(int aId) {
        id = aId;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String aNom) {
        nom = aNom;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String aPays) {
        pays = aPays;
    }
    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(LocalDate aDateDebut) {
        dateDebut = aDateDebut;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }
    public void setDateFin(LocalDate aDateFin) {
        dateFin = aDateFin;
    }
    public List<Etape> getLstEtapes() {
        return lstEtapes;
    }
    public void setLstEtapes(List<Etape> aLstEtapes) {
        lstEtapes = aLstEtapes;
    }
    
    
}
