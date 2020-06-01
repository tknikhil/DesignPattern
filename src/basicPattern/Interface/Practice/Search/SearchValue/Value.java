package basicPattern.Interface.Practice.Search.SearchValue;

import basicPattern.Interface.Practice.Search.SearchInterface.Search;

public class Value {

    Search search;
    int[] value;
    int userValue;

    public Value(int[] value,int userValue,Search search){
        this.userValue=userValue;
        this.value=value;
        this.search=search;
    }

    public void display(){
        System.out.print("List of values are :");
        for (int value:value) {
            System.out.print(value+" ");
        }

        System.out.println("\nValue to be Searched is :"+userValue);
        if(search.search()==-1){
            System.out.println("Value is Not Present");
        }else {
            System.out.println("Value found at index :" + search.search());
        }
    }
}
