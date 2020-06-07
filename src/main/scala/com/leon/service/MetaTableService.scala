package com.leon.service

import com.leon.domain.MetaTable
import com.leon.repository.{MetaTableRepository}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository) {


  @Transactional
  def save(metaTable: MetaTable): MetaTable = {
    metaTableRepository.save(metaTable)
  }


  def query() = metaTableRepository.findAll()
}
