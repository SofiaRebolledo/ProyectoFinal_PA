package Modelo;

public class Aeropuerto {
    protected String id_Nom_Aeropuerto;
    protected String Siglas;
    protected String Ciudad;

    public String getId_Nom_Aeropuerto() {
        return id_Nom_Aeropuerto;
    }

    public void setId_Nom_Aeropuerto(String id_Nom_Aeropuerto) {
        this.id_Nom_Aeropuerto = id_Nom_Aeropuerto;
    }

    public String getSiglas() {
        return Siglas;
    }

    public void setSiglas(String Siglas) {
        this.Siglas = Siglas;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
}
