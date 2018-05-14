/**
 * myapp
 *
 * Since 2018-05-14
 */
package wxts.entity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Baryu
 *
 */
@Entity
@Table(name = "t_greeting")
@NamedQuery(name = "TGreeting.findAll", query = "SELECT t FROM TGreeting t")

public class TGreeting implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "greeting_id")
  private Integer greetingId;

  @Column(name = "greeting_content")
  private String greetingContent;

  public TGreeting() {
  }

  /**
   * @return the greetingId
   */
  public Integer getGreetingId() {
    return greetingId;
  }

  /**
   * @param greetingId
   *          the greetingId to set
   */
  public void setGreetingId(Integer greetingId) {
    this.greetingId = greetingId;
  }

  /**
   * @return the greetingContent
   */
  public String getGreetingContent() {
    return greetingContent;
  }

  /**
   * @param greetingContent
   *          the greetingContent to set
   */
  public void setGreetingContent(String greetingContent) {
    this.greetingContent = greetingContent;
  }
}
