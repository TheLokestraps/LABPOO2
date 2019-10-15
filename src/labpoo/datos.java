/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpoo;

import Blackboard.Curso;
import Usuarios.Persona;
import Usuarios.Asistente;
import Usuarios.Estudiante;
import Usuarios.Profesor;
import java.util.ArrayList;

/**
 *
 * @author jairojg
 */
public class datos {
    
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static ArrayList<Asistente> asistentes = new ArrayList<>();
    public static ArrayList<Persona> personas = new ArrayList<>();
    public static int numUsuarios = 0;
    
    public static ArrayList<Curso> cursos = new ArrayList<>(); 
    public static ArrayList<Grupo> grupos = new ArrayList<>();
    public static int numCursos = 0;
    
    public static int indiceCurso(Curso curso){
        int i = 0;
        while(i<cursos.size() && !cursos.get(i).Codigo.equals(curso.Codigo)){
            i++;
        }
        return i;
    }
    
    public static int indiceGrupo(Curso curso, String codigo){
        int i = 0;
        while(i<curso.grupos.size() && !curso.grupos.get(i).Nrc.equals(codigo)){i++;}
        return i;
    }
    
    
}
    

