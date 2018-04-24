package TEW1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;
	
	//protected 동일 패키지 내에서는 퍼브릿. 타 패키지에서는 private처럼 작동하지만 상속은 됨.
	protected String protectedField;
	//얼마나 빌료올 수 있나 보려고
	public Animal(){//요앞에 public 없으면 타 패키지에서 못 돌리게 된는 거죠
		
		publicField = "public";
		//privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}
}
