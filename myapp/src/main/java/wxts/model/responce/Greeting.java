/**
 * myapp
 *
 * Copyright(c) 2018 NTT DATA INTELLILINK CORPORATION. All rights reserved.
 *
 * This product produced by Contact Center Solution Group in Blue cube Division.
 *
 * Since 2018-05-14
 */
package wxts.model.responce;

/**
 * @author Baryu
 *
 */
public class Greeting {

  private Integer id;
  private String content;

  public Greeting() {
    this.id = null;
    this.content = null;
  }

  public Greeting(Integer id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  /**
   * @param id
   *          the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @param content
   *          the content to set
   */
  public void setContent(String content) {
    this.content = content;
  }

}
