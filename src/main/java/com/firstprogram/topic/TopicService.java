package com.firstprogram.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=Arrays.asList(new Topic("Java","Core Java","Java Discription"),
			new Topic("Spring","Spring Boot","Spring Discription")
			);
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
}
