public class CountSpecial {
    public static void main(String[] args) {
        String s = "Cod#ing@Ninjas@!";
        int count = 0;
        String RemovedSpecialChar = "";
        for(int i=0; i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) 
            && !Character.isLetter(s.charAt(i)))
            {
                  count++;
            }
            else
            {
                RemovedSpecialChar = RemovedSpecialChar + s.charAt(i);
                
            }
        }
        System.out.println(count);
        System.out.println(RemovedSpecialChar);
    }
}
