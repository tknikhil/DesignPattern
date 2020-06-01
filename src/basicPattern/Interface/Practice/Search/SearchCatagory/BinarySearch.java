package basicPattern.Interface.Practice.Search.SearchCatagory;

import basicPattern.Interface.Practice.Search.SearchInterface.Search;

public class BinarySearch implements Search {
    int[] value;
    int userValue;

    public BinarySearch(int[] value,int userValue){
        this.value=value;
        this.userValue=userValue;
    }

    @Override
    public int search() {
        return binarySearch(value,1,value.length-1,userValue);
    }

    private int binarySearch(int[] value, int left, int right, int userValue) {
        if(right>=left) {
            int mid = left+(right - left)  / 2;
            if(value[mid]==userValue)
                return mid;

            if(value[mid]>userValue)
                return binarySearch(value,1,mid-1,userValue);

            return binarySearch(value,mid+1,right,userValue);

        }
        return -1;
    }
}
