<!-- ProjectItem.vue -->
<template>
    <div>
         <!-- {{ project.title }}는 아래 script에서 전달받은 props 데이터를 참조합니다. -->
 
      <h3>{{ project.title }}</h3>
      <ul>
        <!-- v-for 디렉티브를 사용하여 project.items의 각 항목에 대해 반복하고, :key로 index를 부여합니다. -->
        <li v-for="(item, index) in project.items" :key="index">{{ item }}</li>
      </ul>
    </div>
  </template>
  
  <script>
  export default {
    name: 'ProjectItem',
     // props 옵션을 사용하여 부모 컴포넌트로부터 데이터를 전달받습니다. project라는 이름의 props를 정의하고, 이 props는 Object 타입이며 필수로 제공되어야 합니다.
    props: {
      project: {
        type: Object,
        required: true
      }
    }
  }
  </script>
  
  <style scoped>
  
  </style>
  