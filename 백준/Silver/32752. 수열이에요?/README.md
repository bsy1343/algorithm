# [Silver V] 수열이에요? - 32752

[문제 링크](https://www.acmicpc.net/problem/32752)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 988, 정답: 548, 맞힌 사람: 475, 정답 비율: 56.548%

### 분류

정렬

### 문제 설명

<p>길이가 $N$인 정수열 $A$가 주어진다. 다음 조건을 만족하면 $A$는 <strong>단조증가</strong>하는 수열이다.</p>

<ul>
	<li>$1 \le i &lt; j \le N$을 만족하는 모든 $(i, j)$에 대해 $A_i \le A_j$</li>
</ul>

<p>$A$의 $L$번째 원소부터 $R$번째 원소의 순서를 임의로 재배치했을 때 <strong>단조증가</strong>하는 수열로 만들 수 있는지 확인해 보자.</p>

### 입력

<p>첫 번째 줄에 $N$, $L$, $R$이 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에 $A_1$, $A_2$, $A_3$, $\cdots$, $A_N$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>첫 번째 줄에 $A$를 <strong>단조증가</strong>하는 수열로 만들 수 있다면 <span style="color:#e74c3c;"><code>1</code></span>을, 없다면 <span style="color:#e74c3c;"><code>0</code></span>을 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 100\,000$</li>
	<li>$1 \le L \le R \le N$</li>
	<li>$1 \le A_i \le 10^9$</li>
</ul>