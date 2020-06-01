package basicPattern.Interface.Practice.AddressValidator;

import basicPattern.Interface.Practice.AddressValidator.Adddres.Address;
import basicPattern.Interface.Practice.AddressValidator.AddressCatagory.CAAddress;
import basicPattern.Interface.Practice.AddressValidator.AddressCatagory.USAddress;
import basicPattern.Interface.Practice.AddressValidator.AddressInterface.AddressValidator;

public class MainApp {
    public static void main(String[] args) {
        AddressValidator addressValidator = new USAddress("New York","10001");
        Address address=new Address(addressValidator);
        address.display();
        addressValidator=new CAAddress("British Columbia","V5K 0A1");
        address =new Address(addressValidator);
        address.display();
    }
}
