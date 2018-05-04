package pivotal.io.apj.pa.workshops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class WorkshopController {

    private static final Logger logger = LoggerFactory.getLogger(WorkshopController.class);

    private WorkshopRepository workshopRepository;

    public WorkshopController(WorkshopRepository workshopRepository) {
        this.workshopRepository = workshopRepository;
    }

    @RequestMapping("/")
    public String workshopPage (Model model) throws Exception
    {
        Map appMap = Utils.getVcapApplicationMap();

        model.addAttribute("appMap", appMap);
        model.addAttribute("workshops", workshopRepository.findAll());

        logger.info("rendering page workshops.html");

        return "workshops";
    }
}
