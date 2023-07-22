package hellojpa.jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String streets;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    @JoinColumn(name = "ORDER_ID")
    private List<Order> orders = new ArrayList<>();
}
