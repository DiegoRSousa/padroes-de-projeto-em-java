package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRuleAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory brazilianRules = new BrazilianRuleAbstractFactory();
		IPhoneXFactory genXFactory = new IPhoneXFactory(brazilianRules);
		IPhone11Factory gen11Factory = new IPhone11Factory(brazilianRules);

		System.out.println("### Ordering an IPhone X");
		IPhone iphoneX = genXFactory.orderIPhone("standard");
		System.out.println(iphoneX);

		System.out.println("### Ordering an IPhone 11");
		IPhone iPhone11 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iPhone11);


	}
}
