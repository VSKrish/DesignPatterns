package StrategyPattern;

public class SortFactory {
	Sort getSortObject(String type) throws Exception{
		switch(type) {
			case "quick":
				return new QuickSort();
			case "merge":
				return new MergeSort();
			case "insertion":
				return new InsertionSort();
			default:
				throw new Exception("invalid parameter");
		}
	}
}
