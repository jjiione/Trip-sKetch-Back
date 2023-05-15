package com.ssafy.bonvoyageh.controller.plan;

import com.ssafy.bonvoyageh.service.plan.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("plan")
public class PlanController {
    private final PlanService service;

    @Autowired
    public PlanController(PlanService service) {
        this.service = service;
    }

    // plan 보기
    @DeleteMapping("/{planId}/delete")
    public void planDetele(@RequestParam int planId){


    }

}
