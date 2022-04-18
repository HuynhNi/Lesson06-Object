package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SinhVien arr[] = new SinhVien[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new SinhVien();
			System.out.println(" Nhập Sinh Viên Thứ : " + (i+1));
			arr[i].name = sc.nextLine();
			arr[i].old = sc.nextInt();
			arr[i].number = sc.nextLine();
			arr[i].address = sc.nextLine();
			
			sc.nextLine();
			arr[i].toan =sc.nextFloat();
			sc.nextLine();
			arr[i].ly =sc.nextFloat();
			sc.nextLine();
			arr[i].hoa =sc.nextFloat();
			sc.nextLine();
			
			}
			System.out.println("---------------------------");
			
			for (int i = 0; i < arr.length; i++) {
				SinhVien p = arr[i];
				System.out.format("Ten: %S - Tuoi: %d - So:%d - DiaChi:%d - Diem Toan: %.2f - Diem Hoa :%.2f - Diem Ly :%.2f - Diem Trung Binh :%.2f  ",arr[i].name,arr[i].old,arr[i].number,arr[i].address,arr[i].hoa,arr[i].ly,arr[i].toan );
				System.out.println("------------------------------");
			}
			
	}
}