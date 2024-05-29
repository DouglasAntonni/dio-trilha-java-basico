public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25; 

    public void mudarCanal (int novoCanal){
        canal= novoCanal;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentou o volume para "+ volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuiu o volume para "+ volume);
    }
    public void subirCanal(){
        canal++;
        System.out.println("Subiu o canal para "+ canal);
    }
    public void baixarCanal(){
        canal--;
        System.out.println("Baixou o volume para "+ canal);
    }
    }

