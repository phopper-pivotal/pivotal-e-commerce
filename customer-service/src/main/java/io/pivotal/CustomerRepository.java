package io.pivotal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    @RestResource(path="findById", rel="findById")
    List<Customer> findById(@Param("id") Long id);

    @RestResource(path="findByName", rel="findByName")
    List<Customer> findByName(@Param("name") String name);

}
