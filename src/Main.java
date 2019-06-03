public class Main {

    public static void main(String[] args) {

        String str_first_var = "Success";
        String str_second_var = "Fail";

        // Print String before swapping
        System.out.println("Strings before swap: str_first_var = " +
                str_first_var + " and str_second_var = " + str_second_var);

        // append 2nd string to 1st
        str_first_var = str_first_var + str_second_var;

        // store intial string 1st in string 2nd
        str_second_var = str_first_var.substring(0, str_first_var.length() - str_second_var.length());

        // store initial string 2nd in string 1st
        str_first_var = str_first_var.substring(str_second_var.length());

        // print String after swapping
        System.out.println("Strings after swap: str_first_var = " +
                str_first_var + " and str_second_var = " + str_second_var);
    }
}
