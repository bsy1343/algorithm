# [Gold I] Out of Sorts - 15760

[문제 링크](https://www.acmicpc.net/problem/15760)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 573, 정답: 269, 맞힌 사람: 227, 정답 비율: 46.232%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Keeping an eye on long term career possibilities beyond the farm, Bessie the cow has started learning algorithms from various on-line coding websites.</p>

<p>Her favorite algorithm thus far is &quot;bubble sort&quot;. Here is Bessie&#39;s implementation, in cow-code, for sorting an array $A$ of length $N$.</p>

<pre>
sorted = false
while (not sorted):
   sorted = true
   moo
   for i = 0 to N-2:
      if A[i+1] &lt; A[i]:
         swap A[i], A[i+1]
         sorted = false
</pre>

<p>Apparently, the &quot;moo&quot; command in cow-code does nothing more than print out &quot;moo&quot;. Strangely, Bessie seems to insist on including it at various points in her code.</p>

<p>Given an input array, please predict how many times &quot;moo&quot; will be printed by Bessie&#39;s code.</p>

### 입력

<p>The first line of input contains $N$ ($1 \leq N \leq 100,000$). The next $N$ lines describe $A[0] \ldots A[N-1]$, each being an integer in the range $0 \ldots 10^9$. Input elements are not guaranteed to be distinct.</p>

### 출력

<p>Print the number of times &quot;moo&quot; is printed.</p>