package com.unicauca.edu.co.BasicCrud.Controller;

import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Services.IServiceComic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comic")
public class ComicController {

    private final IServiceComic servicecomic;

    public ComicController(IServiceComic servicecomic) {
        this.servicecomic = servicecomic;
    }

    @PostMapping
    public ComicEntity addComic(@RequestBody ComicEntity comic) throws Exception {
        ComicEntity response = servicecomic.addComic(comic);
        if (response == null)
            throw new Exception("Not saved");

        return response;
    }

    @GetMapping
    public List<ComicEntity> findAllComics() {
        return servicecomic.findAllComics();
    }

    @GetMapping("/{idComic}")
    public ComicEntity findByIdComic(@PathVariable String idComic) throws Exception {
        ComicEntity response = servicecomic.findByIdComic(idComic);
        if(response == null)
            throw new Exception("Not found");
        return response;
    }

    @PutMapping("/{idComic}")
    public ComicEntity updateComic(@PathVariable String idComic, @RequestBody ComicEntity comic) throws Exception {
        comic.setIdComic(idComic);
        ComicEntity response = servicecomic.updateComic(comic);
        if (response == null)
            throw new Exception("Not found");
        return response;
    }

    @DeleteMapping("/{idComic}")
    public boolean deleteComic(@PathVariable String idComic) throws Exception {
        ComicEntity response = servicecomic.deleteComic(idComic);
        if(response == null)
            throw new Exception("Not found");
        return true;
    }
}
