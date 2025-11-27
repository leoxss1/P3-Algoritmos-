programa
{   
    inclua biblioteca Util --> u

    funcao inicio()
    {
        cadeia nome, respostaUsuario, jogar, escolha_usu
        inteiro i, totalDados, perguntas_rodada, acertos, idx_sorteado
        inteiro perguntas_feitas
        logico entrada_valida, primeiraVez

        cadeia perguntas[12], alternativas[12], respostas[12]

        // --- CONFIGURAÇÃO ---
        totalDados = 12
        perguntas_rodada = 4
        primeiraVez = verdadeiro   

        // --- INICIALIZAÇÃO DAS PERGUNTAS ---
        perguntas[0] = "Quantas medalhas tem o nadador Michael Phelps?"
        alternativas[0] = "(A) 28 | (B) 25 | (C) 20 | (D) 18"
        respostas[0] = "A"

        perguntas[1] = "Qual é o comprimento, largura e profundidade mínima de uma piscina olímpica?"
        alternativas[1] = "(A) 26x40x1,5 | (B) 20x50x3,0 | (C) 25x50x2,0 | (D) 25x30x2,0"
        respostas[1] = "C"

        perguntas[2] = "Quantos jogadores tem um time de handebol em quadra?"
        alternativas[2] = "(A) 5 | (B) 6 | (C) 11 | (D) 7"
        respostas[2] = "D"

        perguntas[3] = "Quantos pontos vale cada gol no handebol?"
        alternativas[3] = "(A) 1 | (B) 3 | (C) 2 | (D) 5"
        respostas[3] = "A"

        perguntas[4] = "No ciclismo, quantas pedaladas são necessárias para 1 km?"
        alternativas[4] = "(A) 350-390 | (B) 180-220 | (C) 240-280 | (D) 300-335"
        respostas[4] = "C"

        perguntas[5] = "No ciclismo, quantos km dura um pneu de bicicleta?"
        alternativas[5] = "(A) 3000-4000 | (B) 5000-7000 | (C) 7000-10000 | (D) 10000-15000"
        respostas[5] = "A"

        perguntas[6] = "Quantos jogadores cada time tem em quadra no basquete?"
        alternativas[6] = "(A) 3 | (B) 5 | (C) 4 | (D) 6"
        respostas[6] = "B"

        perguntas[7] = "No basquete, quantos pontos vale uma cesta do meio da quadra?"
        alternativas[7] = "(A) 3 | (B) 2 | (C) 1 | (D) 5"
        respostas[7] = "A"

        perguntas[8] = "Qual a altura da rede masculina de vôlei (aprox)?"
        alternativas[8] = "(A) 1,86 | (B) 2,43 | (C) 2,20 | (D) 3,01"
        respostas[8] = "B"

        perguntas[9] = "Com quantos pontos acaba um set no vôlei?"
        alternativas[9] = "(A) 15 | (B) 30 | (C) 25 | (D) 10"
        respostas[9] = "C"

        perguntas[10] = "Quantas Copas do Mundo o Brasil ganhou (masculino)?"
        alternativas[10] = "(A) 3 | (B) 5 | (C) 1 | (D) 4"
        respostas[10] = "B"

        perguntas[11] = "Qual jogador tem mais Bolas de Ouro?"
        alternativas[11] = "(A) Messi | (B) Cristiano | (C) Pelé | (D) Rodinei"
        respostas[11] = "A"

        
        escreva("== BEM-VINDO AO QUIZ ESPORTES ==\n")
        escreva("\nPREPARE PARA TESTAR SEUS CONHECIMENTOS SOBRE O UNIVERSO ESPORTIVO")
        escreva("\nE APRENDER SOBRE ESSE TEMA TÃO PRESENTE NA NOSSA VIDA")
        escreva("\nPor favor digite seu nome: ")
        leia(nome)

        
        // LOOP PRINCIPAL DO JOGO
        enquanto (verdadeiro) 
        {
            
            se (primeiraVez) {
                escreva("Prazer em te conhecer ", nome, ", bora começar?\n")
                escreva("1 = Sim\n")
                escreva("2 = Não\n")
                leia(jogar)

                enquanto (jogar != "1" e jogar != "2") {
                    escreva("Insira uma respost válida! ")
                    escreva("1 = Sim // 2 = Não")
                    leia(jogar)
                }

                se (jogar == "2") {
                    escreva("Tudo bem ", nome, ", até a próxima!!\n")
                    retorne
                }

                primeiraVez = falso
            }

            // INÍCIO DO QUIZ
            acertos = 0
            perguntas_feitas = 0

            escreva("\n===VAMOS NESSA - 4 PERGUNTAS===\n")
            enquanto (perguntas_feitas < perguntas_rodada) 
            {
                idx_sorteado = u.sorteia(0, totalDados -1)

                escreva("\n--------------------------------------\n")
                escreva(perguntas[idx_sorteado], "\n")
                escreva(alternativas[idx_sorteado], "\n")

                entrada_valida = falso
                enquanto (entrada_valida == falso) {
                    escreva("Digite sua resposta (A/B/C/D): ")
                    leia(respostaUsuario)

                    se (respostaUsuario == "A" ou respostaUsuario == "a") {
                        respostaUsuario = "A"
                        entrada_valida = verdadeiro
                    } senao se (respostaUsuario == "B" ou respostaUsuario == "b") {
                        respostaUsuario = "B"
                        entrada_valida = verdadeiro
                    } senao se (respostaUsuario == "C" ou respostaUsuario == "c") {
                        respostaUsuario = "C"
                        entrada_valida = verdadeiro
                    } senao se (respostaUsuario == "D" ou respostaUsuario == "d") {
                        respostaUsuario = "D"
                        entrada_valida = verdadeiro
                    } senao {
                        escreva(" Opção inválida!!!! Digite apenas A, B, C ou D.\n")
                    }
                }

                se (respostaUsuario == respostas[idx_sorteado]) {
                    escreva("você acertou!\n")
                    acertos = acertos + 1
                } senao {
                    escreva("\nVocê errou! A resposta correta é ", respostas[idx_sorteado], ".\n")
                }

                perguntas_feitas = perguntas_feitas + 1
            }

            // ---------- RESULTADO ----------
            escreva("\n === FIM DA RODADA === \n")
            escreva(nome, ", você respondeu ", perguntas_rodada, " perguntas.\n")

            escreva("\nDeseja jogar novamente?\n")
            escreva("1 = Sim\n")
            escreva("2 = Não\n")
            leia(escolha_usu)

            enquanto (escolha_usu != "1" e escolha_usu != "2") {
                escreva("Insira uma resposta válida!\n")
                escreva("1 = Sim // 2 Não\n")
                leia(escolha_usu)
            }

            se (escolha_usu == "2") {
                escreva("Tudo bem,", nome," até a próxima!!\n")
                retorne
            }

        }
    }
}
