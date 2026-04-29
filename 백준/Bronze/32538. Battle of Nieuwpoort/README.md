# [Bronze I] Battle of Nieuwpoort - 32538

[문제 링크](https://www.acmicpc.net/problem/32538)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 68, 맞힌 사람: 62, 정답 비율: 81.579%

### 분류

구현, 문자열, 수학

### 문제 설명

<p>The battle of Nieuwpoort occurred in the year $1600$. This is famously easy to remember, because it ends in two zeros. Alas, not all historical events have been so obliging!</p>

<p>You suspect that the problem is with the fixation of historians on the decimal system. Maybe, given the year of another battle, there exists a small base (at most $16$) in which this year would also be easy to remember?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with $4$ tokens:
	<ul>
		<li>One integer $y$ ($1\leq y\leq 2024$, in base-$10$), the year of the battle.</li>
		<li>Three words $w$ ($2\leq |w|\leq 20$), naming the battle. The words only consist of English letters (<code>A-Z</code> and <code>a-z</code>).</li>
	</ul>
	</li>
</ul>

### 출력

<p>If it is possible to rewrite the year to make it easier to remember, output this base $b$ ($2\leq b\leq 16$, in base-$10$) and the year written in base-$b$. Otherwise, output "<code>impossible</code>".</p>

<p>The year in base-$b$ must end with "<code>00</code>" and must not start with '<code>0</code>'.</p>

<p>Use letters '<code>a</code>', '<code>b</code>', '<code>c</code>', etc. for the digits following '<code>9</code>' in bases higher than $10$.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>