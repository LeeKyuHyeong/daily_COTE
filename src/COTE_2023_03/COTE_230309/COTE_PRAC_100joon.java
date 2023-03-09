package COTE_2023_03;

class COTE_PRAC_100joon {
    public static void main(String[] args) {

        int num = 4;

        String str = "";
        for(int i = 0; i < (num / 4); i++) {
            str += "long ";
        }
        str += "int";

        System.out.println(str);
    }
}