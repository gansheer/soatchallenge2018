package fr.tcd.result;

import java.util.ArrayList;
import java.util.List;

public class ResultLine {
	public String nom;
	public List<String> actions = new ArrayList<>();

	public String printLine(int nbDays) {
		String result = new String();
		result += nom;
		for(String action : actions) {
			result += " "+action;
		}
		return result;
	}
}
