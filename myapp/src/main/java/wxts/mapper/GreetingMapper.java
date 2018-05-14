/**
 * myapp
 *
 * Since 2018-05-14
 */
package wxts.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import wxts.entity.model.TGreeting;

/**
 * @author Baryu
 *
 */
@Mapper
public interface GreetingMapper {


  @Select("<script> "
      + "SELECT   "
          + "* "
      + " FROM T_GREETING "
      + " WHERE "
      + " GREETING_ID = #{GREETING_ID} "
      + "</script> ")
  TGreeting selectGreeting(
      @Param("GREETING_ID") Integer greetingId
      );
}
