package com.upgrad.musichoster.service.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;


@Entity @Table(name = "MUSICS")
@NamedQueries({@NamedQuery(name = "MusicEntityByUuid", query = "select m from MusicEntity m where m.uuid = :uuid"),
		@NamedQuery(name = "MusicEntityByid", query = "select m from MusicEntity m where m.id = :id")})
public class MusicEntity implements Serializable {

	@Id @Column(name = "ID") @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;

	@Column(name = "UUID") @Size(max = 64) private String uuid;


	@Column(name = "MUSIC") private String music;

	@Column(name = "NAME") private String name;

	@Column(name = "DESCRIPTION") private String description;

	@Column(name = "NO_OF_LIKES") private long no_of_likes;


	@ManyToOne @JoinColumn(name = "USER_ID") private UserEntity user;


	@Column(name = "CREATED_AT") private ZonedDateTime created_at;

	@Column(name = "STATUS") private String status;

}
