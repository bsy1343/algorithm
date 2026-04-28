# [Platinum IV] 2차원 - 25687

[문제 링크](https://www.acmicpc.net/problem/25687)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 226, 정답: 136, 맞힌 사람: 52, 정답 비율: 59.770%

### 분류

수학, 애드 혹, 해 구성하기, 비둘기집 원리

### 문제 설명

<p>다음 조건 1, 2를 만족하는 2차원 배열 $\begin{bmatrix} a_{11} &amp; \cdots &amp; a_{1N} \\ \vdots &amp; \ddots &amp; \vdots \\ a_{N1} &amp; \cdots &amp; a_{NN} \end{bmatrix}$ 중 하나를 구하는 프로그램을 작성하세요.</p>

<ul>
	<li>조건 1: $[a_{11}, \cdots, a_{1N}, \cdots, a_{N1}, \cdots, a_{NN}]$은 $[1, 2, \cdots, N^2]$의 순열입니다.</li>
	<li>조건 2: 같은 행이나 같은 열에 있는 서로 다른 두 값 $p$, $q$($p &gt; q$)에 대한 $\frac{p}{q}$들의 최솟값을 배열의 <strong>점수</strong>라고 할 때, <strong>점수</strong>가 최대입니다.</li>
</ul>

### 입력

<p>첫 번째 줄에 양의 정수 $N$이 주어집니다.</p>

### 출력

<p>$i$($1 \le i \le N$)번째 줄에 문제의 조건을 만족하는 $a_{i1}, a_{i2}, \ldots, a_{iN}$을 출력합니다.</p>

### 제한

<ul>
	<li>$2 \le N \le 2 \times 10^3$</li>
</ul>