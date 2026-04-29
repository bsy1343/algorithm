# [Platinum IV] $2N$ 격자판 - 35501

[문제 링크](https://www.acmicpc.net/problem/35501)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 19, 맞힌 사람: 14, 정답 비율: 51.852%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 많은 조건 분기

### 문제 설명

<p>$2$행 $N$열 격자가 주어진다. 각 칸은 문자 <span style="color:#e74c3c;"><code>S</code></span>, <span style="color:#e74c3c;"><code>X</code></span>, <span style="color:#e74c3c;"><code>O</code></span> 중 하나로 나타난다. 각 문자의 의미는 다음과 같다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>S</code></span>: 시작 위치이며, 정확히 한 칸 존재한다. 해당 칸에는 착지할 수 없다.</li>
<li><span style="color:#e74c3c;"><code>X</code></span>: 반드시 한 번 방문해야 하는 칸이다.</li>
<li><span style="color:#e74c3c;"><code>O</code></span>: 장애물이다. 이 칸에는 착지할 수 없다.</li>
</ul>

<p>플레이어는 매 턴 착지 가능한 임의의 칸으로 이동할 수 있다. $(r_1,c_1)$에서 $(r_2,c_2)$로 이동할 때, 이 이동에 드는 비용은 다음과 같다.</p>

<p>$cost\, =\,(|r_1-r_2|+|c_1-c_2|) -1$</p>

<p><span style="color:#e74c3c;"><code>S</code></span>에서 시작하여 모든 <span style="color:#e74c3c;"><code>X</code></span>가 적힌 칸을 정확히 한 번씩 방문하는 경로들 중 총 비용의 최솟값을 구해보자.</p>

### 입력

<p>첫 번째 줄에 격자의 열의 개수를 나타내는 정수 $N$이 주어진다.</p>

<p>두 번째 줄과 세 번째 줄에 길이 $N$의 문자열이 한 줄에 하나씩 주어진다. $i+1$번째 줄의 $j$번째 문자는 $i$행 $j$열 칸을 나타낸다.</p>

### 출력

<p>첫 번째 줄에 총 비용의 최솟값을 출력한다.</p>

### 제한

<ul>
<li>$1\le N\le 1\, 000$</li>
<li>$1\le i\le 2$</li>
<li>$1\le j\le N$</li>
<li><span style="color:#e74c3c;"><code>X</code></span>는 하나 이상 주어진다.</li>
<li><span style="color:#e74c3c;"><code>S</code></span>는 정확히 한 번 주어진다.</li>
<li>입력 문자열은 <span style="color:#e74c3c;"><code>S</code></span>, <span style="color:#e74c3c;"><code>X</code></span>, <span style="color:#e74c3c;"><code>O</code></span> 로만 이루어져 있다.</li>
</ul>