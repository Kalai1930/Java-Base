package com.greenTechnoClass.Day3;

public class PracticeToday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeToday pt = new PracticeToday();
		pt.vowelsSwitch('d');
		pt.evenPrint();
		pt.oddPrint();
		pt.sum10Nos();
	}
	
	public void vowelsSwitch(char vol) {
		switch(vol){
		
		case 'a': System.out.println("its a Vowel " + vol); break;
		case 'e': System.out.println("its a Vowel " + vol); break;
		case 'i': System.out.println("its a Vowel " + vol); break;
		case '0': System.out.println("its a Vowel " + vol); break;
		case 'u': System.out.println("its a Vowel " + vol); break;
		default: System.out.println("its not a vowel " + vol); 
			
		}
	}
		
		public void evenPrint() {
		  int i = 1;
		  System.out.println("Even number 1 to 50");
			while(i<=50) {
				if((i%2)==0) {
				System.out.print(i+" ");
				}
				i++;
			}
			System.out.println();
		}
		
		public void oddPrint() {
			  int i = 1;
			  System.out.println("Odd number 1 to 50");
				while(i<=50) {
					if((i%2)==1) {
					System.out.print(i+" ");
					}
					i++;
				}
				System.out.println();
			}
		
		public void sum10Nos() {
			int sum = 0;
			for(int i=1;i<=10;i++) {
				sum += i;	
			}
			System.out.println("Totla 1 to 10: "+ sum);
		}

}
