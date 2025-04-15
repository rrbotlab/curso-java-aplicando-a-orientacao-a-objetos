public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        ModeloCarro carro1 = new ModeloCarro();
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        ContaCorrente cc = new ContaCorrente();

        System.out.println("\nClasse Carro");
        carro.setModelo("hatch");
        carro.setPrecos(49500,50300,51900);
        carro.exibirDetalhes();

        System.out.println("\nClasse ModeloCarro");
        carro1.setModelo("sedan");
        carro1.setPrecos(78900,82500,84300);
        carro1.setTipoMotor("flex ciclo otto 4cil 1.4cc 104cv");
        carro1.exibirDetalhes();
        System.out.println(carro1.getTipoMotor());

        System.out.println("\nClasse Animal");
        animal.emitirSom();

        System.out.println("\nClasse Cachorro");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("\nClasse Gato");
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("\nClasse ContaCorrente");
        cc.depositar(1000);
        cc.consultarSaldo();
        cc.sacar(200);
        cc.consultarSaldo();
        cc.setTarifaMensal(10);
        cc.cobrarTarifaMensal();
        cc.consultarSaldo();
        cc.sacar(900);
        cc.consultarSaldo();



    }
}
