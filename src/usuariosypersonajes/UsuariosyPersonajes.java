/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariosypersonajes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dam
 */
public class UsuariosyPersonajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        // Crea una aplicación que cree diferentes objetos de cada tipo y los guarde todos en una lista. Recorre la lista mostrando todos los datos de cada objeto.
        
        Usuarios manzano = new Usuarios(52.2,1.75,"Xavi","Manzano");
        Usuarios manzano2 = new Usuarios(58.2,1.95,"Javi","Manzano2");
        Usuarios ironk = new Usuarios(60.5,1.72,"Ironk","Manzano");
        Personajes debuen = new Personajes("Mark", 50, 20);
        Personajes debuen2 = new Personajes("MarkStyle", 70, 40);
        Personajes retokshow = new Personajes("RetokN1", 76, 30);
        Mascotas pitbull = new Mascotas(manzano,"Xavi",8);
        Mascotas americanStanford = new Mascotas(debuen,"Mark",20);
        Mascotas cordero = new Mascotas(retokshow,"Javi",2);
        
        List<Ser> miLista = new ArrayList<>();
        miLista.add(manzano);
        miLista.add(manzano2);
        miLista.add(ironk);
        miLista.add(debuen);
        miLista.add(debuen2);
        miLista.add(retokshow);
        miLista.add(pitbull);
        miLista.add(americanStanford);
        miLista.add(cordero);
        
        for (Ser s: miLista){
            System.out.println(s.toString());
        }
        
        
    }
    
}
