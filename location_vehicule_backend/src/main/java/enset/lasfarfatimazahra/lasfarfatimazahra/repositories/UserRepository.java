package enset.lasfarfatimazahra.lasfarfatimazahra.repositories;

import enset.lasfarfatimazahra.lasfarfatimazahra.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(
            String username
    );
}