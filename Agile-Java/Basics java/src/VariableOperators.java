public class VariableOperators {
    public static void main(String[] args) {
        System.out.println("Variable Operators");


 /*
    Opdracht 1 : Wanneer gebruik je een int, long, double of float?

    - int:      Dit gebruik je bij hele nummer
                Bijvoorbeeld 3 of 23
    - long:     Wanneer je heel veel nummers achter elkaar wil gebruiken, waar een int te kort voor is
                Bijv 12345678901234567890L (deze moet je ook altijd afsluiten met een L )
    - float:    Dit zijn nummers waarbij je 6 a 7 decimalen kan gebruiken.
                Bijvoorbeeld 2.345234f (sluit af met f )
    - double:   Dit zijn nummers met veel meer decimalen dan de float ( 15)
                Bijvoorbeeld 5.645364869563425d (afsluiten met d)
*/

    /*
        Opdracht 2 : Probeer een String en een int bij elkaar op te tellen
        en print het resultaat in je console.
    */
// uitvoering opdrachten
        String namepets = "Ben has a total of ..pets: ";
        int cats = 5;
        int dogs = 4;
        int pets = cats + dogs;
   // opdracht 2
        System.out.println(namepets+ pets);
// opdracht 3,4,5
        String namemore = "He gets more off the streets and now has ..cats: ";
        int NumberOfCats = 10;
        int newcats = NumberOfCats + 5;
        System.out.println(namemore+ newcats);

        String namemax = "He can only keep 4% of his cats so now he has ";
        System.out.println(namemax+ newcats % 4);
// Opdacht 6
        System.out.println(cats > dogs);
        System.out.println(cats < dogs);
        System.out.println(cats >= dogs);
        System.out.println(cats <= dogs);
        System.out.println(cats == dogs);
        System.out.println(cats != dogs);

/*  Opdracht 7
    1. Wat is een voordeel van Strict Typing?
    - Static typing makes it easier to work with relational databases and other systems
    which also rely on static types
    — It helps you catch type mismatches sooner at compile-time.
    It can help reduce the likelihood of some kinds of errors.

    2. Wat is een voordeel van Weak Typing?
    - Het kost minder moeite om een code te schrijven
 */

    }
}
