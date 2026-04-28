# [Gold II] Suspects and Witnesses - 26423

[문제 링크](https://www.acmicpc.net/problem/26423)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 30, 맞힌 사람: 23, 정답 비율: 39.655%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Ada baked some cookies for her birthday party where she invited $\mathbf{N}$ guests, labeled $1$ to $\mathbf{N}$. When all the guests have arrived and the party is about to start, something terrible has happened &mdash; someone stole the cookies!</p>

<p>Ada puts on her detective hat and starts questioning her guests. She gathered $\mathbf{M}$ witness statements of the form: <em>Guest x: &quot;Guest y did not steal the cookies.&quot;</em></p>

<p>Ada knows that, if a guest is innocent (did not steal a cookie), then all their witness statements must be true. Note that Ada does not know whether any statement made by a cookie stealer is correct.</p>

<p>Lastly, Ada has an informant who told her there can be at most $\mathbf{K}$ cookie stealers. With this information, can you help Ada find out the number of guests who can be proved to be innocent?</p>

<p>Note that it is possible that no guest actually stole the cookies, and Ada simply forgot how many cookies she baked.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains three integers $\mathbf{N}$, $\mathbf{M}$, and $\mathbf{K}$: the number of guests, the number of witness statements, and the maximum number of cookie stealers, respectively.</p>

<p>The next $\mathbf{M}$ lines describe the witness statements. The $i$-th line contains two integers $\mathbf{A_i}$ and $\mathbf{B_i}$, which means the witness statement <em>Guest $\mathbf{A_i}$: &quot;Guest $\mathbf{B_i}$ did not steal the cookies.&quot;</em></p>

### 출력

<p>For each test case, output one line containing <code>Case #$x$: $y$</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of guests that can be proved to be innocent.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$2 \le \mathbf{N} \le 10^5$.</li>
	<li>$1 \le \mathbf{M} \le 10^5$.</li>
	<li>$1 \le \mathbf{A_i} \le \mathbf{N}$, for all $i$.</li>
	<li>$1 \le \mathbf{B_i} \le \mathbf{N}$, for all $i$.</li>
	<li>$\mathbf{A_i} \neq \mathbf{B_i}$, for all $i$.</li>
	<li>$(\mathbf{A_i}, \mathbf{B_i}) \neq (\mathbf{A_j}, \mathbf{B_j})$, for all $i \neq j$.</li>
</ul>