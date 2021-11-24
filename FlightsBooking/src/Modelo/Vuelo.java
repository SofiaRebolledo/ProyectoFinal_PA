package Modelo;

import java.sql.Time;


public class Vuelo {
    
    protected int id_Vuelo;
    protected String id_Usuario;
    protected String Aeropuerto_Origen;
    protected String Aeropuerto_Destino;
    protected Time Hora_Partida;
    protected Time Hora_Llegada;
    protected int Distancia;
    protected Time Duracion;
    protected int Costo;

    public int getId_Vuelo() {
        return id_Vuelo;
    }

    public void setId_Vuelo(int id_Vuelo) {
        this.id_Vuelo = id_Vuelo;
    }

    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getAeropuerto_Origen() {
        return Aeropuerto_Origen;
    }

    public void setAeropuerto_Origen(String Aeropuerto_Origen) {
        this.Aeropuerto_Origen = Aeropuerto_Origen;
    }

    public String getAeropuerto_Destino() {
        return Aeropuerto_Destino;
    }

    public void setAeropuerto_Destino(String Aeropuerto_Destino) {
        this.Aeropuerto_Destino = Aeropuerto_Destino;
    }

    public Time getHora_Partida() {
        return Hora_Partida;
    }

    public void setHora_Partida(Time Hora_Partida) {
        this.Hora_Partida = Hora_Partida;
    }

    public Time getHora_Llegada() {
        return Hora_Llegada;
    }

    public void setHora_Llegada(Time Hora_Llegada) {
        this.Hora_Llegada = Hora_Llegada;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public Time getDuracion() {
        return Duracion;
    }

    public void setDuracion(Time Duracion) {
        this.Duracion = Duracion;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    
    
    
}
