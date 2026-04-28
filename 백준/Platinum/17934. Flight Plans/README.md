# [Platinum III] Flight Plans - 17934

[문제 링크](https://www.acmicpc.net/problem/17934)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색

### 문제 설명

<p>As you are probably aware, flight pricing can sometimes be surprisingly complex. For example, it can often be cheaper to take a much longer flight with several legs instead of flying directly between two airports. One of the reasons pricing seems to be complex is that airlines often try to obfuscate exactly how pricing works, in order to ensure that their customers choose more expensive flights.</p>

<p>One particular airline has decided to take this obfuscation to the next level; they do not even offer an automated search of their flights. Instead, they describe their flights in a very peculiar format. For every one of their $N$ airports (which are numbered between $0$ and $N - 1$), they list either:</p>

<ul>
	<li>what airports they travel to from this airport, or</li>
	<li>what airports they <em>do not</em>&nbsp;travel to from this airport.</li>
</ul>

<p>To compensate for this complexity, the airline sets the price of every direct flight between two airports to the same amount.</p>

<p>Can you write a program that, given the descriptions of all the flights the airline provides, determine the minimum number of flights required to travel from airport $s$ to airport $t$?</p>

### 입력

<p>The first line of input contains an integer $1 \le N \le 10^5$, the number of airports, and the two integers $s$ and $t$ ($0 \le s, t &lt; N$, $s \neq t$).</p>

<p>The next $N$ lines each describe the outgoing flights of an airport, starting with airport $0$. The line starts with a letter. If this letter is <code>N</code>, you will get a list of all destination airports from this airport. If this letter is <code>C</code>, you will get a list of all airports that are <em>not</em>&nbsp;destinations from this airport.</p>

<p>Following this letter is an integer $m$, the number of airports in the list. Finally, there will $m$ unique numbers $a_i$ ($0 \le a_i &lt; N$) on the line, the airports in the list.</p>

<p>The sum of $m$ over all airports is at most $2 \cdot 10^5$.</p>

### 출력

<p>Output a single integer, the minimum number of flights required to travel from airport $s$ to airport $t$.</p>

<p>If there is no path, output &quot;<code>impossible</code>&quot;.</p>