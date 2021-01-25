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



}
