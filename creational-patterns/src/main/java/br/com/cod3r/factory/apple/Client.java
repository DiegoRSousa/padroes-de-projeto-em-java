package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProcFactory = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = iPhoneXFactory.orderIPhone();
		System.out.println(iphoneX);


		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11Pro = iphone11ProcFactory.orderIPhone();
		System.out.println(iPhone11Pro);
	}
}
