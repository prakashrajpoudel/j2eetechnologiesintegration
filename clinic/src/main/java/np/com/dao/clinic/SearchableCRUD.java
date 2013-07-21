package np.com.dao.clinic;

import java.util.List;

import np.com.exception.BaseException;


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
	public void save(T t) throws BaseException, Exception;
	
	/**
	 * Deletes dataType T
	 */
	public void delete(T t);
	
	/**
	 * get object by id
	 */
	public T getById(long id);
	
}
