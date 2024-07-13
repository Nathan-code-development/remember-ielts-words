<template>
	<view>
		<uni-list v-for="(item, index) in read_and_write_word" :key="index">
			<uni-list-item :title="item" :note="read_and_write_word_means[index]"></uni-list-item>
		</uni-list>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				unit_number: 0,
				unit_number_list: ["One", "Two", "Three", "Four", "Five", "Six"],
				read_and_write_word: [],
				read_and_write_word_means: []
			}
		},
		onLoad: function(option){
			this.unit_number = option.unit;
			this.getWordList();
		},
		methods: {
			getWordList(){
				uni.request({
					url: "http://121.40.144.4:857/WordLesson"+this.unit_number_list[this.unit_number-1]+"/findAll",
					method: "GET",
					header: {
					    'content-type':'application/x-www-form-urlencoded'
					},
					success: (res) => {
						for(var i = 0; i < res.data.data.length; i++){
							this.read_and_write_word.push(res.data.data[i].word);
							this.read_and_write_word_means.push(res.data.data[i].mean);
						}
					}
				});
			}
		}
	}
</script>

<style>

</style>
