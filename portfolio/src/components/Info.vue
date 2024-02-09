<template>
  <div id="info">
    <h2>Info</h2>
    <!-- {{name}}은 아래 script에서 정의한 데이터를 바인딩-->
    <p>이름 : {{name}}</p>
    <!-- {{birthday}}은 아래 script에서 정의한 데이터를 바인딩-->
    <p>생년 월일 : {{birthday}}</p>
    <!-- v-if 디렉티브를 사용하여 army.isMilitaryServicㄷ가 true인 경우 랜더링-->
    <p v-if="army.isMilitaryService">
      군 복무 : {{army.branch}} - {{army.role}}({{army.period.start}} ~ {{army.period.end}})
    </p>
  </div>

  <div id="skill">
    <h2>Skill</h2>
    <!-- {{backend}}은 아래 script에서 정의한 데이터를 바인딩-->
    <p>{{backend}}</p>
    <!-- {{front}}은 아래 script에서 정의한 데이터를 바인딩-->
    <p>{{front}}</p>
    <!-- {{devOps}}은 아래 script에서 정의한 데이터를 바인딩-->
    <p>{{devOps}}</p>

  </div>
</template>

<script>

// Vue.js 컴포넌트를 export합니다. 이 컴포넌트의 이름은 'ContactMe'입니다.
export default {
  name: 'ContactMe',

  // data 함수를 사용하여 컴포넌트의 초기 데이터를 정의합니다.
  data(){
    return {
      name : "홍길동",
      birthday : "1999.07.07",
      army : {
        isMilitaryService : true,
        branch : "해군",
        role : "UDT",
        period : {
          start : "2017.03",
          end : "2019.03"
        }
      },
      backend : ["SpringBoot(Java)", "Spring(Java)", "PHP"].join(","),
      front : null,
      devOps : null

    }
  },

  // created 라이프사이클 훅에서 프론트엔드 스킬을 설정합니다.
  created() {
    this.front = ["VueJs", "React", "Git", "WIKI", "Jira"].join(",");
  },

  // mounted 라이프사이클 훅에서 DevOps 스킬을 설정합니다.
  mounted(){
    this.devOps = ["Git", "WIKI", "Jira"].join(",");
  }
}
</script>

<style scoped>
div {
  text-align: left;
  border-bottom: 1px solid gray;
  margin-bottom: 10px;
  height: 180px;
}
#info{
  width: 50%;
  /* 'info' id를 가진 'div' 태그를 왼쪽으로 정렬합니다. */
  float: left;
}
#skill{
  width: 50%;
    /* 'skill' id를 가진 'div' 태그를 오른쪽으로 정렬합니다. */
  float: right;
}
a{
  text-decoration: none;
}

</style>

