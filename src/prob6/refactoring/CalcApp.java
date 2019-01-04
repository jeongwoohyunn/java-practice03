package prob6.refactoring;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			String operator = tokens[1];
//			if( tokens.length != 3 ) {
//				System.out.println( ">> 알 수 없는 식입니다." );
//				continue;
//			}
//			
			int a = Integer.parseInt( tokens[0] );
			int b = Integer.parseInt( tokens[2] );
			
			Arith arith = null;//로컬(지역)변수는 초기화해줘야된다.
			//스태틱은 자동 초기화 
			
			
			switch( operator ) {
				case "+" : {
					arith = new Add();
					break;
				}
				case "-" : {
					arith = new Sub();
					break;					
				}
				case "*" : {
					arith = new Mul();
					break;	
				}
				case "/" : {
					arith = new Div();
					break;
				}
				default : {
					break;
				}
				
			}
			if(arith==null) {
				System.out.println( ">> 알 수 없는 연산입니다." );
				break;
			}
			arith.setValue(a, b);
			int result = arith.calculate();
			System.out.println(">>"+result);
		}
		
		scanner.close();

	}

}
