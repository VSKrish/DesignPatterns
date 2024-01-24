package StrategyPattern;

import java.util.ArrayList;

public class StrategyClient {
	public static void main(String[] args) throws Exception{
		SortFactory factory = new SortFactory();
		Sort s = factory.getSortObject("quick");
		s.sort(new ArrayList<>());
	}
}
