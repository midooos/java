
class tableau {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
            System.out.println("La somme est = " + somme);
        }
        for (int i = 0; i < tab.length / 2; i++) {
            int t = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = t;
        }

        for (int n : tab) {
            System.out.print(n + " ");
        }
    }

}
