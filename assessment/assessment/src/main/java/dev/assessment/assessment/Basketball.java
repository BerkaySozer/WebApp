package dev.assessment.assessment;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "matches")
public class Basketball {
    private ObjectId Id;
    private String homeTeam;
    private String awayTeam;
    private String Date;

}
