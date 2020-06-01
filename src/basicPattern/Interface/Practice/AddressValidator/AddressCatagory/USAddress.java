package basicPattern.Interface.Practice.AddressValidator.AddressCatagory;

import basicPattern.Interface.Practice.AddressValidator.AddressInterface.AddressValidator;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USAddress implements AddressValidator {
    String zipCode;
    String address;

    public USAddress(String address,String zipCode){
      this.address=address;
      this.zipCode=zipCode;
    }
    @Override
    public String validateAddress() {
        String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher =pattern.matcher(zipCode);
        if(matcher.find())
            return address+" "+zipCode+" is US Address";
        return  address+" "+zipCode+" is n  ot US Address";
    }
}
