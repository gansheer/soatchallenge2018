package fr.tcd.input;

import java.util.List;

public class Info {

	public final String nom;

	public final List<Integer> valeurs;

	public Info(final String nom, final List<Integer> valeurs) {
		this.nom = nom;
		this.valeurs = valeurs;
	}

	@Override
	public String toString() {
		return "Info{" + "nom='" + nom + '\'' + ", valeurs=" + valeurs + "}\n";
	}

	public boolean isDescendingFlagMoney() {
		System.out.print(this);
		for (int x = 0; x < valeurs.size(); x++) {
			if (!isDescendingFlagPoint(x, valeurs.get(x))) {
				System.out.println("isDescendingFlagMoney FALSE");
				return false;
			}
		}
		System.out.println("isDescendingFlagMoney TRUE");
		return true;
	}

	public boolean isAscendingFlagMoney() {
		System.out.print(this);
		for (int x = 0; x < valeurs.size(); x++) {
			if (!isAscendingFlagPoint(x, valeurs.get(x))) {
				System.out.println("isAscendingFlagMoney FALSE");
				return false;
			}
		}
		System.out.println("isAscendingFlagMoney TRUE");
		return true;
	}

	private boolean isAscendingFlagPoint(double currentX, double currentY) {
		// f(x) = 0.1 x^3 - 2.5 x^2 +19 x + R
		// avec 1 <= R <= 100
		double r = currentY - (((-0.1D) * Math.pow(currentX, 3)) + ((2.5D) * Math.pow(currentX, 2)) - (19D * currentX));
		return (r >= 1 && r <= 100);

	}

	private boolean isDescendingFlagPoint(double currentX, double currentY) {
		// f(x) = -0.1 x^3 + 2.5 x^2 - 19 x + R
		// avec 1000 <= R <= 1500

		double r = currentY - (((-0.1D) * Math.pow(currentX, 3)) + ((2.5D) * Math.pow(currentX, 2)) - (19D * currentX));
		System.out.println(r);
		return (r >= 1000 && r <= 1500);

	}
}
