package com.te.javabsica.accessmodifier;

public class AccessModifiersExample {

	public void getPublic() {
		System.out.println("public method");
	}

	protected void getProtected() {
		System.out.println("protected method");
	}

	void getDefault() {
		System.out.println("default method");
	}

	private void getPrivate() {
		System.out.println("private method");
	}

	public static void main(String[] args) {
		AccessModifiersExample accessModifiersExample = new AccessModifiersExample();

		accessModifiersExample.getPublic();
		accessModifiersExample.getProtected();
		accessModifiersExample.getDefault();
		accessModifiersExample.getPrivate();
	}
}
