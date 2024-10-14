import java.util.Scanner;

public class TestGiocatori {
    static Giocatori[] gioc = new Giocatori[100];

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int indice = 0;
        int indice2 = 0;
        int goal;
        String nome;
        Boolean capitano;
        do {
            System.out.println("1 - aggiungere un giocatore alla squadra");
            System.out.println("1 - visualizzare tutti i giocatori");
            System.out.println("1 - modificare i dati di un giocatore");
            System.out.println("1 - cancellare un giocatore dalla squadra");
            System.out.println("1 - visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("1 - visualizzare il capitano");
            System.out.println("1 - assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("8 - esci");
            indice2 = t.nextInt();
            switch (indice2) {
                case 1:
                    System.out.println("inserisci numero goal");
                    goal = t.nextInt();
                    t.nextLine();
                    System.out.println("inserisci nome");
                    nome = t.nextLine();
                    t.nextLine();
                    System.out.println("dimmi se è capitano");
                    capitano = t.nextBoolean();
                    t.nextLine();
                    aggiuntaGiocatore(goal, nome, capitano, indice);
                    indice++;
                    break;
            }
        }
        while (indice2 != 8);
    }
    public static void aggiuntaGiocatore(int newGoal, String newNome, Boolean newCapitano, int indice){
        gioc [indice] = new Giocatori(newGoal,newNome,newCapitano);





    }
}