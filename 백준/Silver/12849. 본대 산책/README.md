# [Silver I] 본대 산책 - 12849

[문제 링크](https://www.acmicpc.net/problem/12849)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3362, 정답: 2269, 맞힌 사람: 1776, 정답 비율: 67.044%

### 분류

다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>숭실 대학교 정보 과학관은 &nbsp;캠퍼스의 길 건너편으로 유배를 당했다. 그래서 컴퓨터 학부 학생들은 캠퍼스를 &lsquo;본대&rsquo; 라고 부르고 정보 과학관을 &lsquo;정보대&rsquo; 라고 부른다. 준영이 또한 컴퓨터 학부 소속 학생이라서 정보 과학관에 박혀있으며 항상 본대를 가고 싶어 한다. 어느 날 준영이는 본대를 산책하기로 결심하였다. 숭실 대학교 캠퍼스 지도는 아래와 같다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/12849.%E2%80%85%EB%B3%B8%EB%8C%80%E2%80%85%EC%82%B0%EC%B1%85/9b029fb0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12849/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:503px; width:733px" /></p>

<p style="text-align: center;">(편의 상 문제에서는 위 건물만 등장한다고 가정하자)</p>

<p>한 건물에서 바로 인접한 다른 건물로 이동 하는 데 1분이 걸린다. 준영이는 산책 도중에 한번도 길이나 건물에 멈춰서 머무르지 않는다. 준영이는 할 일이 많아서 딱 D분만 산책을 할 것이다. (산책을 시작 한 지 D분 일 때, 정보 과학관에 도착해야 한다.) 이때 가능한 경로의 경우의 수를 구해주자.</p>

### 입력

<p>D 가 주어진다 (1 &le;&nbsp;D &le;&nbsp;100,000)&nbsp;</p>

### 출력

<p>가능한 경로의 수를 1,000,000,007로 나눈 나머지를 출력 한다.</p>