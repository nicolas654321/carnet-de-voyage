package wcs.nc.carnet.dto;

import wcs.nc.carnet.entity.Etape;

public class LienDto {

    
    private Integer id;
    private String chemLien;
    private Etape etape;
    public Integer getId() {
        return id;
    }
    public void setId(Integer aId) {
        id = aId;
    }
    public String getChemLien() {
        return chemLien;
    }
    public void setChemLien(String aChemLien) {
        chemLien = aChemLien;
    }
    public Etape getEtape() {
        return etape;
    }
    public void setEtape(Etape aEtape) {
        etape = aEtape;
    }
    
    
}
