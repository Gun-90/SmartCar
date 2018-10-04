package day07;

public class MoneyException extends Exception{
	MoneyException() {	
		super("money ÀÜ°í´Â À½¼ö Çã¿ë ¾ÈµÊ");
	}
	MoneyException(String msg) {
		super(msg);
		
	}
}
