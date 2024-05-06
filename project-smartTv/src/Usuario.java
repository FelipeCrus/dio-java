public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smarTv = new SmartTv();
        System.out.println("TV Ligada ? " + smarTv.ligada);
        System.out.println("Canal da TV: " + smarTv.canal);
        System.out.println("Volume da TV: " + smarTv.volume);

        
        smarTv.desligar();
        smarTv.ligar();
        smarTv.aumentarCanal();
        smarTv.diminuirCanal();
        smarTv.novoCanal(30);
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();

    }
}
