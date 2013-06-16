package np.com.dao.implementation.clinic;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import np.com.dao.clinic.SearchableCRUD;

public abstract class BaseHibernateSearchableCRUD<T> implements
		SearchableCRUD<T> {

	private Class<T> persistentClass;
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public BaseHibernateSearchableCRUD() {
		// TO-DO find out best way to find persistentClass
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAllByCriteria() {
		StringBuilder queryString = new StringBuilder("from ");
		queryString.append(getPersistentClass().getName());
		if (StringUtils.isNotEmpty(getQueryClause())) {
			queryString.append(getQueryClause());
		}
		try {
			Query query = getSessionFactory().getCurrentSession().createQuery(
					queryString.toString());
			if (StringUtils.isNotEmpty(getQueryClause())) {
				setParameters(query);
			}
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return new ArrayList<T>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		return getSessionFactory().getCurrentSession().createQuery("from " + getPersistentClass().getName()).list();
	}

	/**
	 * get object by id
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T getById(long id) {
		return (T) getSessionFactory().getCurrentSession().get(
				getPersistentClass(), id);
	}

	@Override
	public void save(T t) {
		try {
			getSessionFactory().getCurrentSession().saveOrUpdate(t);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(T t) {
		getSessionFactory().getCurrentSession().delete(t);
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	/**
	 * Override in subclass if any clause is required to getAll
	 */
	protected String getQueryClause() {
		return null;
	}

	/**
	 * If queryClause is extend then associate parameter is set here.
	 */
	protected void setParameters(Query query) {

	}
}
