package may.code.api.exceptions;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Controller
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @Override
    public String getErrorPath() { return PATH;}

    @RequestMapping(CustomErrorController.PATH)
    public ResponseEntity<ErrorDto> error("Webrequest webRequest") (
            Map<String, Object> attributes = errorAtributes.getErrorAttributes(
                    webRequest,
                    ErrorAttributeOptions.of(ErrorAttributeOptions.Include.EXCEPTION, ErrorAttributeOptions.Include.MESSAGE)
            );

            return ResponseEntity
            .status((Integer)attributes.get("status"))
            .body(ErrorDto
                                                                  .
}
