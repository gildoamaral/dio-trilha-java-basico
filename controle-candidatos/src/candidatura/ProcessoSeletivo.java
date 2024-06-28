package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		for (String candidato: candidatosSelecionados) {
			ligarCandidatos(candidato);
		}
	}

	
	static void selecaoCandidatos () {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou o salario " + salarioPretendido);
			if (salarioPretendido <= salarioBase) {
				System.out.println("O candidato " + candidato + " foi adicionado a vaga!");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
		System.out.println("Foram selecionados " + candidatosSelecionados + " candidatos");
		System.out.println("Foram consultados " + candidatosAtual + " candidatos");
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	
	static void mostrarCandidatos () {
		String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		for ( int x=0 ; x < candidatosSelecionados.length; x++) {
			System.out.println((x+1) + "º candidato: " + candidatosSelecionados[x]);
		}
		
		System.out.println("------------------------------------");
		
		for (String candidato: candidatosSelecionados) {
			System.out.println(candidato);
		}
	}
	
	
	static void ligarCandidatos (String candidato) {
		
		
		int tentativa = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			
			atendeu = atender();
			continuarTentando = !atendeu;
			
			System.out.println("O rh está ligando para o candidato " + candidato);
			
			if (atendeu) {
				System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " APÓS " + tentativa + " TENTATIVAS");
			} else if (tentativa == 3) {
				System.out.println("NÃO CONSEGUIMOS ENTRAR EM CONTATO COM O CANDIDATO " + candidato);
			}
			tentativa++;
		} while (tentativa <= 3 && continuarTentando);
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO");
		else if (salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		else 
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
	}
}
