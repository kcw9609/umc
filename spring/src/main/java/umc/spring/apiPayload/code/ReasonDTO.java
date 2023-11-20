package umc.spring.apiPayload.code;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ReasonDTO  {

private final HttpStatus httpStatus;
    private final Boolean isSuccess;
    private final String code;
    private final String message;
}
