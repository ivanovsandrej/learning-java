package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {
        String name = "Andrejs";
        String surname = "Ivanovs";
        // Concatination
        String myText = "My name is: " + name + " " + surname;
        System.out.println(myText);
        // Interpolation
        String interpolation = String.format("My name is: %s %s", name, surname);
        System.out.println(interpolation);


        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        int age = 25;
        String city = "New York";
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));

    }
}
