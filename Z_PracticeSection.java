import java.util.Arrays;

public class Z_PracticeSection {
    public static void main(String[] args) {
        // Anagram checking practice

        String str1 = "Listefn";
        String str2 = "sile\t nt";
        
        isAnagram(str1, str2);

    }
    public static void isAnagram(String str1 , String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("This is anagram.");
        }
        else
        System.out.println("it is not anagram.");
    }

}
