package test.java.sessions.fabiolaMonrroy.katas.example0;

public class Person {
    private String name;
    private String lastName;

    private int age;
    private int ci;

    public Person(String name, String lastName, int ci, int age) {
        this.age = age;
        this.ci = ci;
        this.lastName = lastName;
        this.name = name;
    }

    public String getFullName() {
        return "".concat(sanitizeStr(this.name)).concat(" ").concat(sanitizeStr(this.lastName));
    }

    public static String capitalize(String str) {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String sanitizeStr(String str) {
        if (!str.contains(" ")) {
            return capitalize(str);
        }
        String newString = "";
        for (int i = 0; i < str.split(" ").length; i++) {
            String arrayItem = str.split(" ")[i];
            String capitalizeStringItem = capitalize(arrayItem);
            newString = newString.concat(capitalizeStringItem).concat(" ");
        }
        return newString.trim();

    }
}