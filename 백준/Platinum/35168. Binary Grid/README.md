# [Platinum I] Binary Grid - 35168

[문제 링크](https://www.acmicpc.net/problem/35168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>You are given an array $A$ containing $N$ non-negative integers. You have to construct a binary grid of size $N \times M$ such that:</p>

<ul>
<li>for any cell with value $1$, any of its adjacent cells, i.e. cells that share one of its four sides, must <strong>not</strong> have the value $1$.</li>
<li>the number of cells with value $1$ in row $i$ is exactly $A_i$.</li>
</ul>

<p>Find any such binary grid or tell that it's impossible to construct.</p>

### 입력

<p>The first line contains two integers $N$ and $M$ ($1 \leq N, M \leq 1000$). The next line contains $N$ integers containing $A_i$ ($0 \leq A_i \leq M$).</p>

### 출력

<p>Output $N$ lines, each containing $M$ characters of either <code>0</code> or <code>1</code> representing the binary grid you constructed. If multiple construction exists, you may output any of them. If such a grid does not exist, output $-1$.</p>