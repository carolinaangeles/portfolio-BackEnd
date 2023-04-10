
package com.carolinaangelesporfolio.AP.repository;

//REPOSITORY permite el acceso de datos de un modelo a una tabla de base de datos, interacciona desde algun JPA con Hibernate o JDBC, o algun ORM. para la persistenc
//cada clase debe tener @Repository.
//se crea una interface no una clase.
//I de interface en el nombre. 

//JPA trae crud
import com.carolinaangelesporfolio.AP.entity.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperience extends JpaRepository<Experience, Long>{
    //?? supongo que hace lo q dice el nombre. Son funciones aparte del crud. opcional es xq es posible q lo encuentre o no.
    public Optional<Experience> findByJob(String job);
    public boolean existsByJob(String job);
}
