package co.edu.ufps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.ufps.model.Manga;
import co.edu.ufps.repository.MangaRepository;
import java.util.List;

@Service
public class MangaService {

    @Autowired
    private MangaRepository mangaRepository;

    public List<Manga> getAllMangas() {
        return mangaRepository.findAll();
    }

    public Manga getMangaById(Long id) {
        return mangaRepository.findById(id).orElse(null);
    }

    public Manga createManga(Manga manga) {
        return mangaRepository.save(manga);
    }

    public Manga updateManga(Long id, Manga manga) {
        Manga existingManga = mangaRepository.findById(id).orElse(null);
        if (existingManga != null) {
            manga.setId(id);
            return mangaRepository.save(manga);
        } else {
            return null;
        }
    }

    public void deleteManga(Long id) {
        mangaRepository.deleteById(id);
    }
}