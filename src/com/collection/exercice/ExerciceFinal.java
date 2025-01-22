package com.collection.exercice;

import java.util.*;

public class ExerciceFinal {

    public static void exerciceCollectionFinal() {
        // TODO ******* ArrayList *******

        // Créez une ArrayList de String "colors1",
        // ajoutez 3 couleurs (black, Red, Yellow),
        // affichez "colors1"
        List<String> colors1 = new ArrayList<>();
        colors1.add("Black");
        colors1.add("Red");
        colors1.add("Yellow");
        System.out.println("colors1=" + colors1);

        // Affichez chaque couleur par ligne
        for (var color : colors1)
            System.out.println(color);

        // Ajoutez une nouvelle couleur (Blue) au début de "colors1"
        // affichez "colors1"
        colors1.add(0, "Blue");
        System.out.println("Adding blue color, colors1=" + colors1);

        // Affichez la deuxième couleur
        System.out.println("second color in colors1=" + colors1.get(1));

        // Remplacez la deuxième couleur par (Purple)
        // affichez "colors1"
        colors1.set(1, "Purple");
        System.out.println("replacing second color with purple, colors1=" + colors1);

        // Supprimez la troisième couleur
        // affichez "colors1"
        colors1.remove(2);
        System.out.println("removing third color, colors1=" + colors1);

        // Vérifiez si "colors1" contient la couleur "Black"
        System.out.println("colors1 contains black=" + colors1.contains("Black"));

        // Triez "colors1"
        // affichez "colors1"
        Collections.sort(colors1);
        System.out.println("Sorting, colors1=" + colors1);

        // Copiez "colors1" dans une autre ArrayList "colors2"
        // affichez "colors2"
        List<String> colors2 = new ArrayList<>(colors1);
        System.out.println("colors2=" + colors2);

        // Mélangez l'ordre de vos couleurs de manière aléatoire dans "colors2"
        // affichez "colors2"
        Collections.shuffle(colors2);
        System.out.println("shuffling, colors2=" + colors2);

        // Inversez l'ordre de vos éléments de "colors2"
        // affichez "colors2"
        Collections.reverse(colors2);
        System.out.println("Reversing, colors2=" + colors2);

        // Extrayez les 2 premières couleurs de "colors1" et affichez les
        System.out.println("Extracting 2 first colors of colors1=" + colors1.subList(0, 2));

        // Échanger 2 couleurs par leur places dans "colors1"
        // affichez "colors1"
        Collections.swap(colors1, 0, 1);
        System.out.println("swapping, colors1=" + colors1);

        // Videz "colors1"
        // affichez "colors1"
        colors1.removeAll(colors1);
        System.out.println("empty, colors1=" + colors1);

        // Testez si "colors1" est vide ou non
        System.out.println("colors 1 is empty=" + colors1.isEmpty());
        // TODO ******* HashSet *******

        // Créez un HashSet de String "colorsSet1", ajoutez 3 couleurs (black, Red, Yellow)
        // et affichez "colorsSet1"
        Set<String> colorsSet1 = new HashSet<>();
        colorsSet1.add("Black");
        colorsSet1.add("Red");
        colorsSet1.add("Yellow");
        System.out.println("colorsSet1= " + colorsSet1);

        // Affichez la taille de votre set
        System.out.println("colorsSet1 size= " + colorsSet1.size());
        // Convertissez votre set en un tableau
        // affichez le tableau
        String[] tab = colorsSet1.toArray(new String[0]);
        System.out.println("converting to array= " + Arrays.toString(tab));

        // Convertissez votre set en liste
        // affichez la liste
        List<String> colors3 = new ArrayList<>(colorsSet1);
        System.out.println("colors3 = " + colors3);

        // Créez un autre set contenant (Black, Red)
        // affichez leur intersection
        Set<String> colorsSet2 = new HashSet<>();
        colorsSet2.add("Black");
        colorsSet2.add("Red");
        colorsSet1.retainAll(colorsSet2);
        System.out.println("intersection =" + colorsSet1);

        // Videz "colorsSet1"
        // affichez "colorsSet1"
        colorsSet1.retainAll(colorsSet1);
        System.out.println("clearing colorsSet1=" + colorsSet1);

        // TODO ******* Map *******

        // Créez un Map de Integer:String "map1",
        // ajoutez 3 couleurs (1:black, 2:Red, 3:Yellow),
        // affichez "map1"
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Black");
        map1.put(2, "Red");
        map1.put(3, "Yellow");
        System.out.println("map1=" + map1);

        // Affichez la taille de "map1"
        System.out.println("map1 size =" + map1.size());

        // Créez un autre Map de Integer:String, "map2" ,
        // ajoutez 3 couleurs (4:White, 5:Orange, 6:Blue)
        // affichez "map2"
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Orange");
        map2.put(6, "Blue");
        System.out.println("map2=" + map2);

        // Ajoutez toutes les valeurs de "map2" dans "map1"
        // affichez "map1"
        map1.putAll(map2);
        System.out.println("map1 after adding map2 = " + map1);
        // Videz "map2"
        // affichez "map2"
        map2.clear();
        System.out.println("clearing, map2 =" + map2);
        // Copiez le contenu de map1 en map2
        // affichez "map2"
        map2 = new HashMap<>();
        System.out.println("new map2 = " + map2);
        // Affichez les clés de "map1"
        System.out.println("map1 keys =" + map1.keySet());
        // Affichez les valeurs de "map1"
        System.out.println("map1 values =" + map1.values());
        // Vérifiez si "map1" contient la clé 1
        System.out.println("map1 contains 1 =" + map1.containsKey(1));
        // Vérifiez si "map1" contient la valeur "Red"
        System.out.println("map1 contains value red =" + map1.containsValue("Red"));

    }
}
