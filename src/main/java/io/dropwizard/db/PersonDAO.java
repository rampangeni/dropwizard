package io.dropwizard.db;

import io.dropwizard.core.Person;
import io.dropwizard.hibernate.AbstractDAO;

import org.checkerframework.checker.nullness.Opt;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.management.Query;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class PersonDAO extends AbstractDAO<Person>{
    public PersonDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<Person> findById(Long id) {
        return Optional.ofNullable(get(id);
    }

    public Person create(Person person) {
        return persist(person);
    }

    @SuppressWarnings("unchecked")
    public List<Person> findAll() {
        return list((Query<Person>) namedQuery("io.dropwizard.core.Person.findAll"));
    }
}
