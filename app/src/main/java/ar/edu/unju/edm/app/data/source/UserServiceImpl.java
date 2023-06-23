package ar.edu.unju.edm.app.data.source;

import ar.edu.unju.edm.app.data.repository.CommentRepository;
import ar.edu.unju.edm.app.data.repository.PointRepository;
import ar.edu.unju.edm.app.data.repository.ReviewRepository;
import ar.edu.unju.edm.app.data.repository.UserRepository;
import ar.edu.unju.edm.app.domain.model.Comment;
import ar.edu.unju.edm.app.domain.model.Point;
import ar.edu.unju.edm.app.domain.model.Review;
import ar.edu.unju.edm.app.domain.model.User;
import ar.edu.unju.edm.app.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository USER_DATABASE;
    private final PointRepository POINT_DATABASE;
    private final CommentRepository COMMENT_DATABASE;
    private final ReviewRepository REVIEW_DATABASE;

    public UserServiceImpl(UserRepository USER_DATABASE, PointRepository POINT_DATABASE, CommentRepository COMMENT_DATABASE, ReviewRepository REVIEW_DATABASE) {
        this.USER_DATABASE = USER_DATABASE;
        this.POINT_DATABASE = POINT_DATABASE;
        this.COMMENT_DATABASE = COMMENT_DATABASE;
        this.REVIEW_DATABASE = REVIEW_DATABASE;
    }

    @Autowired
    User user;

    @Override
    public void editUser(User user) {
        this.user.setName(user.getName());
        this.user.setLastName(user.getLastName());
        this.user.setEmail(user.getEmail());
        this.user.setPassword(user.getPassword());
        this.user.setNationality(user.getNationality());
        this.user.setType(user.getType());
        USER_DATABASE.save(this.user);
    }

    @Override
    public void deleteUser(Integer ID) {
        user = USER_DATABASE.findById(ID).get();
        user.setState(false);
        USER_DATABASE.save(user);
    }

    @Override
    public Point getPoint(Integer ID) {
        return POINT_DATABASE.findById(ID).get();
    }

    @Override
    public void addComment(Comment comment) {
        COMMENT_DATABASE.save(comment);
    }

    @Override
    public void addReview(Review review) {
        REVIEW_DATABASE.save(review);
    }

}