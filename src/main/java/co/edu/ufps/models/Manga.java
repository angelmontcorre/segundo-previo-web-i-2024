package co.edu.ufps.models;

import java.util.Date;
import lombok.Data;

@Data
public class Manga {
    
    private Long id;
    private String nombre;
    private Date fechaLanzamiento;
    private int temporadas;
    private String pais;
    private boolean anime;
    private boolean juego;
    private boolean pelicula;
    private String tipo;
    
    // Constructor, getters y setters
    public Manga(Long id, String nombre, Date fechaLanzamiento, int temporadas, String pais, boolean anime, boolean juego, boolean pelicula, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.temporadas = temporadas;
        this.pais = pais;
        this.anime = anime;
        this.juego = juego;
        this.pelicula = pelicula;
        this.tipo = tipo;
    }
}