
import java.util.Random;

public class DiceGame {
    private int maxNum;
    private int numTentativas;
    private int pontAtual;
    private boolean jogoTerminado;
    private InputReader inputReader;

    public DiceGame (){
        this.maxNum = 6;
        this.numTentativas = 0;
        this.pontAtual = 0;
        this.jogoTerminado = false;
        this.inputReader = new InputReader();
    }

    public int rollDice(){

        Random random = new Random();
        return random.nextInt(6) + 1;


    }

    public void showPlay(){
        System.out.println("+--------------------------+");
        System.out.println("|       JOGO DE DADOS      |");
        System.out.println("+--------------------------+");
        System.out.println("Valor máximo = " + maxNum);
        System.out.println("Nº de tentativas = " + numTentativas);
        System.out.println("Pontuação atual = " + pontAtual);
    }

    public int inputMaximumNumber(){
        int numero = inputReader.getIntegerNumber("Insira o número máximo permitido");
        if (numero == 0){
            numero = 6;
        }
        while (numero < 0){
            numero = inputReader.getIntegerNumber("Insira um número não negativo");
        }
        return numero;
    }

    public void play(){
        char repetir;
        do {
            numTentativas = 0;
            pontAtual = 0;
            jogoTerminado = false;
            maxNum = inputMaximumNumber();

            while (!jogoTerminado) {
                String action = inputReader.getText("Escreva JOGAR para jogar ou SAIR para sair");
                if ("JOGAR".equals(action) || "jogar".equals(action)) {
                    int numero = rollDice();
                    numTentativas++;
                    pontAtual += numero;
                    System.out.println("Saiu o valor " + numero + " no dado.");
                    showPlay();
                    if (pontAtual >= maxNum) {
                        System.out.println(pontAtual == maxNum
                                ? "Igualou o limite máximo. Jogo terminado."
                                : "Ultrapassou o limite máximo. Jogo terminado.");
                        jogoTerminado = true;
                    }
                } else if ("SAIR".equals(action) || "sair".equals(action)) {
                    jogoTerminado = true;
                } else {
                    System.out.println("Opção inválida.");
                }
            }

            repetir = inputReader.getCharacter("Novo jogo? (S/N)");
            while (repetir != 'S' && repetir != 's' && repetir != 'N' && repetir != 'n') {
                repetir = inputReader.getCharacter("Responda apenas S ou N");
            }
        } while (repetir == 'S' || repetir == 's');
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getNumTentativa() {
        return numTentativas;
    }

    public void setNumTentativa(int numTentativa) {
        this.numTentativas = numTentativa;
    }

    public int getPontAtual() {
        return pontAtual;
    }

    public void setPontAtual(int pontAtual) {
        this.pontAtual = pontAtual;
    }

    public boolean isJogoTerminado() {
        return jogoTerminado;
    }

    public void setJogoTerminado(boolean jogoTerminado) {
        this.jogoTerminado = jogoTerminado;
    }

    public InputReader getInputReader() {
        return inputReader;
    }

    public void setInputReader(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    

}
