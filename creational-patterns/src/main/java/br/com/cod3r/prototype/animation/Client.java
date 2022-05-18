package br.com.cod3r.prototype.animation;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.prototype.animation.model.Person;
import br.com.cod3r.prototype.animation.model.PersonSamples;

public class Client {
	private static List<Person> frames = new ArrayList<>();
	
	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for(Person frame: frames) {
			frame.draw();
			Thread.sleep(500);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	private static Person addLeft(Person p) throws CloneNotSupportedException {
		Person person = (Person) p.clone();
		person.left();
		frames.add(person);
		return person;
	}

	private static Person addRight(Person p) throws CloneNotSupportedException {
		Person person = (Person) p.clone();
		person.right();
		frames.add(person);
		return person;
	}
	
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		PersonSamples personSamples = new PersonSamples();
		Person person = personSamples.get("fatMan");
		frames.add(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		animate();

	}
}
