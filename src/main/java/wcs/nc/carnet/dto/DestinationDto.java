package wcs.nc.carnet.dto;

import java.time.LocalDate;
import java.util.List;

import wcs.nc.carnet.entity.Etape;

public class DestinationDto {

    private Integer id;
    private String nom;
    private String pays;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private List<Etape> lstEtapes;
    
    public DestinationDto(int aId, String aNom, String aPays, LocalDate aDateDebut, LocalDate aDateFin, List<Etape> aLstEtapes) {
        this.id = aId;
        this.nom = aNom;
        this.pays = aPays;
        this.dateDebut = aDateDebut;
        this.dateFin = aDateFin;
        this.lstEtapes = aLstEtapes;
    }
    public DestinationDto() {

    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer aId) {
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
