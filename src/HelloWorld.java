import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int[] b = {2};
        int[] c = {};

        int minstetall = min(a);

        System.out.println(minstetall);

        System.out.println(min(a));
        System.out.println(Arrays.toString(minmaksv2(a)));
        System.out.println(minmaksv2(a)[1]);

        System.out.println(fak(1));
        System.out.println(fak(2));
        System.out.println(fak(3));
        System.out.println(fak(4));
        System.out.println(maks(a));

        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));
    }

    public static int min(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }

        int min = a[0];
        int minIndex = 0;

        for (int i = 1; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }

        }
        return minIndex;
    }

    public static int maks(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }

        int maks = a[0];
        int maksIndex = 0;
        int count = 0;

        for (int i = 1; i < a.length; ++i) {
            if (a[i] > maks) {
                maks = a[i];
                maksIndex = i;
                count++;
            }

        }
        return count;
    }

    public static int[] minmaks(int[] a) {
        return new int[]{min(a),maks(a)};
    }

    public static int[] minmaksv2(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int mi = 0, minVerdi=a[0];
        int ma = 0,maksVerdi=a[0];

        int verdi = 0;

        for (int i = 1; i < a.length; ++i) {

            verdi = a[i];

            if (verdi > maksVerdi) {
                maksVerdi = verdi;
                ma = i;
            }
            if (verdi < minVerdi) {
                minVerdi = verdi;
                mi = i;
            }
        }
        return new int[]{mi,ma};

        // Hvor mange sammenligninger bruker metoden?
        // 6*2 = 12
    }

    public static long fak(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }

        long fak = 1;

        for (int i = 2; i <= n; ++i) {
            fak *= i;
        }
        return fak;

        // hvis n = 0 eller 1 utføres ingen multiplikasjoner
        // hvis n > 1 utføres n - 1 multiplikasjoner
    }

    // Grunneleggende operasjon:
    // En tilordning -> int a = 0;
    // En tabelloperasjon -> a[i]
    // En sammenligning -> a = b
    // En regneoperasjon -> a + b

    public static int maksv3(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

    public static int max(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks
}
