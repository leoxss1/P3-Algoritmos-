import java.util.Scanner;
import java.util.Random;
public class MainCorrigido {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //começo
        System.out.println("== BEM VINDO AO QUIZZ ESPORTES ==");
        System.out.println("\nPREPARE PARA TESTAR SEUS CONHECIMENTOS SOBRE O UNIVERSO ESPORTIVO E APRENDER SOBRE ESSE TEMA TÃO PRESENTE NA NOSSA VIDA");


        System.out.println("Por favor digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Prazer em te conhecer " + nome + ", bora começar?");
        Thread.sleep(500);
        System.out.println("1. Sim");
        Thread.sleep(500);
        System.out.println("2. Não");
        String resposta = "1";
        Scanner inicio = new Scanner(System.in);
        String Bora = inicio.nextLine();
       
       while (true) {
        if (Bora.equals("1") ){
            System.out.println("===VAMOS NESSA - 4 PERGUNTAS===");
            Thread.sleep(500);
            break;
        } else if (Bora.equals("2"))  {
            System.out.println("Beleza " + nome + ", até a próxima!!");
        Thread.sleep(500);
        System.exit(0);
        } else {
                System.out.println("Insira uma resposta válida!");
                System.out.println("1 = Sim // 2 = Não");
                Bora = inicio.nextLine();
        }
        }



        // Define as perguntas e respostas num array multidimensional
        String[][] perguntas = {
                {
                        "Quantas Medalhas tem o nadador Michael Phelps?",
                        "(A) 28 medalhas.",
                        "(B) 25 medalhas.",
                        "(C) 20 medalhas.",
                        "(D) 18 medalhas.",
                        "A" // resposta correta
                },
                {
                        "Na natação, qual o comprimento, profundidade mínima e largura de uma piscina olímpica?",
                        "(A) Largura 26, comprimento 40, profundidade 1,50",
                        "(B) Largura 20, comprimento 50, profundidade 3,0",
                        "(C) Largura 25, comprimento 50, profundidade 2,0",
                        "(D) Largura 25, comprimento 30, profundidade 2,0",
                        "C"
                },
                {
                        "Quantos jogadores tem em um time, durante uma partida de handebol?",
                        "(A) 5",
                        "(B) 6",
                        "(C) 11",
                        "(D) 7",
                        "D"
                },
                {
                        "Quantos pontos vale cada gol marcado no handebol?",
                        "(A) 1",
                        "(B) 3",
                        "(C) 2",
                        "(D) 5",
                        "A"
                },
                {

                        "No ciclismo, quantas pedaladas são necessárias para percorrer 1 km?",
                        "(A) 350 a 390",
                        "(B) 180 a 220",
                        "(C) 240 a 280",
                        "(D) 300 a 335",
                        "C"
                },
                {
                        "No ciclismo, quantos km dura um pneu de bicicleta?",
                        "(A) 3.000 a 4.000",
                        "(B) 5.000 a 7.000",
                        "(C) 7.000 a 10.000",
                        "(D) 10.000 a 15.000",
                        "A"
                },
                {
                        "Quantos jogadores cada time tem que ter em quadra no basquete?",
                        "(A) 3 jogadores",
                        "(B) 5 jogadores",
                        "(C) 4 jogadores",
                        "(D) 6 jogadores",
                        "B"
                },
                {
                        "No basquete, quantos pontos vale uma cesta do meio da quadra?",
                        "(A) 3 pontos",
                        "(B) 2 pontos",
                        "(C) 1 ponto",
                        "(D) 5 pontos",
                        "A"
                },
                {
                        "Qual a altura de uma rede profissional masculina de vôlei?",
                        "(A) 1,86",
                        "(B) 2,43",
                        "(C) 2,20",
                        "(D) 3,01",
                        "B"
                },
                {
                        "Com quantos pontos acaba um set no vôlei?",
                        "(A) 15",
                        "(B) 30",
                        "(C) 10",
                        "(D) 25",
                        "D"
                },
                {
                        "Quantas Copas do Mundo a seleção brasileira masculina conquistou?(futebol)",
                        "(A) 3",
                        "(B) 5",
                        "(C) 1",
                        "(D) 4",
                        "B"
                },
                {
                        "Qual é o jogador com mais Bolas de Ouro da história?(futebol)",
                        "(A) Lionel Messi",
                        "(B) Cristiano Ronaldo",
                        "(C) Pelé",
                        "(D) Rodinei",
                        "A"
                }
        };

// Quantidade de perguntas que quer fazer por rodada
int totalPerguntas = 4;

// Usadas agora é global entre rodadas
boolean[] usadas = new boolean[perguntas.length];

while (true) {

    // confere se há perguntas disponíveis
    int perguntasDisponiveis = 0;
    for (boolean u : usadas) {
        if (!u) perguntasDisponiveis++;
    }

    if (perguntasDisponiveis < totalPerguntas) {
        System.out.println("\nNão há mais perguntas suficientes para continuar!");
        System.out.println("Você respondeu todas as perguntas disponíveis.");
        System.out.println("Até a próxima!");
        System.exit(0);
    }

    int feitas = 0;

    while (feitas < totalPerguntas) {
        int idx = random.nextInt(perguntas.length);

        if (!usadas[idx]) {
            usadas[idx] = true;
            fazerPergunta(perguntas[idx], scanner);
            feitas++;
        }
    }

    System.out.println("\n=== FIM DA RODADA ===");
    System.out.println("Você respondeu " + feitas + " perguntas.");
    
        System.out.println("\nDeseja jogar mais uma rodada?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        String escolha = scanner.nextLine();
    
        while (true) {
                if (escolha.equals("1") ){
                    System.out.println("===VAMOS NESSA -  MAIS 4 PERGUNTAS===");
                    Thread.sleep(500);
                    break;
                } else if (escolha.equals("2"))  {
                    System.out.println("Beleza " + nome + ", até a próxima!!");
                Thread.sleep(500);
                System.exit(0);
                } else {
                        System.out.println("Insira uma resposta válida!");
                        System.out.println("1 = Sim // 2 = Não");
                        escolha = inicio.nextLine();
                }
        
       }
}
}

 public static void fazerPergunta(String[] perguntaComRespostas, Scanner scanner) throws InterruptedException {
        System.out.println("\n" + perguntaComRespostas[0]); // pergunta
        Thread.sleep(1000);

        // imprime as opções A, B, C, D
        for (int i = 1; i <= 4; i++) {
            System.out.println(perguntaComRespostas[i]);
            Thread.sleep(500);
        }
        String respostaUsuario;
        while (true) {

            System.out.print("\nDigite sua resposta (A, B, C ou D): ");
            respostaUsuario = scanner.nextLine().trim().toUpperCase();

            if (!respostaUsuario.matches("[ABCD]")) {
                System.out.println("\nOpção inválida! Digite apenas A, B, C ou D.");
                continue;
            }
            break;
        }
        if (respostaUsuario.equals(perguntaComRespostas[5])) {
            System.out.println("Você acertou!");
            Thread.sleep(500);
            return;
        } else {
            System.out.println("Você errou! A resposta correta é " + perguntaComRespostas[5] + ".");
            Thread.sleep(500);
        }

    }
}
