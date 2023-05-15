package com.ssafy.bonvoyageh.controller.plan;

import com.ssafy.bonvoyageh.service.plan.PlanService;
import com.ssafy.bonvoyageh.service.plan.PlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("plan")
public class PlanController {
    private final PlanServiceImpl service;

    @Autowired
    public PlanController(PlanServiceImpl service) {
        this.service = service;
    }

    // plan 보기
    @DeleteMapping("/{planId}/delete")
    public void planDetele(@RequestParam int planId){
        service.delete();

    }

}
