package com.longyan.entity;

import java.util.Date;

/**
 * 栏目
 * @author tracyqiu
 *
 */
public class Column {
	
	private int id;  //ID
	
	private int site_id;  //站点ID

	private String name;   //栏目名称
	
	private String code;  //栏目代码
	
	private int style;  //栏目的前端展现样式1 纯文本样式（默认），2 图文混排样式
	
	private int template_id;   //没有二级内容的栏目会对应一个模板文件
	
	private String img_url;    //每个栏目对应的banner图url，可以为多个地址，以##分隔。例如  /upload/a.jpg##/upload/b.jpg
	
	private String create_user;  //创建人
	
	private Date ctime;       //创建时间
	
	private Date utime;       //更新时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(int template_id) {
		this.template_id = template_id;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Date getUtime() {
		return utime;
	}

	public void setUtime(Date utime) {
		this.utime = utime;
	}
}
