package thiGK;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
public class bai1 {

	public static boolean KiemTraChuoi(String str)
	{
		 try {
	            for (int i = 0; i < str.length(); i++) 
	            {
	                if (str.charAt(i) < '0' || str.charAt(i) > '9') 
	                {
	                    throw new IOException("Chuoi khong phai la so!");
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("Chuoi ban nhap khong phai so!");
	            System.out.println("Vui long nhap lai!");
	            return false;
	        }
	        return true;
	    }
	public static boolean KiemTraSoChinhPhuong(int s)
	{
		int j = 0;
        while(j*j <= s)
        {
            if(j*j == s)
            {
                return true;
            }
            j++;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Nhap chuoi: ");
			str = sc.next();
		}
		while (KiemTraChuoi(str)==false);
		int n = Integer.parseInt(str);
		System.out.println("So chuyen doi tu chuoi la: "+n);
		int i=n;
		while(KiemTraSoChinhPhuong(i) == false)
        {
            i++;
        }
        System.out.println("So chinh phuong lon hon " + n + "la : " + i);
	}

}
