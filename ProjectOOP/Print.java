class Print{
	public String delimiter = "";
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	public void A() {		// 메소드 내용
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {		// 메소드 내용
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}