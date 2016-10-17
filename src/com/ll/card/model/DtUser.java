package com.ll.card.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * 浜哄憳瀹炰綋绫�(dt_user琛�)
 * 
 * @date 2016-03-16
 * */
public class DtUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long userSerial;// 浜哄憳搴忓彿
	private String userNo;// 浜哄憳宸ュ彿
	private String userLname;// 濮撳悕
	private String userFname;// 鐝粍
	private String depNo;// 閮ㄩ棬缂栧彿
	private Integer userDep;// 閮ㄩ棬搴忓彿
	private String userDepname;// 閮ㄩ棬鍚嶇О
	private Date userWorkday;// 宸ヤ綔鏃ユ湡
	private String userDuty;// 鑱屽姟
	private String userCard;// 鏈�鍚庝娇鐢ㄧ殑鍗＄墖鐗╃悊鍙�
	private String userFinger;// 鎸囩汗
	private String userPassword;// 瀵嗙爜
	private Integer userLevel;// 鏄惁绠＄悊鑰冨嫟鏈�
	private Integer userPhoto;
	private String userSex;
	private String userNation;
	private String userXueli;
	private String userNative;
	private String userId;// 韬唤璇佸彿
	private String userPost;
	private String userLinkman;
	private String userTelephone;
	private String userAddress;
	private String userEmail;
	private String user1;
	private String user2;
	private String userBz;
	private String kqRule;// 鑰冨嫟瑙勫垯
	private String kqTaoban;// 鑷姩濂楃彮鐝閫夋嫨
	private Integer kqTiaoxiu;// 鍙敤璋冧紤鏃堕棿
	private Integer xfJiange;// 娑堣垂闂撮殧
	private Integer xfJe;// 璐︽埛閲戦
	private String userRank;
	private Integer glyImg;
	private Integer userAc;
	private String userGsbh;
	private String userYglx;
	private String userZhbh;
	private String userZhlx;
	private String userTxm;
	private Integer userLx;
	private Integer userMj;
	private String oldUserPassword;
	private java.sql.Date deadline;
	/**
	 * 鍗＄墖鍏宠仈灞炴��
	 * */
	private Integer cardXh;// 鍗＄墖搴忓彿
	private String cardHao;// 鍗＄墖鐗╃悊鍙�
	private String cardSerial;// 鍗＄墖椤哄簭鍙�(閫昏緫鍙�)
	private Integer cardLx;// 鍗＄墖绫诲瀷
	private String ttName;// 鍗＄墖绫诲瀷鍚嶇О
	private Integer cardType;// 鍗＄墖鐘舵��
	private Integer cardLossCount;// 鍗＄墖鎸傚け娆℃暟
	private String cardBz;// 鎸傚け鍘熷洜銆佸娉�
	/**
	 * 瑙掕壊鍏宠仈灞炴��
	 * */
	private Integer roleId;// 瑙掕壊鏍囪瘑(涓婚敭)
	private String roleName;// 瑙掕壊鍚嶇О
	/**
	 * 璐︽埛绫诲瀷鍏宠仈灞炴��
	 * */
	private String acBh;// 璐︽埛缂栧彿
	private String acName;// 璐︽埛鍚嶇О
	private Integer passMax;// 瀵嗙爜鐘舵��
	private String acPass;// 璐︽埛瀵嗙爜
	/**
	 * 妗ｆ绫诲瀷鍏宠仈灞炴��
	 * */
	private String userTypeName;// 鐘舵�佸悕绉�(妗ｆ绫诲瀷鍚嶇О)
	/**
	 * 鍖昏嵂鍏宠仈灞炴��
	 * */
	private Integer medMoney;// 鍖昏嵂鍓╀綑閲戦
	/**
	 * 鍏朵粬灞炴��
	 * */
	private String ip;
	private String glyNo;

	/** 鍒濆鍖栧憳宸ヨ褰曚娇鐢ㄧ殑瀛楁 */
	private Integer id;
	/** 鍏徃鐨勭紪鍙� */
	private Integer companySerial;
	/** 鍏徃鍚嶇О */
	private String company;
	private String privilege1;
	/** 鏄惁绾ц仈鏌ヨ */
	private Boolean all;
	private Integer openCard;
	private Set<Long> userDeps;
	/** 鍚屾鏃剁殑HR搴撲腑鍛樺伐鎵�灞炰簩绾ф垨涓夌骇鍏徃 */
	private String mainCompany;
	/** 鍚屾鏃剁殑HR搴撲腑鍛樺伐鎵�灞炰簩绾ф垨涓夌骇鍏徃鐨勯儴闂� */
	private String mainDepname;
	private Integer userOrder;

	/**
	 * 鐧藉悕鍗曞憳宸ユ煡璇�
	 * */
	private List<Long> depSerials;
	private List<Integer> userTypes;
	/** 1.琛ㄧず鏄櫧鍚嶅崟鏌ヨ锛岀敤浜庡拷鐣ユ槸鍚﹀紑鍙戞潯浠� */
	private Integer whiteList;

	private String pinyin;

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public Integer getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(Integer userOrder) {
		this.userOrder = userOrder;
	}

	public java.sql.Date getDeadline() {
		return deadline;
	}

	public void setDeadline(java.sql.Date deadline) {
		this.deadline = deadline;
	}

	public Integer getWhiteList() {
		return whiteList;
	}

	public void setWhiteList(Integer whiteList) {
		this.whiteList = whiteList;
	}

	public List<Long> getDepSerials() {
		return depSerials;
	}

	public void setDepSerials(List<Long> depSerials) {
		this.depSerials = depSerials;
	}

	public List<Integer> getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(List<Integer> userTypes) {
		this.userTypes = userTypes;
	}

	public String getMainCompany() {
		return mainCompany;
	}

	public void setMainCompany(String mainCompany) {
		this.mainCompany = mainCompany;
	}

	public String getMainDepname() {
		return mainDepname;
	}

	public void setMainDepname(String mainDepname) {
		this.mainDepname = mainDepname;
	}

	public Set<Long> getUserDeps() {
		return userDeps;
	}

	public void setUserDeps(Set<Long> userDeps) {
		this.userDeps = userDeps;
	}

	public Integer getOpenCard() {
		return openCard;
	}

	public void setOpenCard(Integer openCard) {
		this.openCard = openCard;
	}

	public Boolean getAll() {
		return all;
	}

	public void setAll(Boolean all) {
		this.all = all;
	}

	/** 妤煎眰闂ㄧ鏉冮檺 */
	private int mj;

	public int getMj() {
		return mj;
	}

	public void setMj(int mj) {
		this.mj = mj;
	}

	public String getPrivilege1() {
		return privilege1;
	}

	public void setPrivilege1(String privilege1) {
		this.privilege1 = privilege1;
	}

	public Integer getCompanySerial() {
		return companySerial;
	}

	public void setCompanySerial(Integer companySerial) {
		this.companySerial = companySerial;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName == null ? null : userTypeName.trim();
	}

	public Long getUserSerial() {
		return userSerial;
	}

	public void setUserSerial(Long userSerial) {
		this.userSerial = userSerial;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo == null ? null : userNo.trim();
	}

	public String getUserLname() {
		return userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname == null ? null : userLname.trim();
	}

	public String getUserFname() {
		return userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname == null ? null : userFname.trim();
	}

	public String getDepNo() {
		return depNo;
	}

	public void setDepNo(String depNo) {
		this.depNo = depNo == null ? null : depNo.trim();
	}

	public Integer getUserDep() {
		return userDep;
	}

	public void setUserDep(Integer userDep) {
		this.userDep = userDep;
	}

	public String getUserDepname() {
		return userDepname;
	}

	public void setUserDepname(String userDepname) {
		this.userDepname = userDepname == null ? null : userDepname.trim();
	}

	public Date getUserWorkday() {
		return userWorkday;
	}

	public void setUserWorkday(Date userWorkday) {
		this.userWorkday = userWorkday;
	}

	public String getUserDuty() {
		return userDuty;
	}

	public void setUserDuty(String userDuty) {
		this.userDuty = userDuty == null ? null : userDuty.trim();
	}

	public String getUserCard() {
		return userCard;
	}

	public void setUserCard(String userCard) {
		this.userCard = userCard == null ? null : userCard.trim();
	}

	public String getUserFinger() {
		return userFinger;
	}

	public void setUserFinger(String userFinger) {
		this.userFinger = userFinger == null ? null : userFinger.trim();
	}

	public String getUserPassword() {
		return (userPassword == null) ? null : userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public Integer getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(Integer userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex == null ? null : userSex.trim();
	}

	public String getUserNation() {
		return userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation == null ? null : userNation.trim();
	}

	public String getUserXueli() {
		return userXueli;
	}

	public void setUserXueli(String userXueli) {
		this.userXueli = userXueli == null ? null : userXueli.trim();
	}

	public String getUserNative() {
		return userNative;
	}

	public void setUserNative(String userNative) {
		this.userNative = userNative == null ? null : userNative.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getUserPost() {
		return userPost;
	}

	public void setUserPost(String userPost) {
		this.userPost = userPost == null ? null : userPost.trim();
	}

	public String getUserLinkman() {
		return userLinkman;
	}

	public void setUserLinkman(String userLinkman) {
		this.userLinkman = userLinkman == null ? null : userLinkman.trim();
	}

	public String getUserTelephone() {
		return userTelephone;
	}

	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone == null ? null : userTelephone
				.trim();
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress == null ? null : userAddress.trim();
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	public String getUser1() {
		return user1;
	}

	public void setUser1(String user1) {
		this.user1 = user1 == null ? null : user1.trim();
	}

	public String getUser2() {
		return user2;
	}

	public void setUser2(String user2) {
		this.user2 = user2 == null ? null : user2.trim();
	}

	public String getUserBz() {
		return userBz;
	}

	public void setUserBz(String userBz) {
		this.userBz = userBz == null ? null : userBz.trim();
	}

	public String getKqRule() {
		return kqRule;
	}

	public void setKqRule(String kqRule) {
		this.kqRule = kqRule == null ? null : kqRule.trim();
	}

	public String getKqTaoban() {
		return kqTaoban;
	}

	public void setKqTaoban(String kqTaoban) {
		this.kqTaoban = kqTaoban == null ? null : kqTaoban.trim();
	}

	public Integer getKqTiaoxiu() {
		return kqTiaoxiu;
	}

	public void setKqTiaoxiu(Integer kqTiaoxiu) {
		this.kqTiaoxiu = kqTiaoxiu;
	}

	public Integer getXfJiange() {
		return xfJiange;
	}

	public void setXfJiange(Integer xfJiange) {
		this.xfJiange = xfJiange;
	}

	public Integer getXfJe() {
		return xfJe;
	}

	public void setXfJe(Integer xfJe) {
		this.xfJe = xfJe;
	}

	public String getUserRank() {
		return userRank;
	}

	public void setUserRank(String userRank) {
		this.userRank = userRank == null ? null : userRank.trim();
	}

	public Integer getGlyImg() {
		return glyImg;
	}

	public void setGlyImg(Integer glyImg) {
		this.glyImg = glyImg;
	}

	public Integer getUserAc() {
		return userAc;
	}

	public void setUserAc(Integer userAc) {
		this.userAc = userAc;
	}

	public String getUserGsbh() {
		return userGsbh;
	}

	public void setUserGsbh(String userGsbh) {
		this.userGsbh = userGsbh == null ? null : userGsbh.trim();
	}

	public String getUserYglx() {
		return userYglx;
	}

	public void setUserYglx(String userYglx) {
		this.userYglx = userYglx == null ? null : userYglx.trim();
	}

	public String getUserZhbh() {
		return userZhbh;
	}

	public void setUserZhbh(String userZhbh) {
		this.userZhbh = userZhbh == null ? null : userZhbh.trim();
	}

	public String getUserZhlx() {
		return userZhlx;
	}

	public void setUserZhlx(String userZhlx) {
		this.userZhlx = userZhlx == null ? null : userZhlx.trim();
	}

	public String getUserTxm() {
		return userTxm;
	}

	public void setUserTxm(String userTxm) {
		this.userTxm = userTxm == null ? null : userTxm.trim();
	}

	public Integer getUserLx() {
		return userLx;
	}

	public void setUserLx(Integer userLx) {
		this.userLx = userLx;
	}

	public Integer getUserMj() {
		return userMj;
	}

	public void setUserMj(Integer userMj) {
		this.userMj = userMj;
	}

	public String getCardSerial() {
		return cardSerial;
	}

	public void setCardSerial(String cardSerial) {
		this.cardSerial = cardSerial == null ? null : cardSerial.trim();
	}

	public String getCardHao() {
		return cardHao;
	}

	public void setCardHao(String cardHao) {
		this.cardHao = cardHao == null ? null : cardHao.trim();
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public String getCardBz() {
		return cardBz;
	}

	public void setCardBz(String cardBz) {
		this.cardBz = cardBz == null ? null : cardBz.trim();
	}

	public Integer getCardXh() {
		return cardXh;
	}

	public void setCardXh(Integer cardXh) {
		this.cardXh = cardXh;
	}

	public Integer getCardLx() {
		return cardLx;
	}

	public void setCardLx(Integer cardLx) {
		this.cardLx = cardLx;
	}

	public String getTtName() {
		return ttName;
	}

	public void setTtName(String ttName) {
		this.ttName = ttName == null ? null : ttName.trim();
	}

	public String getAcBh() {
		return acBh;
	}

	public void setAcBh(String acBh) {
		this.acBh = acBh == null ? null : acBh.trim();
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName == null ? null : acName.trim();
	}

	public Integer getPassMax() {
		return passMax;
	}

	public void setPassMax(Integer passMax) {
		this.passMax = passMax;
	}

	public String getAcPass() {
		return acPass;
	}

	public void setAcPass(String acPass) {
		this.acPass = acPass == null ? null : acPass.trim();
	}

	public Integer getCardLossCount() {
		return cardLossCount;
	}

	public void setCardLossCount(Integer cardLossCount) {
		this.cardLossCount = cardLossCount;
	}

	public Integer getMedMoney() {
		return medMoney;
	}

	public void setMedMoney(Integer medMoney) {
		this.medMoney = medMoney;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	public String getGlyNo() {
		return glyNo;
	}

	public void setGlyNo(String glyNo) {
		this.glyNo = glyNo == null ? null : glyNo.trim();
	}

	public String getOldUserPassword() {
		return oldUserPassword;
	}

	public void setOldUserPassword(String oldUserPassword) {
		this.oldUserPassword = oldUserPassword;
	}

	@Override
	public String toString() {
		return "DtUser [userSerial=" + userSerial + ", userNo=" + userNo
				+ ", userLname=" + userLname + ", userFname=" + userFname
				+ ", depNo=" + depNo + ", userDep=" + userDep
				+ ", userDepname=" + userDepname + ", userWorkday="
				+ userWorkday + ", userDuty=" + userDuty + ", userCard="
				+ userCard + ", userFinger=" + userFinger + ", userPassword="
				+ userPassword + ", userLevel=" + userLevel + ", userPhoto="
				+ userPhoto + ", userSex=" + userSex + ", userNation="
				+ userNation + ", userXueli=" + userXueli + ", userNative="
				+ userNative + ", userId=" + userId + ", userPost=" + userPost
				+ ", userLinkman=" + userLinkman + ", userTelephone="
				+ userTelephone + ", userAddress=" + userAddress
				+ ", userEmail=" + userEmail + ", user1=" + user1 + ", user2="
				+ user2 + ", userBz=" + userBz + ", kqRule=" + kqRule
				+ ", kqTaoban=" + kqTaoban + ", kqTiaoxiu=" + kqTiaoxiu
				+ ", xfJiange=" + xfJiange + ", xfJe=" + xfJe + ", userRank="
				+ userRank + ", glyImg=" + glyImg + ", userAc=" + userAc
				+ ", userGsbh=" + userGsbh + ", userYglx=" + userYglx
				+ ", userZhbh=" + userZhbh + ", userZhlx=" + userZhlx
				+ ", userTxm=" + userTxm + ", userLx=" + userLx + ", userMj="
				+ userMj + ", oldUserPassword=" + oldUserPassword
				+ ", deadline=" + deadline + ", cardXh=" + cardXh
				+ ", cardHao=" + cardHao + ", cardSerial=" + cardSerial
				+ ", cardLx=" + cardLx + ", ttName=" + ttName + ", cardType="
				+ cardType + ", cardLossCount=" + cardLossCount + ", cardBz="
				+ cardBz + ", roleId=" + roleId + ", roleName=" + roleName
				+ ", acBh=" + acBh + ", acName=" + acName + ", passMax="
				+ passMax + ", acPass=" + acPass + ", userTypeName="
				+ userTypeName + ", medMoney=" + medMoney + ", ip=" + ip
				+ ", glyNo=" + glyNo + ", id=" + id + ", companySerial="
				+ companySerial + ", company=" + company + ", privilege1="
				+ privilege1 + ", all=" + all + ", openCard=" + openCard
				+ ", userDeps=" + userDeps + ", mainCompany=" + mainCompany
				+ ", mainDepname=" + mainDepname + ", userOrder=" + userOrder
				+ ", depSerials=" + depSerials + ", userTypes=" + userTypes
				+ ", whiteList=" + whiteList + ", pinyin=" + pinyin + ", mj="
				+ mj + ", loginid=" + loginid + ", sn=" + sn + ", cname="
				+ cname + ", password=" + password + ", uuaccountstatus="
				+ uuaccountstatus + "]";
	}

	/*
	 * 鐧诲綍瀛楁 鍛樺伐鍙穝n鍏宠仈dt_user user_no
	 */
	private String loginid;// 璐﹀彿
	private String sn;// 鍛樺伐鍙�
	private String cname;// 涓枃鍚�
	private String password;// 瀵嗙爜
	private String uuaccountstatus;// ESB鎺ㄩ�佷汉鍛樼姸鎬� 1鎸傝捣 0 姝ｅ父

	public String getUuaccountstatus() {
		return uuaccountstatus;
	}

	public void setUuaccountstatus(String uuaccountstatus) {
		this.uuaccountstatus = uuaccountstatus;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}