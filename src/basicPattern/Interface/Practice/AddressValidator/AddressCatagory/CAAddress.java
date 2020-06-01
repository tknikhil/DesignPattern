package basicPattern.Interface.Practice.AddressValidator.AddressCatagory;

import basicPattern.Interface.Practice.AddressValidator.AddressInterface.AddressValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CAAddress implements AddressValidator {

    String zipCode;
    String address;

    public CAAddress(String address,String zipCode){
        this.address=address;
        this.zipCode=zipCode;
    }
    @Override
    public String validateAddress() {
        String regex = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher =pattern.matcher(zipCode);
        if(matcher.find())
            return  address+" "+zipCode+" is CA Address";
        return  address+" "+zipCode+" is not CA Address";
    }
}
