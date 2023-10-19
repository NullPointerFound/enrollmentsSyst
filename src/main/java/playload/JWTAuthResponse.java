package playload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JWTAuthResponse {

    private String accessToken;
    private String tokenType = "Bearer";

    public JWTAuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}