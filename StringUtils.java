// StringUtils

class StringUtils {
  static boolean containsChar(String str, char a) {
    int length = str.length();
    for(int i = 0; i< length; i++) {
      if(str.charAt(i) == a) {
        return true;
      }
    }
    return false;
  }

  static String reverse(String str) {
    String reversed = "";
    int length = str.length();
    
    for(int i = length - 1;i>=0;i--) {
      reversed += str.charAt(i);
    }
    return reversed;
  }

  static String replaceAll(String str, char charToReplace, char replaceChar) {
    String newString = "";
    int length = str.length();

    for(int i = 0; i<length; i++) {
      char currentCharacter = str.charAt(i);
      newString += currentCharacter == charToReplace
        ? replaceChar
        :currentCharacter;
    }
    return newString;
    
  }
}
