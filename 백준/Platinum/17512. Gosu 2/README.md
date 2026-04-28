# [Platinum III] Gosu 2 - 17512

[문제 링크](https://www.acmicpc.net/problem/17512)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 219, 정답: 98, 맞힌 사람: 87, 정답 비율: 51.786%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Ho is an expert in martial arts called <em>Taebo</em>. She runs a Taebo school, and there are $N$ students in her school. To increase the inner competition inside the Taebo school, she is going to make a <em>Taebo ranking website</em>&nbsp;which assigns all students to a certain rank. To find a suitable rank, Ho made all $N(N-1)/2$ pairs of students do a Taebo matchup with each other. In a Taebo matchup, exactly one person wins the match, and another person loses the match. The outcome of Taebo matchups may not be very simple: For example, there might be a case that student A beats B, B beats C, and C beats A. Such situation would make the ranking assignment pretty complicated as there is no definite winner from those three students.</p>

<p>To overcome the issue, Ho will find a <strong>standard ranking chain</strong>&nbsp;and assign other students with respect to such a chain. A <strong>standard ranking chain</strong>&nbsp;of length $K$, is a sequence of $K$ different students $S_1,\ S_2,\ \cdots,\ S_k$ such that $S_i$ beats $S_j$ if and only if $i &lt; j$. In other words, $S_1$ can beat all other students in the chain, $S_2$ can beat all other students in the chain except $S_1$, $S_3$ can beat all other students in the chain except $S_1, S_2$, and so on, and $S_k$ can beat no other student in the chain. Ho&#39;s website will assign other students based on such a chain, which will make the assignment easier.</p>

<p>Ho is not only an expert in Taebo, but she is a math genius too. Ho knows, that for any Taebo matchup, she can find the standard ranking chain of length $1 + \lfloor \log_2(N) \rfloor$, where $\log_2(N)$ is a base 2 logarithm. In other words, for any $k \geq 1$ such that $2^{k-1} \le N$, Ho can find a standard ranking chain of such a length.&nbsp;</p>

<p>While Ho is very good at computer programming too, she is a little bit lazy, therefore she delegates her work to you. You should find a standard ranking chain of length exactly $1 + \lfloor \log_2(N) \rfloor$.</p>

### 입력

<p>In the first line, the number of test cases $T$ is given. For each test case, the following instances are given:</p>

<p>In the first line, the number of students $N$ is given.</p>

<p>In the $i$-th line of the next $N$ lines, a string of $N$ characters, $s_i$, consisting of <code>W</code>, <code>L</code>, and <code>-</code>&nbsp;is given. Let&#39;s denote the $j$-th character of $s_i$ as $s_{i,\ j}$. $s_{i,\ j}$ is given as follows:</p>

<ul>
	<li>$s_{i,\ j}=$ <kbd>-</kbd>, if $i=j$.</li>
	<li>$s_{i,\ j}=$ <kbd>W</kbd>, if student $i$ won student $j$.</li>
	<li>$s_{i,\ j}=$ <kbd>L</kbd>, if student $j$ won student $i$.</li>
</ul>

<p>&nbsp;</p>

<ul>
	<li>$1 \le T \le 250\,000$</li>
	<li>$1 \le N \le 512$</li>
	<li>The sum of $N^2$ for all test cases does not exceed $2\,500\,000$.</li>
	<li>$s_{i, i} =$ <kbd>-</kbd> ($1 \le i \le N$)</li>
	<li>If $i \neq j$, then $s_{i, j}=$ <kbd>W</kbd> or $s_{i, j}=$ <kbd>L</kbd>. ($1 \le i \le N$)</li>
	<li>If $s_{i, j} = $ <kbd>W</kbd>, then $s_{j, i} = $ <kbd>L</kbd>. ($1 \le i,\ j \le N$)</li>
	<li>If $s_{i, j} = $ <kbd>L</kbd>, then $s_{j, i} = $&nbsp;<kbd>W</kbd>. ($1 \le i,\ j \le N$)</li>
</ul>

### 출력

<p>For each test case, print exactly $1 + \lfloor \log_2(N) \rfloor$ integers in a single line, denoting the students in a standard ranking chain in the order of their skills. It can be proved that such a chain exists for every possible input.</p>