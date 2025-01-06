package elhou.salima.orderservice.Interceptors;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
public class FeignIntreceptor implements RequestInterceptor {


    @Override
    public void apply(RequestTemplate requestTemplate) {

       SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();

        JwtAuthenticationToken jwtAuthenticationToken= (JwtAuthenticationToken) authentication;

        String jwtAccessToken = jwtAuthenticationToken.getToken().getTokenValue();

       System.out.println("jwtAccessToken" + jwtAccessToken);

        requestTemplate.header("Authorization", "Bearer "+jwtAccessToken);





    }
}




