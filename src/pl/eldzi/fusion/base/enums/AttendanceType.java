
package pl.eldzi.fusion.base.enums;

public enum AttendanceType {
	ABSENT(0), PRESENT(1), LATE(1.5);
	private double value;

	private AttendanceType(double l) {
		value = l;
	}

	private double getValue() {
		return value;
	}
}
