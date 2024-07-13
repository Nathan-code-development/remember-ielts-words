<template>
	<view>
		<p class="title">听说单词默写</p>
		<p id="word-answer" ref="wordAnswer" @input="changeTextColor" :style="{'font-size': textAnswerSize + 'px', 'color': textAnswerColor}">{{textAnswerContent}}</p>
		<textarea name="textarea1" id="edit" cols="30" rows="1" ref="edit" placeholder="请输入单词" @input="getValue" v-model="textarea_value"></textarea>
		<p class="word-means" id="wd-mean" ref="WdMean" @input="getTextWordMeans">{{textWordMeans}}</p>
		<view class="Btn1" @click="isCorrectWord()">
			<p>确定</p>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				getWord: [],
				getWordMeans: [],
				index: 0,
				unit_number : 0,
				textarea_value: "",
				textAnswerSize: 35,
				textAnswerColor: "green",
				textAnswerContent: "",
				textWordMeans: ""
			}
		},
		onLoad: function(option){
			this.unit_number = option.unit;
			this.getData();
		},
		methods: {
			getValue:function(e){
				this.textarea_value = e.detail.value;
			},
			getData(){
				uni.request({
					url: "http://121.40.144.4:857/WordLesson"+this.unit_number+"/findAll",
					method: "GET",
					header: {
					    'content-type':'application/x-www-form-urlencoded'
					},
					success: (res) => {
						for(var i = 0; i < res.data.data.length; i++){
							this.getWord.push(res.data.data[i].word);
							this.getWordMeans.push(res.data.data[i].mean);
						}
						this.textWordMeans = this.getWordMeans[0];
					}
				});
			},
			changeTextStyle(){
				let that = this;
				that.textAnswerSize = 0;
			},
			getTextWordMeans(index){
				let that = this;
				that.textWordMeans = that.getWordMeans[that.index];
			},
			changeTextColor(valid){
				let that = this;
				if(valid){
					that.textAnswerColor = "green";
				}else{
					that.textAnswerColor = "red";
				}
			},
			isCorrectWord:function(){
				const that = this;
				// const ele = uni.createSelectorQuery().in(this);
				if(that.$refs.edit&&that.$refs.WdMean&&that.$refs.wordAnswer){
					// var word_element = uni.createSelectorQuery().select("#edit");
					// // var word_element = that.$refs.edit;
					// var word_means = uni.createSelectorQuery().select("#wd-mean");
					// var word_answer = uni.createSelectorQuery().select("#word-answer");
					that.textAnswerSize = 35;
					var word = that.textarea_value;
					if(that.index === that.getWord.length - 1){
						alert("恭喜你,已经默写完第"+that.unit_number+"单元的单词");
						if(word === that.getWord[that.index]) {
							// word_answer.style.color = "green";
							that.changeTextColor(word === that.getWord[that.index]);
							that.textColor = "green";
							that.textAnswerContent = word;
							// word_answer.innerHTML = word;
						}else{
							// word_answer.style.color = "red";
							that.changeTextColor(!word === that.getWord[that.index]);
							that.textColor = "red";
							that.textAnswerContent = that.getWord[that.index];
							// word_answer.innerHTML = that.getWord[that.index];
							setTimeout(that.changeTextStyle, 1500);
						}
					}else{
						if(word === that.getWord[that.index]) {
							// word_answer.$el.style.color = "green";
							that.changeTextColor(word === that.getWord[that.index]);
							that.textColor = "green";
							// word_answer.innerHTML = word;
							that.textAnswerContent = word;
							that.index++;
							that.getTextWordMeans(that.index);
							// word_means.innerHTML = that.getWordMeans[that.index];
						}else{
							// word_answer.$el.style.color = "red";
							that.changeTextColor(!word === that.getWord[that.index]);
							that.textColor = "red";
							that.textAnswerContent = that.getWord[that.index];
							that.getTextWordMeans(that.index);
							// word_answer.$el.innerHTML = that.getWord[that.index];
							setTimeout(that.changeTextStyle, 1500);
						}
					}
				}
			}
		}
	}
</script>

<style>
	.title{
		position: fixed;
		top: 18%;
		left: 23%;
		text-align: center;
		font-size: 70rpx;
		color: green;
		z-index: 1;
	}
	#word-answer{
		position: fixed;
		top: 30%;
		left: 30%;
		font-size: 35px;
		z-index: 1;
	}
	#edit{
		position: fixed;
		text-align: center;
		width: 100%;
		height: 5%;
		font-size: 60rpx;
		color: #ffffff;
		background-color: darkcyan;
		color: aliceblue;
		top: 45%;
		z-index: 1;
	}
	.Btn1{
		position: fixed;
		text-align: center;
		font-size: 60rpx;
		width: 90%;
		height: 5%;
		top: 65%;
		left: 5%;
		background-color: darkcyan;
		z-index: 2;
	}
	.word-means{
		font-size: 50rpx;
		position: fixed;
		top: 55%;
		left: 36%;
		z-index: 1;
	}
</style>
