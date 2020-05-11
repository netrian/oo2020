public class EestiKood implements PersonalCodeBehaviour {
    private String gender;
    private String yearNumber = null;
    private String millenium = null;
    private String yearNum;
    private Character first1;
    private String birthDay;
    private String birthMonth;
    

    void getGender(String eestiKood) {
        
        Character first = eestiKood.charAt(0);
        gender = null;
        if(first.equals('1') || first.equals('3') || first.equals('5') || first.equals('7')){
            gender = "male";
            System.out.println("Gender is " + gender );
        } else {
            gender = "female";
            System.out.println("Gender is " + gender );
        }

    }




    void getYear(String eestiKood) {
        
        first1 = eestiKood.charAt(0);
        yearNum = eestiKood.substring(1, 3);

        


        if(first1.equals('1') || first1.equals('2')){
            millenium = "18";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(first1.equals('3') || first1.equals('4')) {
            millenium = "19";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(first1.equals('5') || first1.equals('6')) {
            millenium = "20";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(first1.equals('7') || first1.equals('8')) {
            millenium = "21";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else {
            System.out.println("Enter the personal code correctly");
        }

    }



    
    void getBirthday(String eestiKood) {

        birthDay = eestiKood.substring(5, 7);
        birthMonth = eestiKood.substring(3, 5);
        System.out.println("Sünnipäev on " + birthDay + "." + birthMonth);

    }







    
}