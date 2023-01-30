package com.example.day2.Service;

import com.example.day2.Model.User;
import com.example.day2.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public boolean updateUser(Integer id, User user){
        User oldUser = userRepository.findById(id).orElse(null);

        if(oldUser == null)
            return false;

        user.setId(id);
        userRepository.save(user);
        return true;

    }

    public boolean deleteUser(Integer id){
        User user = userRepository.findById(id).orElse(null);

        if (user == null){
            return false;
        }

        userRepository.delete(user);
        return true;
    }
}
