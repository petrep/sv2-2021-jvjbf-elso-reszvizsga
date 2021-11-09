package stringmanipulation;

public class StringManipulation {
	public String everyEvenCharacter(String s) {
		String everyEvenCharacterString = "";
		if (s.equals("")) return "";
		if (s.length() == 1) return s;

		for (int i = 0; i < s.length(); i = i + 2) {
			System.out.print(s.charAt(i));
		}

		return everyEvenCharacterString;
	}
}
