# [Gold IV] 미로에 갇힌 상근 - 5069

[문제 링크](https://www.acmicpc.net/problem/5069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 459, 정답: 304, 맞힌 사람: 257, 정답 비율: 69.459%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5069.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EC%83%81%EA%B7%BC/0403cf85.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/5069.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EC%83%81%EA%B7%BC/0403cf85.png" data-original-src="https://www.acmicpc.net/upload/images/hex.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:292px; width:268px" /></p>

<p>상근이는 오른쪽 그림과 같은 미로에 갇혀있다. 미로는 육각형 모양의 방이 계속해서 붙어있는 모양이고, 이러한 방은 무수히 많이 있다. 또, 인접한 방은 문으로 연결되어 있어서, 한 방에서 다른 방으로 건너갈 수 있다. 하지만, 방의 개수는 무한대이기 때문에, 상근이는 절대 이 미로를 빠져나갈 수 없다.</p>

<p>오른쪽 그림에 상근이가 있는 방이 표시되어 있다. 이때, 상근이가 있는 방에서 시작해서 방을 n번 이동해서,&nbsp;다시 원래 있던 방으로 돌아오는 경로의 수를 구하려고 한다.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 n을 포함하는 한 줄로 이루어져 있다. (1 &le; n &le; 14)</p>

### 출력

<p>각 테스트 케이스에 대해서, 입력으로 주어진 n에 해당하는 경로의 개수를 출력한다. 정답은 항상 2<sup>31</sup>보다 작다.</p>