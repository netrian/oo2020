public class kodu2{
    private int birthyear;

    public kodu2(String name, int birthyear){
        this.birthyear = birthyear;
    }

    public static String getYear(int birthyear) {
        if (birthyear<2000){
            return " varsti sured";
        } else if (birthyear<2005){
            return " oled vanamutt";
        } else if (birthyear<2010){
            return " oled noor";
        } else {
            return " oled alles beebi";
        }
    }
}