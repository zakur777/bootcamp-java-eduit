package clase17;

import java.util.Collection;

public interface IDatos<T> {

	public T buscar();

	public Collection<T> buscarTodos();

}
