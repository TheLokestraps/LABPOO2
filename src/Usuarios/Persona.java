/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Enumeraciones.TipoDoc;
import java.util.ArrayList;
import labpoo.datos;

/**
 *
 * @author ieperez
 */
public class Persona {
    public String NumDoc;
    public TipoDoc tipoDoc;
    public final String Codigo;
    public String Nombre;
    public String Apellido;
    public String Email;
    public String contraseña;

    public Persona(String NumDoc, TipoDoc tipoDoc, String Codigo, String Nombre, String Apellido, String Email, String contraseña) {
        this.NumDoc = NumDoc;
        this.tipoDoc = tipoDoc;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.contraseña = contraseña;
    }
    public Persona(String NumDoc, TipoDoc tipoDoc, String Nombre, String Apellido, String contraseña) {
        this.NumDoc = NumDoc;
        this.tipoDoc = tipoDoc;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.contraseña = contraseña;
        this.Codigo = "";
    }
    public boolean esIgual(Persona a){
        boolean loSon = false;
        if (this.Nombre.equals(a.Nombre)) {
            if (this.Apellido.equals(a.Apellido)) {
                if (this.NumDoc.equals(a.NumDoc)) {
                    if (this.contraseña.equals(a.contraseña)) {
                        if (this.tipoDoc.toString().equals(a.tipoDoc.toString())) {
                            loSon = true;
                        }
                    }
                }
            }
        }
        return loSon;
    }
    public void asimilar(Persona a){
        this.NumDoc = a.NumDoc;
        this.tipoDoc = a.tipoDoc;
        this.Nombre = a.Nombre;
        this.Apellido = a.Apellido;
        this.contraseña = a.contraseña;
    }
    public boolean esProfesor(){
        int i = 0;
        while(i<datos.profesores.size() && !datos.profesores.get(i).Codigo.equals(this.Codigo)){
            i++;
        }
        return i<datos.profesores.size();
    }
    public boolean esEstudiante(){
        int i = 0;
        while(i<datos.estudiantes.size() && !datos.estudiantes.get(i).Codigo.equals(this.Codigo)){
            i++;
        }
        return i<datos.estudiantes.size();
    }
    public boolean esAsistente(){
        int i = 0;
        while(i<datos.asistentes.size() && !datos.asistentes.get(i).Codigo.equals(this.Codigo)){
            i++;
        }
        return i<datos.asistentes.size();
    }
    public int indiceCargo(){
        int i = 0;
        if (this.esAsistente()) {
            while(i<datos.asistentes.size() && !datos.asistentes.get(i).Codigo.equals(this.Codigo)){
                i++;
            }
        }else{
            if (this.esEstudiante()) {
                while(i<datos.estudiantes.size() && !datos.estudiantes.get(i).Codigo.equals(this.Codigo)){
                    i++;
                }
            }else{
               while(i<datos.profesores.size() && !datos.profesores.get(i).Codigo.equals(this.Codigo)){
                    i++;
                }  
            }
        }
        return i;
    }
    public int indicePersona(){
        int i = 0;
        while(i<datos.personas.size() && !datos.personas.get(i).Codigo.equals(this.Codigo)){i++;}
        return i;
    }
    
}
