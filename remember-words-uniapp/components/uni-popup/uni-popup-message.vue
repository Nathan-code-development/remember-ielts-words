<template>
	<view class="uni-popup-message" :class="'uni-popup__'+[type]">
		<text class="uni-popup-message-text" :class="'uni-popup__'+[type]+'-text'">{{message}}</text>
	</view>
</template>

<script>
	
	/**
	 * PopUp 弹出层-消息提示
	 * @description 弹出层-消息提示
	 * @tutorial https://ext.dcloud.net.cn/plugin?id=329
	 * @property {String} type = [success|warning|info|error] 主题样式
	 *  @value success 成功
	 * 	@value warning 提示
	 * 	@value info 消息
	 * 	@value error 错误
	 * @property {String} message 消息提示文字
	 * @property {String} duration 显示时间，设置为 0 则不会自动关闭
	 */
	
	export default {
		name: 'UniPopupMessage',
		props: {
			/**
			 * 主题 success/warning/info/error	  默认 success
			 */
			type: {
				type: String,
				default: 'success'
			},
			/**
			 * 消息文字
			 */
			message: {
				type: String,
				default: ''
			},
			/**
			 * 显示时间，设置为 0 则不会自动关闭
			 */
			duration: {
				type: Number,
				default: 3000
			}
		},
		inject: ['popup'],
		data() {
			return {}
		},
		created() {
			this.popup.childrenMsg = this
		},
		methods: {
			open() {
				if (this.duration === 0) return
				clearTimeout(this.popuptimer)
				this.popuptimer = setTimeout(() => {
					this.popup.close()
				}, this.duration)
			},
			close() {
				clearTimeout(this.popuptimer)
			}
		}
	}
</script>
<style lang="scss" scoped>
	.uni-popup-message {
		/* #ifndef APP-NVUE */
		display: flex;
		/* #endif */
		flex-direction: row;
		background-color: #e1f3d8;
		padding: 10px 15px;
		border-color: #eee;
		border-style: solid;
		border-width: 1px;
		text-align: center;
	}
	.uni-popup-message-text {
		font-size: 14px;
		padding: 0;
		margin: 0 auto;
	}

	.uni-popup__success {
		background-color: #e1f3d8;
	}

	.uni-popup__success-text {
		color: #67C23A;
	}

	.uni-popup__warn {
		background-color: #faecd8;
	}

	.uni-popup__warn-text {
		color: #E6A23C;
	}

	.uni-popup__error {
		background-color: #fde2e2;
	}

	.uni-popup__error-text {
		color: #F56C6C;
	}

	.uni-popup__info {
		background-color: #F2F6FC;
	}

	.uni-popup__info-text {
		color: #909399;
	}
</style>
