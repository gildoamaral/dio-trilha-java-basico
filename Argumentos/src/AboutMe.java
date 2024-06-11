public class AboutMe {
    // Estes argumentos são passados quando executado diretamente no terminal. exemplo: 
    // execute no terminal: java AboutMe Marco Antonio 27 1.70

    // Outra coisa que fiz diretamente no vsCode, é entrar em RUN e  ADD CONFIGURATION para colocar parametros padroes
    // Assim, ele criou o arquivo launch.json
    
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}
