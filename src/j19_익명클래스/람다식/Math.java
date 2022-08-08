package j19_익명클래스.람다식;

@FunctionalInterface //람다용이란 뜻
public interface Math<T1, T2> {
	
	public double calc(T1 value1, T2 value2);
	// 람다를 쓸때에는 인터페이스에서는 메소드는 무조건 하나만 존재해야함

}
