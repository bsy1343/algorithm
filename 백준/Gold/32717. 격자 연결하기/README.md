# [Gold III] 격자 연결하기 - 32717

[문제 링크](https://www.acmicpc.net/problem/32717)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 175, 정답: 89, 맞힌 사람: 76, 정답 비율: 54.286%

### 분류

격자 그래프, 다이나믹 프로그래밍, 최대 부분 배열 문제

### 문제 설명

<p>각 격자에 정수가 적힌 $N\times M$크기의 격자판이 있다. <strong>격자판 점수</strong>는 $2$개의 격자를 선택하여 최단 경로로 연결했을 때, 연결된 경로에 있는 격자들에 적힌 수의 합으로 계산한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32717.%E2%80%85%EA%B2%A9%EC%9E%90%E2%80%85%EC%97%B0%EA%B2%B0%ED%95%98%EA%B8%B0/b923309f.png" data-original-src="https://boja.mercury.kr/assets/problem/32717-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 300px; width: 300px;"></p>

<p>최단 경로가 여러 개인 경우, 어떤 경로를 선택해도 무관하다. 연결된 경로에는 선택한 격자들도 포함된다. 같은 위치의 격자를 중복하여 선택할 수도 있는데, 이 경우 해당 격자의 수를 한 번만 더한다.</p>

<p>임의의 두 격자를 선택했을 때, 얻을 수 있는 격자판 점수의 최댓값을 구해보자.</p>

### 입력

<p>첫째 줄에 격자판의 세로 크기 $N$과 가로 크기 $M$이 공백으로 구분되어 주어진다. $\left(1\leq N,M\leq 1,000\right)$</p>

<p>둘째 줄부터 $N$줄에 걸쳐 격자의 점수 $A_{ij}$가 공백으로 구분되어 주어진다. $(\left|A_{ij}\right|\leq 1,000;$ $1\leq i\leq N;$ $1\leq j\leq M)$</p>

### 출력

<p>두 격자를 선택했을 때, 얻을 수 있는 격자판 점수의 최댓값을 출력한다.</p>

### 힌트

<p>$\left(r, c\right)$를 기준으로 $\left(3, 1\right)$ 위치의 격자와 $\left(2, 4\right)$ 위치의 격자를 선택하면 $4, 5, 7, -3, 6$을 선택하여 $19$점을 얻는다.</p>