import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class firstup {
    public static class Smartphone {
        public float m;
        public float price;
        public int x, y, z;
        public double power;
        public String color;
    }

    //http://ideone.com/2QqIgX

    public static void showinfoaboutphone (Smartphone r) {
        System.out.println("Масса: " + r.m);
        System.out.println("Цена: " + r.price);
        System.out.println("Мощность: " + r.power);
        System.out.println("Цвет: " + r.color);
        System.out.println("Ширина: " + r.x);
        System.out.println("Длина: " + r.y);
        System.out.println("Толщина: " + r.z);
    }

    public static void main(String[] args) {
        Smartphone[] arraySmart = new Smartphone[3];
        Smartphone s1 = new Smartphone();
        Smartphone s2 = new Smartphone();
        Smartphone s3 = new Smartphone();
        s1.color = "green";
        s1.power = 5000;
        s1.price = 1000;
        s1.m = 1500;
        s1.x = 100;
        s1.y = 200;
        s1.z = 300;

        s2.color = "red";
        s2.power = 4800;
        s2.price = 1100;
        s2.m = 1800;
        s2.x = 110;
        s2.y = 220;
        s2.z = 330;

        s3.color = "blue";
        s3.power = 5100;
        s3.price = 1800;
        s3.m = 2000;
        s3.x = 300;
        s3.y = 350;
        s3.z = 400;

        System.out.println("_________________");
        showinfoaboutphone(s1);
        System.out.println("_________________");
        showinfoaboutphone(s2);
        System.out.println("_________________");
        showinfoaboutphone(s3);
        System.out.println("_________________");
    }

    public static class Refrigerator {
        public int x, y, z; //поле класса
        public double power; //поле класса
        public boolean noFrost; //поле класса
        public float m; //поле класса
        public String color; //поле класса
        public int db; //поле класса
        public  float price; //поле класса
    }

    public static void showinformationfridge(Refrigerator r) {
        System.out.println("Color:" + r.color);
        System.out.println("Weigth" + r.x);
        System.out.println("Shirina" + r.m);
        System.out.println("Price" + r.price);
    }

    public static void main777(String[] args) {
    Refrigerator f1 = new Refrigerator();
    Refrigerator f2 = new Refrigerator();
    Refrigerator f3 = new Refrigerator();
        f1.color = "red";
        f1.m = 34;
        f1.x = 345;
        f1.price = 789;

        f2.color = "purple";
        f2.m = 4;
        f2.x = 3545;
        f2.price = 850;

        f3.color = "green";
        f3.m = 52;
        f3.x = 654;
        f3.price = 560;

        System.out.println("_______________");
        showinformationfridge(f1);
        System.out.println("_______________");
        showinformationfridge(f2);
        System.out.println("_______________");
        showinformationfridge(f3);
        System.out.println("_______________");
    }


    /* package whatever; // don't place package name! */
        public static void main789797(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //программа на языке brainfuck
            //String code = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.>+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.<.>.<.>.";
            String code = ",...";
            //Номер символа из прогаммы который сейчас надо выполнить
            int currentSymbol = 0;
            //Данные 1:  номер активной ячейки
            int i = 0;
            //Данные 2: 30000 пустых ячеек
            char[] array = new char[30000];
            //Пока мы не выполнили всю строку
            //надо выполить очередной символ
            for (currentSymbol = 0; currentSymbol < code.length(); currentSymbol++) {
                char command = code.charAt(currentSymbol);// один из символов +- <> ., []
                switch (command) {
                    case '+':
                        array[i] = (char) (array[i] + 1);
                        break;
                    case '-':
                        array[i] = (char) (array[i] - 1);
                        break;
                    case '>':
                        i++;
                        break;
                    case '<':
                        i--;
                        break;
                    case '.':
                        System.out.print(array[i]);
                        break;
                    case ',':
                        array[i] = scanner.next().charAt(0);
                        break;
                }
            }
        }


    public static void main564(String[] args) {
        String s = "123456";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(2));

        String c = "abc\"defj";
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(c.charAt(3));

        String a = "dkl46546456'AAAA4567Aag";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.charAt(16)=='a');
        System.out.println(a.indexOf("A"));
        System.out.println(a.codePointCount(11,a.length()));
        System.out.println(a.contains("A"));
        System.out.println();

    }

    public static final int SIZE_X = 150;
    public static final int SIZE_Y = 35;
    public static final char EMPTY = ' ';
    public static final char FULL = '#';
    public static final char[][] polex = new char[SIZE_X][SIZE_Y];

    public static void makeLoop(){

    }

    public static void show() {

        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++)
                System.out.println(polex[i][j]);
            System.out.println();
        }
    }

    public static void main45646(String[] args) {

        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++)
                polex[i][j] = EMPTY;
    }
