package com.leon.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class ScalaHelloBoot {

  @RequestMapping(value = Array("/sayScalaHello"), method = Array(RequestMethod.GET))
  def sayScalaHello(): String = {
    "scala 的世界你好"
  }

}
