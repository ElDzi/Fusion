
package pl.eldzi.fusion.base.enums;

public enum MarkValence {
	ABOVE_LEVEL(6), VERY_GOOD(5), GOOD(4), CORRECT(3), ALLOWING(2), INSUFFICIENT(
	        1), NOINFORMATION(0);

	private int value;

	private MarkValence(int k) {
		value = k;
	}

	public int getValue() {
		return value;
	}
}
