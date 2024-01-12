<template>
  <div class="hello">
    <!-- 사용자의 아이디를 화면에 표시합니다. -->
    <p>Hello, {{ name }}</p>
  </div>
</template>


<script>

export default {
  name: 'MainPage',
  data() {
    return {
      // 사용자 이름과 응답 메시지를 저장하는 변수
      name : null
    };
  },
  created() {
    // 컴포넌트가 생성될 때 로컬 스토리지에서 아이디를 불러와 name에 저장합니다.
    this.name = localStorage.getItem('userId');
  },
  methods: {},
}
</script>