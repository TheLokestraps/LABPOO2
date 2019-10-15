/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackboard;

import java.util.ArrayList;
import labpoo.Grupo;

/**
 *
 * @author ieperez
 */
public class Curso {
    public String Codigo;
    public String Nombre;
    public int Creditos;
    public int horas;
    public int cantGrupos;
    public ArrayList<Grupo> grupos;
    
    public Curso(String Codigo, String Nombre, int Creditos, int horas)
    {
        this.horas = horas;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Creditos = Creditos;
        grupos = new ArrayList<>();
    }    
}
