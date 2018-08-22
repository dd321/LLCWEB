package llcweb.com.domain.models; /***********************************************************************
 * Module:  Document.java
 * Author:  Ricardo
 * Purpose: Defines the Class Document
 ***********************************************************************/

import javax.persistence.*;
import java.util.Date;

/** 文档类
 * @pdOid f86d4902-a99e-4dbd-97ed-b6c5472765bc */
@Entity
@Table(name="document")
public class Document {
   /** 文章id
    * 
    * @pdOid b19668b5-6362-4ec1-8d8b-e8083a74a39f */
   @Id
   @GeneratedValue
   public long id;
   /** 作者id
    * 
    * @pdOid c9d8e504-8f4d-44b2-ab87-5b5062aa42f0 */
   public int authorId = 0;
   /** 作者
    *
    * @pdOid c9d8e504-8f4d-44b2-ab87-5b5062aa42f0 */
  public String author;
   /** 文章标题
    * 
    * @pdOid 2a5cdd5d-0200-497c-b388-fee7931829aa */
   public String title;
   /** 文章内容
    * 
    * @pdOid b6632517-862f-4d63-8faa-8623d1d90cf0 */
   public String content;
   /** 创建时间
    * 
    * @pdOid a8870d71-f2da-4d8a-bfad-efdffd3aa2d4 */
   @Column(columnDefinition="DATE",name="createDate")
   public Date createDate;
   /** 修改时间
    * 
    * @pdOid 8117e7b1-5fdd-4b3b-9a8d-2a1d58284cc6 */
   @Column(columnDefinition="DATE",name="modifyDate")
   public Date modifyDate;
   /** 注释
    * 
    * @pdOid 8639391d-4744-442b-9b12-febf59fdbf3a */
   public String infor;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public int getAuthorId() {
      return authorId;
   }

   public void setAuthorId(int authorId) {
      this.authorId = authorId;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   public Date getModifyDate() {
      return modifyDate;
   }

   public void setModifyDate(Date modifyDate) {
      this.modifyDate = modifyDate;
   }

   public String getInfor() {
      return infor;
   }

   public void setInfor(String infor) {
      this.infor = infor;
   }

   @Override
   public String toString() {
      return "Document{" +
              "id=" + id +
              ", authorId=" + authorId +
              ", author='" + author +
              ", title='" + title +
              ", content='" + content +
              ", createDate=" + createDate +
              ", modifyDate=" + modifyDate +
              ", infor='" + infor +
              '}';
   }
}