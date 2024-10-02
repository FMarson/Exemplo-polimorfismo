public class Main {
    public static void main(String[] args) {
        ControleRemoto controleGenerico;

        controleGenerico = new ControleRemoto();

        controleGenerico.funcionalidade(1, '+');

        controleGenerico = new ControleRemotoTV();
        controleGenerico.ligarDesligar();

        controleGenerico.funcionalidade(1, '+');
        controleGenerico.funcionalidade(2, '+');

        controleGenerico = new ControleRemotoArCond();
        controleGenerico.funcionalidade(1, '+');
        controleGenerico.funcionalidade(2, '+');

    }
}