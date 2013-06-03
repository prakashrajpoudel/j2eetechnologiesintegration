package np.com.dao.clinic;

import java.util.List;


public interface SearchableCRUD<T> {

	/**
	 * Returns List of dataType T
	 **/
	public List<T> getAll();
	
	/**
	 * TO-DO
	 * Returns List of dataType T
	 **/
	public List<T> getAllByCriteria();
	
	/**
	 * Saves dataType T
	 */
	public void save(T t);
	
	/**
	 * Deletes dataType T
	 */
	public void delete(T t);
	
	/**
	 * get object by id
	 */
	public T get(long id);
	
}
