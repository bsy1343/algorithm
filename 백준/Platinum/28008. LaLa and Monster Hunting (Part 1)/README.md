# [Platinum I] LaLa and Monster Hunting (Part 1) - 28008

[문제 링크](https://www.acmicpc.net/problem/28008)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 18, 맞힌 사람: 12, 정답 비율: 29.268%

### 분류

볼록 껍질, 기하학, 정렬, 스위핑

### 문제 설명

<p>A dreadful monster has been witnessed in a forest near the city of $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ Sharia, and a group of valorous adventurers will hunt it down in few days before it hurts anyone. However, $\color{blue}{\text{LaLa}}$ knows that the real reason those adventurers are willing to take the risk is to obtain the rare $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ stone that the monster is known to produce in its intestines. $\color{blue}{\text{LaLa}}$ would like to obtain the $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ stone before they do, as it is known to be quite beautiful.</p>

<p>$\color{blue}{\text{LaLa}}$ will first locate the monster with her $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$. $\color{blue}{\text{LaLa}}$ has placed a bunch of $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ tools within the forest, each of which has some power associated with it.</p>

<p>Consider the circles centered at each $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ tool with radius equal to its power. $\color{blue}{\text{LaLa}}$&#39;s $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ will successfully locate the monster if and only if the convex hull of the circles contains the location of the monster.</p>

<p>Write a program that determines whether $\color{blue}{\text{LaLa}}$ will be able to locate the monster.</p>

### 입력

<p>The input is given in the following format:</p>

<blockquote>
<p>$N$</p>

<p>$x_0$ $y_0$ $r_0$</p>

<p>$x_1$ $y_1$ $r_1$</p>

<p>$\vdots$</p>

<p>$x_{N-1}$ $y_{N-1}$ $r_{N-1}$</p>
</blockquote>

<p>where $N$ is the number of $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ tools placed in the forest, the $i$-th of which is located at $(x_i, y_i)$ and has power $r_i$. Here, assume that the forest is a two-dimensional plane where the monster is located at $(0, 0)$.</p>

<p>The input satisfies the following constraints:</p>

<ul>
	<li>All the numbers in the input are integers.</li>
	<li>$1 \le N \le 1\,000\,000$</li>
	<li>$-1\,000\,000 \le x_i, y_i \le 1\,000\,000$ for all integers $0 \le i &lt; N$</li>
	<li>$0 \le r_i \le 1\,000\,000$ for all integers $0 \le i &lt; N$</li>
	<li><strong>The distance between point $(0, 0)$ and the boundary of the convex hull of $N$ circles, $i$-th of which is centered at $(x_i, y_i)$ and has radius $r_i$, is at least $1$</strong>.</li>
</ul>

### 출력

<p>If $\color{blue}{\text{LaLa}}$&#39;s $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ will successfully locate the monster, print a single string &quot;Yes&quot;. Otherwise, print a single string &quot;No&quot;. You may print each character in either case (lower or upper).</p>

### 힌트

<p>The following illustrates the configuration of the $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ tools for the sample tests. The red curve denotes the boundary of the convex hull.</p>

<table class="table table-bordered th-center td-center">
	<tbody>
		<tr>
			<th>First Sample</th>
			<th>Second Sample</th>
			<th>Third Sample</th>
		</tr>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/d46ccaea-64ae-4f46-9021-26c25f1967f5/-/preview/" style="width: 355px; height: 269px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/350d4e41-4328-41ab-8203-3cba8a0c3c42/-/preview/" style="width: 414px; height: 403px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/b86e3e05-2eac-46ff-a247-f711d8d947eb/-/preview/" style="width: 171px; height: 171px;" /></td>
		</tr>
	</tbody>
</table>