/*krestiki-noliki

    public static final int GO_ON = 1;
    public static final int DRAW = 2;
    public static final int WINNER_X = 3;
    public static final int WINNER_0 = 4;
    
    public static final char EMPTY = ' ';

    static char[][] pole = {{EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}};

    public static void display() {
        System.out.println(pole[0][0] + "|" + pole[0][1] + "|" + pole[0][2]);
        System.out.println("-----");
        System.out.println(pole[1][0] + "|" + pole[1][1] + "|" + pole[1][2]);
        System.out.println("-----");
        System.out.println(pole[2][0] + "|" + pole[2][1] + "|" + pole[2][2]);
        System.out.println("**********************************");
    }

    public static void makeTurn(char symbol) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        do {
            int n = scanner.nextInt();
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] != EMPTY);
        pole[i][j] = symbol;
    }

    public static void makeTurnRandom(char symbol) throws InterruptedException {
        Random random = new Random();
        int i;
        int j;
        do {
            int n = 1 + random.nextInt(9);
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] != EMPTY);
        pole[i][j] = symbol;
        Thread.sleep(1000);
    }

    public static int check() {
        for (int i = 0; i < 3; i++) {
            if (pole[i][0] == pole[i][1] && pole[i][1] == pole[i][2]) {
                if (pole[i][0] == 'X')
                    return 3;
                if (pole[i][0] == '0')
                    return 4;
            }
            if (pole[0][i] == pole[1][i] && pole[1][i] == pole[2][i]) {
                if (pole[0][i] == 'X')
                    return 3;
                if (pole[0][i] == '0')
                    return 4;
            }
        }
    if((pole[0][0]==pole[1][1]&&pole[1][1]==pole[2][2])||
            (pole[0][2]==pole[1][1]&&pole[1][1]==pole[2][0])) {
        if (pole[1][1] == 'X')
            return 3;
        if (pole[1][1] == '0')
            return 4;
    }
for (int i = 0; i < 3; i++)
    for (int j = 0; j < 3; j++)
        if (pole[i][j] == EMPTY)
            return 1;
        return 2;//ничья
    }

    public static void main123(String[] args) throws InterruptedException {
        int result;
        char symbol = 'X';
        do {
            display();
            if(symbol=='X')
                makeTurn(symbol);
            else
            makeTurnRandom(symbol);
            result = check();
            symbol = nextSymbol(symbol);
        } while (result == 1);
        switch (result){
            case 2:
                System.out.println("Ничья");
                break;
            case 3:
                System.out.println("Победа Х");
                break;
            case 4:
                System.out.println("Победа 0");
                break;
        }
    }

    public static char nextSymbol (char c) {
        if (c == 'X')
            return '0';
        return 'X';
    }

    /*public static void main(String[] args) {
        display();
        makeTurn('X');
        display();
        makeTurn('0');
        display();
    }*/

    public static void main47(String[] args) {
        int[][] a = new int[4][5];
        a[0][0] = 1;
        a[0][1] = 1;
        a[0][2] = 1;
        a[0][3] = 1;
        a[0][4] = 1;
        a[1][0] = 2;
        a[1][1] = 2;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }


   /* public static int sumFromTo(int[] array, int i, int M) {
        if (i > M)
            return 0;
        return array[i] + sumFromTo(array, i + 1, M);
    }*/

    public static void main46(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();
        if (K > L || L > N) {
            System.out.println("Ошибка!");
            return;
        }
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int s = 0;
        for (int i = K; i <= L; i++)
            s = s + array[i];
        System.out.println("Сумма = " + s);
    }


    public static int fib(int i) {
        if (i == 0)
            return 0;
        if (i == 1)
            return 1;

        int p = fib(i - 1);
        int pp = fib(i - 2);
        return p + pp;
    }


    public static int count(int n) {
        return n;
    }


    public static int sum2(int n) {
        int d = 1;
        // while (d < n)
        //   d = d * 10;
        //d = d / 10;

        int nCopy = n;
        while (nCopy > 1) {
            d = d * 10;
            nCopy /= 10;
        }

        while (d > 0) {
            System.out.println(n / d);
            n = n % d;
            d = d / 10;
        }
        return d;
    }


    public static void main45(String[] args) {
        System.out.println(1000);
    }


    public static int sum1(int n) {
        int s = 0;
        while (n > 0) {
            System.out.println(n % 10);
            s = s + n % 10;
            n = n / 10;
        }
        return s;
    }

    //public static void main44(String[] args) {
    //int s = sum(124);
    //System.out.println(s);
    //}


    //менюшка начало

    public static void A(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void B() {
        System.out.println("Привет");
    }

    public static void C() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x > y ? x : y);
    }

    public static void main43а(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1) - Прямоугольник");
            System.out.println("2) - \"Привет\"");
            System.out.println("3) - Максимальное из двух");
            System.out.println("4) - Выход");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    A(a, b);
                    break;
                case 2:
                    B();
                    break;
                case 3:
                    C();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Смотри меню!!!");
            }
        }
        while (choose != 4);
    }

    //менюшка - конец


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static int[] createAndFillRandom(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = (int) (Math.random() * 100);
        return array;
    }

    public static void main42(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {144, 26456, 36456, 664, 3215, 4646, 646546};
        int[] c = {4651, 5645642, 13213, 21334, 32165, 4646, 6542, 879, 7456233};
        printArray(a);
        printArray(b);
        printArray(c);
    }


    public static void plpryam(int a, int b) {
        System.out.println(a + b);
    }

    public static void main41(String[] args) {
        int i = 0;
        System.out.print(i);
        System.out.println();

    }


    public static void printFrom1to10() {
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main40(String[] args) {
        printFrom1to10();
        printFrom1to10();
    }


    public static void main39(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                count = 3;
                while (array[i] == array[i + count])
                    count++;
                System.out.println("Кол-во: " + count);
                System.out.println("Первый индекс: " + i);
                break;
            }
        }

        //int fromIndex = scanner.nextInt();
        // int count = scanner.nextInt();
        //for (int i = fromIndex; i < size - count; i++)
        //  array[i] = array[i + count];
        //size = size - count;
        //for (int i = 0; i < size; i++) {
        //  System.out.print(array[i] + " ");
        //}
        //System.out.println();
    }


    public static void main38__(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int fromIndex = scanner.nextInt();
        int count = scanner.nextInt();
        for (int i = fromIndex; i < size - count; i++)
            array[i] = array[i + count];
        size = size - count;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main37(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < size - 1; j++) {
            if (array[j] > array[j + 1]) ;
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
        for (int q = 0; q < size; q++) {
            System.out.print(array[q] + " ");
        }
    }


    public static void main36(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(6);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main35(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < size - 1; j++) {
            if (array[j] > array[j + 1]) ;
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
        for (int q = 0; q < size; q++) {
            System.out.print(array[q] + " ");
        }

    }


    public static void main34(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(1);
            System.out.println(a[i] + " ");
        }
    }


    public static void main33(String[] args) {
        int[] a;
        a = new int[10];
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }


    public static void main32(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 20 + random.nextInt(90);
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i--) {
            System.out.print(a[i] + "<->");
        }
        System.out.println();
    }


    public static void main31(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 20 + random.nextInt(81);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--)
            a[i] = a[i - 1];
        a[0] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }


    public static void main30(String[] args) {
        int[] a;
        int[] b;
        a = new int[5];
        b = new int[5];


    }


    public static void main29(String[] args) {
        System.out.println(Byte.MAX_VALUE);
    }


    public static void main28(String[] args) {
        int x = 10;
        x++; //x=x+1
        System.out.println(x);

    }


    public static void main27(String[] args) {
        int x = 9;
        int y = 6;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j > x / 2 + i || j < x / 2 - i) {
                    System.out.print("-");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main26(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = 1;
        int count = 0;
        while (d != x) {
            if (x % d == 0)
                count++;
            d++;
        }
        System.out.println("Всего делителей: " + count);
    }


    public static void main25(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(100));
    }


    public static void main24(String[] args) {
        //Игра "Угадай число"
        Scanner scanner = new Scanner(System.in);
        int secret = 7; //секретное число
        int user = 0; //число от пользователя
        user = scanner.nextInt();
        //пользователь вводит число раз за разом
        //пока не угадает
        //посчитать сколько было попыток
        while (user != secret) {

        }
    }


    public static void main23(String[] args) {
        int x = 10;
        int y = 4;
        for (int i = 0; i < y; i = i + 1) {
            for (int j = 0; j < x; j = j + 1) {
                if (i == 0 || i == y - 1)
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.println();
        }
    }


    public static void main22(String[] args) {
        int x = 10;
        int y = 4;
        for (int i = 0; i < y; i = i + 1) {
            for (int j = 0; j < x; j = j + 1) {
                System.out.print("*");

            }
            System.out.println();
        }
    }


    public static void main21(String[] args) {
        int x = 67764;
        int s = 0;
        int min = x % 10;
        int max = x % 10;
        while (x > 0) {
            int c = x % 10;
            if (c > max) ;
            System.out.println(c);
            max = c;
            if (c < min) ;
            System.out.println(c);
            min = c;
            System.out.println("x=" + x);
            System.out.println("c=" + c);
            s = s + c;
            System.out.println("s=" + s);
            x = x / 10;
        }
    }


    public static void main20(String[] args) {
        int x = 678;
        int s = 0;
        while (x > 0) {
            int c = x / 10;
            if (c < x)
                System.out.println(c);
            System.out.println("x=" + x);
            System.out.println("c=" + c);
            s = s + c;
            System.out.println("s=" + s);
            x = x / 10;
            if (x < s)
                System.out.println(x);
        }
    }


    public static void main19(String[] args) {
        int s = 0;
        int i = 0;
        while (s < 11) {
            s = s + i;
            i = i + 1;
            System.out.println("s=" + s);
        }
    }


    public static void main18(String[] args) {
        int s = 0;
        int i = 0;
        while (s < 20) {
            i = i + 1;
            s = s + i;
            System.out.println("i=" + i);

        }
    }


    public static void main17(String[] args) {
        System.out.println(5 + "  " + 1);
        System.out.println(5 + "  " + 1);
        System.out.println(5 + "  " + 1);
        System.out.println(5 + "  " + 1);
    }


    public static void main16(String[] args) {
        for (int i = 1; i < 19; i = i * 2)
            System.out.println(i);
    }


    public static void main15(String[] args) {
        for (int i = 13; i < 18; i = i + 1)
            System.out.println(i);
    }


    public static void main14(String[] args) {
        for (int i = 18; i < 31; i = i + 3)
            System.out.println(i);
    }


    public static void main13(String[] args) {
        for (int i = 0; i < 10; i = i + 2)
            System.out.println(i);
    }


    public static void main12(String[] args) {
        for (int i = 0; i < 10; i = i + 1)
            System.out.println(i);
    }


    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введите возраст");
        int y = scanner.nextInt();
        System.out.println("Введите сумму");
        int f = scanner.nextInt();
        System.out.println("Введите N пачек");
        int d = scanner.nextInt();
        System.out.println("Введите цену за пачку");
        int a = scanner.nextInt();
        System.out.println("Введите кол-во пачек на складе");
        if (x >= 18) ;
        System.out.println("Да");
        if (y >= 1) ;
    }


    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (0 <= age && age <= 1)
            System.out.println(100);
        else if (age <= 4)
            System.out.println(200);
        else if (age <= 6)
            System.out.println(250);
        else if (age <= 9)//но при этом >6
            System.out.println(300);
        else if (age <= 14)
            System.out.println(500);
        else
            System.out.println(600);
    }


    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a / b;
        System.out.println();


    }


    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        System.out.println(max);
    }


    public static void main7(String[] args) {
        int a = 4;
        int b = 5;
        if (a > b)
            System.out.println("AAA");
        else
            System.out.println("BBB");
    }


    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        double d = scanner.nextDouble();
        System.out.println(x + y + z);
    }


    public static void main5(String[] args) {
        int x = 20;
        int e = 30;
        int k = 40;
        int m = 20 + 30 * 40;
        System.out.println(m);
    }


    public static void main4(String[] args) {
        double r = 486312;
        double o = 741.285;
        double w = r * o;
        System.out.println(w);
    }


    public static void main3(String[] args) {
        double l = 210;
        double v = 50.4;
        double t = l / v;
        System.out.println(t);
    }


    public static void main2(String[] args) {
        int l = 200;
        int x = 50;
        int t = l / x;
        System.out.println(t);
    }


    public static void main1(String[] args) {
        int x = 50;
        int y = 10;
        System.out.println(x + y);
        System.out.println("x=" + x + " y=" + y);
        System.out.println("x+y=" + (x + y));

    }

}


//idea2016