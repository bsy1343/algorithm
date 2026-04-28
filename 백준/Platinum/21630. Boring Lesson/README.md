# [Platinum III] Boring Lesson - 21630

[문제 링크](https://www.acmicpc.net/problem/21630)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 자료 구조, 문자열, 최단 경로, 데이크스트라, 백트래킹, 우선순위 큐

### 문제 설명

<p>Ildar is attending a boring online lesson. In order to do something, he transforms strings. Initially, he has a string $s$. Ildar wants to get a string $t$ from the string $s$ in minimum number of steps. In one step he can:</p>

<ul>
	<li>Remove a character from any position.</li>
	<li>Insert any character to any position. I.e. before the first character, between two adjacent characters, or after the last character.</li>
	<li>Replace character at any position with any other character.</li>
</ul>

<p>The minimum number of such steps needed to transform string $s$ into string $t$ is also known as <em>edit distance</em> between $s$ and $t$.</p>

<p>Ildar has $n$ favorite strings $w_i$. Consider sequence of strings that would occur during the transformation: $s = x_1$, $x_2$, \dots, $x_{m - 1}$, $x_m = t$. Ildar wants as many of $w_i$ as possible to appear in the set $\{x_1, x_2, \dots, x_m\}$. Help Ildar to find out what is the minimum number of steps needed to transform $s$ to $t$, and what is the maximum number of $w_i$ that can appear during this process, also print these strings.</p>

### 입력

<p>The first line of input contains the string $s$.</p>

<p>The second line of input contains the string $t$.</p>

<p>The third line contains a single integer $n$ ($0 \le n \le 1\,000$). The following $n$ lines contain strings $w_i$.</p>

<p>All strings consist of lowercase English letters, are non-empty, their lengths don&#39;t exceed $10\,000$. The total length of all strings doesn&#39;t exceed $10\,000$. All strings are distinct, including $s \neq t$, $s \neq w_i$ and $t \neq w_i$.</p>

### 출력

<p>Output two integers at the first line of output --- the minimum number of steps, needed to transform $s$ into $t$, and the maximum number of strings $w_i$ that can appear in the process of transformation.</p>

<p>After that, output strings $w_i$ that can appear during the transformation, in the same order they would appear. If there are multiple correct answers, you can output any of them.</p>

### 힌트

<p>In the second example one of correct transformations is the following:</p>

<p>&quot;longlong&quot; $\rightarrow$ &quot;<strong>longleng</strong>&quot; $\rightarrow$ &quot;dongleng&quot; $\rightarrow$ &quot;dongleg&quot; $\rightarrow$ &quot;<strong>dongle</strong>&quot; $\rightarrow$ &quot;donble&quot; $\rightarrow$ &quot;double&quot;</p>

<p>Ildar&#39;s favorite strings are highlighted.</p>