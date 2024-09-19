package may.code.api.factories;

import may.code.api.dto.ProjectDto;
import may.code.api.dto.TaskDto;
import may.code.store.entities.ProjectEntity;
import may.code.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity) {

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
