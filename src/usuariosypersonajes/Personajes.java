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
public class Personajes extends SerInteligente {

    private String Nick;

    private int Ataque;

    private int Defensa;

    public Personajes(String Nick, int Ataque, int Defensa) {
        this.Nick = Nick;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
    }

    
    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    @Override
    public String toString() {
        return "Personajes{" + "Nick=" + Nick + ", Ataque=" + Ataque + ", Defensa=" + Defensa + '}';
    }

    @Override
    public String dameNombre() {
       return getNick();
    }

    @Override
    public int calcularPoder() {
    int poder = getAtaque() / getDefensa();
    return poder;
    }

    //  En el caso de los personajes será su fuerza menos su defensa multiplicado por 6.
    @Override
    public int calcularInteligencia() {
    int inteligencia = getAtaque()-getDefensa() * 6;
    return inteligencia;
    }
    
    

}
