# [Platinum I] First Solved, Last Coded - 30601

[문제 링크](https://www.acmicpc.net/problem/30601)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 17, 맞힌 사람: 16, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In ICPC, teamwork is everything. That&#39;s why everyone on your team has a well-defined role: Sol the Solver can solve any problem in the problem set, Codie the Coder can implement any solution that Sol comes up with, and you... are the glue that holds everything together. Sol and Codie are very picky about the order of problems they would solve/code, and your job is to satisfy their preferences.</p>

<p>There will be $n$ problems in the upcoming contest, and you know the general topic of each problem: greedy, geometry, graphs, etc. For simplicity, we will represent each topic with an integer from $1$ to $n$. These integers don&#39;t have to be distinct, that is, multiple problems in the contest can have the same topic.</p>

<p>Sol wants to solve problems in a specific order of topics: first, the problem with the topic $a_1$, after that, the problem with the topic $a_2$, \ldots, and finally, the problem with the topic $a_n$. Codie also has a preference list: $b_1, b_2, \ldots, b_n$, only willing to code problems in that order of topics.</p>

<p>Your job during the contest will be to take solution sheets from Sol and hand them to Codie in the correct order. As your team only has one table to work with, you don&#39;t have enough space to arrange all the solutions neatly. Thus, you came up with the following workflow: you will ask Sol for solutions (who will hand them to you in order $a_1, a_2, \ldots, a_n$), store them in a stack on your part of the table, and hand them to Codie to code (in order $b_1, b_2, \ldots, b_n$).</p>

<p>More formally, at any moment during the contest, you have (at most) two actions you can make:</p>

<ul>
	<li>If there are still any unsolved problems remaining, ask Sol for another solution and put it on top of your stack of solution sheets. This action is denoted by the character &#39;<code>S</code>&#39;.</li>
	<li>If your stack is not empty, take the solution sheet from the top of your stack and give it to Codie to implement. This action is denoted by the character &#39;<code>C</code>&#39;.</li>
</ul>

<p>For the given lists of Sol&#39;s and Codie&#39;s preferences, find a sequence of actions that ensures that all problems are solved and coded in the correct order. Consider all solving and coding times insignificant --- managing solution sheets is a much harder and more important job anyway.</p>

### 입력

<p>The first line contains a single integer $n$, denoting the number of problems in the contest ($1 \le n \le 100$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$, denoting Sol&#39;s preferred order of topics ($1 \le a_i \le n$).</p>

<p>The third line contains $n$ integers $b_1, b_2, \ldots, b_n$, denoting Codie&#39;s preferred order of topics ($1 \le b_i \le n$).</p>

<p>The given lists are equal as multisets: every integer occurs the same number of times in $A$ and in $B$.</p>

### 출력

<p>If your task is impossible, print &quot;<code>NO</code>&quot;. Otherwise, print &quot;<code>YES</code>&quot; on the first line, followed by the sequence of actions on the second line: a string consisting of $2n$ characters &#39;<code>S</code>&#39; or &#39;<code>C</code>&#39; ($n$ of each), describing your actions in order.</p>

<p>You are not allowed to ask Sol for more solutions if all $n$ problems have already been solved, or give Codie a solution with the wrong topic. If there are multiple answers, print any of them.</p>