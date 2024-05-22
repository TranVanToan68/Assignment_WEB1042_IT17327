package Ontap;

import java.util.Arrays;
import java.util.Scanner;

public class TongHop {
	public static void main(String[] args) {
		while (true) {
			System.out.println(">>  Lựa chọn tính năng  <<");
			System.out.println("---------------------------------");
			System.out.println("1: Cộng Trừ nhân chia");
			System.out.println("2: Xếp loại học lực");
			System.out.println("3: Viết bảng cửu chương ");
			System.out.println("4: UCLN & BCNN 2 số:");
			System.out.println("5: Sắp xếp mảng: ");
			System.out.println("6: Nhập mảng 2 chiều: ");
			System.out.println("7: Tính tổng các phần tử trong ma trận: ");
			System.out.println("8: Tìm phần tử lớn nhất vào nhỏ nhất trong ma trận ");
			System.out.println("9: Nhập mảng 2 chiều: ");
			System.out.println("0: Thoát chương trình");
			System.out.println("---------------------------------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Mời bạn chọn tính năng: ");
			int value = sc.nextInt();

			switch (value) {
			case 1:
				System.out.println("Cộng trừ nhân chia");
				Bai1();
				break;
			case 2:
				System.out.println("Xếp loại học lực");
				xeploaihocluc();
				break;
			case 3:
				System.out.println("Viết Bảng cửu chương");
				bangcuuchuong();
				break;
			case 4:
				System.out.println("UCLN & BCLN 2 số: ");
				UCLN_BCLN();
				break;
			case 5:
				System.out.println("Sắp xếp mảng");
				sapxepmang();
				break;
			case 6:
				System.out.println("Nhập mảng 2 chiều: ");
				nhapmang2chieu();
				break;
			case 7:
				System.out.println("Tính tổng ma trận: ");
				tinhtongmatran();
				break;
			case 8:
				System.out.println("Tìm số lớn nhất và số nhỏ nhất trong ma trận: ");
				timSLN_SNN();
				break;
			case 0:
				System.out.println("Chương trình đã kết thúc");
				System.exit(0);

			default:
				System.out.println("Bạn nhập không đúng mời bạn nhập lại!");

			}
		}
	}

	public static void Bai1() {
		Scanner scanner = new Scanner(System.in);

		// Nhập số a từ người dùng
		System.out.print("Nhập số a: ");
		float a = scanner.nextFloat();

		// Nhập số b từ người dùng
		System.out.print("Nhập số b: ");
		float b = scanner.nextFloat();

		// Tính tổng của a và b
		float tong = a + b;
		// Tính hiệu của a và b
		float hieu = a - b;
		// Tính thương của a và b
		Float thuong = a / b;
		// Tính tích của a và b
		float tich = a * b;

		// Hiển thị kết quả
		System.out.println("Tổng của " + a + " và " + b + " là: " + tong);
		System.out.println("Hiệu của " + a + " và " + b + " là: " + hieu);
		System.out.println("Thương của " + a + " và " + b + " là: " + thuong);
		System.out.println("Tích của " + a + " và " + b + " là: " + tich);
	}

	public static void xeploaihocluc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm môn toán: ");
		float toan = sc.nextFloat();
		System.out.println("Nhập điểm tiếng anh: ");
		float tienganh = sc.nextFloat();
		System.out.println("Nhập điểm vật lý: ");
		float vatly = sc.nextFloat();
		System.out.println("Nhập điểm môn hóa: ");
		float hoa = sc.nextFloat();
		System.out.println("Nhập điểm môn Văn: ");
		float van = sc.nextFloat();

		float average = (toan + tienganh + vatly + hoa + van) / 5;
		if (average >= 9) {
			System.out.println("Học lực xuất sắc");
			System.out.println("Điểm trung bình là: " + average);
		}
		if (8 <= average && average < 9) {
			System.out.println("Học lực Giỏi");
			System.out.println("Điểm trung bình là: " + average);
		}
		if (6.5 <= average && average < 8) {
			System.out.println("Học lực khá ");
			System.out.println("Điểm trung bình là: " + average);
		} else {
			System.out.println("Học lực yếu");
			System.out.println("Điểm trung bình là: " + average);
		}

	}

	public static void bangcuuchuong() {
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("Nhập bảng cửu chương: ");
		for (int i = 0; i <= 10; i++) {
			System.out.printf(" %d x %d = %d ", a, i, a * i);
			System.out.println();
		}
	}

	public static void UCLN_BCLN() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất: ");
		int num1 = sc.nextInt();
		System.out.print("Nhập số thứ hai: ");
		int num2 = sc.nextInt();

		int originalNum1 = num1; // Lưu giá trị gốc của num1
		int originalNum2 = num2; // Lưu giá trị gốc của num2

		// Tính ƯCLN sử dụng thuật toán Euclid
		while (num1 != num2) {
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		int ucln = num1; // Hoặc num2, vì khi kết thúc vòng lặp num1 và num2 sẽ bằng nhau
		System.out.printf("Ước chung lớn nhất là: %d\n", ucln);

		// Tính BCNN dựa trên ƯCLN
		int bcln = (originalNum1 * originalNum2) / ucln;
		System.out.printf("Bội chung nhỏ nhất là: %d\n", bcln);
	}

	public static void sapxepmang() {
		System.out.println("Nhập vào số lượng mảng: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Nhập phần tử: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Mảng ban đầu: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Mảng sắp xếp lớn dần: " + Arrays.toString(a));
	}

	public static void nhapmang2chieu() {
		int soDong, soCot;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số dòng của mảng: ");
		soDong = scanner.nextInt();
		System.out.println("Nhập vào số cột của mảng: ");
		soCot = scanner.nextInt();

		// khai báo và cấp phát bộ nhớ cho mảng
		int[][] A = new int[soDong][soCot];

		// Để nhập giá trị các phần tử cho mảng
		// chúng ta sẽ sử dụng 2 vòng lặp for
		// vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
		// và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
		// mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				A[i][j] = scanner.nextInt();
			}
		}

		// hiển thị các phần tử trong mảng vừa nhập
		// chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(A[i][j] + "\t");
			}
			// sau khi viết xong 1 dòng thi xuống hàng
			System.out.println("\n");
		}
	}

	public static void tinhtongmatran() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số hàng của ma trận: ");
		int rows = sc.nextInt();
		System.out.print("Nhập số cột của ma trận: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];
		System.out.println("Nhập các phần tử của ma trận:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum += matrix[i][j];
			}
		}

		System.out.println("Tổng các phần tử của ma trận là: " + sum);
	}

	public static void timSLN_SNN() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số hàng của ma trận: ");
		int rows = sc.nextInt();
		System.out.print("Nhập số cột của ma trận: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];
		System.out.println("Nhập các phần tử của ma trận:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int max = matrix[0][0];
		int min = matrix[0][0];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
		}

		System.out.println("Phần tử lớn nhất trong ma trận là: " + max);
		System.out.println("Phần tử nhỏ nhất trong ma trận là: " + min);
	}
}
