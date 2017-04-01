package com.dsjk.platform.common.bean.cms;

import com.dsjk.platform.common.base.BaseEntity;

/**
 * 文章Entity
 *
 * @author ThinkGem
 * @version 2013-01-15
 */
public class CmsArticleData extends BaseEntity<CmsArticleData> {

    private static final long serialVersionUID = 1L;
    private String content;    // 内容
    private String copyfrom;// 来源
    private String relation;// 相关文章
    private String allowComment;// 是否允许评论

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCopyfrom() {
        return copyfrom;
    }

    public void setCopyfrom(String copyfrom) {
        this.copyfrom = copyfrom;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(String allowComment) {
        this.allowComment = allowComment;
    }
}