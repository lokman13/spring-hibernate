package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Ventnrml {
    private int idVentNrml;
    private int idVent;
    private String nomArticle;
    private Date dateVent;

    @Id
    @Column(name = "id_vent_nrml", nullable = false)
    public int getIdVentNrml() {
        return idVentNrml;
    }

    public void setIdVentNrml(int idVentNrml) {
        this.idVentNrml = idVentNrml;
    }

    @Basic
    @Column(name = "id_vent", nullable = false)
    public int getIdVent() {
        return idVent;
    }

    public void setIdVent(int idVent) {
        this.idVent = idVent;
    }

    @Basic
    @Column(name = "nomArticle", nullable = false, length = 20)
    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    @Basic
    @Column(name = "dateVent", nullable = false)
    public Date getDateVent() {
        return dateVent;
    }

    public void setDateVent(Date dateVent) {
        this.dateVent = dateVent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ventnrml ventnrml = (Ventnrml) o;

        if (idVentNrml != ventnrml.idVentNrml) return false;
        if (idVent != ventnrml.idVent) return false;
        if (nomArticle != null ? !nomArticle.equals(ventnrml.nomArticle) : ventnrml.nomArticle != null) return false;
        if (dateVent != null ? !dateVent.equals(ventnrml.dateVent) : ventnrml.dateVent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVentNrml;
        result = 31 * result + idVent;
        result = 31 * result + (nomArticle != null ? nomArticle.hashCode() : 0);
        result = 31 * result + (dateVent != null ? dateVent.hashCode() : 0);
        return result;
    }
}
