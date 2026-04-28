# [Platinum III] BinCoin - 26282

[문제 링크](https://www.acmicpc.net/problem/26282)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 13, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

수학, 트리, 확률론, 해싱, 무작위화

### 문제 설명

<p>There are $n$ employees in the BinCoin company numbered from $1$ to $n$. The subordination structure in this company is a rooted tree. In other words:</p>

<ul>
	<li>There is one CEO in the company --- the main boss.</li>
	<li>Each other employee has exactly one direct superior.</li>
	<li>There are no cycles in the subordination structure.</li>
</ul>

<p>Moreover, due to the inexplicable love of the CEO of BinCoin for all the binary stuff, the subordination structure in the company is a <strong>binary</strong> rooted tree. That means each employee is directly superior to exactly zero or two other employees.</p>

<p>In the CEO&#39;s opinion, working in this company is almost as dangerous as in mines. So, employees should sign the waiver of claims sometimes. This process happens in the following way. Initially, CEO takes the journal, then recursively the following procedure is performed:</p>

<ul>
	<li>If an employee that holds the journal does not have any subordinates, they sign the waiver in the journal and give it back to their superior. The procedure stops if that was the CEO, who has no superior.</li>
	<li>Otherwise
	<ul>
		<li>they choose one of two of their direct subordinates uniformly at random and give the journal to one of them;</li>
		<li>when they get the journal back, they sign it;</li>
		<li>and then they give it to another direct subordinate;</li>
		<li>when they get it back again, they give it back to their superior. The procedure stops if that was the CEO, who has no superior.</li>
	</ul>
	</li>
</ul>

<p>All random choices are independent.</p>

<p>One day, the CEO realized that they could not remember the subordination tree. Fortunately, they have the journal with $k$ records. Each record is a sequence of employees in the order they&#39;ve signed in a journal.</p>

<p>Help CEO restore the subordination tree.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ --- the number of employees and the number of records in the journal ($1 \le n \le 999$; $50 \le k \le 100$).</p>

<p>Each of the next $k$ lines contains a permutation of integers from $1$ to $n$ --- the order of employees in the corresponding record.</p>

<p>It is guaranteed that the input was obtained as described in the statement with a real random choice.</p>

### 출력

<p>Output $n$ integers $p_i$. If $i$ is a CEO, then $p_i$ should be $-1$. Otherwise, $p_i$ should be the index of the direct superior of $i$-th employee.</p>

<p>Your output should correspond to a binary rooted tree. If there are several trees satisfying the input, you can output any one of them.</p>