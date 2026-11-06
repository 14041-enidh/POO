public class TravelCard {
    // Variáveis
    private float saldo;
    private boolean inicializado;
    private boolean emUso;
    private char tipo;
    private int numeroViagens;
    private float totalDescontos;

    // Getters e Setters
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getInicializado(){
        return inicializado;
    }
    public void setInicializado (boolean inicializado){
        this.inicializado = inicializado;
    }

    public boolean getEmUso() {
        return emUso;
    }
    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }

    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumeroViagens() {
        return numeroViagens;
    }
    public void setNumeroViagens(int numeroViagens) {
        this.numeroViagens = numeroViagens;
    }

    public float getTotalDescontos() {
        return totalDescontos;
    }

    public TravelCard(){
        this.saldo = 0;
        this.tipo = ' ';
        this.inicializado = false;
        this.emUso = false;
        this.numeroViagens = 0;
        this.totalDescontos = 0;
    }

    public void showInfo(){
        System.out.println("");
        System.out.println("******** INFORMAÇÃO NO CARTÃO ********");
        System.out.println("Saldo \t \t \t : \t " + getSaldo());
        System.out.println("Total de descontos \t : \t " + getTotalDescontos() + "€");
        System.out.println("Inicializado \t \t : \t " + (inicializado ? "SIM" : "NAO"));
        System.out.println("Total de Viagens \t : \t " + getNumeroViagens());
        System.out.println("Em Utilização \t \t : \t " + (emUso ? "SIM" : "NAO" ));
        switch (tipo) {
            case 'M' -> System.out.println("Transporte \t\t : \t Metro");
            case 'T' -> System.out.println("Transporte \t\t : \t Train");
            case 'B' -> System.out.println("Transporte \t\t : \t Bus");
            case 'F' -> System.out.println("Transporte \t\t : \t Ferry");
            case ' ' -> System.out.println("");
        }
        System.out.println("**************************************");
        System.out.println("");
    }

    public void inicialize(float montante){
        if(!inicializado && montante >= 10.00){
            setSaldo(this.saldo = montante);
            setInicializado(this.inicializado=true);
            showInfo();
        }else if(inicializado){
            System.err.println("O cartão já está inicializado");
        }else{
            System.err.println("O montante mínimo é de 10€");
        }
    }

    public void getTripPrice(){
        System.out.println("   Transporte   |     Sigla     |   Preço Viagem (€)");
        System.out.println("----------------------------------------------------");
        System.out.println("Metro\t\t|\tM\t|\t0.90");
        System.out.println("Train\t\t|\tT\t|\t2.30");
        System.out.println("Bus\t\t|\tB\t|\t1.90");
        System.out.println("Ferry\t\t|\tF\t|\t0.85");
        System.out.println("----------------------------------------------------");
    
    }

    public void beginTrip(char tipo){
        if (inicializado && !emUso) {
            float precoBase;
            switch (tipo) {
                case 'M' -> precoBase = 0.90f;
                case 'T' -> precoBase = 2.30f;
                case 'B' -> precoBase = 1.90f;
                case 'F' -> precoBase = 0.85f;
                default -> {
                    System.err.println("Tipo de transporte inválido");
                    return;
                }
            }

            float precoFinal = precoBase * (1.0f - getDiscount());
            if (saldo < precoFinal) {
                System.err.println("Saldo insuficiente para esta viagem");
                return;
            }

            totalDescontos += precoBase - precoFinal;
            setSaldo(saldo - precoFinal);
            setTipo(tipo);
            setEmUso(true);
            System.out.println("Viagem iniciada no transporte: " + tipo);
            showInfo();
        } else if (!inicializado) {
            System.err.println("O Cartão deve estar inicializado");

        } else if (emUso) {
            System.err.println("O cartão está atualmente em uso");
        } else {
            System.err.println("Tipo de transporte inválido");
        }
        
    }

    public void endTrip(){
        if (inicializado && emUso){
            setEmUso(this.emUso = false);
            setNumeroViagens(this.numeroViagens += 1);
            setTipo(this.tipo = ' ');
            showInfo();
        }else if (!inicializado){
            System.err.println("O Cartão deve estar inicializado");
        }else{
            System.err.println("O Cartão deve de estar em uso");
        }
    }

    public void showAvailableTrips (){

        if(inicializado && !emUso){
            System.out.println("******** VIAGENS DISPONÍVEIS *******");
            System.out.println("\tMetro\t\t|\t " + saldo / 0.9);
            System.out.println("\tTrain\t\t|\t " + saldo / 2.3);
            System.out.println("\tBus\t\t|\t " + saldo / 1.9);
            System.out.println("\tFerry\t\t|\t " + saldo / 0.85);
            System.out.println("************************************");
        }else if (!inicializado){
            System.err.println("O Cartão tem de estar inicializado");
        } else{
            System.err.println("O Cartão não pode estar em uso");
        }

    }

    public void recharge (float montante){
        if(inicializado && montante >= 10.00){
            setSaldo(this.saldo += montante);
            showInfo();
        }else if(!inicializado){
            System.err.println("O cartão não está inicializado");
        }else{
            System.err.println("O montante mínimo é de 10€");
        }
    }

    public float getDiscount() {
        if (numeroViagens >= 10 && numeroViagens < 20) {
            return 0.02f;
        } else if (numeroViagens >= 20 && numeroViagens < 50) {
            return 0.03f;
        } else if (numeroViagens >= 50 && numeroViagens < 100) {
            return 0.04f;
        } else if (numeroViagens >= 100) {
            return 0.05f;
        } else {
            return 0.00f;
        }

    }
}