package acat.hibernate.dao;

import java.util.List;

import acat.hibernate.model.Person;
import acat.hibernate.repository.PersonRepository;

public class PersonDao extends AbstractDaoImpl<Person, Long> implements PersonRepository {

	public PersonDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Person findOne(Long id) {
		// TODO Auto-generated method stub
		return super.findOne(id);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Person save(Person entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}

	@Override
	public Person update(Person entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public void delete(Person entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public void deleteById(Long entityId) {
		// TODO Auto-generated method stub
		super.deleteById(entityId);
	}
}
