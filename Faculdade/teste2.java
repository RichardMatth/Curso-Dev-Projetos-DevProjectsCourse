public class VerificarAptidao {
    public static void main(String[] args) {
        // Corpo do método main

        int idade1 = 25;
        double altura1 = 1.60;

        int idade2 = 20;
        double altura2 = 1.55;

        // Verificar se está apto (primeiro caso)
        if (idade1 >= 22 && altura1 >= 1.60) {
            System.out.println("Apto para o serviço.");
        } else if (idade1 >= 22 && altura1 < 1.60) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Não especificado.");
        }

        // Verificar para o segundo caso
        if (idade2 >= 22 && altura2 >= 1.60) {
            System.out.println("Apto para o serviço.");
        } else if (idade2 >= 22 && altura2 < 1.60) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Não especificado.");
        }
    }
}
