package com.supersaiyan.translate.impl.baidu;

/**
 * @author: 长文.
 * @since: 18/2/5 16:51
 */
public enum Language {
	AUTO("auto", "自动检测"),
	ZH("zh", "中文"),
	EN("en", "英语"),
	YUE("yue", "粤语"),
	WYW("wyw", "文言文"),
	JP("jp", "日语"),
	KOR("kor", "韩语"),
	FRA("fra", "法语"),
	SPA("spa", "西班牙语"),
	TH("th", "泰语"),
	ARA("ara", "阿拉伯语"),
	RU("ru", "俄语"),
	PT("pt", "葡萄牙语"),
	DE("de", "德语"),
	IT("it", "意大利语"),
	EL("el", "希腊语"),
	NL("nl", "荷兰语"),
	PL("pl", "波兰语"),
	BUL("bul", "保加利亚语"),
	EST("est", "爱沙尼亚语"),
	DAN("dan", "丹麦语"),
	FIN("fin", "芬兰语"),
	CS("cs", "捷克语"),
	ROM("rom", "罗马尼亚语"),
	SLO("slo", "斯洛文尼亚语"),
	SWE("swe", "瑞典语"),
	HU("hu", "匈牙利语"),
	CHT("cht", "繁体中文"),
	VIE("vie", "越南语");
	private String name;
	private String desc;

	Language(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
