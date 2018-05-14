/**
 * myapp
 *
 * Since 2018-05-14
 */
package wxts.service;

import wxts.model.responce.Greeting;

/**
 * @author Baryu
 *
 */
public interface GreetingService {


  public abstract Greeting getGreeting(Integer id);
  
}
