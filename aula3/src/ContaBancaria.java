// Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
// consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
// Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa
//  mensal da conta corrente.


public class ContaBancaria {

    protected double saldo;

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de " + valor + " realizado com sucesso.");
        } else
            System.out.println("Valor de depósito inválido!");
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque no valor de " + valor + " realizado com sucesso.");
        } else
            System.out.println("Saldo insuficiente!");
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }


}
