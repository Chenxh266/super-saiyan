package com.cxh.supersaiyan.web.translate;

import com.supersaiyan.translate.api.BaseTranslator;
import com.supersaiyan.translate.impl.baidu.BaiduTranslatorImpl;
import com.supersaiyan.translate.impl.baidu.Language;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 长文.
 * @since: 18/2/5 16:46
 */
@Controller
@RequestMapping(value = "/trans")
@Slf4j
public class TsltController {
	private BaseTranslator baiduTrans = new BaiduTranslatorImpl();

	@RequestMapping(value = "/general")
	@ResponseBody
	public Object general(String q, String from, String to) {
		return baiduTrans.handle(q, from, to);
	}


	@RequestMapping(value = "/japan")
	@ResponseBody
	public Object general(String q) {
		return baiduTrans.handle(q, Language.JP.getName(), Language.ZH.getName());
	}
}
