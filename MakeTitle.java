/*
 * Program that takes takes a string and an integer. 
 * If the value of the integer is negative, all value is the string are set to lower case.
 * If the value of the integer is 0, the values of the string are left alone
 * If the value of the integer is possitive, the characters to the index matching
 * the integer given should be capitalized.
 *
 * @author Stewart
 * @version JAVA 8, 7/17/2019
 */

public class MakeTitle{
    public static void main(String[] args){
        System.out.println(makeTitle("Twice a bow to my dear cousin Vinny.", 3));
        System.out.println(makeTitle("Twice a bow to my dear cousin Vinny.", -5));
        System.out.println(makeTitle("Twice a bow to my dear cousin Vinny.", 0));
        System.out.println(makeTitle("Twice a bow to my dear cousin Vinny.", 20));
        System.out.println(makeTitle("Twice a bow to my dear cousin Vinny.", 1));

    }

    public static String makeTitle(String str, int val){
        /* If the value of 'val' is '0', then the string will be returned as it was given */
        if(val == 0){
            return str;
        /* If the value is negative, all letters should be returned as lower case */
        } else if(val < 0){
            return str.toLowerCase();
        } else {
            /* Forces all values in 'str' to be lower case */
            str = str.toLowerCase();
            /*
             * Regex: \\s+
             * Specifies split on one or more (+) white spaces, " ", "\t", "\n" 
             */
            String[] parts = str.split("\\s+");
            /* resets 'str' to be empty so it can be reused in the below for loop */
            str = "";
            /* loops through all the values of 'parts' */
            for(int i = 0; i < parts.length; i++){
                /*
                 * If 'val' is less than the total length of the string, every
                 * index from '0' to 'val' will be cut and set to upper case.
                 * then the remaining indexes after 'val' are added to 'str'
                 */
                if(val < parts[i].length()){
                    str += parts[i].substring(0, val).toUpperCase();
                    str += parts[i].substring(val);
                /* 
                 * If 'val' is greater than the total length of the string,
                 * sets all values of the string to upper case
                 */
                } else {
                    str += parts[i].substring(0).toUpperCase();
                }
                /* If 'parts[i]' is not at its last index, adds a space to 'str' */
                if(i != parts.length - 1){
                    str += " ";
                }
            }
        }
        return str;
    }
}
