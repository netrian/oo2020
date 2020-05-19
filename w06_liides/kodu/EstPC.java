

public class EstPC implements PersonalCodeBehaviour{

    private String gender;
    private String year;
    private String yearNumber;
    private String century;
    private String birthDay;
    private String birthMonth;
    
    @Override
    public String getGender(String personalCode) {
        Character first = personalCode.charAt(0);
        gender = null;
        if(first.equals('1') || first.equals('3') || first.equals('5')){
            gender = "male";
        } else {
            gender = "female";
        }
        System.out.println("Your gender is " + gender);    
        return null;
    }

    @Override
    public String getBirthday(String personalCode) {
        birthMonth = personalCode.substring(3, 5);
        birthDay = personalCode.substring(5, 7);
        System.out.println("Your birthday is on " + birthDay + "." + birthMonth);
        return null;
    }

    @Override
    public int getYear(String personalCode) {
        Character first = personalCode.charAt(0);
        yearNumber = personalCode.substring(1, 3);
        
        if(first.equals('1') || first.equals('2')){
            century = "18";
            year = century + yearNumber;
            System.out.println(year);
        } else if (first.equals('3') || first.equals('4')){
            century = "19";
            year = century + yearNumber;
            System.out.println(year);
        } else if(first.equals('4') || first.equals('5')){
            century = "20";
            year = century + yearNumber;
            System.out.println("You were born in " + year);
        } else {
            System.out.println("Please enter the correct personal code");
        }
        
        return 0;
    }

  
   
}