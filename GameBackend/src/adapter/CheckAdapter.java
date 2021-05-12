package adapter;

import abstracts.PlayerCheckService;
import entites.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

		boolean result = false;

		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstNameString().toUpperCase(), player.getLastName().toUpperCase(),
					player.getDateOfBirthDate().getYear());

		} catch (Exception e) {

			System.out.println("Bilgiler Hatalý");
		}
		
		return result;
	}

}
