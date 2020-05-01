//package com.upgrad.musichoster.service.business;
//
//import com.upgrad.musichoster.service.dao.MusicDao;
//import com.upgrad.musichoster.service.entity.MusicEntity;
//import com.upgrad.musichoster.service.entity.UserAuthTokenEntity;
//import com.upgrad.musichoster.service.exception.MusicNotFoundException;
//import com.upgrad.musichoster.service.exception.UnauthorizedException;
//import com.upgrad.musichoster.service.exception.UserNotSignedInException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service public class AdminServiceImpl implements AdminService {
//
//	@Autowired private MusicDao musicDao;
//
//	@Override public MusicEntity getMusic(final String musicUuid, final String authorization)
//			throws MusicNotFoundException, UnauthorizedException, UserNotSignedInException {
//		UserAuthTokenEntity userAuthTokenEntity = musicDao.getUserAuthToken(authorization);
//		String role = userAuthTokenEntity.getUser().getRole();
//	}
//
//	@Override @Transactional(propagation = Propagation.REQUIRED)
//	public MusicEntity updateMusic(final MusicEntity musicEntity, final String authorization)
//			throws MusicNotFoundException, UnauthorizedException, UserNotSignedInException {
//
//		UserAuthTokenEntity userAuthTokenEntity = musicDao.getUserAuthToken(authorization);
//
//		String role = userAuthTokenEntity.getUser().getRole();
//		if (role.equals("admin")) {
//
//			MusicEntity existingmusicEntity = musicDao.getMusicById(musicEntity.getId());
//
//			musicEntity.setUuid(existingmusicEntity.getUuid());
//			musicEntity.setNo_of_likes(existingmusicEntity.getNo_of_likes());
//			musicEntity.setUser(existingmusicEntity.getUser());
//			musicEntity.setCreated_at(existingmusicEntity.getCreated_at());
//
//		}
//	}
//
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
//	public MusicEntity updateMusicStatus(final Long musicId, final String status, final String authorization)
//			throws MusicNotFoundException, UnauthorizedException, UserNotSignedInException {
//		UserAuthTokenEntity userAuthTokenEntity = musicDao.getUserAuthToken(authorization);
//
//		String role = userAuthTokenEntity.getUser().getRole();
//
//	}
//}
