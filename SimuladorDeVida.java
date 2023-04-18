import java.util.Random;
import java.util.Scanner;

public class SimuladorDeVida {

    private int idade;
    private int felicidade;
    private int dinheiro;
    private boolean vivo;

    public SimuladorDeVida() {
        idade = 0;
        felicidade = 50;
        dinheiro = 50;
        vivo = true;
    }

    private void tomarDecisao(int escolha) {
        Random random = new Random();
        int chance;
        switch (escolha) {
            case 1:
                chance = random.nextInt(100);
                if (chance < 70) {
                    System.out.println("Você se machucou ao estudar e precisou gastar dinheiro em tratamento.");
                    dinheiro -= 20;
                    felicidade -= 10;
                } else if (chance >= 70 && chance < 90) {
                    System.out.println("Você estudou com sucesso e ganhou conhecimento.");
                    felicidade += 10;
                }
                idade += 1;
                break;
            case 2:
                System.out.println("Você trabalhou duro e ganhou dinheiro.");
                dinheiro += 20;
                felicidade -= 10;
                idade += 1;
                break;
            case 3:
                chance = random.nextInt(100);
                if (chance < 30) {
                    System.out.println("Você encontrou dinheiro na rua!");
                    dinheiro += random.nextInt(100);
                    felicidade += 10;
                } else if (chance >= 30 && chance < 60) {
                    System.out.println("Você teve um dia de passeio agradável.");
                    felicidade += 20;
                } else {
                    System.out.println("Você sofreu um acidente fatal enquanto viajava. GAME OVER.");
                    vivo = false;
                }
                idade += 1;
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
                break;
        }
    }

    public void jogar() {
        while (vivo) {
            System.out.println("IDADE: " + idade);
            System.out.println("FELICIDADE: " + felicidade);
            System.out.println("DINHEIRO: " + dinheiro);
            System.out.println("Escolha sua ação:");
            System.out.println("1 - Estudar");
            System.out.println("2 - Trabalhar");
            System.out.println("3 - Viajar");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            tomarDecisao(escolha);

            if (idade >= 100) {
                System.out.println("Você viveu uma vida plena e morreu feliz aos 100 anos. PARABÉNS!");
                vivo = false;
            } else if (felicidade <= 0) {
                System.out.println("Sua felicidade chegou a zero e você se tornou depressivo. GAME OVER.");
                vivo = false;
            } else if (dinheiro <= 0) {
                System.out.println("Você ficou sem dinheiro e não consegue mais se sustentar. GAME OVER.");
                vivo = false;
            }
        }
    }

    public static void main(String[] args) {
        SimuladorDeVida jogo = new SimuladorDeVida();
        jogo.jogar();
    }
}
