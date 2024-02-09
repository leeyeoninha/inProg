<template>
  <div>
    <h2>About Me</h2>
    <p>항상 최선을 다하는 {{name}}입니다.</p>
    <p>현재 {{school}}에서 {{major}}을 전공 하고 있으며</p>
    <p>팀원과 협력을 하며 문제를 해결합니다.</p>
  </div>
</template>

<script>
export default {
  name: 'AboutMe',
  // data 함수를 사용하여 컴포넌트의 초기 데이터를 정의합니다.
  data(){
    return {
      name : "홍길동",
      school : "인하대학교",
      major : "컴퓨터공학"
    }
  }
}
</script>

<style scoped>
div {
  text-align: left;
  border-bottom: 1px solid gray;
}
</style>
