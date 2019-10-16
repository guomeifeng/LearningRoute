/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author kelly
 */
public class StreamUtil {
    public static <T> Predicate<T> distinctByKeys(Function<? super T, ?>... keyExtractors)
    {
      final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();

      return t ->
      {
        final List<?> keys = Arrays.stream(keyExtractors)
                    .map(ke -> ke.apply(t))
                    .collect(Collectors.toList());

        return seen.putIfAbsent(keys, Boolean.TRUE) == null;
      };
    }
}
