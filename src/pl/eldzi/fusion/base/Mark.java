
package pl.eldzi.fusion.base;

import pl.eldzi.fusion.base.enums.MarkValence;

public class Mark {
	private MarkValence mV;
	private int multiplier;

	public Mark(MarkValence valence, int multiplier) {
		mV = valence;
		this.multiplier = multiplier;
	}

	public int markValance() {
		return mV.getValue() * multiplier;
	}
}
