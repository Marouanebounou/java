//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.*;
import  java.util.Random;
import  java.util.HashMap;
import  java.util.HashSet;
import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ////////////////////----1----//////////////////
//        System.out.printf("Entre your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name );


        ////////////////////----2----//////////////////
//        System.out.printf("Entre a number: ");
//        int num = scanner.nextInt();
//        for (int i = num ; i >= 0 ; i--){
//            System.out.println(i);
//        }


        /////////////////////----3----/////////////////////

//        int randomNum = random.nextInt(10);
//        int numE;
//        do {
//            System.out.println("Entre a number between 0 and 10: ");
//            numE = scanner.nextInt();
//            if(numE == randomNum){
//                System.out.println("Bravo ! Vous avez trouvé");
//            }else {
//                System.out.println("Trop petit ! Essayez encore.");
//            }
//        }while (randomNum != numE);

        /////////////////////----4----/////////////////////
//        int num;
//        do {
//            System.out.println("1. Consulter le solde");
//            System.out.println("2. Dépôt");
//            System.out.println("3. Retrait");
//            System.out.println("4. Quitter\n");
//            System.out.printf("Entrez votre choix : ");
//            num = scanner.nextInt();
//            switch (num){
//                case 1 -> {
//                    System.out.println("5400");
//                    break;
//                }
//                case 2 -> {
//                    int depot;
//                    System.out.printf("Entrez le montant :");
//                    depot = scanner.nextInt();
//                    System.out.println("Dépôt effectué avec succès.\n");
//                }
//                case 3 -> {
//                    int retrais;
//                    System.out.printf("Entrez le montant :");
//                    retrais = scanner.nextInt();
//                    System.out.println("Retrait effectué avec succès.\n");
//                }
//            }
//        }while (num != 4);

        /////////////////////----5----/////////////////////

//
//        System.out.printf("Entre the size of the table: ");
//        int num = scanner.nextInt();
//        int[] table = new int[num];
//        for (int i = 0 ; i < num ; i++){
//            System.out.printf("Entre number " + (i+1) + ": ");
//            int number = scanner.nextInt();
//            table[i] = number;
//        }
//        int max = 0;
//        int secondMax = 0;
//        int[] table2 = new int[num -1];
//        for (int i = 0 ; i< num ; i++){
//            if (max < table[i]){
//                max= table[i];
//            }
//        }
//        for (int i = 0 ; i< num ; i++){
//            if (table[i] != max){
//                table2[i] = table[i];
//            }
//        }
//        for (int i = 0 ; i< table2.length ; i++){
//            if (secondMax  < table[i]){
//                secondMax = table[i];
//            }
//        }
//        System.out.printf("The biggest: "+ max + "\n");
//        System.out.printf("Second max is : "+ secondMax);

        /////////////////////----6----/////////////////////


//        int[] tab = {1 , 2 , 3 , 4 , 5};
//        int last = tab[tab.length - 1];
//        for(int i = tab.length - 1 ; i > 0 ; i--){
//            tab[i] = tab[i - 1];
//        }
//        tab[0] = last;
//
//        for (int x : tab) {
//            System.out.print(x + " ");
//        }

        /////////////////////----7----/////////////////////
//        int[] tab = {2, 3, 2, 5, 3};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int x : tab){
//            if(map.containsKey(x)){
//                map.put(x , map.get(x) + 1);
//            }else {
//                map.put(x , 1);
//            }
//        }
//        System.out.println(map);

        /////////////////////----8----/////////////////////

//        int cible = 6;
//        int[] table = {2, 6, 1, 4, 5};
//
//        for (int x = 0 ; x < table.length ; x++){
//           for (int i : table){
//               if ((table[x] + i) == cible ){
//                   System.out.printf("[" + table[x] + "," + i + "]");
//               }else if(table[x] == cible) {
//                   System.out.printf("[" + table[x] + "]");
//                   break;
//               }
//           }
//        }

        /////////////////////----9----/////////////////////

//        int[] tab1 = {1 , 8, 10 , 2, 3, 4};
//        int[] tab2 = {3, 4, 5, 6 , 8 , 10};
//        HashSet<Integer> table = new HashSet<>();
//        for (int i : tab1){
//            table.add(i);
//        }
//        for (int i : tab2){
//            if (table.contains(i)){
//                System.out.println(i);
//            }
//        }

        /////////////////////----10----/////////////////////

//        String mot1 ;
//        String mot2 ;
//        mot1 = scanner.nextLine();
//        mot2 = scanner.nextLine();
//        char[] mot1Arr = mot1.toCharArray();
//        char[] mot2Arr = mot2.toCharArray();
//
//        Arrays.sort(mot1Arr);
//        Arrays.sort(mot2Arr);
//
//
//        if (Arrays.equals(mot1Arr , mot2Arr)){
//            System.out.println("Les deux mots sont des anagrammes.");
//        }else {
//            System.out.println("Les deux mots ne sont pas des anagrammes.");
//        }


        /////////////////////----11----/////////////////////


        String sentence = "le chat et le chien et le chat";
        String[] words = sentence.split(" ");

        HashMap<String , Integer> result = new HashMap<>();
        for (String i : words){
            result.put(i , result.getOrDefault(i, 0) + 1);
        }
        String mostFrequent = "";
        int max = 0;

        for (String key : result.keySet()) {
            if (result.get(key) > max) {
                max = result.get(key);
                mostFrequent = key;
            }
        }

        System.out.println("Mot le plus fréquent : " + mostFrequent);





















    }


}