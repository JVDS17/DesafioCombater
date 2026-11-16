package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class Program {

     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Champion champ1;
        Champion champ2;


        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida Inicial: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor= sc.nextInt();

        champ1 = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        sc.nextLine();
        String n = sc.nextLine();
        System.out.print("Vida Inicial: ");
        int l = sc.nextInt();
        System.out.print("Ataque: ");
        int att = sc.nextInt();
        System.out.print("Armadura: ");
        int ar= sc.nextInt();

        champ2 = new Champion(n, l, att, ar);

        System.out.println();
        System.out.print("Quantos turnos deseja executar? ");
        int turn = sc.nextInt();

        System.out.println();

        sc.close();

        for(int i = 0; i < turn; i++){
            System.out.println("Resultado do turno "+(i+1)+":");
            champ1.takeDamage(champ2);
            champ2.takeDamage(champ1);
            System.out.println(champ1.status());
            System.out.println(champ2.status());
            System.out.println();
            
            if(champ1.getLife() == 0 || champ2.getLife() == 0){
                i = turn - 1;
                System.out.println("FIM DO COMBATE");
            }
        }
        

     }
}