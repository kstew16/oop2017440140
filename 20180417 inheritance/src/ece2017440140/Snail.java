package ece2017440140;

public class Snail extends Animal {
	public Snail(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override // �ڹ����� �̰� �������̵� �´ٰ� �˷��ִ°�. �̻��ϸ� �갡 �˷��� �̰� ������ ��ȣ �ȿ� �� �־ �����ε��ϸ� ���������
	public void sing() {
		System.out.println(name + " �簢�簢");
	}//���� �� �߿��� sing�̶�� �͸� �������̵� �� ���̾�

}
