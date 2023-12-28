package umc.spring.service.TempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.service.TempQueryService;

@Service
@RequiredArgsConstructor
public class TempCommandService implements TempQueryService {

    @Override
    public void CheckFlag(Integer flag) {

    }
}