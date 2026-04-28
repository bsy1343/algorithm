# [Platinum III] Projected Array - 30918

[문제 링크](https://www.acmicpc.net/problem/30918)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 20, 맞힌 사람: 14, 정답 비율: 31.818%

### 분류

기하학, 수학, 누적 합, 정렬, 스위핑

### 문제 설명

<p>$2$차원 평면 상에 서로 다른 점들이 $N$개 놓여있다. 각 점에는 $1$부터 $N$까지의 서로 다른 정수가 쓰여있다.</p>

<p>이제 모든 점들을 원점을 기준으로 특정한 각도만큼 회전시키고, $x$축 위로 사영한다. 이를 $x$좌표가 증가하는 순서대로 점을 읽었을 때, 점에 쓰인 수들로 길이 $N$의 수열을 만들 수 있다. 단 어떤 두 점이 회전 이후 같은 $x$좌표를 가지는 것은 금지된다. 이 방법으로 만들 수 있는 수열 중, 반전 수가 최소인 수열의 반전 수를 구하시오.</p>

<p>여기서 수열 $A_1$, $A_2$, $\cdots$, $A_n$의 반전 수란, $1 \le i &lt; j \le n$이면서 $A_i &gt; A_j$인 순서쌍 $(i, j)$의 개수를 말한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30918.%E2%80%85Projected%E2%80%85Array/3bc606b1.png" data-original-src="https://upload.acmicpc.net/4eddbe77-232c-4a71-af97-38f4eadf7673/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 163px;" /></p>

### 입력

<p>첫 번째 줄에 점들의 개수 $N$이 주어진다. $(1 \le N \le 2000)$</p>

<p>다음 $N$개의 줄에 걸쳐, $i$번째 줄에는 정수 $i$가 쓰여있는 점의 좌표를 나타내는 두 정수 $x_i$, $y_i$가 공백으로 구분되어 주어진다. $(1 \le i \le N; -10^9 \le x_i, y_i \le 10^9)$</p>

### 출력

<p>첫 번째 줄에 가능한 최소의 반전 수를 출력한다.</p>