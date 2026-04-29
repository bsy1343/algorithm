# [Platinum II] Copycat Catcher - 32479

[문제 링크](https://www.acmicpc.net/problem/32479)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 109, 정답: 37, 맞힌 사람: 34, 정답 비율: 50.000%

### 분류

문자열, 해싱

### 문제 설명

<p>Your university recently established the Graduate Code Plagiarism Control (GCPC) initiative to get hold of the ever-increasing load on the graders for the computer science assignments. Currently, the graders need to check the code of assignments manually for plagiarism. The GCPC aims to simplify this part of the graders' jobs by performing the plagiarism checks automatically.</p>

<p>Code consists of tokens separated by spaces. Tokens are strings of alphabetical letters, numerals, and brackets. If a token consists of only a single alphabetical letter (upper or lowercase), it is a variable in the code.</p>

<p>The GCPC wants the plagiarism checker to compare query pieces of code to a reference code. Specifically, it should check whether each query could have been obtained by selecting a contiguous string of tokens from the reference and consistently renaming variables.</p>

<p>Variables are consistently renamed if no two occurrences of the same variable are renamed to different variables, and if no two different variables are renamed to the same variable.</p>

<p>The GCPC has asked you to develop the plagiarism checker.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A description of the reference, consisting of:
	<ul>
		<li>One line containing an integer $n$ ($1\leq n \leq 2\,000$), the number of tokens in the reference.</li>
		<li>One line containing $n$ tokens, each consisting only of the characters '<code>a</code>'-'<code>z</code>', '<code>A</code>'-'<code>Z</code>', '<code>0</code>'-'<code>9</code>', '<code>(</code>' and '<code>)</code>'.</li>
	</ul>
	</li>
	<li>An integer $q$ ($1 \leq q \leq 2\,000$), the number of queries.</li>
	<li>$2\cdot q$ lines, each two lines in the same format as the reference.</li>
</ul>

<p>It is guaranteed that each query as well as the reference consist of at most $2\,000$ characters (excluding spaces). Tokens are separated by single spaces.</p>

### 출력

<p>For each query, output "<code>yes</code>" if the query could have been obtained from the reference, and "<code>no</code>" otherwise.</p>