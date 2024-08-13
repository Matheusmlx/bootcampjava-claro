package src.candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCAndidato(45.0);
    }

    static void analisarCAndidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar com candidato com contra proposta");
        }else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
