package com.upgrad.musichoster.api.controller;


import com.upgrad.musichoster.service.business.AdminService;
import com.upgrad.musichoster.service.entity.MusicEntity;
import com.upgrad.musichoster.service.exception.MusicNotFoundException;
import com.upgrad.musichoster.service.exception.UnauthorizedException;
import com.upgrad.musichoster.service.exception.UserNotSignedInException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.GET, path = "/videos/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MusicDetailsResponse> getVideo(@PathVariable("id") final String musicUuid, @RequestHeader("authorization") final String authorization) throws MusicNotFoundException, UnauthorizedException, UserNotSignedInException {


        final MusicEntity videoEntity = adminService.getMusic(musicUuid, authorization);


        MusicDetailsResponse videoDetailsResponse = new MusicDetailsResponse().
                music(videoEntity.getMusic()).id((int) videoEntity.getId())
                .name(videoEntity.getName()).description(videoEntity.getDescription())
                .status(videoEntity.getStatus());

        return new ResponseEntity<MusicDetailsResponse>(videoDetailsResponse, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/videos/update/{video_id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UpdateMusicResponse> updateVideo(final UpdateMusicRequest updateVideoRequest, @PathVariable("video_id") final long video_id, @RequestHeader("authorization") final String authorization) throws MusicNotFoundException, UnauthorizedException, UserNotSignedInException {
        MusicEntity videoEntity = new MusicEntity();
        videoEntity.setMusic(updateVideoRequest.getMusic());
        videoEntity.setId(video_id);
        videoEntity.setName(updateVideoRequest.getName());
        videoEntity.setStatus(updateVideoRequest.getStatus());
        videoEntity.setDescription(updateVideoRequest.getDescription());
        MusicEntity updatedvideoEntity = adminService.updateMusic(videoEntity, authorization);
        UpdateMusicResponse updateVideoResponse = new UpdateMusicResponse().id((int) updatedvideoEntity.getId()).status(updatedvideoEntity.getStatus());
        return new ResponseEntity<UpdateMusicResponse>(updateVideoResponse, HttpStatus.OK);
    }


}