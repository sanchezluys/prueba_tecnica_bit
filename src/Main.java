
import com.bit.proyecto.service.IntegerSet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //
        // // emoticones: ⚠️🔥📝✅❎📂⚙️🏷️📦📆🗓️🕑🏁➡️⬆️🎁🛒🛍️✏️🖍️✂️🔒🔓🚗✈️🛞
        // ➕➖➗✖️🟰♾️💲 ❓❔‼️⁉️🔅🔆〽️⚠️🚸
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║ BIT INSTITUTE  JUNIO 2024  BY: SANCHEZLUYS             ║");
        System.out.println("║ PRUEBA TECNICA  *PROYECTO 4*                           ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ JAVA  SDK 17                                           ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        // ingresando los datos y viendo como queda la matriz
        int dato;
        //**************** set 1
        dato=1;
        set1.insertElement(dato);
        System.out.println("Set 1:("+dato+")="+ Arrays.toString(set1.getSet()));
        //
        dato=50;
        set1.insertElement(dato);
        System.out.println("Set 1:("+dato+")="+ Arrays.toString(set1.getSet()));
        System.out.println("\uD83C\uDFF7\uFE0F Set 1 Resumen " + set1.toSetString());
        //******************* set 2
        System.out.println("════════════════════════════════════════════════════════");
        dato=50;
        set2.insertElement(dato);
        System.out.println("Set 2:("+dato+")="+ Arrays.toString(set2.getSet()));
        //
        dato=75;
        set2.insertElement(dato);
        System.out.println("Set 2:("+dato+")="+ Arrays.toString(set2.getSet()));
        System.out.println("\uD83C\uDFF7\uFE0F Set 2 Resumen " + set2.toSetString());
        System.out.println("════════════════════════════════════════════════════════");
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        //
        System.out.println("➕ Resultado de la Unión: " + unionSet.toSetString());
        System.out.println("════════════════════════════════════════════════════════");
        System.out.println("\uD83C\uDF17 Resultado de la Intersección: " + intersectionSet.toSetString());
        System.out.println("════════════════════════════════════════════════════════");
        System.out.println("❓ ¿Es igual Set1 al Set2? " + set1.equalTo(set2));
        System.out.println("════════════════════════════════════════════════════════");
        dato=50;
        System.out.println("❎ Borrando al: "+ dato +" de Set1");
        set1.deleteElement(dato);
        System.out.println("⚠\uFE0F Resultado al borrar el: " +dato +" es Set1= " + set1.toSetString());
    }
}