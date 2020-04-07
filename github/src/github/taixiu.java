package github;

import java.util.Random;
import java.util.Scanner;
//1->10 là xỉu
//11 + là tài
public class taixiu {
	public static void game() {
		int nguoiChoi, xingau1, xingau2, xingau3;
		Random rd=new Random();
		xingau1 = 1 + rd.nextInt(7);
		Random rd1=new Random();
		xingau2 = 1 + rd1.nextInt(7);
		Random rd2=new Random();
		xingau3 = 1 + rd2.nextInt(7);
		int tong = xingau1 + xingau2 + xingau3;
		System.out.println("---------- TÀI XỈU ----------");
		System.out.println("[1] là tài ========== [2] là xỉu ");
		System.out.println("Mời bạn đặt cược:");
		Scanner kb=new Scanner(System.in);
		nguoiChoi=kb.nextInt();
		do {
			if(nguoiChoi<=0)
				System.out.println("Nhập 1 hoặc 2 thôi :) Nhập lại đi: ");
			if(nguoiChoi>=3)
				System.out.println("Nhập 1 hoặc 2 thôi :) Nhập lại đi: ");
				nguoiChoi=kb.nextInt();
				if(nguoiChoi == 1) {
					System.out.print("Bạn chọn: ["+ nguoiChoi +"]");
						if(tong<11) 
							System.out.println("  là TÀI! \nMáy ra XỈU: "+tong+"\nBạn Thua!");
						else
							System.out.println("  là TÀI! \nMáy ra TÀI: "+tong+"\nBạn Thắng!" );	
				}
				if(nguoiChoi == 2) {
					System.out.print("Bạn chọn: ["+ nguoiChoi +"]");
						if(tong<11)
							System.out.print("  là XỈU! \nMáy ra XỈU: "+tong+"\nBạn Thắng!");
						else
							System.out.print("  là XỈU! \nMáy ra TÀI: "+tong+"\nBạn Thua!");
				}
		}while(nguoiChoi<1);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		do {
			game();
			System.out.println(" ===> MUỐN CHƠI TIẾP KHÔNG ? (c/k)");
			String check = sc.nextLine();
			if(check.equalsIgnoreCase("k")|| check.equalsIgnoreCase("K"))
				break;
		}while(true);
		System.out.println("OK! BYE BYE ");
		sc.close();
	}
}
