package companion.challeculum.domains.mission.dtos;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by jonghyeon on 2023/02/16,
 * Package : companion.challeculum.domains.mission.dtos
 */
@Data
public class MissionCreateDto {
    private Long groundId;
    private String assignment;
    private LocalDate startAt;
    private LocalDate endAt;
}