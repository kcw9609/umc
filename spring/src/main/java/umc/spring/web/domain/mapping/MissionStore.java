package umc.spring.web.domain.mapping;

import lombok.*;
import umc.spring.web.domain.Mission;
import umc.spring.web.domain.Store;
import umc.spring.web.domain.common.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberStore extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    public void setMission(Mission mission) {
        if (this.mission != null)
            mission.getMissionStoreList().remove(this);
        this.mission = mission;
        mission.getMissionStoreList().add(this);

    }

    public void setStore(Store store) {
        this.store = store;
    }
}
