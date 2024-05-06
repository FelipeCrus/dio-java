public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
        if (ligada == true) {
            System.out.println("A TV esta ligada.");
        }
            
        }

    public void desligar(){
        ligada=false;
        if (ligada == false) {
            System.out.println("A TV esta desligada.");
        }
    }
    public void novoCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O canal atual e: " + novoCanal);
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("A TV passou para o canal: " + canal);
    }

    public void diminuirCanal(){
        canal --;
        System.out.println("A TV voltou para o canal: " + canal);
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("O volume da TV aumentou para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("O volume da TV diminuiu para: " + volume);
    }

}