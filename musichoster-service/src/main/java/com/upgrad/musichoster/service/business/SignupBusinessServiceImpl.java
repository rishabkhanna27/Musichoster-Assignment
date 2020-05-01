package com.upgrad.musichoster.service.business;

import com.upgrad.musichoster.service.dao.UserDao;
import com.upgrad.musichoster.service.entity.UserEntity;
import com.upgrad.musichoster.service.exception.SignUpRestrictedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class SignupBusinessServiceImpl implements SignupBusinessService {

	@Autowired private UserDao userDao;

	@Autowired private PasswordCryptographyProvider passwordCryptographyProvider;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public UserEntity signup(UserEntity userEntity) throws SignUpRestrictedException{
		String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(userEntity.getEmail());

	}
}
