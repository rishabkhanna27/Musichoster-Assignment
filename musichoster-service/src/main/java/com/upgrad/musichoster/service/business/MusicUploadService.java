package com.upgrad.musichoster.service.business;

import com.upgrad.musichoster.service.entity.MusicEntity;
import com.upgrad.musichoster.service.entity.UserAuthTokenEntity;
import com.upgrad.musichoster.service.exception.UploadFailedException;
import com.upgrad.musichoster.service.dao.MusicDao;
import com.upgrad.musichoster.service.entity.MusicEntity;
import com.upgrad.musichoster.service.entity.UserAuthTokenEntity;
import com.upgrad.musichoster.service.exception.UploadFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MusicUploadService {

    @Autowired
    private com.upgrad.musichoster.service.dao.MusicDao musicDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public MusicEntity upload(MusicEntity musicEntity, final String authorizationToken) throws UploadFailedException {
        UserAuthTokenEntity userAuthTokenEntity = musicDao.getUserAuthToken(authorizationToken);
        if (userAuthTokenEntity == null) {
            throw new UploadFailedException("UP-001", "User is not Signed in, sign in to upload an music");
        }
        musicEntity.setUser_id(userAuthTokenEntity.getUser());
        return musicDao.createmusic(musicEntity);
    }
}