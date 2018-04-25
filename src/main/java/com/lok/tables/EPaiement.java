package com.lok.tables;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "e_paiement", schema = "bdd", catalog = "")
public class EPaiement {
    private int idEPaiement;
    private int idCartBanque;
    private int codePin;
    private int idPaiement;
    private Date datePaiement;

    @Id
    @Column(name = "id_e_paiement", nullable = false)
    public int getIdEPaiement() {
        return idEPaiement;
    }

    public void setIdEPaiement(int idEPaiement) {
        this.idEPaiement = idEPaiement;
    }

    @Basic
    @Column(name = "idCart_Banque", nullable = false)
    public int getIdCartBanque() {
        return idCartBanque;
    }

    public void setIdCartBanque(int idCartBanque) {
        this.idCartBanque = idCartBanque;
    }

    @Basic
    @Column(name = "code_pin", nullable = false)
    public int getCodePin() {
        return codePin;
    }

    public void setCodePin(int codePin) {
        this.codePin = codePin;
    }

    @Basic
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

        EPaiement ePaiement = (EPaiement) o;

        if (idEPaiement != ePaiement.idEPaiement) return false;
        if (idCartBanque != ePaiement.idCartBanque) return false;
        if (codePin != ePaiement.codePin) return false;
        if (idPaiement != ePaiement.idPaiement) return false;
        if (datePaiement != null ? !datePaiement.equals(ePaiement.datePaiement) : ePaiement.datePaiement != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEPaiement;
        result = 31 * result + idCartBanque;
        result = 31 * result + codePin;
        result = 31 * result + idPaiement;
        result = 31 * result + (datePaiement != null ? datePaiement.hashCode() : 0);
        return result;
    }
}
