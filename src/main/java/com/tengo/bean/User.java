package com.tengo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * @author tengo_liu
 * 用户Model
 */
@Entity
public class User {

	public User() {
	}

	public User(String name, String phone, String imgUrl) {
		this.name = name;
		this.phone = phone;
		this.imgUrl = imgUrl;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;// 用户id

	public String name;// 用户姓名

	public String phone;// 用户的手机号码

	public String imgUrl;// 用户头像的地址

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return String.format("User[id=%d, name='%s', phone='%s', imgUrl='%s']", id, name, phone, imgUrl);
	}
}
