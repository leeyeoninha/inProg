<template>
  <div>
    <h2>학교</h2>

    <!-- v-for 디렉티브를 사용하여 eduList의 각 항목에 대해 반복합니다. -->
    <p v-for="edu in eduList" :key="edu.name">
      {{ edu.name }} {{ edu.type }}({{ edu.start }} ~ {{ edu.end ? edu.end : '재학 중' }})
    </p>
  </div>
</template>

<script>
export default {
  name: 'EducationList',
  // data 함수를 사용하여 컴포넌트의 초기 데이터를 정의합니다.
  data(){
    return {
      // 사용자의 학교 정보 리스트를 저장합니다.
      eduList : [
        {name : '인하초등학교', type : '졸업', start : '1999.03', end : '2006.02'},
        {name : '인하중학교', type : '졸업', start : '2006.03', end : '2009.02'},
        {name : '인하고등학교', type : '졸업', start : '2009.03', end : '2012.02'},
        {name : '인하대학교', type : '재학', start : '2012.03', end : null}
      ]
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
