package kr.hs.study.myBatisPrj.mapper;

import kr.hs.study.myBatisPrj.dto.memoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface memoDAO {
    public void insert(memoDTO dto);
    public List<memoDTO> list();
    public memoDTO listOne(int idx);
    public void update(memoDTO dto);

    public void delete(int idx);
}
