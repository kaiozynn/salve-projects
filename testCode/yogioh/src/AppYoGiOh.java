public class AppYoGiOh {
    public static void main(String[] args) throws Exception {
        Deck dk = new Deck();
        Monstro m1 = new Monstro("Abaki", "Quando este card for destruído em batalha e enviado para o Cemitério, cada duelista sofre 500 de dano.", "Demônio", "Fogo", 4);
        Magica ma1 = new Magica("Espadas da Luz Reveladora", "Depois da ativação deste card, ele permanece no campo, mas destrua-o durante a Fase Final do 3º turno do seu oponente. Quando este card for ativado: se seu oponente controlar um monstro com a face para baixo, vire com a face para cima todos os monstros que ele controla. Enquanto este card estiver com a face para cima no campo, os monstros do seu oponente não podem declarar um ataque.");
        Armadilha a1 = new Armadilha("Cessar-Fogo", "Se um monstro com a face para baixo em Posição de Defesa ou um Monstro de Efeito estiverem no campo: coloque com a face para cima em Posição de Defesa todos os monstros que estiverem no campo com a face para baixo em Posição de Defesa (os efeitos de monstros de Virar não são ativados neste momento) e, além disso, cause 500 de dano ao seu oponente para cada Monstro de Efeito no campo.");

        // Adição de mais cartas
        Monstro m2 = new Monstro("Dragão Negro de Olhos Vermelhos", "Este dragão atira um fogo negro que é suficientemente quente para derreter qualquer coisa.", "Dragão", "Trevas", 7);
        Magica ma2 = new Magica("Raigeki", "Destrua todos os monstros que seu oponente controla.");
        Armadilha a2 = new Armadilha("Espelhos Estilhaçados", "Ative apenas quando um monstro do oponente declarar um ataque. Destrua todos os monstros atacantes.");
        Monstro m3 = new Monstro("Mago Negro", "Este mago utiliza magias negras para derrotar seus inimigos.", "Mago", "Trevas", 7);
        Magica ma3 = new Magica("Fissura", "Destrua o monstro com o menor ATK que seu oponente controla.");
        Armadilha a3 = new Armadilha("Cilada do Monstro", "Ative apenas quando um monstro do oponente declarar um ataque. Destrua o monstro atacante.");

        Monstro m4 = new Monstro("Lobo Místico", "Um lobo mágico que se move em silêncio pela noite.", "Besta", "Terra", 4);
        Magica ma4 = new Magica("Tornado Negro", "Destrua todos os monstros virados para cima no campo.");
        Armadilha a4 = new Armadilha("Armadura de Sakuretsu", "Quando um monstro do oponente declara um ataque: destrua o monstro atacante.");

        Monstro m5 = new Monstro("Dragão Branco de Olhos Azuis", "Este lendário dragão é uma poderosa máquina de guerra.", "Dragão", "Luz", 8);
        Magica ma5 = new Magica("Buraco Negro", "Destrua todos os monstros no campo.");
        Armadilha a5 = new Armadilha("Cilada Interdimensional", "Ative apenas quando um monstro do oponente declara um ataque. Remova o monstro atacante do jogo.");

        // Adição de mais cartas
        Monstro m6 = new Monstro("Cavaleiro do Enxame", "Um cavaleiro misterioso que comanda uma horda de insetos.", "Guerreiro", "Terra", 5);
        Magica ma6 = new Magica("Mão do Destino", "Escolha 1 monstro que seu oponente controla e o destrua.");
        Armadilha a6 = new Armadilha("Espelho Infinito", "Ative somente quando um monstro do oponente declarar um ataque. Nega o ataque e, depois, seu oponente recebe dano igual ao ATK do monstro atacante.");

        Monstro m7 = new Monstro("Fênix de Fogo", "Uma fênix lendária que renasce das cinzas para destruir seus inimigos.", "Ave", "Fogo", 6);
        Magica ma7 = new Magica("Pot of Greed", "Com este card, você pode sacar 2 cartas do seu Deck.");
        Armadilha a7 = new Armadilha("Cilada do Abismo", "Ative apenas quando um monstro do oponente declarar um ataque. Destrua todos os monstros no campo e cause dano ao seu oponente igual à metade dos ATK originais dos monstros destruídos.");


        // Monstro m2 = new Monstro("Caio", "Magro", "Humano", "Vento", 5);

        dk.inserir(m1);
        dk.inserir(ma1);
        dk.inserir(a1);
        dk.inserir(m2);
        dk.inserir(ma2);
        dk.inserir(a2);
        dk.inserir(m3);
        dk.inserir(ma3);
        dk.inserir(a3);
        dk.inserir(m4);
        dk.inserir(ma4);
        dk.inserir(a4);
        dk.inserir(m5);
        dk.inserir(ma5);
        dk.inserir(a5);
        dk.inserir(m6);
        dk.inserir(ma6);
        dk.inserir(a6);
        dk.inserir(m7);
        dk.inserir(ma7);
        dk.inserir(a7);
        dk.iniciarGame();
    }
}
