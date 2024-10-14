import java.util.Scanner;

public class TestGiocatori {
    static Giocatori[] gioc = new Giocatori[100];

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int indice = 0;
        int indice2 = 0;
        int goal;
        int giocator;
        String nome;
        Boolean capitano;
        do {
            System.out.println(" ");
            System.out.println("1 - aggiungere un giocatore alla squadra");
            System.out.println("2 - visualizzare tutti i giocatori");
            System.out.println("3 - modificare i dati di un giocatore");
            System.out.println("4 - cancellare un giocatore dalla squadra");
            System.out.println("5 - visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("6 - visualizzare il capitano");
            System.out.println("7 - assegnare il ruolo di capitano in modo casuale se non ancora presente");
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
                    System.out.println("è capitano? (true/false)");
                    capitano = t.nextBoolean();
                    t.nextLine();
                    aggiuntaGiocatore(goal, nome, capitano, indice);
                    indice++;
                    break;
                case 2:
                    for (int i = 0; i < indice; i++) {
                        System.out.println(stampa(i));
                    }
                    break;
                case 3:
                    System.out.println("scegli giocatore da modificare");
                    giocator = t.nextInt();
                    System.out.println("inserisci numero goal nuovo");
                    goal = t.nextInt();
                    t.nextLine();
                    System.out.println("inserisci nuovo nome");
                    nome = t.nextLine();
                    t.nextLine();
                    System.out.println("è capitano?(true/false)");
                    capitano = t.nextBoolean();
                    t.nextLine();
                    modifica(giocator, goal, nome, capitano);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
            }
        }
        while (indice2 != 8);
    }
    public static void aggiuntaGiocatore(int newGoal, String newNome, Boolean newCapitano, int indice){
        gioc [indice] = new Giocatori(newGoal,newNome,newCapitano);
    }
    public static String stampa(int i){
        String giocatore="";
        giocatore=giocatore+gioc [i].getNome() + "\t" + gioc [i].getGoal() + "\t" +gioc [i].getCapitano() + "\t";
        return giocatore;
    }
    public static void modifica(int giocator, int newGoal, String newNome, Boolean newCapitano){
        gioc[giocator].setGoal(newGoal);
        gioc[giocator].setNome(newNome);
        gioc[giocator].setCapitano(newCapitano);


    }
    public void cancellazione(){

    }

}