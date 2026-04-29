# [Silver III] GLCCDM - 32649

[문제 링크](https://www.acmicpc.net/problem/32649)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 399, 정답: 181, 맞힌 사람: 142, 정답 비율: 43.293%

### 분류

브루트포스 알고리즘, 수학, 정수론, 해 구성하기

### 문제 설명

<p>$\operatorname{gcd}(d_1, \cdots, d_K) = A, \operatorname{lcm}(d_1, \cdots, d_K) = B$를 만족하는 서로 다른 양의 정수 $K$개로 이루어진 수열 $d_1, \cdots, d_K$를 구해보자.</p>

### 입력

<p>첫 번째 줄에 양의 정수 $A$, $B$, $K$가 공백을 사이에 두고 주어진다. $(1 \le A &lt; B \le 1\,000\,000 ; 2 \le K \le 100)$</p>

### 출력

<p>$K$개의 양의 정수 $d_1, \cdots, d_K$를 공백을 사이에 두고 순서에 상관없이 출력한다.</p>

<p>조건을 만족하는 수열이 여러 개라면, 아무 수열이나 하나 출력한다.</p>

<p>조건을 만족하는 수열이 존재하지 않으면 <span style="color:#e74c3c;"><code>-1</code></span>만 출력한다.</p>

### 힌트

<p>$\operatorname{gcd}(d_1, \cdots, d_K)$는 $d_1, \cdots, d_K$의 공통된 약수 중 가장 큰 양의 정수를 뜻하고, $\operatorname{lcm}(d_1, \cdots, d_K)$는 공통된 배수 중 가장 작은 양의 정수를 뜻한다.</p>