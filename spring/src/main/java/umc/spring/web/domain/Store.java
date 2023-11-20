//package umc.spring.web.domain;
//import lombok.*;
//import umc.spring.web.domain.enums.Gender;
//import umc.spring.web.domain.enums.MemberStatus;
//import umc.spring.web.domain.enums.SocialType;
//import umc.spring.web.domain.mapping.MemberMission;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class Store {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, length = 40)
//    private String name;
//
//    @Column(nullable = false, length = 40)
//    private String address;
//
//    private Float score;
//
//    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
//    private List<Review> storeReviewList = new ArrayList<>();
//
//}
