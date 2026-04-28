# [Platinum II] Team Contest - 24947

[문제 링크](https://www.acmicpc.net/problem/24947)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 145, 정답: 69, 맞힌 사람: 56, 정답 비율: 44.800%

### 분류

그리디 알고리즘, 정렬, 애드 혹, 집합과 맵

### 문제 설명

<p>There are $N$ beavers in JOI University. All of them are working on competitive programming. Each beaver has three abilities: <strong>consideration skill</strong>, <strong>implementation skill</strong>, and <strong>luck</strong>. If the value of an ability is large, it means the level of the ability is high. For each $i$ ($1 &le; i &le; N$), the consideration skill of the beaver $i$ is $X_i$, the implementation skill of the beaver $i$ is $Y_i$, and the luck of the beaver $i$ is $Z_i$.</p>

<p>This year, the beavers of JOI University will attend a programming contest for teams. In this contest, the participants solve programming tasks, and each team consists of three beavers. Bitaro is a coach of JOI University. Since teamwork is very important, Bitaro decided to choose three beavers among the $N$ beavers and make a team so that the following condition is satisfied.</p>

<p><strong>Condition</strong> Every member in the team has an advantage. This means every member has an ability whose value is strictly larger than the values of the same ability of the other two members.</p>

<p>Among possible teams satisfying the above condition, Bitaro wants to choose a team whose <strong>total ability</strong> is as large as possible. Here, the total ability of a team is defined as the sum of the maximum value of the consideration skill of the members of the team, the maximum value of the implementation skill of the members of the team, and the maximum value of the luck of the members of the team.</p>

<p>Write a program which, given information of the abilities of each beaver, determines whether it is possible to make a team satisfying the above condition, and, if it is possible to make a team, calculate the maximum possible value of the total ability of a team.</p>

### 입력

<p>Read the following data from the standard input. Given values are all integers.</p>

<p>$\begin{align*} &amp; N \\ &amp; X_1 \, Y_1 \, Z_1 \\ &amp; X_2 \, Y_2 \, Z_2 \\ &amp; \vdots \\ &amp; X_N \, Y_N \, Z_N \end{align*}$</p>

### 출력

<p>Write one line to the standard output. The output should contain the maximum possible value of the total ability of a team. If it is impossible to make a team satisfying the condition, output <code>-1</code>.</p>

### 제한

<ul>
	<li>$3 &le; N &le; 150\,000$.</li>
	<li>$1 &le; X_i &le; 100\,000\,000$ ($= 10^8$) ($1 &le; i &le; N$).</li>
	<li>$1 &le; Y_i &le; 100\,000\,000$ ($= 10^8$) ($1 &le; i &le; N$).</li>
	<li>$1 &le; Z_i &le; 100\,000\,000$ ($= 10^8$) ($1 &le; i &le; N$).</li>
</ul>