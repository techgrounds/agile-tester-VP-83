public class Modifier {
    public static void main(String[] args) {
        System.out.println("Modifier & More");
/*
Opdracht 1 - Noem de vier verschillende Access Control Modifiers en geef bij elke een korte beschrijving.

   - concat:    hiermee kun je 2 strings aan elkaar verbinden. Doet hetzelfde als een +
   - charAt:    deze manipuleert de output van een gehele string.
                Als je bijv een (0) hebt gebruikt, dan neemt hij de eerste letter van je gehele String.
                Aan de hand van welke cijfer je kiest, zal hij ook de output beinvloeden.
   - indexOf:    Hiermee kun je terug naar de eerste keer dat een bepaalde caracters/gekozen input start.
                Je ziet dan na hoeveel caracters het te vinden is.
   - toUpperCase/ toLowerCase: hiermee kan je een hele inhoud veranderen naar hoofdletters of kleine letters.
*/
    // Uivoering concat
        String hello = "Hello";
        String world = "World";
        System.out.println(hello.concat(world));

        // Uitvoering charAt
        String myStr0 = "Hello";
        char result0 = myStr0.charAt(0);
        System.out.println(result0);
        String myStr1 = "Hello";
        char result1 = myStr1.charAt(1);
        System.out.println(result1);

        // Uitvoering indexOf
        String planet = "Hello planet earth, you are a great planet.";
        System.out.println(planet.indexOf("planet"));
        System.out.println(planet.indexOf("great"));

        // uitvoering upper/lower
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
/*
Opdracht 2 - Kan je uitleggen waar je static en final voor zou gebruiken?
En wat is het voordeel ervan als je dit doet?

    Een Final gebruik je wanneer je wilt dat attributen/ methodes/classes niet veranderd kunnen worden.
    Ze kunnen dus nooit overruled worden door andere methodes. Het voordeel hiervan is dat je niet snel
    fouten zult maken wanneer een wijziging dezastreuze gevolgen zou hebben.

    Bij static behoort een methode tot de hele class in plaats van een specifiek object.
    Je hoeft hiervoor geen aparte object aan te maken. Je kunt de static op ieder moment aanroepen.
    Voordeel is dat je niet steeds dus iets hoeft aan te maken.


Opdracht 3 - Wanneer gebruik je .equals() en wanneer gebruik je ==?
    == moet worden gebruikt tijdens referentievergelijking.
    == controleert of beide verwijzingen naar dezelfde locatie verwijzen of niet.
    equals() methode moet worden gebruikt voor het vergelijken van inhoud.
    equals() methode evalueert de inhoud om de gelijkheid te controleren
 */

    }
}
