package com.supersaiyan.translate.impl.baidu;

import com.supersaiyan.translate.api.BaseTranslator;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: 长文.
 * @since: 18/2/4 22:19
 */
@Slf4j
public class BaiduTranslatorImpl implements BaseTranslator {
	private TransApi transApi = new TransApi();

	@Override
	public String handle(String input, String from, String to) {
		return transApi.getTransResult(input, from, to);
	}
}
