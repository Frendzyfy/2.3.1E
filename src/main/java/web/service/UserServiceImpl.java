package web.service;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;
        import web.dao.UserDAO;
        import web.model.User;

        import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}