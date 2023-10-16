public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        System.out.println("A tv está ligada ?" + SmartTv.ligada);
        System.out.println("O canal é " + SmartTv.canalTv);
        System.out.println("O volume da tv é " + SmartTv.volume);

        System.out.println("---------------------------------------------------");

        smartTv.ligar();
        System.out.println("A tv está ligada ?" + SmartTv.ligada);

        smartTv.passarCanal();
        System.out.println("O canal é " + SmartTv.canalTv);

        smartTv.aumentarVolume();
        System.out.println("O volume da tv é " + SmartTv.volume);


        System.out.println("---------------------------------------------------");

        smartTv.ligar();
        System.out.println("A tv está ligada ?" + SmartTv.ligada);

        smartTv.voltarCanal();
        System.out.println("O canal é " + SmartTv.canalTv);

        smartTv.diminuirVolume();
        System.out.println("O volume da tv é " + SmartTv.volume);
    }

}
