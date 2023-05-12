public class C_Oppervlakte {

    public static void main(String[] args) {
        int antwoord = 0;
        // Uncomment de regels en maak een method die voor het juiste antwoord zorgt.

        antwoord = oppervlakteRechthoek(2, 8);
        System.out.println("De oppervlakte van een rechthoek met lengte 2 en breedte 8 is " + antwoord);

        antwoord = oppervlakteVierkant(5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteRechthoek()` hergebruiken.
        System.out.println("De oppervlakte van een vierkant met zijden van 5 cm is " + antwoord);

        antwoord = oppervlakteDoos(2,8,5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteRechthoek()` hergebruiken.
        System.out.println("De oppervlakte van een doos met lengte 2, breedte 8 en hoogte 5 is " + antwoord);

        antwoord = oppervlakteKubus(5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteVierkant()` hergebruiken, of `oppervlakteDoos()` hergebruiken.
        System.out.println("De oppervlakte van een kubus met zijden van 5 cm is " + antwoord);
    }

    // nieuwe methods komen hier
    private static int oppervlakteRechthoek(int length, int with) {
        return length * with;
    }

    private static int oppervlakteVierkant(int length) {
        return length * length;
    }

    private static int oppervlakteDoos(int length, int with, int height) {
        int bottom_and_top = length * with * 2;
        int front_and_back = length * height * 2;
        int left_and_right = with * height * 2;
        return bottom_and_top + front_and_back + left_and_right;
    }

    private static int oppervlakteKubus(int length) {
        return (length * length) * 6;
    }

}
