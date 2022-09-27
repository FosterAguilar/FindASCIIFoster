class Main {
  public static void main (String [] args){
    char ch = 'a';  //char datatype
    int ascii = ch;  //explicit conversion
    // you can laso cast char to int
    int castAscii = (int)ch;  //casting
    System.out.println("The ASCII value of " + ch + " is: " + ascii);  
    System.out.println("The ASCII value of " + ch + " is: " + castAscii); 
  }
}