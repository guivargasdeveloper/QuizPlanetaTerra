import java.util.Scanner;

public class QuizPlanetaTerra {

    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns, resposta Correta! - Letra: " + this.correta);
                System.out.println("");
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                System.out.println("");
                return false;
            }
        }

        public String leiaResposta() {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.println("Digite a resposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;
        }

        private boolean respostaValida(String resp) {
            if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
                return true;
            }
            System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
            System.out.println("");
            return false;
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Cabecalho
        System.out.println("Faculdade: Centro Universitario Alfredo Nasser");
        System.out.println("Aluno: Guilherme Augusto de Oliveira Vargas");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Tema do Quiz: Planeta Terra");
        System.out.println("----------------------------------------");
        System.out.println();

        // Array de questões
        Questao[] questoes = new Questao[15];

        // Questao 0
        questoes[0] = new Questao();
        questoes[0].pergunta = "0. Qual é o maior oceano da Terra?";
        questoes[0].opcaoA = "A) Oceano Atlântico";
        questoes[0].opcaoB = "B) Oceano Índico";
        questoes[0].opcaoC = "C) Oceano Ártico";
        questoes[0].opcaoD = "D) Oceano Pacífico";
        questoes[0].opcaoE = "E) Oceano Antártico";
        questoes[0].correta = "D";

        // Questao 1
        questoes[1] = new Questao();
        questoes[1].pergunta = "1. Qual é o ponto mais alto da Terra?";
        questoes[1].opcaoA = "A) Monte Kilimanjaro";
        questoes[1].opcaoB = "B) Monte Everest";
        questoes[1].opcaoC = "C) Monte McKinley";
        questoes[1].opcaoD = "D) Monte Elbrus";
        questoes[1].opcaoE = "E) Monte Aconcágua";
        questoes[1].correta = "B";

        // Questao 2
        questoes[2] = new Questao();
        questoes[2].pergunta = "2. Qual é o maior deserto do mundo?";
        questoes[2].opcaoA = "A) Deserto do Saara";
        questoes[2].opcaoB = "B) Deserto de Gobi";
        questoes[2].opcaoC = "C) Deserto da Arábia";
        questoes[2].opcaoD = "D) Deserto do Kalahari";
        questoes[2].opcaoE = "E) Deserto da Antártida";
        questoes[2].correta = "E";

        // Questao 3
        questoes[3] = new Questao();
        questoes[3].pergunta = "3. Qual é o país mais populoso do mundo?";
        questoes[3].opcaoA = "A) Índia";
        questoes[3].opcaoB = "B) Estados Unidos";
        questoes[3].opcaoC = "C) China";
        questoes[3].opcaoD = "D) Brasil";
        questoes[3].opcaoE = "E) Indonésia";
        questoes[3].correta = "C";

        // Questao 4
        questoes[4] = new Questao();
        questoes[4].pergunta = "4. Qual é o maior rio do mundo em volume de água?";
        questoes[4].opcaoA = "A) Rio Amazonas";
        questoes[4].opcaoB = "B) Rio Nilo";
        questoes[4].opcaoC = "C) Rio Yangtzé";
        questoes[4].opcaoD = "D) Rio Mississipi";
        questoes[4].opcaoE = "E) Rio Ganges";
        questoes[4].correta = "A";

        // Questao 5
        questoes[5] = new Questao();
        questoes[5].pergunta = "5. Qual é o menor país do mundo?";
        questoes[5].opcaoA = "A) Mônaco";
        questoes[5].opcaoB = "B) San Marino";
        questoes[5].opcaoC = "C) Vaticano";
        questoes[5].opcaoD = "D) Liechtenstein";
        questoes[5].opcaoE = "E) Andorra";
        questoes[5].correta = "C";

        // Questao 6
        questoes[6] = new Questao();
        questoes[6].pergunta = "6. Qual é o maior lago do mundo?";
        questoes[6].opcaoA = "A) Lago Vitória";
        questoes[6].opcaoB = "B) Lago Superior";
        questoes[6].opcaoC = "C) Mar Cáspio";
        questoes[6].opcaoD = "D) Lago Baikal";
        questoes[6].opcaoE = "E) Lago Tanganica";
        questoes[6].correta = "C";

        // Questao 7
        questoes[7] = new Questao();
        questoes[7].pergunta = "7. Qual é o país com maior número de vulcões ativos?";
        questoes[7].opcaoA = "A) Indonésia";
        questoes[7].opcaoB = "B) Japão";
        questoes[7].opcaoC = "C) Chile";
        questoes[7].opcaoD = "D) Estados Unidos";
        questoes[7].opcaoE = "E) Islândia";
        questoes[7].correta = "A";

        // Questao 8
        questoes[8] = new Questao();
        questoes[8].pergunta = "8. Qual é o continente mais seco do mundo?";
        questoes[8].opcaoA = "A) África";
        questoes[8].opcaoB = "B) Austrália";
        questoes[8].opcaoC = "C) Antártida";
        questoes[8].opcaoD = "D) América do Sul";
        questoes[8].opcaoE = "E) Ásia";
        questoes[8].correta = "C";

        // Questao 9
        questoes[9] = new Questao();
        questoes[9].pergunta = "9. Qual é o país com maior biodiversidade do mundo?";
        questoes[9].opcaoA = "A) Brasil";
        questoes[9].opcaoB = "B) Colômbia";
        questoes[9].opcaoC = "C) Indonésia";
        questoes[9].opcaoD = "D) China";
        questoes[9].opcaoE = "E) México";
        questoes[9].correta = "A";

        // Questao 10
        questoes[10] = new Questao();
        questoes[10].pergunta = "10. Qual é o maior animal terrestre?";
        questoes[10].opcaoA = "A) Elefante Africano";
        questoes[10].opcaoB = "B) Girafa";
        questoes[10].opcaoC = "C) Baleia Azul";
        questoes[10].opcaoD = "D) Rinoceronte";
        questoes[10].opcaoE = "E) Hipopótamo";
        questoes[10].correta = "A";

        // Questao 11
        questoes[11] = new Questao();
        questoes[11].pergunta = "11. Qual é o maior bioma terrestre?";
        questoes[11].opcaoA = "A) Floresta Tropical";
        questoes[11].opcaoB = "B) Deserto";
        questoes[11].opcaoC = "C) Tundra";
        questoes[11].opcaoD = "D) Taiga";
        questoes[11].opcaoE = "E) Savana";
        questoes[11].correta = "D";

        // Questao 12
        questoes[12] = new Questao();
        questoes[12].pergunta = "12. Qual é o país com maior número de idiomas falados?";
        questoes[12].opcaoA = "A) Índia";
        questoes[12].opcaoB = "B) Papua Nova Guiné";
        questoes[12].opcaoC = "C) Nigéria";
        questoes[12].opcaoD = "D) Indonésia";
        questoes[12].opcaoE = "E) México";
        questoes[12].correta = "B";

        // Questao 13
        questoes[13] = new Questao();
        questoes[13].pergunta = "13. Qual é o maior vulcão ativo do mundo?";
        questoes[13].opcaoA = "A) Monte Fuji";
        questoes[13].opcaoB = "B) Monte Etna";
        questoes[13].opcaoC = "C) Monte Vesúvio";
        questoes[13].opcaoD = "D) Mauna Loa";
        questoes[13].opcaoE = "E) Monte Santa Helena";
        questoes[13].correta = "D";

       // Questao 14
        questoes[14] = new Questao();
        questoes[14].pergunta = "14. Qual é o país com maior número de ilhas?";
        questoes[14].opcaoA = "A) Filipinas";
        questoes[14].opcaoB = "B) Indonésia";
        questoes[14].opcaoC = "C) Suécia";
        questoes[14].opcaoD = "D) Grécia";
        questoes[14].opcaoE = "E) Japão";
        questoes[14].correta = "C";

        // Execucao do quiz
        int pontuacao = 0;
        for (int i = 0; i <= questoes.length; i++) {
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                pontuacao++;
            }
        }

        // Resultado final
        System.out.println("Quiz finalizado! Sua pontuação foi: " + pontuacao + " de " + questoes.length);
    }
}