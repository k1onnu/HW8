public class Main {
    public static void main(String[] args) {

        double[] people = new double[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = (int) (40 + Math.random() * 60);
            System.out.println("Вес " + "человека: " + people[i]);
        }

        // подсчёт среднего веса всех людей
        double middleCount = 0;
        for (int i = 0; i < people.length; i++) {
            middleCount += people[i];
        }
        System.out.println("\nСредний вес всех людей: " + middleCount / people.length);


        // подсчёт кол-во людей
        int peopleNumber = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] >= 60 && people[i] <= 80) {
                peopleNumber++;
            }
        }
        System.out.println("Кол-во людей: " + peopleNumber);
    }
}
