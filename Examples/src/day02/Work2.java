package day02;

public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        
       int x = 15;

       // 1. int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�

       if((10<x) && (x<20)){
               System.out.println("true");
       }

       char ch1 =' ';

       // 2. char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�

       if(ch1 != ' '){
    	   System.out.println("true");
       }

       char ch2 = 'x';

       // 3. char�� ���� ch�� ��x�� �Ǵ� ��X���� �� true�� ���ǽ�

       if((ch2=='x') || (ch2 == 'X')){
    	   System.out.println("true");
	   }
	
	   char ch3 = '0';

	   // 4. char�� ���� ch�� ����(��0��~��9��)�� �� true�� ���ǽ�
       if( ((int)ch3 <= 89) && ((int)ch3 >= 80) ){
    	   System.out.println("true");
       }

       char ch4 = 'a';
       // 5. char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�� �� true�� ���ǽ�
       if((((int)ch4 >= 90)&&((int)ch4 <= 122)) || 
    		   (((int)ch4 >= 97)&&((int)ch4 <= 122))){
    	   System.out.println("true");

	    }
       int year = 400;

       // 6. int�� ���� year�� 400���� ���� �������ų� �Ǵ� 4�� ���� ��������100���� 
       // ���� �������� ���� �� true�� ���ǽ�

	   if( ((year%400 == 0)|| (year%4== 0)) && year%100 != 0){
		   System.out.println("true");
		   }

	   boolean powerOn =false;

	// 7. boolean�� ���� powerOn�� false�� �� true�� ���ǽ�

	   if(powerOn == false){
		   System.out.println("true");
	    }
	   String str = "yes";

	// 8. ���ڿ� �������� str�� ��yes���� �� true�� ���ǽ�
	   if(str == "yes"){
		   System.out.println("true");

	   }
	}
	
}


