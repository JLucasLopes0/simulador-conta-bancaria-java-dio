import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner infos = new Scanner(System.in);
        int NumeroConta, Agencia;
        String NomeCliente;
        double Saldo;
        System.out.println("Por favor, digite o número da conta.");
        NumeroConta = infos.nextInt();
        infos.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Por favor, digite o número da agência.");
        Agencia = infos.nextInt();
        infos.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Por favor, digite o nome do cliente.");
        NomeCliente = infos.nextLine();
        System.out.println("Por favor, digite o saldo.");
        Saldo = infos.nextDouble();
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");
        infos.close();
    }
}