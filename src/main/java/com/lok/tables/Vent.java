package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Vent {
    private int idVent;
    private Date dateVent;

    @Id
    @Column(name = "id_vent", nullable = false)
    public int getIdVent() {
        return idVent;
    }

    public void setIdVent(int idVent) {
        this.idVent = idVent;
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

        Vent vent = (Vent) o;

        if (idVent != vent.idVent) return false;
        if (dateVent != null ? !dateVent.equals(vent.dateVent) : vent.dateVent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVent;
        result = 31 * result + (dateVent != null ? dateVent.hashCode() : 0);
        return result;
    }
}
