package may.code.api.factories;

import lombok.NonNull;
import may.code.api.dto.ProjectDto;
import may.code.api.dto.TaskStateDto;
import may.code.store.entities.ProjectEntity;
import may.code.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .ordinal(entity.getOrdinal())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
