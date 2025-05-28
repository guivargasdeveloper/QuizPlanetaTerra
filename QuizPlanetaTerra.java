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

        // Questao 1
        questoes[1] = new Questao();
        questoes[1].pergunta = "1. Qual é o maior oceano da Terra?";
        questoes[1].opcaoA = "A) Oceano Atlântico";
        questoes[1].opcaoB = "B) Oceano Índico";
        questoes[1].opcaoC = "C) Oceano Ártico";
        questoes[1].opcaoD = "D) Oceano Pacífico";
        questoes[1].opcaoE = "E) Oceano Antártico";
        questoes[1].correta = "D";

        // Questao 2
        questoes[2] = new Questao();
        questoes[2].pergunta = "2. Qual é o ponto mais alto da Terra?";
        questoes[2].opcaoA = "A) Monte Kilimanjaro";
        questoes[2].opcaoB = "B) Monte Everest";
        questoes[2].opcaoC = "C) Monte McKinley";
        questoes[2].opcaoD = "D) Monte Elbrus";
        questoes[2].opcaoE = "E) Monte Aconcágua";
        questoes[2].correta = "B";

        // Questao 3
        questoes[3] = new Questao();
        questoes[3].pergunta = "3. Qual é o maior deserto do mundo?";
        questoes[3].opcaoA = "A) Deserto do Saara";
        questoes[3].opcaoB = "B) Deserto de Gobi";
        questoes[3].opcaoC = "C) Deserto da Arábia";
        questoes[3].opcaoD = "D) Deserto do Kalahari";
        questoes[3].opcaoE = "E) Deserto da Antártida";
        questoes[3].correta = "E";

        // Questao 4
        questoes[4] = new Questao();
        questoes[4].pergunta = "4. Qual é o país mais populoso do mundo?";
        questoes[4].opcaoA = "A) Índia";
        questoes[4].opcaoB = "B) Estados Unidos";
        questoes[4].opcaoC = "C) China";
        questoes[4].opcaoD = "D) Brasil";
        questoes[4].opcaoE = "E) Indonésia";
        questoes[4].correta = "C";

        // Questao 5
        questoes[5] = new Questao();
        questoes[5].pergunta = "5. Qual é o maior rio do mundo em volume de água?";
        questoes[5].opcaoA = "A) Rio Amazonas";
        questoes[5].opcaoB = "B) Rio Nilo";
        questoes[5].opcaoC = "C) Rio Yangtzé";
        questoes[5].opcaoD = "D) Rio Mississipi";
        questoes[5].opcaoE = "E) Rio Ganges";
        questoes[5].correta = "A";

        // Questao 6
        questoes[6] = new Questao();
        questoes[6].pergunta = "6. Qual é o menor país do mundo?";
        questoes[6].opcaoA = "A) Mônaco";
        questoes[6].opcaoB = "B) San Marino";
        questoes[6].opcaoC = "C) Vaticano";
        questoes[6].opcaoD = "D) Liechtenstein";
        questoes[6].opcaoE = "E) Andorra";
        questoes[6].correta = "C";

        // Questao 7
        questoes[7] = new Questao();
        questoes[7].pergunta = "7. Qual é o maior lago do mundo?";
        questoes[7].opcaoA = "A) Lago Vitória";
        questoes[7].opcaoB = "B) Lago Superior";
        questoes[7].opcaoC = "C) Mar Cáspio";
        questoes[7].opcaoD = "D) Lago Baikal";
        questoes[7].opcaoE = "E) Lago Tanganica";
        questoes[7].correta = "C";

        // Questao 8
        questoes[8] = new Questao();
        questoes[8].pergunta = "8. Qual é o país com maior número de vulcões ativos?";
        questoes[8].opcaoA = "A) Indonésia";
        questoes[8].opcaoB = "B) Japão";
        questoes[8].opcaoC = "C) Chile";
        questoes[8].opcaoD = "D) Estados Unidos";
        questoes[8].opcaoE = "E) Islândia";
        questoes[8].correta = "A";

        // Questao 9
        questoes[9] = new Questao();
        questoes[9].pergunta = "9. Qual é o continente mais seco do mundo?";
        questoes[9].opcaoA = "A) África";
        questoes[9].opcaoB = "B) Austrália";
        questoes[9].opcaoC = "C) Antártida";
        questoes[9].opcaoD = "D) América do Sul";
        questoes[9].opcaoE = "E) Ásia";
        questoes[9].correta = "C";

        // Questao 10
        questoes[10] = new Questao();
        questoes[10].pergunta = "10. Qual é o país com maior biodiversidade do mundo?";
        questoes[10].opcaoA = "A) Brasil";
        questoes[10].opcaoB = "B) Colômbia";
        questoes[10].opcaoC = "C) Indonésia";
        questoes[10].opcaoD = "D) China";
        questoes[10].opcaoE = "E) México";
        questoes[10].correta = "A";

        // Questao 11
        questoes[11] = new Questao();
        questoes[11].pergunta = "11. Qual é o maior animal terrestre?";
        questoes[11].opcaoA = "A) Elefante Africano";
        questoes[11].opcaoB = "B) Girafa";
        questoes[11].opcaoC = "C) Baleia Azul";
        questoes[11].opcaoD = "D) Rinoceronte";
        questoes[11].opcaoE = "E) Hipopótamo";
        questoes[11].correta = "A";

        // Questao 12
        questoes[12] = new Questao();
        questoes[12].pergunta = "12. Qual é o maior bioma terrestre?";
        questoes[12].opcaoA = "A) Floresta Tropical";
        questoes[12].opcaoB = "B) Deserto";
        questoes[12].opcaoC = "C) Tundra";
        questoes[12].opcaoD = "D) Taiga";
        questoes[12].opcaoE = "E) Savana";
        questoes[12].correta = "D";

        // Questao 13
        questoes[13] = new Questao();
        questoes[13].pergunta = "13. Qual é o país com maior número de idiomas falados?";
        questoes[13].opcaoA = "A) Índia";
        questoes[13].opcaoB = "B) Papua Nova Guiné";
        questoes[13].opcaoC = "C) Nigéria";
        questoes[13].opcaoD = "D) Indonésia";
        questoes[13].opcaoE = "E) México";
        questoes[13].correta = "B";

        // Questao 14
        questoes[14] = new Questao();
        questoes[14].pergunta = "14. Qual é o maior vulcão ativo do mundo?";
        questoes[14].opcaoA = "A) Monte Fuji";
        questoes[14].opcaoB = "B) Monte Etna";
        questoes[14].opcaoC = "C) Monte Vesúvio";
        questoes[14].opcaoD = "D) Mauna Loa";
        questoes[14].opcaoE = "E) Monte Santa Helena";
        questoes[14].correta = "D";

//        // Questao 15
//        questoes[15] = new Questao();
//        questoes[15].pergunta = "15. Qual é o país com maior número de ilhas?";
//        questoes[15].opcaoA = "A) Filipinas";
//        questoes[15].opcaoB = "B) Indonésia";
//        questoes[15].opcaoC = "C) Suécia";
//        questoes[15].opcaoD = "D) Grécia";
//        questoes[15].opcaoE = "E) Japão";
//        questoes[15].correta = "C";

        // Execucao do quiz
        int pontuacao = 0;
        for (int i = 1; i <= questoes.length; i++) {
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