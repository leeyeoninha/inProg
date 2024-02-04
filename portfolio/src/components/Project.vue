<template>
    <div>
      <h2>Project</h2>

      <h3>XXX 배달 프로젝트</h3>
      <ul>
        <li>Spring, React 기반 배달 앱 프로젝트</li>
        <li>일평균 5000건 주문</li>
        <li>마이크로 서비스 아키텍처, 아파치 카프카를 통한 시스템 설계</li>
      </ul>

      <h3>XXX 배달 음식 추천 프로젝트</h3>
      <ul>
        <li>XXX 배달 앱에서 머신런닝을 활용한 배달 음식 추천 </li>
        <li>사용자의 취향을 고려한 배달 음식 추천 알고리즘 설계</li>
      </ul>

      <h3>XXX 배달 라이더 매칭 프로젝트</h3>
      <ul>
        <li>위치기반 배달 라이더 매칭 시스템 개발</li>
        <li>음식 종류에 따라 오토바이, 뚜벅이 라이더 자동 매칭 알고리즘 설계</li>
          <ul>
            <li>금방 차가워 지는 국물 요리일 경우 - 오토바이 라이더 매칭</li>
            <li>배달 시간과 관련 없는 음식, 제품 - 뚜벅이 라이더 매칭</li>
          </ul>
      </ul>

    </div>
  </template>
  
  <script>
  export default {
    name: 'ProjectList'
  }
  </script>
  
  <style scoped>
  div {
  text-align: left;
  border-bottom: 1px solid gray;
  }
  
  </style>