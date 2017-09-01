package brq.redhat.model;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
	private List<CoffeeGround> coffeeGrounds;
	private boolean jammed;

	public CoffeeMachine(){
		coffeeGrounds = new ArrayList<>();
		jammed = false;
	}

	public boolean canMakeCoffee(){
		return coffeeGrounds.size() > 0 && !jammed;
	}

	public boolean isJammed(){
		return jammed;
	}

	public boolean makeCoffee(){
		if(coffeeGrounds.size() <= 0){
			return false;
		}
		else{
			if(!jammed){
				coffeeGrounds.remove(0);
			}
			return !jammed;
		}
	}

	public boolean refill(){
		for(int i = 0; i < 10; i++){
			coffeeGrounds.add(new CoffeeGround());
		}
		if(coffeeGrounds.size()>10){
			jammed = true;
		}

		return false;
	}

	public void jam(){
		this.jammed = true;
	}

}
