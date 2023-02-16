package companion.challeculum.domains.ground;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface GroundDAO {
    void deleteGround(long groundId);

    GroundDTO showGroundDetail(long groundId);

    List<ListGroundDTO> getGrounds(@Param("startRow") Integer startRow,
                               @Param("ROWS_PER_PAGE") int ROWS_PER_PAGE,
                               @Param("categoryId") Integer categoryId,
                               @Param("level") Integer level);

    void createGround(CreateGroundDTO createGroundDTO);

    List<Map<String, Object>> getMyGrounds(@Param("userId") long userId,
                                           @Param("startRow") int startRow,
                                           @Param("ROWS_PER_PAGE") int rowsPerPage,
                                           @Param("status") String status);

    void refundDeposit(long groundId);

    void markNotAttending(long groundId);

    void addMissionsToGround(List<Map<String, String>> missionList);
}
