<template>
	<view>
		<p>单元选择</p>
		<button class="btn1" @click="ToWordList(1)">1</button>
		<button class="btn2" @click="ToWordList(2)">2</button>
		<button class="btn3" @click="ToWordList(3)">3</button>
		<button class="btn4" @click="ToWordList(4)">4</button>
		<button class="btn5" @click="ToWordList(5)">5</button>
		<button class="btn6" @click="ToWordList(6)">6</button>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				
			}
		},
		methods: {
			ToWordList(index){
				uni.navigateTo({
					url: "/pages/speaking_and_listening_memory/word_list/word_list?unit="+index
				});
			}
		}
	}
</script>

<style>
	p{
		position: fixed;
		top: 12%;
		left: 23%;
		text-align: center;
		font-size: 100rpx;
		color: green;
	}
	.btn1{
		position: fixed;
		width: 20%;
		height: 10%;
		font-size: 65rpx;
		left: 20%;
		top: 25%;
		background-color: aqua;
	}
	.btn2{
		position: fixed;
		width: 20%;
		height: 10%;
		font-size: 65rpx;
		left: 60%;
		top: 25%;
		background-color: aqua;
	}
	.btn3{
		position: fixed;
		width: 20%;
		height: 10%;
		font-size: 65rpx;
		left: 20%;
		top: 40%;
		background-color: aqua;
	}
	.btn4{
		position: fixed;
		width: 20%;
		height: 10%;
		font-size: 65rpx;
		left: 60%;
		top: 40%;
		background-color: aqua;
	}
	.btn5{
		position: fixed;
		width: 20%;
		height: 10%;
		font-size: 65rpx;
		left: 20%;
		top: 55%;
		background-color: aqua;
	}
	.btn6{
		position: fixed;
		width: 20%;
		height: 10%;
		font-size: 65rpx;
		left: 60%;
		top: 55%;
		background-color: aqua;
	}
</style>
