/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackboard;

import Usuarios.Estudiante;
import labpoo.Grupo;

/**
 *
 * @author ieperez
 */
public class Nota {
    public int IDNota;
    public String Nombre;
    public int Valor;
    
    public Estudiante ElEstud;
    public Grupo ElG;
    
    public Nota(int IDNota,String Nombre,int Valor, Estudiante Estud, Grupo ElG){
        this.IDNota = IDNota;
        this.Nombre = Nombre;
        this.Valor = Valor;
        this.ElEstud = Estud;
        this.ElG = ElG;
    }
}
