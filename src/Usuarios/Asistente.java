/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Enumeraciones.TipoDoc;
import java.util.ArrayList;
import labpoo.Grupo;

/**
 *
 * @author ieperez
 */
public class Asistente extends Persona{
    
    public ArrayList<Grupo> MisG;

    public Asistente(String NumDoc, TipoDoc tipoDoc, String Codigo, String Nombre, String Apellido, String Email, String contraseña) {
        super(NumDoc, tipoDoc, Codigo, Nombre, Apellido, Email, contraseña);
        MisG = new ArrayList<>();
    }

    
    
    
}
