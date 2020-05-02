package com.upgrad.musichoster.service.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "MUSIC")
@NamedQueries({
		@NamedQuery(name = "MusicEntityByUuid", query = "select i from MusicEntity i where i.uuid = :uuid"),
		@NamedQuery(name = "MusicEntityByid", query = "select i from MusicEntity i where i.id = :id")
})
public class MusicEntity implements Serializable {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "UUID")
	@Size(max = 64)
	private String uuid;


	@Column(name = "MUSIC")
	private String music;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "NO_OF_LIKES")
	private long no_of_likes;


	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private UserEntity user;


	@Column(name = "CREATED_AT")
	private ZonedDateTime created_at;

	@Column(name = "STATUS")
	private String status;
	//private String music;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getNo_of_likes() {
		return no_of_likes;
	}

	public void setNo_of_likes(long no_of_likes) {
		this.no_of_likes = no_of_likes;
	}

	public UserEntity getUser_id() {
		return user;
	}

	public void setUser_id(UserEntity user_id) {
		this.user = user_id;
	}

	public ZonedDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(ZonedDateTime created_at) {
		this.created_at = created_at;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		return new EqualsBuilder().append(this, obj).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this).hashCode();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}


}
