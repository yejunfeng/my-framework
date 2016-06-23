package test.IDao;

import test.domain.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}