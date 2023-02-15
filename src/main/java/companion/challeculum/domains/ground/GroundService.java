package companion.challeculum.domains.ground;

import java.util.List;
import java.util.Map;

public interface GroundService {
    void deleteGround(long groundId);

    GroundDTO showGroundDetail(long groundId);

    List<GroundDTO> getGrounds(int page, Integer categoryId, Integer level);

    void createGround(GroundDTO groundDTO);

    List<Map<String, Object>> getMyGrounds(long userId, int page, String status);
}
