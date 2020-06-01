package basicPattern.Interface.Practice.Search.SearchCatagory;

import basicPattern.Interface.Practice.Search.SearchInterface.Search;

public class LinearSearch implements Search {
    int[] value;
    int userValue;

    public LinearSearch(int[] value,int userValue){
        this.value=value;
        this.userValue=userValue;
    }
    @Override
    public int search() {
        return linearSearch(value,userValue);
    }

    private int linearSearch(int[] value, int userValue) {
        for(int i=0;i<value.length;i++){
            if(value[i]==userValue)
                return i;
        }
        return -1;
    }
}
