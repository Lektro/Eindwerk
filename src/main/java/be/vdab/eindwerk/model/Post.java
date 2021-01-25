package be.vdab.eindwerk.model;

import javax.persistence.*;

@Entity
@Table(name = "post", schema = "eindewerk")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    /// own homemade class not java class pretty please
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "post_title")
    private String postTitle;

    @Column(name = "post_content")
    private String postContent;


    public Post() { }

    public Post(User user, String postTitle, String postContent) {
        this.user = user;
        this.postTitle = postTitle;
        this.postContent = postContent;
    }

    public Long getId() {
        return id;
    }

    public Post setId(Long id) {
        this.id = id;
        return this;
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

    public Post setPostTitle(String postTitle) {
        this.postTitle = postTitle;
        return this;
    }

    public String getPostContent() {
        return postContent;
    }

    public Post setPostContent(String postContent) {
        this.postContent = postContent;
        return this;
    }
}
