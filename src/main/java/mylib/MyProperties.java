package mylib;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my-props")
public class MyProperties {

	private String one;

	private final MyInnerProperties myInnerProperties = new MyInnerProperties();
	private final MyOuterProperties myOuterProperties = new MyOuterProperties();

	public MyInnerProperties getInner() {
		return this.myInnerProperties;
	}

	public String getOne() {
		return this.one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public MyOuterProperties getOuter() {
		return this.myOuterProperties;
	}

	public static class MyInnerProperties {

		private String two;

		public String getTwo() {
			return this.two;
		}

		public void setTwo(String two) {
			this.two = two;
		}
	}
}
