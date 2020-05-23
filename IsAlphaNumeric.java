package works;

import java.util.regex.Pattern;

class IsAlphaNumeric
{
	private static Pattern p = Pattern.compile("^[\\p{L} .']+$");

	public static boolean isAlphaNumeric(String s) {
		return p.matcher(s).find();
	}

	public static void main(String[] args)
	{
		String s = "Raghavan P";
		System.out.println("Is correct: " + isAlphaNumeric(s));
	}
}