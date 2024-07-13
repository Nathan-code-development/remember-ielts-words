<template>
	<view>
		<uni-list v-for="(item, index) in speaking_and_listening_memory" :key="index">
			<uni-list-item :title="item" :note="speaking_and_listening_memory_means[index]"></uni-list-item>
		</uni-list>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				unit_number : 0,
				speaking_and_listening_memory: [],
				speaking_and_listening_memory_means: []
			}
		},
		onLoad: function(option){
			this.unit_number = option.unit;
			this.getWordList();
		},
		methods: {
			getWordList(){
				uni.request({
					url: "http://121.40.144.4:857/WordLesson"+this.unit_number+"/findAll",
					method: "GET",
					header: {
					    'content-type':'application/x-www-form-urlencoded'
					},
					success: (res) => {
						for(var i = 0; i < res.data.data.length; i++){
							this.speaking_and_listening_memory.push(res.data.data[i].word);
							this.speaking_and_listening_memory_means.push(res.data.data[i].mean);
						}
					}
				});
			}
		}
	}
</script>

<style>

</style>
