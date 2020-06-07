package com.leon.controller

import com.leon.domain.MetaTable
import com.leon.service.MetaTableService
import com.leon.utils.{ResultVO, ResultVOUtil}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestBody, RequestMapping, RequestMethod, RestController}


@RestController
@RequestMapping(Array("/meta/data"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @RequestBody
  def save(@ModelAttribute metaTable: MetaTable) = {
    metaTableService.save(metaTable)
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @RequestBody
  def query() = ResultVOUtil.success(metaTableService.query())

}
