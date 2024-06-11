public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O canal é: " + smartTv.canal);
        System.out.println("O volume é: " + smartTv.volume);

        smartTv.trocarCanal(200);
        System.out.println(smartTv.canal);
    }
}
