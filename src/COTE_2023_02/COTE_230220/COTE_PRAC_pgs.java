package COTE_2023_02.COTE_230220;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int chicken = 328756;
		
		if(chicken == 0) {
            System.out.println(0);
        }
        int serv_coupon = 0;
        int serv_chi = chicken / 10;
        int remain = chicken % 10;
        boolean flag = true;
        int sum = 0;
        int i = 1;
        
        while(flag) {
            System.out.println(i + " 번쨰");
            System.out.println("===========시작라인=========");
            System.out.println("serv_coupon : " + serv_coupon);
            System.out.println("remain : " + remain);
            System.out.println("sum : " + sum);
            sum += serv_chi;
            
            serv_coupon = serv_chi;

            serv_chi = (serv_coupon + remain) / 10;
                                    
            if(serv_chi == 0) {
            	if(serv_coupon < 10) {
            		remain += serv_coupon;
            	}
            	if(remain >= 10) {
            		sum += remain / 10;
            	}
                flag = false;
            } else {
            	remain = (serv_coupon + remain) % 10;
            }
            i++;
            System.out.println("===========끝라인=========");
            System.out.println("serv_coupon : " + serv_coupon);
            System.out.println("remain : " + remain);
            System.out.println("sum : " + sum);
            
        }

		
	}

}
