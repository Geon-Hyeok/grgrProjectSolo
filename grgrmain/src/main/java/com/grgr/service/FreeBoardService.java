package com.grgr.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
 
import org.springframework.web.multipart.MultipartFile;

import com.grgr.dto.FreeBoard;
import com.grgr.exception.FileUploadFailException;
import com.grgr.exception.WriteNullException;
import com.grgr.util.SearchCondition;

public interface FreeBoardService {
	//�Խñ� �� ��ȸ
	int getFreeCount(SearchCondition searchCondition);
	//�Խñ� �߰�
	int addFreeBoard(FreeBoard freeBoard, List<MultipartFile> files)throws WriteNullException, FileUploadFailException, IOException;
	//�Խñ� ����
	void modifyFreeBoard(FreeBoard freeBoard);
	//�Խñ� ����
	void removeFreeBoard(int freeBno, int uno);
	//�Խñ� ���� ó��
	void hideFreeBoard(int freeBno);
//	int increaseFreeViewCnt(int freeBno);
//	int increaseFreeReportNo(int freeBno);
	//�Խñ� �� ��ȸ
	Map<String, Object> getFreeBoard(int freeBno);
	//���� �Խñ� ��ȣ ��ȸ
	Integer prevFreeBno(SearchCondition searchCondition, int freeBno);
	//���� �Խñ� ��ȣ ��ȸ
	Integer nextFreeBno(SearchCondition searchCondition, int freeBno);
	//�Խñ� ��� ��ȸ
	Map<String, Object> getFreeBoardList(SearchCondition searchCondition);
}
