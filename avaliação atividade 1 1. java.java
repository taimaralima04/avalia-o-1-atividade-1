import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];
        
        // Recebendo as 8 notas
        System.out.println("Digite as 8 notas anuais do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota do bimestre " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        // Médias bimestrais são as próprias notas, então só mostramos
        System.out.println("\nMédias bimestrais:");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Bimestre %d: %.2f\n", i + 1, notas[i]);
        }
        
        // Cálculo das médias semestrais (primeiros 4 e últimos 4 bimestres)
        double mediaSemestre1 = 0;
        double mediaSemestre2 = 0;
        
        for (int i = 0; i < 4; i++) {
            mediaSemestre1 += notas[i];
        }
        for (int i = 4; i < 8; i++) {
            mediaSemestre2 += notas[i];
        }
        
        mediaSemestre1 /= 4;
        mediaSemestre2 /= 4;
        
        System.out.printf("\nMédia do 1º semestre: %.2f\n", mediaSemestre1);
        System.out.printf("Média do 2º semestre: %.2f\n", mediaSemestre2);
        
        // Média final (média das médias semestrais)
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;
        System.out.printf("\nMédia final do ano: %.2f\n", mediaFinal);
        
        sc.close();
    }
}
