# [Gold III] 채굴 - 15573

[문제 링크](https://www.acmicpc.net/problem/15573)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 2118, 정답: 670, 맞힌 사람: 467, 정답 비율: 28.792%

### 분류

그래프 이론, 그래프 탐색, 이분 탐색, 너비 우선 탐색, 매개 변수 탐색, 격자 그래프

### 문제 설명

<p>땅 위에 놓여있는 세로&nbsp;<em>N</em>, 가로&nbsp;<em>M</em>&nbsp;길이의 광산에&nbsp;1&thinsp;&times;&thinsp;1&nbsp;광물&nbsp;<em>N</em>&thinsp;&times;&thinsp;<em>M</em>개가 있으며, 각 광물은 고유의 강도<em>S</em><sub><em>i</em>,&thinsp;<em>j</em></sub>를 가진다.</p>

<p style="text-align:center"><br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15573.%E2%80%85%EC%B1%84%EA%B5%B4/1f1b0202.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15573/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:139px; width:200px" /></p>

<p>채굴기를 이용하여 이 광물들을 채굴하려고 한다. 채굴기는 공기와 맞닿아 있는 광물 하나를 골라 채굴할 수 있다. 바닥과 광물과만 맞닿아 있으면 채굴할 수 없다. 채굴기의 성능&nbsp;<em>D</em>에 대해, 채굴기는 강도가&nbsp;<em>D</em>&nbsp;이하인 광물들만 채굴할 수 있다. 원하는 광물의 수&nbsp;<em>K</em>&nbsp;이상을 채굴할 수 있는 최소의&nbsp;<em>D</em>를 구하여라.</p>

### 입력

<p>첫째 줄에&nbsp;<em>N</em>,&nbsp;<em>M</em>,&nbsp;<em>K</em>가 주어진다.&nbsp;(1&thinsp;&le;&thinsp;<em>N</em>,&thinsp;<em>M</em>&thinsp;&le;&thinsp;1000,&thinsp;1&thinsp;&le;&thinsp;<em>K</em>&thinsp;&le;&thinsp;<em>N</em>&thinsp;&times;&thinsp;<em>M</em>)&nbsp;둘째 줄부터 맨 위의 광물들부터 순서대로&nbsp;<em>N</em>줄 동안&nbsp;<em>M</em>개의 광물의 강도&nbsp;<em>S</em><sub><em>i</em>,&thinsp;<em>j</em></sub>가 주어진다.(<em>i</em>&thinsp;=&thinsp;1,&thinsp;2,&thinsp;...,&thinsp;<em>N</em>,&thinsp;<em>j</em>&thinsp;=&thinsp;1,&thinsp;2,&thinsp;...,&thinsp;<em>M</em>)&nbsp;(1&thinsp;&le;&thinsp;<em>S</em><sub><em>i</em>,&thinsp;<em>j</em></sub>&thinsp;&le;&thinsp;10<sup>6</sup>)</p>

### 출력

<p><em>K</em>개 이상의 광물을 채굴할 수 있는 최소의&nbsp;<em>D</em>를 구하여라.</p>