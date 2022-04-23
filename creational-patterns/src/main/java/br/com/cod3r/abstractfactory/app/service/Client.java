package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory ejbFactory = new EJBAbstractFactory();
		ServicesAbstractFactory restFactory = new RestAbstractFactory();

		UserService userService = ejbFactory.getUserService();
		userService.save("Jhon");
		userService.delete(5);

		CarService carService = restFactory.getCarService();
		carService.save("Onix");
		carService.update("Tesla");



	}
}
