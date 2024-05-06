public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smarTv = new SmartTv();
        System.out.println("TV Ligada ? " + smarTv.on);
        System.out.println("Canal da TV: " + smarTv.channel);
        System.out.println("Volume da TV: " + smarTv.sound);

        
        smarTv.off();
        smarTv.on();
        smarTv.turnUpSound();
        smarTv.turnDownSound();
        smarTv.switchChannel();
        smarTv.backChannel();

    }
}
