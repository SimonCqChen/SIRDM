package com.example.sirdm.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name="tweet")
@Qualifier("TweetRepository")
@RepositoryRestResource(path="tweet")
public class TweetRepository {

}
