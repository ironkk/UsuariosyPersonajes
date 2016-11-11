/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariosypersonajes;

/**
 *
 * @author dam
 */
public class Mascotas implements Ser{

    private SerInteligente Amo;

    public SerInteligente getAmo() {
        return Amo;
    }

    public void setAmo(SerInteligente Amo) {
        this.Amo = Amo;
    }


    private String TipoAnimal;

    private int NivelEntrenamiento;

    public Mascotas(SerInteligente Amo, String TipoAnimal, int NivelEntrenamiento) {
        this.Amo = Amo;
        this.TipoAnimal = TipoAnimal;
        this.NivelEntrenamiento = NivelEntrenamiento;
    }



    public int getNivelEntrenamiento() {
        return NivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int NivelEntrenamiento) {
        this.NivelEntrenamiento = NivelEntrenamiento;
    }

    public String getTipoAnimal() {
        return TipoAnimal;
    }

    public void setTipoAnimal(String TipoAnimal) {
        this.TipoAnimal = TipoAnimal;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "TipoAnimal=" + TipoAnimal + ", NivelEntrenamiento=" + NivelEntrenamiento + '}';
    }


    @Override
    public String dameNombre() {
       return getTipoAnimal();
    }

    @Override
    public int calcularPoder() {
    int poder = getNivelEntrenamiento() + Amo.calcularPoder();
    return poder;

    }

}
