package clase18;

public class ComparadorDeCheques extends ChequeComparator {

	@Override
	public int comparar(Cheque c1, Cheque c2) {
		// TODO Auto-generated method stub
		int resta;
		
		if (c1.getFechaPago() == null || c2.getFechaPago() == null) {
			resta = 0;
		}
		
		resta = c1.getFechaPago().compareTo(c2.getFechaPago());
		
		if(resta == 0) {
			resta = c1.getBanco().compareTo(c2.getBanco());
		}
		
		if (resta == 0) {
			resta = c1.getCmc7().compareTo(c2.getCmc7());
		}
		
		return resta;
	}

}
