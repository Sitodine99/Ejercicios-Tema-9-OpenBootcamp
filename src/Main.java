public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Josito");
        cliente.setEdad(36);
        cliente.setTeléfono(665376263);
        cliente.setCrédito(1725);
        System.out.println(cliente.getNombre() + " tiene " + cliente.getEdad() + " años, su nuevo teléfono móvil es: " + cliente.getTeléfono() + " y tiene " + cliente.getCrédito() + " euros para gastar en lo que quiera. " );

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Brenda");
        trabajador.setEdad(33);
        trabajador.setTeléfono(610802686);
        trabajador.setSalario(1250);
        System.out.println(trabajador.getNombre() + " tiene " + trabajador.getEdad() + " años, su nuevo teléfono móvil es: " + trabajador.getTeléfono() + " y gana " + trabajador.getSalario() + " euros. ");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int teléfono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTeléfono(int teléfono){
        this.teléfono = teléfono;
    }
    public int getTeléfono(){
        return this.teléfono;
    }
}

class Cliente extends Persona {
    private double crédito;
    public Cliente(){}

    public void setCrédito(double crédito){
        this.crédito = crédito;
    }
    public double getCrédito(){
        return this.crédito;
    }
}
class Trabajador extends Persona {

    private double salario;
    public Trabajador(){}

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}