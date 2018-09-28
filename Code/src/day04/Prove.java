package day04;

public class Prove {
	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		
		String encodedString = "";
		StringBuilder sb = new StringBuilder();
		
		// 참고 문자 'a'의 정수값은 97이며, 'z'는 122입니다
		char[] cc = new char[sourceString.length()];
		
		for(int i=0;i<sourceString.length();i++) {
			char c =sourceString.charAt(i);
			if(c ==' ') {
//				encodedString += c;
				sb.append(c);
				cc[i] = (char)(c-23);
				continue;
			}
			encodedString += (char)(c+3);
			if('x'<= c && c<= 'z') {
//				encodedString += (char)(c-23);
				sb.append((char)(c-23));
				
				continue;
			}
			sb.append((char)(c+3));
			cc[i] = (char)(c-3);
		}
		encodedString = sb.toString();
		String r =  new String(cc);
		
		System.out.println("암호화할 문자열 : "+sourceString);
		System.out.println("암호화된 문자열 : "+encodedString);
	}
}
