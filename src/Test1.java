import java.util.Scanner;
public class Test1 {
	public static void main(String[] args){
		
		int fir;
		int sec;
		String g; 
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		String str;
		System.out.println("계산할 첫번째숫자 입력");
		str = scan.nextLine();
		fir = Integer.parseInt(str);
		System.out.println("계산식을 입력하세요");
		g = scan.nextLine();
		System.out.println("계산할 두번째숫자 입력");
		str = scan.nextLine();
		sec = Integer.parseInt(str);
		//첫번째 숫자 받아오기
		if(g.equals("+")) {
			System.out.println("더하기 결과 : "+(fir + sec));
		}
		else if(g.equals("-")) {
			System.out.println("빼기 결과 : "+(fir - sec));
		}
		else if(g.equals("*")) {
			System.out.println("곱하기 결과 : "+(fir * sec));
		}
		else if(g.equals("/")) {
			if(fir%sec == 0) {
				System.out.println("나누기 결과 : "+(fir / sec));
			}
			else
			{
				System.out.println("나누기 결과 : "+(fir / sec) +" 몫: " + (fir%sec));
			}
		}
		else
		{
			System.out.println(g);
		}
		scan.close();
		scan1.close();
	}
}
