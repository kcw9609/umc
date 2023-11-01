package umc.spring.web.domain.mapping;
import lombok.*;
import umc.spring.web.domain.FoodCategory;
import umc.spring.web.domain.Member;
import umc.spring.web.domain.common.BaseEntity;
import umc.spring.web.domain.enums.MissionStatus;

import javax.persistence.*;
@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberPrefer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY) // 지연 로딩 설정
    @JoinColumn(name = "category_id") // 데이터베이스에서 해당 외래키 이름 설정
    private FoodCategory foodCategory;


}
