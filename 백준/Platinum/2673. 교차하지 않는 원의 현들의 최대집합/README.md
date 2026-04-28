# [Platinum IV] 교차하지 않는 원의 현들의 최대집합 - 2673

[문제 링크](https://www.acmicpc.net/problem/2673)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3528, 정답: 1419, 맞힌 사람: 1145, 정답 비율: 44.363%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>평면상에 있는 원의 둘레에 100개의 점이 일정한 간격으로 시계방향으로 번호가 1, 2, ... 100으로 붙여져 있다. 이 점들을 끝점으로 갖는 N개의 선분(원의 현)이 입력으로 주어질 때, 이들중에서 서로 교차하지 않는 것들을 최대한 많이 찾아서 그 개수를 출력하는 프로그램을 작성하라.</p>

<p>단, 1 &le; N &le; 50이고, 주어진 각 점은 많아야 한 현의 끝점이 될 수 있다.</p>

### 입력

<p>첫 번째 줄은 주어지는 현의 개수 N이고, 다음의 N줄은 각 현의 양끝점의 번호가 주어진다.</p>

### 출력

<p>구한 현의 개수를 출력한다.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/2673.%E2%80%85%EA%B5%90%EC%B0%A8%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EB%8A%94%E2%80%85%EC%9B%90%EC%9D%98%E2%80%85%ED%98%84%EB%93%A4%EC%9D%98%E2%80%85%EC%B5%9C%EB%8C%80%EC%A7%91%ED%95%A9/af0a5c34.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/2673.%E2%80%85%EA%B5%90%EC%B0%A8%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EB%8A%94%E2%80%85%EC%9B%90%EC%9D%98%E2%80%85%ED%98%84%EB%93%A4%EC%9D%98%E2%80%85%EC%B5%9C%EB%8C%80%EC%A7%91%ED%95%A9/af0a5c34.png" data-original-src="https://www.acmicpc.net/upload/images/XTsjcmekYr6xY.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 207px; height: 181px; " /></p>