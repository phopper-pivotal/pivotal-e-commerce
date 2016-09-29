package io.pivotal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "addressBook", path = "addressBook")
public interface AddressBookRepository extends PagingAndSortingRepository<AddressBook, Long> {

    @RestResource(path="findById", rel="findById")
    List<AddressBook> findById(@Param("id") Long id);

    @RestResource(path="findByName", rel="findByName")
    List<AddressBook> findByName(@Param("name") String name);

}
