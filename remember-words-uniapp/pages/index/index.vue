<template>
	<view class="content">
		<p class="title_p1">IELTS</p>
		<view class="box1" @click="ToListenAndSpeakWordList()">
			<p>听说单词列表</p>
		</view>
		<view class="box2" @click="ToListenAndReadWordList()">
			<p>听读单词列表</p>
		</view>
		<view class="box3" @click="ToListenAndSpeakWordMemorize()">
			<p>听说单词默写</p>
		</view>
		<view class="box4" @click="ToListenAndReadWordMemorize()">
			<p>听读单词默写</p>
		</view>
		<image src="../../static/iphone_background.jpg"></image>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello'
			}
		},
		onLoad() {
			
		},
		methods: {
			ToListenAndSpeakWordList(){
				uni.navigateTo({
					url: "/pages/speaking_and_listening_memory/select_unit_word/select_unit_word"
				});
			},
			ToListenAndSpeakWordMemorize(){
				uni.navigateTo({
					url: "/pages/speaking_and_listening_write/select_unit_word/select_unit_word"
				});
			},
			ToListenAndReadWordList(){
				uni.navigateTo({
					url: "/pages/speaking_and_reading_memory/select_unit_word/select_unit_word"
				});
			},
			ToListenAndReadWordMemorize(){
				uni.navigateTo({
					url: "/pages/speaking_and_reading_write/select_unit_word/select_unit_word"
				});
			}
		}
	}
</script>

<style>
	image{
		position: fixed;
		width: 100%;
		height: 100%;
		z-index: -1;
	}
	.title_p1{
		position: fixed;
		left: 25%;
		top: 10%;
		font-size: 150rpx;
		color: green;
	}
	.box1{
		position: fixed;
		text-align: center;
		width: 35%;
		top: 60%;
		left: 10%;
		height: 9%;
		background-color: aqua;
		font-size: 60rpx;
	}
	.box2{
		position: fixed;
		text-align: center;
		width: 35%;
		top: 60%;
		left: 55%;
		height: 9%;
		background-color: purple;
		font-size: 60rpx;
	}
	.box3{
		position: fixed;
		text-align: center;
		width: 35%;
		top: 80%;
		left: 10%;
		height: 9%;
		background-color: aqua;
		font-size: 60rpx;
	}
	.box4{
		position: fixed;
		text-align: center;
		width: 35%;
		top: 80%;
		left: 55%;
		height: 9%;
		background-color: purple;
		font-size: 60rpx;
	}
</style>
