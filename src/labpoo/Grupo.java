/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpoo;

import Blackboard.Curso;
import Blackboard.Evaluacion;
import Blackboard.Contenido;
import Blackboard.Webmail;
import Usuarios.Asistente;
import Usuarios.Estudiante;
import Usuarios.Profesor;
import java.util.ArrayList;

/**
 *
 * @author ieperez
 */
public class Grupo {
    public String Nrc;
    public ArrayList<Profesor> losProfes;
    public ArrayList<Asistente> LosAsis;
    public Curso MiCurso;
    public ArrayList<Contenido> MisCont;
    public ArrayList<Estudiante> MisEstu;
    public ArrayList<Evaluacion> LasEva;
    public ArrayList<Webmail> MisW;
    public int semestre;
    public int maxEstudiantes;
    public int año;
    
    public Grupo(String codigo,Curso curso,int semestre, int año, int maxEstudiantes){
        this.maxEstudiantes = maxEstudiantes;
        this.Nrc = codigo;
        this.semestre = semestre;
        this.año = año;
        this.MiCurso = curso;
        this.MisEstu = new ArrayList<>();
    }
}
