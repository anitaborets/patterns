package org.example.MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository activityRepository;
    public List<ActivityModel> getAll() {
        return activityRepository.getAll();
    }
}
