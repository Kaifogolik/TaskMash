package may.code.api.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import may.code.api.dto.ProjectDto;
import may.code.api.exceptions.BadRequestException;
import may.code.api.factories.ProjectDtoFactory;
import may.code.store.repositories.ProjectRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Transactional
@RestController
public class ProjectController {

    ProjectDtoFactory projectDtoFactory;
    ProjectRepository projectRepository;

    public static final String CREATE_PROJECT = "/api/projects";

    @PostMapping(CREATE_PROJECT)
    public ProjectDto createProject(@RequestParam String name) {

        projectRepository
                .findByName(name)
                .ifPresent(project -> {
                    throw new BadRequestException(String.format("Project \"%s\" alredy exists.", name));
                });

        ProjectRepository project =

        //TODO: insert entity in metod and uncomit
        //return projectDtoFactory.makeProjectDto();
        return null;

    }

}
