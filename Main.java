import java.util.Scanner;
class Main {

	
	
	
	public static double area(double base, double altura) {
		double area = base*altura;
		return area;
	}      
	
	public static double perimetro(double base,double altura) {
		double perimetro = base*2 + altura*2;
		return perimetro;
		
	}	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
			System.out.println("Informe a base: ");		
			double largura = sc.nextDouble();
			System.out.println("Informe a altura: ");
			double altura = sc.nextDouble();
			sc.close();
			 
			double area = (largura*altura);
			double perimetro = (largura*2 + altura*2);
			
			
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro );
		}
	}
	

