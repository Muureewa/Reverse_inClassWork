//Name: Murad Mohammed
//Date: 02/23/2023
// In Class work with the professor. 

class Main {
  public static void main(String[] args) {
  
    Compare string, parameter would be two strings a and b. 
    isReverse. a = abcd, b = dcba, return true 
    a = level, b = level, return true
    a = usman, b = raymond, retunr false

    String a = "abcd";
    String b = "dcba";
    System.out.println(isReverse(a, b)); // true
        
     a = "level";
    b = "level";
    System.out.println(isReverse(a, b)); // true
        
    a = "usman";
    b = "raymond";
    System.out.println(isReverse(a, b)); // false

    
  }

  public static boolean isReverse(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(b.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  
}
    

  



