package io.expensetracker;

import io.expensetracker.model.user.MyUser;
import io.expensetracker.repository.user.MyUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final MyUserRepository userRepository;

    public UserDetailServiceImpl(MyUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> optionalUser = userRepository.findByUsername(username);

            return Optional.ofNullable(optionalUser).orElseThrow( ()-> new UsernameNotFoundException("Username Not Found"))
                    .map(MyUserDetails::new).get();
    }
}
