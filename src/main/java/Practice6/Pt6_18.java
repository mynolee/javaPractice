package Practice6;

class Pt6_18 {

    static boolean isNumber(String str){
        boolean a = true;
        for(int i = 1; i<=2*str.length() - 1; i++)
            if (str == null || str == "") {
                a = false;
                return a;
            }else if(0 <= Math.pow((str.charAt(i)-'0'), 2) && Math.pow((str.charAt(i)-'0'), 2)<100){
                a = true;
                return a;
            }else {
                a = false;
                return a;
            }

/*
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
*/

        return a;
    }


    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}

