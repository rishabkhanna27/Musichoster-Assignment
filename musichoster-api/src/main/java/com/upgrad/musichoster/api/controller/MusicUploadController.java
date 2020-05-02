package com.upgrad.musichoster.api.controller;


import com.upgrad.musichoster.service.business.MusicUploadService;
import com.upgrad.musichoster.service.entity.MusicEntity;
import com.upgrad.musichoster.service.exception.UploadFailedException;

import com.upgrad.musichoster.service.business.MusicUploadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.time.ZonedDateTime;
import java.util.UUID;
@RestController
@RequestMapping("/")
public class MusicUploadController {

    @Autowired
    private MusicUploadService musicUploadService;

    @RequestMapping(method = RequestMethod.POST, path = "/musicupload", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MusicUploadResponse> musicupload(final MusicUploadRequest musicUploadRequest, @RequestHeader("authorization") final String authorization) throws UploadFailedException, UnsupportedEncodingException {
        final MusicEntity musicEntity = new MusicEntity();
        musicEntity.setMusic(musicUploadRequest.getMusic());
        musicEntity.setName(musicUploadRequest.getName());
        musicEntity.setDescription(musicUploadRequest.getDescription());
        musicEntity.setUuid(UUID.randomUUID().toString());
        musicEntity.setNo_of_likes(0);
        musicEntity.setCreated_at(ZonedDateTime.now());
        musicEntity.setStatus("REGISTERED");
        final MusicEntity createdmusicEntity = musicUploadService.upload(musicEntity, authorization);
        MusicUploadResponse musicUploadResponse = new MusicUploadResponse().id(createdmusicEntity.getUuid()).status("Music Successfully Uploaded");
        return new ResponseEntity<MusicUploadResponse>(musicUploadResponse, HttpStatus.CREATED);
    }
}