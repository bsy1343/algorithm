# [Platinum II] HILO - 23873

[문제 링크](https://www.acmicpc.net/problem/23873)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 169, 정답: 76, 맞힌 사람: 61, 정답 비율: 40.667%

### 분류

자료 구조, 세그먼트 트리, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Bessie knows a number $x+0.5$ where $x$ is some integer between $0$ to $N,$ inclusive ($1\le N\le 2 \cdot 10^5$).</p>

<p>Elsie is trying to guess this number. She can ask questions of the form &quot;is $i$ high or low?&quot; for some integer $i$ between $1$ and $N,$ inclusive. Bessie responds by saying &quot;HI&quot; if $i$ is greater than $x+0.5$, or &quot;LO&quot; if $i$ is less than $x+0.5$.</p>

<p>Elsie comes up with the following strategy for guessing Bessie&#39;s number. Before making any guesses, she creates a list of $N$ numbers, where every number from $1$ to $N$ occurs exactly once (in other words, the list is a permutation of size $N$). Then she goes through the list, guessing numbers that appear in the list in order.</p>

<p>However, Elsie skips any unnecessary guesses. That is, if Elsie is about to guess some number $i$ and Elsie previously guessed some $j &lt; i$ and Bessie responded with &quot;HI&quot;, Elsie will not guess $i$ and will move on to the next number in the list. Similarly, if she is about to guess some number $i$ and she previously guessed some $j &gt; i$ and Bessie responded with &quot;LO&quot;, Elsie will not guess $i$ and will move on to the next number in the list. It can be proven that using this strategy, Elsie always uniquely determines $x$ regardless of the permutation she creates.</p>

<p>If we concatenate all of Bessie&#39;s responses of either &quot;HI&quot; or &quot;LO&quot; into a single string $S$, then the number of times Bessie says &quot;HILO&quot; is the number of length $4$ substrings of $S$ that are equal to &quot;HILO.&quot;</p>

<p>Bessie knows that Elsie will use this strategy; furthermore, she also knows the exact permutation that Elsie will use. However, Bessie has not decided on what value of $x$ to choose.</p>

<p>Help Bessie determine how many times she will say &quot;HILO&quot; for each value of $x$.</p>

### 입력

<p>The first line contains $N.$</p>

<p>The second line contains Elsie&#39;s permutation of size $N.$</p>

### 출력

<p>For each $x$ from $0$ to $N$, inclusive, output the number of times Bessie will say HILO on a new line.</p>