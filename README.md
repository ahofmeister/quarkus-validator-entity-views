To reproduce the issue:

1. `mvn quarkus:dev`
2. `postFoodiAsEntity.sh`
3. `postFoodiAsView.sh`

You can see, that within 2. Hibernate complains about the missing `name`. I would expect the same behaviour with 3, but
instead a NPE occurs.
