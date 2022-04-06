package clase15.generic;

public abstract class Service<T> {
	
	protected IGenericOperation<T> iTabla;

	public Service(IGenericOperation<T> iTabla) {
		this.iTabla = iTabla;
	}
	
	
	
	

}
