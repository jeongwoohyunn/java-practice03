package prob6.refactoring;

public abstract class Arith {
	protected int a;//get set을 따로 두지않고, 자식에서 오버라이드 접근하기위해 접근제한자 protected
	protected int b;
	//오버라이딩으로 Arith를 부모로 두어 각각 상속해주어 부모것을 가져다 쓴다.
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
		//추상은 완결된것도있고, abstract 완결 안된 것도 있다.
		
	}
	public abstract int calculate();
}
