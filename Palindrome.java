public class Palindrome {
  // Test if text is a palindrome.
  // Ignore upper/lower case, white space, and punctuation.
  //
  public static boolean isPalindrome(String text) {
      // boolean check = false;
      text = text.replaceAll("[^A-Za-z]+", "").toLowerCase();
      char charText[] = text.toCharArray();
      int length = charText.length;
      Stack<Character> textStack = new Stack<Character>();
        for(int i = 0; i < length; i++){
       textStack.push(charText[i]);
    }
        String reverseText = "";

    while (!textStack.isEmpty()){
        reverseText += textStack.pop ();
     }
        text.equals(reverseText)
      // if (text.equals(reverseText)) check = true;
      // return check;
     }

  public static void main(String[] args) {
    // TODO: test
    System.out.println(isPalindrome("ABAA"))
    System.out.println(isPalindrome("Abdallah"))
    System.out.println(isPalindrome("Na, Fabkir, "))

  }
}
/*
    private static boolean isAllKilled(String[] persons){
        for (String person : persons) {
            if (!person.equals("")) {
                return false;
            }
        }
        return true;
    }

    public static Queue<String> solve2(String[] persons, int k) {
    public static Queue<String> solve2(String[] persons, int k) {
        // TODO: implementation
        Queue<String> killed = new Queue<String>(); // erste Queue "Leben"
        int initalKillPosition = 0;
        while (!isAllKilled(persons)) { // erste Queue wird mit alle Personen befüllt
            //leben.enqueue(persons[i]);
            int killPosition = initalKillPosition;
            System.out.println("kill position" + killPosition);
            for(int j=initalKillPosition; j<= initalKillPosition +(k-1) ; j++){
                int limit = initalKillPosition + (k -1);
                System.out.println("j:" + j + " limi:" + limit );
                if(killPosition == persons.length){
                    killPosition=0;
                    break;
                }
                if(!persons[j].equals("")) killPosition++;

                System.out.println("j:" + j + " limi:" + limit );
            }
            if(killPosition == persons.length){
                killPosition=0;
            }
            System.out.println(persons[killPosition]);
            killed.enqueue(persons[killPosition]);
            persons[killPosition]="";
            initalKillPosition = killPosition;
        }
        return killed;
    }
}

*/