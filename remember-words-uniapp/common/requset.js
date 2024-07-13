export default {
	get(url,data) {
		let token =  uni.getStorageSync('token');
		
		return new Promise((resolve, reject) => {
			uni.request({
				method: 'GET',
				url: url,
				data: data,
				header: {
					'authorization': token
				},
				dataType: 'json',
				success: (res) => {
					if(res.data.code == 401){
						uni.removeStorageSync('token');
						uni.showModal({
						    title: '提示',
						    content: '登录认证已过期，请重新登录！',
						    success: function (res) {
						        if (res.confirm) {
									uni.navigateTo({
										url: '/pages/login/index'
									})
						        } else if (res.cancel) {
						            console.log('用户点击取消');
						        }
						     }
						});
						
					}
					resolve(res.data);
				},
				fail: (err) => {
					uni.showToast({
						title:"接口请求失败",
						icon: 'none'
					})
					reject(err)
				}
			})
		});
	},
	post(url,data) {
		let token =  uni.getStorageSync('token');
		return new Promise((resolve, reject) => {
			uni.request({
				method: 'POST',
				url: url,
				data: data,
				header: {
					'content-type': 'application/json',
					'authorization': token
				},
				dataType: 'json',
				success: (res) => {
					if(res.data.code == 401){
						uni.removeStorageSync('token');
						uni.showModal({
						    title: '提示',
						    content: '登录认证已过期，请重新登录！',
						    success: function (res) {
						        if (res.confirm) {
									uni.navigateTo({
										url: '/pages/login/index'
									})
						        } else if (res.cancel) {
						            console.log('用户点击取消');
						        }
						     }
						});
						
					}
					resolve(res.data)
				},
				fail: (err) => {
					uni.showToast({
						title:"接口请求失败",
						icon: 'none'
					})
					reject(err)
				}
			})
		});
	},
	put(url,data) {
		let token =  uni.getStorageSync('token');
		
		return new Promise((resolve, reject) => {
			uni.request({
				method: 'PUT',
				url: url,
				data: data,
				header: {
					'content-type': 'application/json',
					'authorization': token
				},
				dataType: 'json',
				success: (res) => {
					if(res.data.code == 401){
						uni.removeStorageSync('token');
						uni.showModal({
						    title: '提示',
						    content: '登录认证已过期，请重新登录！',
						    success: function (res) {
						        if (res.confirm) {
									uni.navigateTo({
										url: '/pages/login/index'
									})
						        } else if (res.cancel) {
						            console.log('用户点击取消');
						        }
						     }
						});
						
					}
					resolve(res.data)
				},
				fail: (err) => {
					uni.showToast({
						title:"接口请求失败",
						icon: 'none'
					})
					reject(err)
				}
			})
		});
	}
}