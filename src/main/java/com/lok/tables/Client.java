package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
    private int idClient;
    private int idVent;
    private String nomClient;
    private String prénomClient;
    private String emailClient;
    private String adresseClient;
    private int téléphoneClient;
    private String password;

    @Id
    @Column(name = "idClient", nullable = false)
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
    @Column(name = "nomClient", nullable = false, length = 25)
    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    @Basic
    @Column(name = "prénomClient", nullable = false, length = 25)
    public String getPrénomClient() {
        return prénomClient;
    }

    public void setPrénomClient(String prénomClient) {
        this.prénomClient = prénomClient;
    }

    @Basic
    @Column(name = "emailClient", nullable = false, length = 55)
    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    @Basic
    @Column(name = "adresseClient", nullable = false, length = -1)
    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    @Basic
    @Column(name = "téléphoneClient", nullable = false)
    public int getTéléphoneClient() {
        return téléphoneClient;
    }

    public void setTéléphoneClient(int téléphoneClient) {
        this.téléphoneClient = téléphoneClient;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (idClient != client.idClient) return false;
        if (idVent != client.idVent) return false;
        if (téléphoneClient != client.téléphoneClient) return false;
        if (nomClient != null ? !nomClient.equals(client.nomClient) : client.nomClient != null) return false;
        if (prénomClient != null ? !prénomClient.equals(client.prénomClient) : client.prénomClient != null)
            return false;
        if (emailClient != null ? !emailClient.equals(client.emailClient) : client.emailClient != null) return false;
        if (adresseClient != null ? !adresseClient.equals(client.adresseClient) : client.adresseClient != null)
            return false;
        if (password != null ? !password.equals(client.password) : client.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + idVent;
        result = 31 * result + (nomClient != null ? nomClient.hashCode() : 0);
        result = 31 * result + (prénomClient != null ? prénomClient.hashCode() : 0);
        result = 31 * result + (emailClient != null ? emailClient.hashCode() : 0);
        result = 31 * result + (adresseClient != null ? adresseClient.hashCode() : 0);
        result = 31 * result + téléphoneClient;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
