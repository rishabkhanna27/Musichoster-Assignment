package com.upgrad.musichoster.service.business;

import com.upgrad.musichoster.service.dao.UserDao;
import com.upgrad.musichoster.service.entity.UserAuthTokenEntity;
import com.upgrad.musichoster.service.entity.UserEntity;
import com.upgrad.musichoster.service.exception.AuthenticationFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthenticationServiceImpl extends AuthenticationService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordCryptographyProvider CryptographyProvider;


	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public UserAuthTokenEntity authenticate(String username, String password)
			throws AuthenticationFailedException {
		UserEntity userEntity = userDao.getUserByEmail(username);

		final String encryptedPassword = CryptographyProvider.encrypt(password, userEntity.getSalt());

		return null;
	}
}
