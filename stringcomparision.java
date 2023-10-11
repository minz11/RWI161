package demo;

public class stringcomparision {
	
		    public static void main(String[] args) {
		        String str1 = "a";
		        String str2 = "c";

		        int result = str1.compareTo(str2);

		        if (result < 0) {
		            System.out.println("str1 comes before str2");
		        } else if (result > 0) {
		            System.out.println("str1 comes after str2");
		        } else {
		            System.out.println("str1 and str2 are equal");
		        }
		        }
		    }
