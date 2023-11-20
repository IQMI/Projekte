import aud.Stack;
public class TPalindrome {
  // Test if text is a T-palindrome.
  // The input is guaranteed to include only valid characters, i.e.,
  // those in {'a',...,'z','(',')','*'}. You don't need to check this.
  //
  public static boolean isTPalindrome(String text) {
    // TODO: implementation
    Stack<Character> word = new Stack<>();  // 1.Stack
    int length = text.length();
    int i = 0;
    while (i < length) {
      Character nextLetter = text.charAt(i);
      if (!nextLetter.equals(')')) {
        word.push(nextLetter);
      } else {
        Stack<Character> sWord = new Stack<>(); // 2.Stack
        while (!word.top().equals('(')) {
          sWord.push(word.pop());
        }
        if (!isPalindrome(sWord.toString())) {
          return false;
        }
        word.pop();
        Character stern = '*';
        word.push(stern);
      }
      i++;
    }
    return isPalindrome(word.toString());
  }
  public static boolean isPalindrome(String text) {
    java.util.Stack<Character> word = new java.util.Stack<>(); // 1. Stack (java.util)
    text = text.toLowerCase();
    int length = text.length();
    int wordHight = 0;
    for (int i = 0; i < length; i++) {
      Character temp = text.charAt(i);
      if (Character.isLetter(temp) || temp.equals('*')) {
        word.push(text.charAt(i));
        wordHight++;
      }
    }
    java.util.Stack<Character> half = new java.util.Stack<>(); // new Stack
    for (int i = 0; i < wordHight / 2; i++) {
      half.push(word.pop());
    }
    if (wordHight % 2 != 0) {
      word.pop();
    }
    boolean palindrome = true;
    while (palindrome && !word.empty()) {
      if (!word.pop().equals(half.pop())) {
        palindrome = false;
      }
    }
    return palindrome;
  }
  public static void main(String[] args) {
    // TODO: test
    System.out.println(isPalindrome("otto"));
    System.out.println(isTPalindrome("al(otto)la"));
    System.out.println(isTPalindrome("abc(aha)(u)cba"));
    System.out.println(isTPalindrome("abc(ah(otto)v(atta)ha)cba"));
    System.out.println(isTPalindrome("a(b)cca(b)"));
    System.out.println(isTPalindrome("abc(ah(otto)h)cba"));
    System.out.println(isTPalindrome("a"));
  }
}