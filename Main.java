package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println(" Welcome to the Pet shop.\n" +
				"Please give your dog a name. ");

		String name = s.nextLine();
		System.out.println(" Your dog's name is: " + name);

		System.out.println(" How old is he? ");
		int age = s.nextInt();
		System.out.println(" Your dog is " + age + " years old");


		System.out.println(" What would you like to do with " + name + "\n" +
				"1. Make the dog older\n" +
				"2. Make the dog younger\n" +
				"3. Change the dog's name\n" +
				"4. Leave this shitty ass store");

		int a = s.nextInt();

		while (a!=4) {
			switch (a) {

				case 1:
					System.out.println("How much more older would you like the dog to be?");
					int ageup1 = s.nextInt();

					mathmatics Ageup = new mathmatics();
					Ageup.setAgeup(ageup1, age);
				case 2:
					System.out.println("How far back in time would you like to go?");
					int agedown1 = s.nextInt();

					mathmatics Agedown = new mathmatics();
					Agedown.setAgedown(agedown1, age);

					System.out.println("Your dog's age is now " + Agedown.getAgedown() + " years old");


				case 3:
			}


		}

	}
}