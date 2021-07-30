
package javaexample56stringoperationpart7;


public class JavaExample56StringOperationPart7 {

    
    public static void main(String[] args) {
       
        // Inspector methods (method gives us info about object)
        
        String str = "Sun is shining.";
        
        System.out.println("Your string is: "+str);
        System.out.println("Its length is: "+str.length());
        System.out.println("Substring begins with index (2) is: "+str.substring(2));
        System.out.println("Substring begins with index (2) inclusive, and ends in index (5) exclusive is: "+str.substring(2,5));
        
        
        System.out.println();
        System.out.println();
        
        // Mutator methods (method changes object)
        
        StringBuilder sb =new StringBuilder("I go to the school everyday.");
        
        System.out.println("Your string is: "+sb);
        System.out.println("---");
        
        System.out.println("Change character at index (6) with character (B)...");
        sb.setCharAt(6, 'B');
        System.out.println("Your string is: "+sb);
        System.out.println("---");
        
        System.out.println("Insert another string into this string, beginning with index (2)........");
        sb.insert(2, "YYYYY");
        System.out.println("Your string is: "+sb);
        System.out.println("---");
        
        System.out.println("Delete a part from this string, beginning with index (1) to the index (8)........");
        sb.delete(1,8);
        System.out.println("Your string is: "+sb);
        System.out.println("---");
        
        System.out.println("Replace a part from this string with another string, beginning with index (3) to the index (6)........");
        sb.replace(3,6, "RRR");
        System.out.println("Your string is: "+sb);
        System.out.println("---");
        
        
        
    }
    
}
