package com.tlz.librarysystem.service;

import com.tlz.librarysystem.entity.Publisher;
import com.tlz.librarysystem.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> findAllPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher findPublisherById(Long id) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher unknown."));
        return publisher;
    }

    public void createPublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher unknown."));
        publisherRepository.deleteById(publisher.getId());
    }
}
