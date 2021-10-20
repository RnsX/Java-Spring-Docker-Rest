package com.enterprise.SqlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private SqlService service = new SqlService("");

    @GetMapping("/RunScenario")
    public void RunScenario(@RequestParam(value="ScenarioId", defaultValue = "0") int ScenarioId)
    {
        service.RunScenario(ScenarioId);
    }

}
