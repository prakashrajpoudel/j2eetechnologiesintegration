package np.com.dao.implementation.clinic;

import java.util.List;

import np.com.dao.clinic.SearchableCRUD;

public class BaseSearchableCRUD<T> implements SearchableCRUD<T> {

	@Override
	public List<T> getAll() {
		return null;
	}

	@Override
	public void save(T t) {
		
	}

	@Override
	public void delete(T t) {
		
	}

	@Override
	public T get(long id) {
		return null;
	}

	@Override
	public List<T> getAllByCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

}
