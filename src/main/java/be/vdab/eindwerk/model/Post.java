package be.vdab.eindwerk.model;

import javax.persistence.*;

@Entity
@Table(name = "post", schema = "eindwerk")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    /// own homemade class not java class pretty please
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String postTitle;

    private String postContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Post() {
    }
}
