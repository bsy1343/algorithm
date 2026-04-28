# [Bronze II] Fastestest Function - 25985

[문제 링크](https://www.acmicpc.net/problem/25985)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 385, 정답: 248, 맞힌 사람: 210, 정답 비율: 66.879%

### 분류

수학, 사칙연산

### 문제 설명

<p>You are working as a software developer for the Bug Acquisition Programming Company. They developed a specific piece of software called Program C that they sell to their clients. For the past weeks, you have been working on optimising a specific function <code>foo</code> in the main code path in Program C. You have made it a lot faster and would like to show off to your boss about it.</p>

<p>Your IDE has a nice tool that allows you to profile your code and tell you what percentage of the total running time <code>foo</code> takes. You can run this on the version before your change and after your change. However, you think it looks a lot cooler if you can just tell your boss how much faster you have made <code>foo</code> itself.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $x$ and $y$ ($0 &lt; x, y &lt; 100$), where $x$ is the percentage of the total running time that <code>foo</code> took before optimising and $y$ the percentage of the total running time it took after optimising.</li>
</ul>

### 출력

<p>Output the factor of how much faster <code>foo</code> got after your optimization.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>