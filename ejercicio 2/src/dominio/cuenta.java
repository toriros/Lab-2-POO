package dominio;

public class cuenta {

    private String nombre;
    private String numcuenta;
    private Double saldo;
    private Double interes;
    
    
    public cuenta(String nombre, String cuenta, Double saldo, Double interes) {
        this.nombre = nombre;
        this.numcuenta = cuenta;
        this.saldo = saldo;
        this.interes = interes;
    }


    public cuenta() {
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCuenta() {
        return numcuenta;
    }


    public void setCuenta(String cuenta) {
        this.numcuenta = cuenta;
    }


    public Double getSaldo() {
        return saldo;
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public Double getInteres() {
        return interes;
    }


    public void setInteres(Double interes) {
        this.interes = interes;
    }
    
    
    public void ingresar(Double cantidad){
        if (cantidad <= 0){
            System.out.println("Ingreso denegado, valor inválido");
            return;
        }
        this.saldo += cantidad;
        System.out.println("Ingreso exitoso. Nuevo saldo: " + this.saldo);
    }

    public void extraccion(Double cantidad){
        if (cantidad <= 0){
            System.out.println("Extracción denegada, valor inválido");
            return;
        }
        if (cantidad > this.saldo){
            System.out.println("Extracción denegada, no hay suficiente saldo");
            return;
        }
        this.saldo -= cantidad;
        System.out.println("Extracción exitosa. Nuevo saldo: " + this.saldo);
    }

    public void transferir(cuenta destino, Double cantidad){
        if (cantidad <= 0){
            System.out.println("Transferencia denegada, valor inválido");
            return;
        }
        if (cantidad > this.saldo){
            System.out.println("Transferencia denegada, no hay suficiente saldo");
            return;
        }
        this.saldo -= cantidad;
        destino.saldo += cantidad;
        System.out.println("Transferencia exitosa de " + cantidad + " desde " + this.nombre + " a " + destino.nombre);
        System.out.println("Saldo de " + this.nombre + ": " + this.saldo);
        System.out.println("Saldo de " + destino.nombre + ": " + destino.saldo);
    }
    
}


