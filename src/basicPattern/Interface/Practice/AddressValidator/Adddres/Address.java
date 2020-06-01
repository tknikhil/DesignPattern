package basicPattern.Interface.Practice.AddressValidator.Adddres;

import basicPattern.Interface.Practice.AddressValidator.AddressCatagory.USAddress;
import basicPattern.Interface.Practice.AddressValidator.AddressInterface.AddressValidator;

public class Address {
    AddressValidator addressValidator;
    String address;

    public Address(AddressValidator addressValidator){
        this.addressValidator=addressValidator;
    }

    public void display(){
        System.out.println(addressValidator.validateAddress());
    }

}
