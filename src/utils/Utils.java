package utils;

public class Utils {
    public static boolean isNumberString(String s){
        int lenth = s.length();
        for (int i = 0; i < lenth; i++) {
            if(s.toCharArray()[i] < '0' || s.toCharArray()[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
