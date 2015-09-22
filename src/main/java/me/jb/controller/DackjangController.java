package me.jb.controller;

import me.jb.domain.Dackjang;
import me.jb.repository.DackjangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by test on 2015-09-19.
 */
@Controller
@RequestMapping("dackjang")
public class DackjangController {
    @Autowired
    DackjangRepository repository;

    @RequestMapping("/view")
    String view(HttpServletRequest request, HttpServletResponse response){
        List<Dackjang> dackjangs    =   repository.findAll();

        if(!dackjangs.isEmpty())
        {
            request.setAttribute("dackjang", dackjangs.get(0));
        }


        return "DackjangView";
    }

    @RequestMapping("/update")
    String update(HttpServletRequest request, HttpServletResponse response, @RequestParam Integer temper, @RequestParam Integer humidity){
        List<Dackjang> dackjangs    =   repository.findAll();

        Dackjang dackjang;

        if(!dackjangs.isEmpty())
        {
            dackjang    =   dackjangs.get(0);
        }else
        {
            dackjang    =   new Dackjang();
        }


        dackjang.setTemper(temper);
        dackjang.setHumidity(humidity);

        dackjang.setUpdatetime(new Date());

        Dackjang newDackjang   = repository.saveAndFlush(dackjang);

        request.setAttribute("dackjang", newDackjang);

        return "DackjangView";
    }
}
