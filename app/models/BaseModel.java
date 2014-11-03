package models;

import javax.persistence.*;
import play.db.ebean.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public abstract class BaseModel extends Model {

	@Id
	public int id ;
}
