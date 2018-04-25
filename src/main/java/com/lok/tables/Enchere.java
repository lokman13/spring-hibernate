package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Enchere {
    private int idEnchere;
    private int idVent;
    private Date dateDebut;
    private Date dateFin;
    private Date dateVent;

    @Id
    @Column(name = "idEnchere", nullable = false)
    public int getIdEnchere() {
        return idEnchere;
    }

    public void setIdEnchere(int idEnchere) {
        this.idEnchere = idEnchere;
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
    @Column(name = "dateDebut", nullable = false)
    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Basic
    @Column(name = "dateFin", nullable = false)
    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
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

        Enchere enchere = (Enchere) o;

        if (idEnchere != enchere.idEnchere) return false;
        if (idVent != enchere.idVent) return false;
        if (dateDebut != null ? !dateDebut.equals(enchere.dateDebut) : enchere.dateDebut != null) return false;
        if (dateFin != null ? !dateFin.equals(enchere.dateFin) : enchere.dateFin != null) return false;
        if (dateVent != null ? !dateVent.equals(enchere.dateVent) : enchere.dateVent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnchere;
        result = 31 * result + idVent;
        result = 31 * result + (dateDebut != null ? dateDebut.hashCode() : 0);
        result = 31 * result + (dateFin != null ? dateFin.hashCode() : 0);
        result = 31 * result + (dateVent != null ? dateVent.hashCode() : 0);
        return result;
    }
}
