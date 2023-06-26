package org.project.service;


import org.project.entity.AppDocument;
import org.project.entity.AppPhoto;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
}
