package HomeWork.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        char[] ass = str.toCharArray();
        int i = 0;
        int j = ass.length-1;

        while (i <= j) {
            char temp = ass[i];
            ass[i] = ass[j];
            ass[j] = temp;
            i++;
            j--;

        }
        System.out.println(ass);




    }

}
