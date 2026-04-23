import dominio.cuenta;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear dos cuentas
        cuenta cuenta1 = new cuenta("Juan Pérez", "123456789", 1000.0, 0.05);
        cuenta cuenta2 = new cuenta("María García", "987654321", 500.0, 0.03);

        System.out.println("Saldo inicial de " + cuenta1.getNombre() + ": " + cuenta1.getSaldo());
        System.out.println("Saldo inicial de " + cuenta2.getNombre() + ": " + cuenta2.getSaldo());

        // Simular una transferencia de cuenta1 a cuenta2
        double montoTransferencia = 200.0;
        cuenta1.transferir(cuenta2, montoTransferencia);

        System.out.println("\nDespués de la transferencia:");
        System.out.println("Saldo de " + cuenta1.getNombre() + ": " + cuenta1.getSaldo());
        System.out.println("Saldo de " + cuenta2.getNombre() + ": " + cuenta2.getSaldo());
    }
}
