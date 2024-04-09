package contas;

public class Poupanca {

    double saldo;
    String nome;
    
    
    void ExibirSaldo() {
        System.out.println("O saldo de "+this.nome+" eh "+this.saldo);
    }
    
    void DepositarValor(double valor) {
      if (valor > 0) {
          this.saldo += valor;  // saldos = saldo +  valor
          System.out.println("Valor de "+valor+" foi depositado para "+this.nome);
      } else {
          System.out.println("Valor inválido!");
      }
    }
    
    void SacarValor(double valor) {
        double saldoAntes = this.saldo;
        if (valor > 0) {
          if ((saldoAntes - valor) > 0 ) {  
              this.saldo -= valor;   // efetua o cálculo
              System.out.println("Valor de "+valor+" Sacado do "+this.nome+" com sucesso!");
          } else {
             System.out.println("Saldoinsuficiente!");
          }
      } else {
          System.out.println("Valor inválido!");
      }
    }
    
    void TransferirValor(ContaCorrente destino, double valor) {
         if (valor > 0 ) {
             if (this.saldo-valor > 0) {
                 destino.saldo += valor;
                 System.out.println("Foi transferido o valor de "+valor+" para "+destino.nome);
                 this.saldo -= valor;                 
                 System.out.println("Foi sacado o valor de "+valor+" para "+nome);
                 
             } else {
             System.out.println("Saldo insuficiente");
         }
         } else {
             System.out.println("Valor incorreto");
         }
       
    }
}
