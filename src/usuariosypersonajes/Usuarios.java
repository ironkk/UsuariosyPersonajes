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
public class Usuarios extends SerInteligente{

     private double Peso;

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    private double Altura;

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    private String Apellidos;

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Usuarios(double Peso, double Altura, String Apellidos, String Nombre) {
        this.Peso = Peso;
        this.Altura = Altura;
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "Peso=" + Peso + ", Altura=" + Altura + ", Apellidos=" + Apellidos + ", Nombre=" + Nombre + '}';
    }

    @Override
    public String dameNombre() {
        return getNombre();
    }

    @Override
    public int calcularPoder() {
   int poder = (int) (getPeso() / getAltura());
   return poder;
    }
    
    @Override
    public int calcularInteligencia() {
     int inteligencia = (int) (getPeso()+getAltura() * 8);
     return inteligencia;
    }

    
    
}
