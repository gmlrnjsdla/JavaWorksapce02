import java.util.Scanner;

public class Ex0830_07 {

	public static void main(String[] args) {
		//1번 환율 계산
//		double won;
//		double dol;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("원화를 입력하세요(단위 원) :");
//		won = sc.nextDouble();
//		dol = won /1348.01 ;
//		System.out.println(won + "원은 " + dol + "$ 입니다.");
//		sc.close();
//-----------------------------------------------------------//
		
		//1-2번 km -> m, m -> km
//		double km, m;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("KM : ");
//		km = sc.nextDouble();
//		m = km * 1000;
//		System.out.println(m + "M 입니다.");
//		sc.close();
//-------------------------------------------------------------//
		//1-3번 feet inch = ?cm
//		int feet, inch;
//		double fcm, icm;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("feet 입력: ");
//		feet = sc.nextInt();
//		System.out.print("inch 입력: ");
//		inch = sc.nextInt();
//		
//		fcm = feet * 30.48;
//		icm = inch * 2.54;
//		System.out.println(feet + "feet " + inch + 
//				"inch는 " + (fcm+icm) + "cm입니다.");
//		
//		sc.close();
//------------------------------------------------------------------//
		
		//1-4번 cm --> feet inch?
//		int feet, inch;
//		double cm;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("cm 입력: ");
//		cm = sc.nextDouble();
//		
//		feet = (int) (cm / 30.48);
//		inch = (int) ((cm % 30.48) / 2.54);
//		System.out.println(cm + "cm는 " +feet+ "feet " +inch+ "inch 입니다.");
//		
//		sc.close();
		
//----------------------------------------------------------//
		
		//2번 십의자리와 일의자리가 같은가?
//		int num;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("2자리수 정수 입력(10~99) >> ");
//		num = sc.nextInt();
//		
//		if (num % 11 == 0) 
//			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
//		
//		else
//			System.out.println("No! 10의 자리와 1의 자리가 같지않습니다.");
//------------------------------------------------------------------//
		
		//3번 동전
//		int won;
//		Scanner sc = new Scanner(System.in);
//		won = sc.nextInt();
//------------------------------------------------------------------//
		
		//4번 3개의 숫자중 중간크기의 수를 출력
//		int a,b,c;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 3개 입력 : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		if((a>b && a<c)||(a>c && a<b))
//			System.out.println(a);
//		else if ((b>a && b<c)||(b>c && b<a))
//			System.out.println(b);
//		else
//			System.out.println(c);
//		
//		sc.close();
//-----------------------------------------------------------------//
		
		//5번 삼각형을 만들 수 있는지 판별
//		int a,b,c;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 3개 입력 : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		if(((a+b)>c) && (b+c)>a && (a+c)>b)
//			System.out.println("삼각형이 됩니다.");
//		else
//			System.out.println("삼각형이 안됩니다.");
//		
//		sc.close();
	}

}
