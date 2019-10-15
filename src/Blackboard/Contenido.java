/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackboard;

import Enumeraciones.TipoCont;

/**
 *
 * @author ieperez
 */
public class Contenido {
    public int IDContent;
    public String Nombre;
    public String Texto;
    public TipoCont elTipo;
    
    public Contenido(int IDContent, String Nombre, String Texto, TipoCont elTipo){
        this.IDContent = IDContent;
        this.Nombre = Nombre; 
        this.Texto = Texto;
        this.elTipo  = elTipo;
    }
}
