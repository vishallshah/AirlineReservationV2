package parser;

import common.Itenary;

public class Context {
	private GeneralParser strategy;

	   public Context(GeneralParser strategy){
	      this.strategy = strategy;
	   }

	   public Itenary executeStrategy(String num1, String num2){
	      return strategy.parseGeneral(num1, num2);
	   }
}
