package stuff;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;

/**
 * @author Alexander Hofmeister
 */
@EntityView(Foodi.class)
@CreatableEntityView
public interface FoodiCreateView {

  void setName(String name);

  String getName();

  @IdMapping
  Long getId();

}
