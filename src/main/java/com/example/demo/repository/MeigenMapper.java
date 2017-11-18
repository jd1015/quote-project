/**
 *
 */
package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Meigen;

/**
 * @author lepra
 *
 */
@Mapper
public interface MeigenMapper {
  void insert(Meigen meigen);
  Meigen select(int id);
  Meigen[] selectAll();
  void deleteMeigenById(int id);
}
