package com.leon.controller;


import com.leon.domain.MetaDatabase;
import com.leon.service.MetaDataService;
import com.leon.utils.ResultVO;
import com.leon.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetaDataBaseController {

    @Autowired
    private MetaDataService metaDataService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase) {
        System.out.println(metaDatabase.getLocation());
        metaDataService.save(metaDatabase);
        return ResultVOUtil.success();

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResultVO query() {
        return ResultVOUtil.success(metaDataService.getQuery());

    }

}
