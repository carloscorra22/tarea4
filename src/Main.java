public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       cliente.setEdad(22);
       cliente.setNombre("pepe");
       cliente.setTelefono(223134233);
       cliente.setCredito(2334);


       int edad= cliente.getEdad();
       String nombre = cliente.getNombre();
       int telefono = cliente.getTelefono();
       int credito = cliente.getCredito();

       System.out.println(edad);
       System.out.println(nombre);
       System.out.println(telefono);
       System.out.println(credito);

       Trabajador trabajador = new Trabajador();
       trabajador.setSalario(3344342);

       int salario= trabajador.getSalario();

       System.out.println(salario);

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public int getEdad(){
       return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito( int credito){
        this.credito=credito;
    }

    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario=salario;
    }

    public int getSalario(){
        return this.salario;
    }

}