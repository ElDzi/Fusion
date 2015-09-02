
package pl.eldzi.fusion.base;

import java.util.ArrayList;

public class School {
	private String name, shortName;
	private String fullAddress;
	private ArrayList<User> teachers = new ArrayList<>();
	private ArrayList<User> pupils = new ArrayList<>();

	public School() {
		name = "Zespó³ Szkó³ Ponadgimnazjalnych nr 2. Rolnicze Centrum Kszta³cenia Ustawicznego i Praktycznego w £owiczu";
		shortName = "ZSP nr2 RCKUiP w £owiczu";

		fullAddress = "ul. Blich 10, £owicz";
	}
}
