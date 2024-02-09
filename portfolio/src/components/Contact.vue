<template>
  <div id="contant">
    <h2>Contact</h2>
    <p>Tel : {{formattedPhone}}</p>
    <p>Email : {{email}}</p>
    
  </div>

  <div id="gitHub">
    <h2>GitHub</h2>
    <!-- 'a' 태그를 사용하여 GitHub 링크를 생성하고, 클릭 시 gitClicks 메서드를 호출합니다. -->
    <p><a :href="gitUrl" target="_blank" @click="gitClicks">Git 으로 이동</a> (총 방문자 수: {{visitCounter}})</p>
  </div>
</template>

<script>
export default {
  name: 'ContactMe',
  // data 함수를 사용하여 컴포넌트의 초기 데이터를 정의합니다.
  data(){
    return {
      phone : "01012345678",
      email : "hongMan@inga.edu",
      gitUrl : "https://github.com/leeyeoninha/inProg",
      visitCounter : 0,
    }
  },
  // computed 속성을 사용하여 전화번호 형식을 계산합니다.
  computed:{
    formattedPhone() {
      let phoneNumber = null;
      if (this.phone.length === 11) {
        // 전화번호가 11자리일 경우, 3-4-4 형식으로 바꿉니다.
        phoneNumber = this.phone.replace(/(\d{3})(\d{4})(\d{4})/, '$1-$2-$3');
      } else if (this.phone.length === 10) {
        // 전화번호가 10자리일 경우, 3-3-4 형식으로 바꿉니다.
        phoneNumber = this.phone.replace(/(\d{3})(\d{3})(\d{4})/, '$1-$2-$3');
      } else {
        phoneNumber = this.phone;
      }
      return phoneNumber;
    }
  },
  methods: {
     // methods 속성을 사용하여 방문자 수를 증가시키는 메서드를 정의합니다.
    gitClicks() {
      this.visitCounter++;
    }
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
#contant{
  width: 50%;
  float: left;
}
#gitHub{
  width: 50%;
  float: right;
}
a{
  text-decoration: none;
}

</style>
