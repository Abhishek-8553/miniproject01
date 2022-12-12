package  com.miniProject01;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact,Integer> {
}