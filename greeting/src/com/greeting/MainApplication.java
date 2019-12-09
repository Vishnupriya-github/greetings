package com.greeting;

public class MainApplication {

	public static void main(String[] args) {
		Greeting greeting = () -> System.out.println("Good Morning");
		displayGreeting(greeting);
		greeting = () -> System.out.println("Good Afternoon");
		displayGreeting(greeting);
		greeting = () -> System.out.println("Good Night");
		displayGreeting(greeting);
	}
	public static void displayGreeting(Greeting greeting) {
		greeting.greet();
	}
}

@FunctionalInterface
interface Greeting{
	public void greet();
}
