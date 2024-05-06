public class SmartTv {

    boolean on=false;
    int channel=1;
    int sound=25;

    public void on(){
        on=true;
        if (on == true) {
            System.out.println("A TV esta ligada.");
        }
            
        }

    public void off(){
        on=false;
        if (on == false) {
            System.out.println("A TV esta desligada.");
        }
    }

    public void switchChannel(){
        channel ++;
        System.out.println("A TV passou para o canal: " + channel);
    }

    public void backChannel(){
        channel --;
        System.out.println("A TV voltou para o canal: " + channel);
    }

    public void turnUpSound(){
        sound ++;
        System.out.println("O volume da TV aumentou para: " + sound);
    }

    public void turnDownSound(){
        sound --;
        System.out.println("O volume da TV diminuiu para: " + sound);
    }

}