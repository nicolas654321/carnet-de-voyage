package wcs.nc.carnet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lien")
public class Lien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String chemLien;

    @ManyToOne
    @JoinColumn(name="etape_id", columnDefinition="int")
    private Etape etape;
    
    public int getId() {
        return id;
    }

    public void setId(int aId) {
        id = aId;
    }

    public String getChemLien() {
        return chemLien;
    }

    public void setChemLien(String aChemLien) {
        chemLien = aChemLien;
    }
    
}
