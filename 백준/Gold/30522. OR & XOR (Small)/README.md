# [Gold II] OR & XOR (Small) - 30522

[문제 링크](https://www.acmicpc.net/problem/30522)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 215, 정답: 95, 맞힌 사람: 80, 정답 비율: 50.955%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p><strong>Small 버전에서는 $A_i$, $B_j$의 상한이 $2^{10}$으로 주어진다.</strong></p>

<p>길이가 $N$인 수열 $A_1, A_2, \cdots, A_N$, 수열 $B_1, B_2, \cdots, B_N$ 과 정수 $p$가 주어진다.</p>

<p>$$\sum_{i=1}^N\, \sum_{j=1}^N\, (A_i \oplus B_j)$$</p>

<p>$\oplus$는 Bitwise XOR 연산을 의미한다.</p>

<p>위의 수식을 전개했을 때 나타나는 $N^{2}$개의 <a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">Bitwise XOR</a> 연산 중 $p$개를 <a href="https://en.wikipedia.org/wiki/Bitwise_operation#OR">Bitwise OR</a> 연산으로 변경할 때, 가능한 수식의 최댓값을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 정수 $N$과 정수 $p$가 공백으로 구분되어 주어진다.</p>

<p>둘째 줄에 수열 $A_1, A_2, \cdots, A_N$이 공백으로 구분되어 주어진다.</p>

<p>셋째 줄에 수열 $B_1, B_2, \cdots, B_N$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>문제에서 요구하는 값을 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 200\ 000$</li>
	<li>$0 \le p \le N^2$</li>
	<li>$0 \le A_i, B_j &lt; 2^{10}$</li>
	<li>$A_i, B_j$는 정수</li>
</ul>