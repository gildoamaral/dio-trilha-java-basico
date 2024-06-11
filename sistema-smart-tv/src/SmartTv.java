public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 1;

  public void power() {
    ligada = !ligada;
    System.out.println("a teve foi: " + (ligada ? "ligada" : "desligada"));
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("o volume aumentou");
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("o volume diminuiu");
  }

  public void subirCanal() {
    canal++;
    System.out.println("O canal agora é: " + canal);
  }

  public void descerCanal() {
    canal--;
    System.out.println("O canal agora é: " + canal);
  }

  public void trocarCanal(int numero) {
    canal = numero;
    System.out.println("O canal agora é: " + canal);
  }
}
