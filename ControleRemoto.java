public class ControleRemoto {
    //atributos - privados
    protected boolean estaLigado; // false ou true
    protected boolean timerLigado; // false ou true

    //método contrutor - sempre o mesmo nome da classe
    public ControleRemoto(){
        estaLigado = false;
    }

    public void ligarDesligar(){
        estaLigado = !estaLigado;
        if(estaLigado)
            System.out.println("O aparelho foi ligado");
        else
            System.out.println("O aparelho foi desligado");
    }

    public void timer(int tempo){
        //ajustarv timer
    }

    public void funcionalidade(int tipo){
        System.out.println("Função não implementada!");
    }

    public void funcionalidade(int tipo, char tecla){
        System.out.println("Função não implementada!");
    }

    public void funcionalidade(int tipo, int valor){
        System.out.println("Função não implementada!");
    }

}
