package tew;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<String>();
		String str = new String ("Hello");
		
		box.set(str);
		System.out.println("�ڽ��� ������ �ֽ��ϴ�"+box.get());
		
		Box<Integer> ibox = new Box<Integer>();
		Integer i= new Integer(10);
		
		ibox.set(i);
		
		System.out.println(100+ibox.get());
		
		Box<Integer> ���ײ��� = new Box<Integer>;
		���ײ���.set(10);
	}

}
