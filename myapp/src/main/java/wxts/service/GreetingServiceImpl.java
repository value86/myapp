/**
 * myapp
 *
 * Since 2018-05-14
 */
package wxts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wxts.mapper.GreetingMapper;
import wxts.model.responce.Greeting;

/**
 * @author Baryu
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {


  @Autowired
  private GreetingMapper greetingMapper;
  
  /* (non-Javadoc)
   * @see wxts.service.greetingService#getGreeting()
   */
  @Override
  public Greeting getGreeting(Integer id) {
    Greeting greeting = new Greeting();
    greeting.setContent(greetingMapper.selectGreeting(id).getGreetingContent());
    return greeting;
  }

}
