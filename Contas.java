package contas;

import java.util.Scanner;

public class Contas {

    public static void main(String[] args) {

    ContaCorrente usuario1 = new ContaCorrente();
    ContaCorrente usuario2 = new ContaCorrente();
    Poupanca usuario3 = new Poupanca();
    
    Scanner entrada = new Scanner(System.in);
    double depositar=0, sacar=0; 
    double pix=0;
    
    System.out.println("Digite o nome do Usuario1 : ");
    usuario1.nome = entrada.next();    

    System.out.println("Digite o saldo do Usuario1 :");
    usuario1.saldo = entrada.nextDouble();
  
    System.out.println("Digite o valor para o deposito do Usuario1 :");
    depositar = entrada.nextDouble();

    System.out.println("Digite o valor para o saque do Usuario1 :");
    sacar =  entrada.nextDouble();
    
    usuario1.ExibirSaldo();
    usuario1.DepositarValor(depositar);
    usuario1.ExibirSaldo();
    usuario1.SacarValor(sacar);
    usuario1.ExibirSaldo();

// Zerando as variáveis    
     depositar=0;
     sacar=0; 
     pix=0;
     
    System.out.println("Digite o nome do Usuario2 : ");
    usuario2.nome = entrada.next();    

    System.out.println("Digite o saldo do Usuario2 :");
    usuario2.saldo = entrada.nextDouble();
  
    System.out.println("Digite o valor para o deposito do Usuario2 :");
    depositar = entrada.nextDouble();

    System.out.println("Digite o valor para o saque do Usuario2 :");
    sacar =  entrada.nextDouble();
    
    usuario2.ExibirSaldo();
    usuario2.DepositarValor(depositar);
    usuario2.ExibirSaldo();
    usuario2.SacarValor(sacar);
    usuario2.ExibirSaldo();

 // Transferindo o valor para o usuário 2
    
     System.out.println("Digite o valor da transferencia para o Usuario2 :");
     pix =  entrada.nextDouble();
    
    usuario1.TransferirValor(usuario2, pix);
    usuario1.ExibirSaldo();
    usuario2.ExibirSaldo();
    
    usuario3.nome = "andre";
    usuario3.saldo = 1000;
    
    
    
    }
    
}
