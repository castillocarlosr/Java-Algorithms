class RotateBy2Places{
    static boolean isRoatedBy2(String str1, String str2){
        int lenOne = str1.length();
        int lenTwo = str2.length();
        
        if(lenOne != lenTwo) return false;
        
        String clockWise = "";
        String antiClockWise = "";

        antiClockWise = antiClockWise + str2.substring(lenTwo - 2, lenTwo) + str2.substring(0, lenTwo - 2);
        clockWise = clockWise + str2.substring(2, lenTwo) + str2.substring(0, 2);

        if((antiClockWise == str1) || (clockWise == str1)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Two Strings shifted 2 places");
        System.out.println(" ");
        
    }
}