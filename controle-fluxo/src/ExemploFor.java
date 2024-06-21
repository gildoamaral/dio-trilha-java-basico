public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        int num = 5, count = 1;

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x: " + x + " é " + alunos[x]);
        }

        System.out.println("----------------------------");

        for (String aluno : alunos) {
            System.out.println("Existe um aluno chamado " + aluno);
        }

        System.out.println("-----------------------------");

        for (int x = 0; x <= 5; x++) {
            System.out.println("isto foi executado");

            if (x == 3)
                System.out.println("isso não foi executado");

            break;
        }

        System.out.println("-----------------------------");

        for (int x = 0; x <= 2; x++) {

            if (x == 1)
                continue;

            System.out.println("indice: " + x);
        }
        System.out.println("fim");
    }
}