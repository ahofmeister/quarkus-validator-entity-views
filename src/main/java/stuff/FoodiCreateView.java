package stuff;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import javax.validation.constraints.NotNull;

/**
 * @author Alexander Hofmeister
 */
@EntityView(Foodi.class)
@CreatableEntityView
public interface FoodiCreateView {

  void setName(String name);

  @NotNull
  String getName();

  @IdMapping
  Long getId();

}
