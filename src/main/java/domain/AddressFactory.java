package domain;

import addressesType.MailingAddress;
import addressesType.RegisteredAddress;

public class AddressFactory {
	
	public Addresses createAddress(String addressType){
		
		if(addressType.equals("korespondencyjny"))
			return new MailingAddress();
		else if	(addressType.equals("zameldowania"))
			return new RegisteredAddress();
		else if(addressType.equals("pracy"))
			return new MailingAddress();
		else
			return null;
	}
}
