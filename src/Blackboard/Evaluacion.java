/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackboard;

import Enumeraciones.TipoEval;
import labpoo.Grupo;

/**
 *
 * @author ieperez
 */
public class Evaluacion {
    public int IDEval;
    public String Nombre;
    public String FechaIn;
    public String FechaFin;
    public TipoEval elTipo;
    public Nota LaNota;
    public Grupo ElGrupo;
    
    public Evaluacion (int IDEval ,String Nombre ,String FechaIn, String FechaFin, TipoEval elTipo, Nota LaNota, Grupo ElGrupo){
        this.IDEval = IDEval;
        this.Nombre = Nombre;
        this.FechaIn = FechaIn;
        this.FechaFin = FechaFin;
        this.elTipo = elTipo;
        this.LaNota = LaNota;
        this.ElGrupo = ElGrupo;
    }
}
