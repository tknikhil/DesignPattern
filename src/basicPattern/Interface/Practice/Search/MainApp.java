package basicPattern.Interface.Practice.Search;

import basicPattern.Interface.Practice.Search.SearchCatagory.BinarySearch;
import basicPattern.Interface.Practice.Search.SearchCatagory.LinearSearch;
import basicPattern.Interface.Practice.Search.SearchInterface.Search;
import basicPattern.Interface.Practice.Search.SearchValue.Value;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] value={10,5,23,87,19,4,35,68};
        int userValue=19;
        Search search=new BinarySearch(value,userValue);
        Value searchingValue = new Value(value,userValue,search);
        searchingValue.display();
        search=new LinearSearch(value,userValue);
        searchingValue=new Value(value,userValue,search);
        searchingValue.display();
    }
}
