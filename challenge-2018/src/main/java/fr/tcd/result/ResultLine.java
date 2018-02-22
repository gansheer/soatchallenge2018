package fr.tcd.result;

public class ResultLine {
	public int montant;
	public String action;
	public int dayIn;
	public int dayOut;

	public String printLine(int nbDays) {
		String result = new String();
		result += montant;
		for (int i = dayIn; i < dayOut; i++) {
			result += " " + 0;
		}
		result += " " + action;
		for (int i = dayOut; i < nbDays; i++) {
			result += " " + 0;
		}
		return result;
	}
}
