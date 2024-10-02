public class ControleRemotoArCond extends ControleRemoto{
    
    public ControleRemotoArCond(){

    }

    public void mudarTemperatura(char tecla){
        System.out.println("Mudando a temperatura do ar condicionado!");
    }

    public void mudarModoFuncionamento(char tecla){
        System.out.println("Mudando o modo de funcionamento do ar condicionado!");
    }

    public void mudarNivelVentilacao(char tecla){
        System.out.println("Mudando o nível de ventilação do ar condicionado!");
    }

    @Override
    public void funcionalidade(int tipo, char tecla){
        switch (tipo) {
            case 1: mudarTemperatura(tecla);                
                break;
            case 2: mudarModoFuncionamento(tecla);
                break;
            case 3: mudarNivelVentilacao(tecla);
                break;
            default:
                throw new AssertionError();
        }
    }
}
