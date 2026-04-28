# [Platinum V] 본대 산책2 - 12850

[문제 링크](https://www.acmicpc.net/problem/12850)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3509, 정답: 2867, 맞힌 사람: 2481, 정답 비율: 83.255%

### 분류

수학, 그래프 이론, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>숭실 대학교 정보 과학관은 유배를 당해서 &nbsp;캠퍼스의 길 건너편에 있다. 그래서 컴퓨터 학부 학생들은 캠퍼스를 &lsquo;본대&rsquo; 라고 부르고 정보 과학관을 &lsquo;정보대&rsquo; 라고 부른다. 준영이 또한 컴퓨터 학부 소속 학생이라서 정보 과학관에 박혀있으며 항상 꽃 이 활짝 핀 본 대를 선망한다. 어느 날 준영이는 본 대를 산책하기로 결심하였다. 숭실 대학교 캠퍼스 지도는 아래와 같다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12850.%E2%80%85%EB%B3%B8%EB%8C%80%E2%80%85%EC%82%B0%EC%B1%852/69d4bcca.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12850.%E2%80%85%EB%B3%B8%EB%8C%80%E2%80%85%EC%82%B0%EC%B1%852/69d4bcca.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12850/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:644px; width:940px" /></p>

<p style="text-align: center;">(편의 상 문제에서는 위 건물만 등장한다고 가정하자)</p>

<p>한 건물에서 바로 인접한 다른 건물로 이동 하는 데 1분이 걸린다. 준영이는 산책 도중에 한번도 길이나 건물에 멈춰서 머무르지 않는다. 준영이는 할 일이 많아서 딱 D분만 산책을 할 것이다. (산책을 시작 한 지 D분 일 때, 정보 과학관에 도착해야 한다.) 이때 가능한 경로의 경우의 수를 구해주자.</p>

### 입력

<p>D 가 주어진다 (1 &le;&nbsp;D &le;&nbsp;1,000,000,000)&nbsp;</p>

### 출력

<p>가능한 경로의 수를 1,000,000,007로 나눈 나머지를 출력한다.</p>