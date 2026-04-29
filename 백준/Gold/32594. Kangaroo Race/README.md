# [Gold I] Kangaroo Race - 32594

[문제 링크](https://www.acmicpc.net/problem/32594)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 25, 맞힌 사람: 18, 정답 비율: 52.941%

### 분류

브루트포스 알고리즘, 수학, 오일러 피 함수, 정수론, 페르마의 소정리

### 문제 설명

<p>The country of Austria is well known for their kangaroo population. In order to stay in good shape, the kangaroos each have an athletics track to practice for the Annual Austrian Pogostick Jumping Event.</p>

<p>Each athletics track consists of $n$ segments, each $1$ meter in length. These segments are numbered from $1$ to $n$, in order. The track is cyclic, so after segment $n$ follows segment $1$ again.</p>

<p>On each track, a kangaroo is located in one of the segments. The kangaroo can make some finite number of jumps. In each jump, if the kangaroo is currently in segment $y$, it will jump $y(y-1)$ segments ahead. Your task is to determine the minimum number of jumps needed for the kangaroo to reach the segment numbered $1$.</p>

<p>Since the kangaroo population in Austria is quite large, you are asked to solve this problem for many different kangaroos on different athletics tracks.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $k$ ($1\leq k\leq 10^5$), the number of kangaroos.</li>
	<li>$k$ lines with two integers $n$ and $x$ ($1\leq x \leq n \leq 10^{18}$), the number of segments in one of the athletics tracks and the kangaroo's initial position on this track.</li>
</ul>

### 출력

<p>For each kangaroo, if the kangaroo can reach can reach the segment numbered $1$ in a finite number of jumps, output the minimum number of jumps needed. Otherwise, output "<code>impossible</code>".</p>

### 힌트

<p>The intermediate values of your calculation may become larger than what fits in $64$-bit integers. To store these large intermediate values, use <code>__int128</code> in C++ or <code>java.math.BigInteger</code> in Java/Kotlin. In Python, integers have arbitrary size by default.</p>