package com.project.finalpoint;

import com.project.finalpoint.mapper.BookMapper;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class FinalPointApplicationTests {
	@Autowired
	private BookMapper bookMapper;
	@Test
	void contextLoads() {
		String prefix="https://book-picture-finalpoint.oss-cn-hangzhou.aliyuncs.com/book-picture-finalpoint/";
		List<String> urlList= Lists.newArrayList("150.webp","151.webp","152.webp","153.webp","154.webp");
		for(int i=1;i<6;++i) {
			bookMapper.updateBookPicUrl(prefix+urlList.get(i-1),i);
		}
	}

}
