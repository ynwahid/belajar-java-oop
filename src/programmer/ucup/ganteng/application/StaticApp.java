package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.data.Country;
import programmer.ucup.ganteng.util.MathUtil;

import static programmer.ucup.ganteng.data.Application.PROCESSORS;
import static programmer.ucup.ganteng.data.Constant.APPLICATION;
import static programmer.ucup.ganteng.data.Constant.VERSION;

public class StaticApp {

  public static void main(String[] args) {

    Country.City city = new Country.City();

    city.setName("Banyuwangi");
    System.out.println(city.getName());

    System.out.println(MathUtil.sum(1, 1, 1, 1, 1));

    System.out.println(PROCESSORS);

    System.out.println(APPLICATION);
    System.out.println(VERSION);
  }
}
