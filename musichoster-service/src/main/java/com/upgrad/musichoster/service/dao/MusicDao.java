package com.upgrad.musichoster.service.dao;

import com.upgrad.musichoster.service.entity.MusicEntity;
import com.upgrad.musichoster.service.entity.UserAuthTokenEntity;

import com.upgrad.musichoster.service.entity.UserAuthTokenEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class MusicDao {

    @PersistenceContext
    private EntityManager entityManager;

    public MusicEntity createmusic(MusicEntity musicEntity) {
        entityManager.persist(musicEntity);
        return musicEntity;
    }

    public UserAuthTokenEntity getUserAuthToken(final String accesstoken) {
        try {
            return entityManager.createNamedQuery("userAuthTokenByAccessToken", UserAuthTokenEntity.class).setParameter("accessToken", accesstoken).getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
    }

    public MusicEntity getmusic(final String musicUuid) {

        try {
            return entityManager.createNamedQuery("MusicEntityByUuid", MusicEntity.class).setParameter("uuid", musicUuid).getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
    }
    public MusicEntity getmusicById(final long Id) {
        try {
            return entityManager.createNamedQuery("MusicEntityByid", MusicEntity.class).setParameter("id", Id).getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
    }

    public MusicEntity updatemusic(final MusicEntity musicEntity) {
        return entityManager.merge(musicEntity);
    }
}
