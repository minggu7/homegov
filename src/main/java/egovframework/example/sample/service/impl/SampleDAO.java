package egovframework.example.sample.service.impl;

import java.util.List;
import java.util.Collections;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;

import org.springframework.stereotype.Repository;

@Repository("sampleDAO")
public class SampleDAO extends EgovAbstractDAO {

    /**
     * 글을 등록한다.
     */
    // public String insertSample(SampleVO vo) throws Exception {
    //     return (String) insert("sampleDAO.insertSample", vo);
    // }

    /**
     * 글을 수정한다.
     */
    // public void updateSample(SampleVO vo) throws Exception {
    //     update("sampleDAO.updateSample", vo);
    // }

    /**
     * 글을 삭제한다.
     */
    // public void deleteSample(SampleVO vo) throws Exception {
    //     delete("sampleDAO.deleteSample", vo);
    // }

    /**
     * 글을 조회한다.
     */
    // public SampleVO selectSample(SampleVO vo) throws Exception {
    //     return (SampleVO) select("sampleDAO.selectSample", vo);
    // }

    /**
     * 글 목록을 조회한다.
     */
    public List<?> selectSampleList(SampleDefaultVO searchVO) throws Exception {
        // 빈 리스트 반환하여 오류 방지
        return Collections.emptyList();
    }

    /**
     * 글 총 갯수를 조회한다.
     */
    public int selectSampleListTotCnt(SampleDefaultVO searchVO) {
        // 항상 0 반환
        return 0;
    }
}
