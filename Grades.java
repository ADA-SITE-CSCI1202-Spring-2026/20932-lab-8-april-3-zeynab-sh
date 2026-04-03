import java.util.HashMap;

public class Grades {
    public static void main(String[] args) {

        HashMap<String, Double> grades = new HashMap<>();

        grades.put("Ali", 3.5);
        grades.put("Nahida", 4.0);
        grades.put("Sam", 2.8);
        grades.put("Nigar", 3.9);

        /*for (String name : grades.keySet()) {
            System.out.println(name + " -> " + grades.get(name));
        }
        */

        double max = 0;

    for (double gpa : grades.values()) {
        if (gpa > max) {
            max = gpa;
        }
    }


    System.out.print("Highest GPA: ");

    for (String name : grades.keySet()) {
        if (grades.get(name) == max) {
            System.out.println(name + " ");
        }
}


        double sum = 0;

        for (double gpa : grades.values()) {
            sum += gpa;
        }
        double avg = sum / grades.size();
        System.out.println("Average GPA: " + avg);

        int count = 0;

        for (double gpa : grades.values()) {
            if (gpa < avg) {
                count++;
            }
        }

        System.out.println("Below average: " + count);
    }
}