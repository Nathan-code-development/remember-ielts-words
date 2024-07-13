var ip = uni.getStorageSync('serverIp');
var baseUrl = 'http://'+ip;

export default{
	SERVER_BASE: baseUrl,
	//引导页
	GET_GUIDE_IMG: baseUrl + '/userinfo/rotation/lists',
	//登录
	USER_LOGIN: baseUrl + '/prod-api/api/login',
	//注册
	USER_REGISTER: baseUrl + '/prod-api/api/register',
	//首页轮播图
	HOME_ROTATION: baseUrl + '/prod-api/api/rotation/list',
	//查询专题新闻列表
	GET_TOPIC_LIST: baseUrl + '/prod-api/press/press/list',
	//首页新闻分类
	HOME_NEWS_CATEGORY: baseUrl + '/prod-api/press/category/list',
	//首页新闻列表
	HOME_NEWS_LIST: baseUrl + '/prod-api/press/press/list',
	//首页推荐服务(全部服务)
	HOME_SERVICE: baseUrl + '/prod-api/api/service/list',
	//查询个人信息
	GET_USER_INFO: baseUrl + '/prod-api/api/common/user/getInfo',
	//新闻详情
	NEWS_DETIAILS: baseUrl +'/prod-api/press/press',
	//查询新闻评论列表
	GET_COMMENTS: baseUrl +'/prod-api/press/comments/list',
	//新增评论
	ADD_COMMENTS: baseUrl +'/prod-api/press/pressComment',
	//修改个人信息
	RESET_USERINFO: baseUrl + '/prod-api/api/common/user',
	//修改密码
	RESET_PASSWORD: baseUrl +'/prod-api/api/common/user/resetPwd',
	//意见反馈
	ADD_FEEDBACK: baseUrl +'/prod-api/api/common/feedback',
	//我的订单列表
	GET_ORDER_LIST: baseUrl +'/prod-api/api/bus/order/list',
	//查询订单详情
	GET_ORDER_DETAILS: baseUrl +'/prod-api/userinfo/orders/',
	//地铁线路查询
	GET_METRO_LIST: baseUrl +'/prod-api/api/metro/list',
	//查询地铁线路详情
	GET_ROUTE_DETAILS: baseUrl +'/prod-api/api/metro/line/',
	//获取地铁总览图
	GET_METRO_OVERVIEW: baseUrl +'/prod-api/api/metro/city',
	//查询公交路线
	GET_BUS_ROUTES: baseUrl +'/prod-api/api/bus/line/list',
	//查询公交路线基本信息
	GET_BUSLINE_INFO: baseUrl + '/prod-api/api/bus/line/',
	//查询公交路线站点信息
	GET_BUSSTOP_LIST: baseUrl + '/prod-api/api/bus/stop/list',
	//新增巴士订单
	ADD_BUS_ORDER: baseUrl + '/prod-api/api/bus/order',
	//查询公交订单列表
	GET_BUS_ORDERS: baseUrl + '/prod-api/api/bus/order/list',
	//巴士订单支付
	BUS_ORDER_PAY: baseUrl + '/prod-api/api/bus/pay',
	//查询门诊预约首页医院列表
	GET_HOSPITAL_LIST: baseUrl + '/prod-api/api/hospital/hospital/list',
	//查询医院详情
	GET_HOSPITAL_DETAILS: baseUrl + '/prod-api/api/hospital/hospital/',
	//查询医院详情轮播图
	GET_HOSPDTL_ROTATIONS: baseUrl + '/prod-api/api/hospital/banner/list',
	//查询当前用户下的就诊人卡片
	GET_PATIENT_LIST: baseUrl + '/prod-api/api/hospital/patient/list',
	//修改或新增就诊人信息(POST:新增，PUT:修改)
	RESET_PATIENT_INFO: baseUrl + '/prod-api/api/hospital/patient',
	//查询挂号科室列表（注：did:1为专家 2为普通）
	GET_DEPART_LIST: baseUrl + '/prod-api/api/hospital/category/list',
	//门诊预约生成预约单
	CREATE_APPOINT_ORDER: baseUrl + '/prod-api/api/hospital',
	//查询用户预约列表
	GET_APPOINT_LIST: baseUrl + '/prod-api/api/hospital/reservation/list',
	//查询违章情况
	GET_ILLEGAL_LIST: baseUrl + '/prod-api/api/traffic/illegal/list',
	//查询违章详情
	GET_ILLEGAL_DETAILS: baseUrl + '/prod-api/api/traffic/illegal/',
	//查询停车场列表
	GET_PARK_LIST: baseUrl + '/prod-api/api/park/lot/list',
	//查询停车场详情
	GET_PARK_DETAILS: baseUrl + '/prod-api/api/park/lot/',
	//查询停车记录
	GET_PARK_RECORD: baseUrl + '/prod-api/api/park/lot/record/list',
	//查询用户生活缴费信息
	GET_LIVE_DETAILS: baseUrl +'/prod-api/userinfo/householder',
	//查询用户缴费详情
	GET_LIVE_ELECTRICITY:baseUrl +'/prod-api/userinfo/electricity/list',
	//充值电费/水费
	GET_LIVE_PAYFEES:baseUrl +'/prod-api/userinfo/householder',
	//查询缴费类型列表
	GET_LIVES_LIST: baseUrl +'/prod-api/userinfo/feeslist/list',
	//查询缴费账单
	GET_LIVES_BILL: baseUrl +'/prod-api/api/living/bill',
	//添加分组
	CREATE_LIVE_TYPENAME:baseUrl +'/prod-api/userinfo/payObjects',
	//添加缴费类型
	CREATE_LIVE_RELATION:baseUrl +'/prod-api/userinfo/relations',
	//根据身份证号查询缴费编号
	GET_LIVING_ACCOUNT: baseUrl + '/prod-api/api/living/account/list',
	//缴费接口
	LIVING_RECHARGE: baseUrl + '/prod-api/api/living/recharge',
	//缴费记录
	GET_RECHARGE_RECORD:  baseUrl + '/prod-api/api/living/recharge/record/list',
	//通用上传接口
	COMMON_UPLOAD: baseUrl + '/prod-api/common/upload',
	//查询职位列表
	GET_PROFESSION_LIST: baseUrl + '/prod-api/api/job/profession/list',
	//查询招聘列表
	GET_POST_LIST: baseUrl + '/prod-api/api/job/post/list',
	//查询招聘详情
	GET_POST_DETAIL: baseUrl + '/prod-api/api/job/post/',
	//查询公司详情
	GET_COMPANY_DETAIL: baseUrl + '/prod-api/api/job/company/',
	//投递简历
	DELIVER_RESUME: baseUrl + '/prod-api/api/job/deliver',
	//查询投递历史
	GET_DELIVER_LIST: baseUrl + '/prod-api/api/job/deliver/list',
	//查询简历详情
	GET_RESUME_DETAIL: baseUrl + '/prod-api/api/job/resume/queryResumeByUserId/',
	//新增（POST）/修改（PUT）个人简历
	ADD_EDIT_RESUME: baseUrl + '/prod-api/api/job/resume'
}