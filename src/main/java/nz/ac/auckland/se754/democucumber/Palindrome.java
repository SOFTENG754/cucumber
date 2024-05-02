package nz.ac.auckland.se754.democucumber;

public class Palindrome {
    public boolean check(final String str) {

        if(str == null) {
            return false;
        }

        String strWhiteSpacesRemoved = str.replaceAll("\\s+", "");
        StringBuilder reversedStr = new StringBuilder();

        for(int i = strWhiteSpacesRemoved.length() - 1; i >= 0; i--) {
            reversedStr.append(strWhiteSpacesRemoved.charAt(i));
        }

        return strWhiteSpacesRemoved.equals(reversedStr.toString());
    }
}

