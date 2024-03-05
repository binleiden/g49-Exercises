package se.lexicon.Strings;

public class StringExercise {

    static String getExercise1 = "java";
    static String getExercise2 = "Long example sentence";
    static String getExercise3 = "Even longer example sentence";
    static String getExercise4 = "Ok this is not as long!";
    static String getExercise5 = "CAPS EQUALS SCREAMING";
    static String getExercise6 = "Java is the worst programming language!";
    static String getExercise7 = "\tJ\ta\tv\ta\t";
    static int getExercise8 = 20;
    static String result = getExercise8 + "20";


    public static void main(String[] args) {
        System.out.println(StringExercise.getExercise1.length());
        System.out.println(StringExercise.getExercise2.charAt(6));
        System.out.println(StringExercise.getExercise3.indexOf("o"));
        System.out.println(StringExercise.getExercise4.substring(3, 22));
        System.out.println(StringExercise.getExercise5.toLowerCase());
        System.out.println(StringExercise.getExercise5.toUpperCase());
        System.out.println(StringExercise.getExercise6.replace("worst", "best"));
        System.out.println(StringExercise.getExercise7.trim());
        System.out.println(StringExercise.result);

        //exercise 10
        String getGetExercise9 = "Oil and Water";
        String[] words = getGetExercise9.split(" ");

        for (String word : words) {
            System.out.println(word);


        }
        //exercise 11
        String firstName = "Carl, Susie, Fredrick, Bob, Erik";
        String[] names = firstName.split(", "); // Using ", " as the delimiter

        for (String name : names) {
            System.out.println(name);
        }
        //exercise 10
        String str = "ThisShouldBeConverted";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            System.out.println(c + " ");
        }

        //exercise 11
        char[] java = {'J', 'a', 'v', 'a'};
        String strArray = String.valueOf(java);
        System.out.println(strArray);
    }
}
