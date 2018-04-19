package com.away1994.idlerest.classdiagram;

import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.aggregator.impl.AggregatorImpl;
import com.away1994.structure.lang.aggregator.impl.ClassDiagram;
import com.away1994.structure.lang.aggregator.impl.SessionImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GithubProjectController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/github", method = RequestMethod.GET)
    public ClassDiagram github(@RequestParam(value="name", defaultValue="World") String name) {
        Session session = new SessionImpl(null, "/Users/away/Desktop/symbols");

        AggregatorImpl aggregator = new AggregatorImpl(session);
        ClassDiagram res = aggregator.getClassDiagram(1);
        return res;
    }
}
