# [Platinum III] Homework - 25409

[문제 링크](https://www.acmicpc.net/problem/25409)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 20, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 파싱, 스택, 문자열, 트리

### 문제 설명

<p>Little Helena recently finished her first year of primary school. She is a model student, has straight A&rsquo;s, and has a huge passion for mathematics. She is currently on a well-deserved vacation with her family, but she&rsquo;s starting to miss her daily math homework. Luckily, her older brother decided to quench her intellectual thirst, and gave her the following problem.</p>

<p>A <em>valid expression</em> is defined recursively as follows:</p>

<ul>
	<li>the string <code>?</code> is a valid expression which represents a number.</li>
	<li>if $A$ and $B$ are valid expressions, then so are <code>min(</code>$A$<code>,</code>$B$<code>)</code> and <code>max(</code>$A$<code>,</code>$B$<code>)</code>, where the former represents a function returning the smaller of its two arguments, while the latter represents a function returning the larger of its two arguments.</li>
</ul>

<p>For example, expressions <code>min(min(?,?),min(?,?))</code> and <code>max(?,max(?,min(?,?)))</code> are valid according to the definition above, but expressions <code>??</code>, <code>max(min(?))</code> and <code>min(?,?,?)</code>are not.</p>

<p>Helena is given a valid expression containing a total of $N$ question marks. Each question mark is to be replaced with a number from the set ${1, 2, \dots, N}$ in such a way that each number from this set appears exactly once in the expression. In other words, the question marks are replaced by a permutation of the numbers from $1$ to $N$.</p>

<p>Once the question marks have been replaced by numbers, the expression can be evaluated and its value will be an integer between $1$ and $N$. Considering all the ways of assigning numbers to question marks, how many different values can Helena obtain after evaluating the expression?</p>

### 입력

<p>The first and only line contains a single valid expression.</p>

### 출력

<p>Output a single integer between $1$ and $N$, the number of different values obtainable by evaluating the expression.</p>

### 제한

<p>In all subtasks it holds that $2 &le; N &le; 1\,000\,000$.</p>