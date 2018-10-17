package mylib;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("my-props")
public class MyProperties {

	/**
	 * Property for prop one.
	 */
	private String one;

	/**
	 * Inner property for prop two.
	 */
	private final MyInnerProperties inner = new MyInnerProperties();

	/**
	 * Outer property for prop three.
	 */
	@NestedConfigurationProperty
	private final MyOuterProperties outer = new MyOuterProperties();

	public MyInnerProperties getInner() {
		return this.inner;
	}

	public String getOne() {
		return this.one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public MyOuterProperties getOuter() {
		return this.outer;
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
