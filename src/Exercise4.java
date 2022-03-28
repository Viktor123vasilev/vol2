public class Exercise4 {
    public static void main(String[] args) {
        //Write a method that reverses a string.
        //For example, 'java interview' becomes 'weivretni avaj'.
        String str = "Hello pure";
        System.out.println("Put your string here: " + str);
        System.out.println("reversed string is: " + reversedString(str));

    }

    public static StringBuilder reversedString(String str){
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        return str1;


    }





}

