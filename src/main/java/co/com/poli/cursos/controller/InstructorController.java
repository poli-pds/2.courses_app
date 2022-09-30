package co.com.poli.cursos.controller;

import co.com.poli.cursos.persistence.entity.Instructor;
import co.com.poli.cursos.services.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PostMapping
    public Instructor save(@RequestBody Instructor instructor) {
        return instructorService.save(instructor);
    }

    @GetMapping
    public List<Instructor> findAll() {
        return instructorService.findAll();
    }

}
