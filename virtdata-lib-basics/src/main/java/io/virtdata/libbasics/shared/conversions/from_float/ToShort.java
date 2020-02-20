package io.virtdata.libbasics.shared.conversions.from_float;

import io.virtdata.annotations.Categories;
import io.virtdata.annotations.Category;
import io.virtdata.annotations.ThreadSafeMapper;

import java.util.function.Function;

@ThreadSafeMapper
@Categories({Category.conversion})
public class ToShort implements Function<Float,Short> {

    private final int scale;
    public ToShort() {
        this.scale = Short.MAX_VALUE;
    }
    public ToShort(int modulo) {
        this.scale = modulo;
    }

    @Override
    public Short apply(Float input) {
        return (short)((input.longValue()) % scale);
    }
}
