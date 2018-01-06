package agh.mwo.java1_1;

import java.util.Arrays;

public class LoginGenerator {

	public static void main(String[] args) {

		String[] studentNames = { "Budynek Piotr", "Chalupa Krystyna", "Wiezowiec Jan", "Szkieletor Andrzej",
				"Domek Marianna" };

		System.out.println(Arrays.toString(createAddressList(studentNames)));

	}

	public static String[] createAddressList(String[] students) {

		String addressList[] = new String[students.length];

		for (int i = 0; i < students.length; i++) {
			addressList[i] = createMailAddress(students[i]);
		}

		return addressList;
	}

	public static String createLogin(String user) {

		String[] loginBase = user.split(" ");
		String loginStart = loginBase[1].substring(0, 3).toLowerCase();
		String loginEnd = loginBase[0].substring(0, 2).toLowerCase();
		return loginStart + loginEnd;

	}

	public static String createMailAddress(String user) {

		return createLogin(user) + "@student.agh.edu.pl";

	}
}