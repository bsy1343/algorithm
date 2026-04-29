# [Platinum III] The Interview Problem - 33329

[문제 링크](https://www.acmicpc.net/problem/33329)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 2, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are given a string $s$ consisting of parentheses ("<code>(</code>" and "<code>)</code>") and digits ("<code>0</code>" through "<code>9</code>"). From the string $s$, you construct another string $t$ by considering every character of $s$ in order and performing the following operations based on the character values:</p>

<ul>
	<li>"<code>(</code>": append "<code>(</code>" to $t$.</li>
	<li>"<code>)</code>": append "<code>)</code>" to $t$.</li>
	<li>$0 \leq c \leq 9$: delete any $c$ characters from $t$. It is guaranteed that it is always possible to do so. The deleted characters don't need to be consecutive.</li>
</ul>

<p>Is it possible to construct $t$ to be a balanced bracket sequence?</p>

### 입력

<p>The first line contains an integer $t$ ($1 \leq t \leq 10^{4}$), the number of test cases.</p>

<p>For each test case, you are given a non-empty string $s$ consisting of parentheses and digits ("<code>()0123456789</code>"). The length of the string will be at most $3 \cdot 10^{5}$ characters.</p>

<p>It is guaranteed that the total length of the strings will not exceed $3 \cdot 10^{5}$ characters.</p>

### 출력

<p>For each test case, output "<code>YES</code>" if it is possible to construct $t$ to be a balanced bracket sequence, and "<code>NO</code>" otherwise.</p>

<p>You may output each letter in any case (lowercase or uppercase). For example, the strings "<code>yEs</code>", "<code>yes</code>", "<code>Yes</code>", and "<code>YES</code>" will be accepted as a positive answer.</p>