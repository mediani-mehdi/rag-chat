package com.medev.ragchat.documents;

import org.springframework.web.multipart.MultipartFile;

public class FileStorage {

    private final DocumentRepository documentRepository;

    public FileStorage(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Object saveFile(MultipartFile file) {

        Document document = new Document();
        document.setName(file.getOriginalFilename());
        document.setSize(file.getSize());


        documentRepository.save(document);

        return document.getUpdatedAt();
    }
}
