package be.vdab.eindwerk.model;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private long id;
    @OneToOne
    @JoinColumn(name = "parent_id")
//    @Column(name = "parent_id")
    private Post parent;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column()
    private String content;

    public long getId() {
        return id;
    }

    public Comment setId(long id) {
        this.id = id;
        return this;
    }

    public Post getParent() {
        return parent;
    }

    public Comment setParent(Post parent) {
        this.parent = parent;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Comment setContent(String content) {
        this.content = content;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Comment setUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", parent=" + parent +
                ", user=" + user +
                ", content='" + content + '\'' +
                '}';
    }
}
