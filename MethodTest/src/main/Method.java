public class Method {


    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("some text 133", "Справка");
        printer.append("some text 210", 544);
        System.out.println(printer.getPendingQueue());
        printer.printPrinter();
        printer.append("some text 8", 530);
        printer.clear();
        printer.append("some text 23", "Договор", 312);
        printer.append("some text 11");
        printer.printPrinter();
        System.out.println(printer.getPrintedPages());
    }

    public static void printInfo(Users user) {
        int age = user.getAge();
        String label = "";
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);
        int ageLastDigit = age % 10;
        if (ageLastDigit == 1) {
            label = "год";
        } else if(ageLastDigit == 0 ||
                ageLastDigit >= 5 && ageLastDigit <= 9) {
            label = "лет";
        } else if(ageLastDigit >= 2 && ageLastDigit <= 4) {
            label = "года";
        }
        if (isExclusion) {
            label = "лет";
        }

        System.out.println("Пользователь: " + user.getName() +
                ", " + age + " " + label);
        }

    }

