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
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column()
    private String postTitle;
    @Column()
    private String postContent;

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

    public Post setUser(User user) {
        this.user = user;
        return this;
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

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user=" + user +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                '}';
    }
}
