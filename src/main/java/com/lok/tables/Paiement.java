package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Paiement {
    private int idPaiement;
    private Date datePaiement;

    @Id
    @Column(name = "idPaiement", nullable = false)
    public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    @Basic
    @Column(name = "datePaiement", nullable = false)
    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paiement paiement = (Paiement) o;

        if (idPaiement != paiement.idPaiement) return false;
        if (datePaiement != null ? !datePaiement.equals(paiement.datePaiement) : paiement.datePaiement != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPaiement;
        result = 31 * result + (datePaiement != null ? datePaiement.hashCode() : 0);
        return result;
    }
}
