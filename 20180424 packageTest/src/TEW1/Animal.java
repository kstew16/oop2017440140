package TEW1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;
	
	//protected ���� ��Ű�� �������� �ۺ긴. Ÿ ��Ű�������� privateó�� �۵������� ����� ��.
	protected String protectedField;
	//�󸶳� ����� �� �ֳ� ������
	public Animal(){//��տ� public ������ Ÿ ��Ű������ �� ������ �ȴ� ����
		
		publicField = "public";
		//privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}
}
