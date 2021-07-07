package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    /**
     *
     * @param paramMap
     * @param model
     * @return
     */
    // /** 하면 자동으로 나온다
    String process(Map<String,String> paramMap, Map<String,Object> model);
}
