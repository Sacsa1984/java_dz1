package Dz1.company;
import java.awt.geom.Area;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static class Zd11 {
        private static int x;
        private static int y;

        public Zd11(int x, int y) {
            this.x = x;
            this.y = y;

        }

        public static void Vizual() {

            System.out.println("X=" + x + " Y=" + y);
        }

        public static void Redakt(int new_x, int new_y) {
            x = new_x;
            y = new_y;

            System.out.println("X=" + x + " Y=" + y);
        }

        public static int Sum() {
            int sum = x + y;
            return sum;
        }

        public static int Max() {
            if (x > y) return x;
            else return y;

        }
    }

    public static class Trains {
        String Name;
        int Number;
        String TimeStart;

        public Trains(String Destination, int Number, String TimeStart) {
            this.Name = Destination;
            this.Number = Number;
            this.TimeStart = TimeStart;
        }
    }

    public static class Student {

        String name;
        int grup;
        int[] ocen;

        //конструктор для класса Cat
        public Student(String name, int grup, int[] ocen) {
            this.name = name;
            this.grup = grup;
            this.ocen = ocen;
        }


    }
//для проверки по очереди раскаментировать !!!!!!
    public static void main(String[] args) {
        //  Zd1();
        // Zd2();
        // Zd3();
        //  Zd5();
        //  Zd6();
        // Zd7();

        //Zd9();
        //Dz10();

//         Zd11 obj=new Zd11(2,10);
//        obj.Vizual();
//        obj.Redakt(20,30);
//        System.out.println(obj.Sum());
//        System.out.println(obj.Max());

    }


    public static void Zd1() {


        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int ran = rand.nextInt(10);
        int n;
        System.out.println("В ведите количество попыток ");

        int pop = scanner.nextInt();
        int itr = 0;

        do {
            itr++;
            System.out.println("В ведите число от 1 до 10 ");

            n = scanner.nextInt();
            if (n == ran) {
                System.out.println("поздравляю вы угадали");
                itr = pop;
            } else if (ran < n) {
                System.out.println("ваше число больше");
            } else {
                System.out.println("ваше число меньше");
            }

        }
        while (pop != itr);


        System.out.println("Dz1 отработал ");

    }

    public static void Zd2() {

        int[] arr = new int[]{1, 3, 2, 4, 1};
        Arrays.sort(arr);
        int itr = 1;
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] != x) {
                itr++;
            }
            x = arr[i];
        }

        System.out.println(itr);
        System.out.println("Dz2 отработал ");

    }

    public static void Zd3() {

        int[] arr = new int[]{1, 3, 2, 4, 1};


        Random rand = new Random();
        int x1, x2, x3;
        for (int i = 0; i < arr.length; i++) {

            x1 = rand.nextInt(arr.length);

            x2 = rand.nextInt(arr.length);
            x3 = arr[x1];
            arr[x1] = arr[x2];
            arr[x2] = x3;


        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void Zd5() {

        Scanner scanner = new Scanner(System.in);
        String str;
        String str1;
        System.out.println("В ведите строку");
        str = scanner.nextLine();

        str1 = str.replaceAll("\\s+", " ").trim();// заменяем два пробела на один
        String[] subStr;
        String delimeter = " "; // заносим в переменную то по чём розбиваем строку на массив строк
        subStr = str1.split(delimeter);//розбиваем строку на массив строк
        str1 = "";
        for (int j = 0; j < subStr.length; j++) {
            str1 += subStr[j].substring(0, 1).toUpperCase() + subStr[j].substring(1).toLowerCase() + " ";
        }
        System.out.println(str1);

    }

    public static void Zd6() {
        String str_Email = "email Romza1234.com";
        String str_Https = "www.site.com";
        int n = str_Email.length() - 5;

        String new_Email = str_Email.substring(0, 5) + String.join("", Collections.nCopies(n, "*"));
        String new_Https = "http://" + str_Https.substring(4, str_Https.length());
        System.out.println(new_Email);
        System.out.println(new_Https);

    }

    public static boolean isNumeric(String str) {//функция проверка строки на число
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("некоректные данные ");

            return false;
        }
    }

    public static void Zd7() {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("В ведите выражение  max(a,b) min(a,b)");

        str = scanner.nextLine();


        if (isNumeric(str.substring(4, 5))) {
            if (isNumeric(str.substring(6, 7))) {
                switch (str.substring(0, 3)) {
                    case "max": {

                        if (Integer.parseInt(str.substring(4, 5)) < Integer.parseInt(str.substring(6, 7))) {
                            System.out.println(str + " = " + Integer.parseInt(str.substring(6, 7)));
                            break;
                        } else {
                            System.out.println(str + " = " + Integer.parseInt(str.substring(4, 5)));
                            break;
                        }
                    }

                    case "min": {
                        if (Integer.parseInt(str.substring(4, 5)) > Integer.parseInt(str.substring(6, 7))) {
                            System.out.println(str + " = " + Integer.parseInt(str.substring(6, 7)));
                            break;
                        } else {
                            System.out.println(str + " = " + Integer.parseInt(str.substring(4, 5)));
                            break;
                        }

                    }
                    default:
                        System.out.println("некоректные данные ");
                        break;
                }
            }
        }
    }



    public static void Zd9() {

        Student[] stud = new Student[10];
        stud[0] = new Student("Попов Ф.В", 32, new int[]{1, 3, 2, 4, 1});
        stud[1] = new Student("Бобров Ф.В", 32, new int[]{7, 3, 6, 11, 12});
        stud[2] = new Student("Наумов Ф.В", 32, new int[]{5, 4, 6, 4, 6});
        stud[3] = new Student("Моргунов Ф.В", 32, new int[]{12, 3, 2, 3, 1});
        stud[4] = new Student("Васильев Ф.В", 32, new int[]{1, 10, 2, 4, 1});
        stud[5] = new Student("Бубнов Ф.В", 32, new int[]{1, 3, 8, 4, 7});
        stud[6] = new Student("Павлов Ф.В", 32, new int[]{1, 6, 9, 4, 11});
        stud[7] = new Student("Сергиенко Ф.В", 32, new int[]{4, 7, 2, 4, 3});
        stud[8] = new Student("Матвиенко Ф.В", 32, new int[]{1, 5, 2, 4, 1});
        stud[9] = new Student("Соболев Ф.В", 32, new int[]{1, 3, 2, 8, 1});
        int saiz = 0;

        for (int i = 0; i < stud.length; i++) {
            saiz = 0;
            for (int j = 0; j < stud[i].ocen.length; j++) {
                saiz += stud[i].ocen[j];

            }
            if (saiz / stud[i].ocen.length == 4) {
                System.out.println(stud[i].name + " група" + stud[i].grup);
                System.out.println("средний бал " + saiz / stud[i].ocen.length);


            }
            if (saiz / stud[i].ocen.length == 5) {
                System.out.println(stud[i].name + " група" + stud[i].grup);
                System.out.println("средний бал " + saiz / stud[i].ocen.length);


            }

        }

    }

    public static void Dz10() {

        Trains[] trains = new Trains[5]; //Массив с поездами

        Trains[] NewTrains = new Trains[5]; //Массив с отсортироваными поездами
        Trains[] temp = new Trains[5]; //Массив для хранения одиночных поездов без пары

        int NewTrainsIndex = 0; //Индекс новых поездов
        int IndexTemp = 0; //Индекс поездов без пары

        //Заполнение масива


        trains[0] = new Trains("Киев", 1, "21.30");
        trains[1] = new Trains("Москва", 4, "13.00");
        trains[2] = new Trains("Киев", 2, "19.20");
        trains[3] = new Trains("Волгоград", 3, "8.00");
        trains[4] = new Trains("Москва", 7, "15.00");


        System.out.println("До сортировик");

        for (int i = 0; i < trains.length; i++) {

            System.out.println(trains[i].Name + " " + trains[i].TimeStart + "  " + trains[i].Number);

        }

        Scanner scanner = new Scanner(System.in);
        int nom;
        System.out.println("В ведите поизда");

        nom = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < trains.length; i++) {

            if (nom == trains[i].Number) {

               System.out.println(trains[i].Name + " " + trains[i].TimeStart + "  " + trains[i].Number);
            }


        }
        System.out.println("после сортировки");
        for (int i = 0; i < trains.length; i++) {

            int counter = 0; //Счётчик одинаковых пунктов назначения
            boolean isNotFound = true; //Отсортированы ли поезда по текущему пункту назначения?

            Trains[] TimeStartSort = new Trains[6]; //Массив для сортировки по времени отправки
            int IndexTimeStartSort = 0; //Индекс данного масива

            for (int j = i; j < trains.length; j++) {

                if (trains[i].Name == trains[j].Name) { //Если был найден поезд с пунктом назначения как у текущего поезда

                    for (int y = 0; y < NewTrains.length; y++) { //Проверяем не сортировался ли этот поезд раньше
                        if (NewTrains[y] != null) {
                            if (NewTrains[y].Name == trains[i].Name) {
                                isNotFound = false; //Если уже отсортирован, не сортируем
                            }
                        }
                    }

                    if (isNotFound) { //Если ещё не сортировали

                        counter++; //Прибавляем счётчик
                        if (counter == 2) { //Если есть пара :)
                            TimeStartSort[IndexTimeStartSort] = trains[i]; //Добавляем в масив с отсортироваными поездами поезд с пунктом назначения, по которому производился поиск
                            IndexTimeStartSort++;
                            TimeStartSort[IndexTimeStartSort] = trains[j]; //И поезд с таким же пунктом назначеия, как у первого поезда
                            IndexTimeStartSort++;
                        } else if (counter > 2) { //Если поездов с данным пунктом назначения больше, чем два
                            TimeStartSort[IndexTimeStartSort] = trains[j]; //То добавляем только найденный поезд
                            IndexTimeStartSort++;
                        }

                    }
                }

            }

            if (counter <= 1 && isNotFound) { //Если пары у поезда нет :(
                temp[IndexTemp] = trains[i]; //Добавляем его в массив temp
                IndexTemp++;
            } else { //Если счётчик не равен 0, и данный поезд уже был отсортирован

                for (int j = 0; j < IndexTimeStartSort; j++) { //Сортируем поезда с одинаковым пунктом назначения по времени отправик
                    for (int y = 0; y < IndexTimeStartSort; y++) {
                        if (j != y) {
                            if (Double.parseDouble(TimeStartSort[j].TimeStart) < Double.parseDouble(TimeStartSort[y].TimeStart)) {
                                Trains tmp = TimeStartSort[j];
                                TimeStartSort[j] = TimeStartSort[y];
                                TimeStartSort[y] = tmp;
                            }
                        }
                    }
                }

                for (int j = NewTrainsIndex; j < NewTrains.length; j++) { //И вносим изменения после сортирвоки в массив с отсортироваными поездами
                    if (IndexTimeStartSort > 0) {
                        IndexTimeStartSort--;
                        NewTrains[j] = TimeStartSort[IndexTimeStartSort];
                        NewTrainsIndex++;
                    }
                }

            }

        }


        for (int i = 0; i < NewTrains.length; i++) {
            if (NewTrains[i] == null) {
                if (IndexTemp - 1 >= 0) { //Поезда без пары добавляем в конец масива
                    NewTrains[i] = temp[IndexTemp - 1];
                    IndexTemp--;
                }
            }
            trains[i] = NewTrains[i];
            System.out.println(trains[i].Name + " " + trains[i].Number + " " + trains[i].TimeStart);
        }
    }

}





