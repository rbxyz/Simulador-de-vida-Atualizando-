/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinSimulador.Teste_1.Teste_1;

/**
 *
 * @author kauan
 */
public class Update_dia_20 {
    //UPDATE PARA DIA 20
    public static void main(String[] args) {
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
                } else {
                    System.out.println("Você sofreu um acidente fatal enquanto estudava. GAME OVER.");
                    vivo = false;
                }
                idade += 1;
                break;
         }
    }
}
