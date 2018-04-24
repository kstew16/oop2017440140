package ece2017440140;

public class Snail extends Animal {
	public Snail(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override // 자바한테 이거 오버라이딩 맞다고 알려주는거. 이상하면 얘가 알려줌 이거 있으면 괄호 안에 뭐 넣어서 오버로딩하면 에러띄워줌
	public void sing() {
		System.out.println(name + " 사각사각");
	}//받은 것 중에서 sing이라는 것만 오버라이딩 한 것이야

}
