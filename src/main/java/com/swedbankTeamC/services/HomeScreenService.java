package com.swedbankTeamC.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by p998ueh on 2016.02.11.
 */
@RestController
public class HomeScreenService {

    /*
        @PostConstruct
        public void init() {
            peanutList = new PeanutList();
            peanutList.addPeanut(new Peanut("Karolis"));
            peanutList.addPeanut(new Peanut("Antanas"));
            peanutList.addPeanut(new Peanut("Petras"));
            peanutList.addPeanut(new Peanut("Jonas"));
        }

        @RequestMapping("/peanuts")
        public PeanutList list() {
            return peanutList;
        }

        @RequestMapping("/peanuts/sorted")
        public PeanutList sortedList() {
            Collections.sort(peanutList.getPeanuts());
            return peanutList;
        }

        @RequestMapping("/two")
        public List<Peanut> two() {
            List<Peanut> list = new ArrayList<Peanut>();
            list.add(peanutList.getPeanuts().get(0));
            list.add(peanutList.getPeanuts().get(1));
            return list;
        }

        @RequestMapping("/peanuts/withO")
        public List<Peanut> peanutsWithO() {
            List<Peanut> list = new ArrayList<Peanut>();
            for(Peanut peanut : peanutList.getPeanuts())
            {
                if(peanut.getName().contains("o"))
                    list.add(peanut);
            }

            return list;
        }


        @RequestMapping("/peanuts/dividableby3")
        public PeanutList dividableBy3List() {

            PeanutList dividableBy3List = new PeanutList();
            for (Peanut peanut : peanutList.getPeanuts()) {
                if (peanut.getId() % 3 == 0)
                    dividableBy3List.addPeanut(peanut,peanut.getId());
            }
            return dividableBy3List;
        }


        @RequestMapping(value = "/peanuts", method = RequestMethod.PUT)
        public void create(String name) {
            peanutList.addPeanut(new Peanut(name));
        }


        @RequestMapping(value = "/peanuts/{id}", method = RequestMethod.GET)
        public Peanut getPeanut(@PathVariable Long id) {
            for (Peanut peanut : peanutList.getPeanuts()) {
                if (peanut.getId() == id.intValue())
                    return peanut;
            }
            return null;
        }


        @RequestMapping(value = "/peanuts/{id}", method = RequestMethod.DELETE)
        public void removePeanut(@PathVariable Long id) {

        }
*/



}
