package com.example.onamedic1.onamedic1.entity;


import jakarta.persistence.*;

@Entity
@Table (name ="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //El id lo va incrementando
    private Integer id;
    private String nombre;
    @Column (unique = true, nullable = false)
    private String correo;
    @Lob // Indica que es un campo de texto superior a 255 caracteres
    private String mensaje;
    @Lob
    private String comentario;
    private Integer telefono;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String correo, String mensaje, String comentario, Integer telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.mensaje = mensaje;
        this.comentario = comentario;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
