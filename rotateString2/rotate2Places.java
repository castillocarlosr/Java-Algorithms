class RotateBy2Places{
    public boolean isRoatedBy2(String str1, String str2){
        int lenOne = str1.length();
        int lenTwo = str2.length();
        
        if(lenOne != lenTwo) return false;
        
        String clockWise = "";
        String antiClockWise = "";

        antiClockWise = antiClockWise + str2.substring(lenTwo - 2, lenTwo) + str2.substring(0, lenTwo - 2);
        clockWise = clockWise + str2.substring(2, lenTwo) + str2.substring(0, 2);

        if((str1.equals(antiClockWise)) || (str1.equals(clockWise))){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Two Strings shifted 2 places");
        System.out.println(" ");

        String str1 = "imcodingup";
        String str2 = "codingupim";
        String str3 = "upimcoding";
        String str4 = "notevenclose";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str3);
        System.out.println(" ");

        RotateBy2Places rBy2Places = new RotateBy2Places();
        System.out.println("String1 & String2");
        System.out.println(rBy2Places.isRoatedBy2(str1, str2));
        System.out.println(" ");
        System.out.println("String1 & String3");
        System.out.println(rBy2Places.isRoatedBy2(str1, str3));
        System.out.println(" ");
        System.out.println("String1 & String4");
        System.out.println(rBy2Places.isRoatedBy2(str1, str4));
    }
}