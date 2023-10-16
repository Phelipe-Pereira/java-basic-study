public class SmartTv {
    static boolean ligada =  false;
    static int volume = 25;
    static int canalTv = 1;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        ++volume;
        System.out.println("Aumentando volume para " + volume);
    };

    public void diminuirVolume(){
        --volume;
        System.out.println("Diminuindo volume para " + volume);
    };

    public void escolherCanal(int novoCanal){
        canalTv = novoCanal;
    };

    public void passarCanal(){
        ++canalTv;
    };

    public void voltarCanal(){
        --canalTv;
    };
}