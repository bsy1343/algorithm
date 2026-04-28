# [Platinum III] Variable Assignments - 30615

[문제 링크](https://www.acmicpc.net/problem/30615)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 11, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

2-sat, 그래프 이론, 강한 연결 요소

### 문제 설명

<p>Unfortunately, this year, you somehow managed to make your math teacher at school really angry with you. He wants to take his revenge but without raising any suspicion. After some thought, he comes up with a plan: he will hand you a list of very boring math exercises that you&#39;ll have to solve during the school&#39;s Christmas break...</p>

<p>So he comes up with the following exercise for you:</p>

<p>Let x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>n</sub> be variables.</p>

<p>You&#39;re given an ordered list of constraints (equations) of the form x<sub>i</sub> = x<sub>j</sub> or x<sub>i</sub> = -x<sub>j</sub>. The constraints are transitive, so if you&#39;re given x<sub>i</sub> = x<sub>j</sub> and x<sub>j</sub> = x<sub>k</sub>, then x<sub>i</sub> = x<sub>k</sub> holds true even if not explicitly given in the list.</p>

<p>Then for each constraint between two variables x<sub>i</sub> and x<sub>j</sub>, you must mark it with:</p>

<ul>
	<li>The letter N if it&#39;s a new constraint, meaning that x<sub>i</sub> and x<sub>j</sub> are so far not constrained in any way (neither directly or transitively).</li>
	<li>The letter E if it&#39;s an existing constraint, meaning that no new information is added (the constraint existed either directly or transitively).</li>
	<li>The letter C it&#39;s a contradicting constraint, meaning that it&#39;s impossible to fulfill the constraint given the previous ones. If you come across a contradiction the exercise ends and you don&#39;t mark the rest of the constraints.</li>
</ul>

<p>In addition, we consider that a constraint x<sub>i</sub> = x<sub>i</sub> is always existing and a constraint x<sub>i</sub> = -x<sub>i</sub> is always contradicting.</p>

<p>The exercise is difficult, but your teacher is kind enough to give an example with explanations:</p>

<p>Let&#39;s say we have N = 4 variables and the following M = 7 constraints:</p>

<ol>
	<li>x<sub>1</sub> = x<sub>2</sub></li>
	<li>x<sub>3</sub> = -x<sub>4</sub></li>
	<li>x<sub>1</sub> = -x<sub>4</sub></li>
	<li>x<sub>1</sub> = x<sub>3</sub></li>
	<li>x<sub>2</sub> = -x<sub>4</sub></li>
	<li>x<sub>2</sub> = -x<sub>3</sub></li>
	<li>x<sub>1</sub> = -x<sub>4</sub></li>
</ol>

<p>They&#39;re marked as follows:</p>

<ol>
	<li>Is a new constraint, as x<sub>1</sub> and x<sub>2</sub> weren&#39;t bound in any way. (N)</li>
	<li>Is a new constraint, as x<sub>3</sub> and x<sub>4</sub> weren&#39;t bound in any way. (N)</li>
	<li>Is a new constraint, as x<sub>1</sub> and x<sub>4</sub> weren&#39;t bound in any way. (N)</li>
	<li>Is an existing constraint due to the transitive property from constraints 2 and 3: From x<sub>1</sub> =-x<sub>4</sub> and -x<sub>4</sub> = x<sub>3</sub> we can get x<sub>1</sub> = x<sub>3</sub>. (E)</li>
	<li>Is an existing constraint too, by using transitivity on constraints 1 and 2. (E)</li>
	<li>Is a contradiction, because applying the transitive property at constraints 1 and 4 gives us x<sub>2</sub> = x<sub>3</sub> which cannot hold at the same time with x<sub>2</sub> = -x<sub>3</sub>. (C)</li>
</ol>

<p>Since we&#39;ve reached a contradiction, the exercise stops.</p>

<p>The only thing that your teacher didn&#39;t knew is that you&#39;re really good at programming. In order to quickly solve all the exercises and get your time back, you&#39;ve decided to write a program that automatically solves any instance of this exercise.</p>

### 입력

<p>The first line of the input contains two integers N and M separated with a single whitespace character (1 &le; N &le; 10<sup>6</sup>, 1 &le; M &le; 10<sup>6</sup>). N is the number of variables (from x<sub>1</sub> to x<sub>N</sub>). After the first line there are M more lines, each with two integers I and J separated with a whitespace character and with I&isin; [1, N] and J&isin; [-N, 1]&cup; [1, N]. Each (I,J) pair represents a constraint. If J&gt;0 then it represents the constraint x<sub>I</sub> = x<sub>J</sub>. If J&lt;0 then it represents the constraint x<sub>I</sub> = -x<sub>|J|</sub>. Although not necessary for the solution, you can assume that I&lt;|J| holds for all input data if you want.</p>

### 출력

<p>The output must be K lines, each with a single character which can be either N, E or C. The character at line i in the output is what you mark the i-th constraint of the input. It holds that 1&le; K &le; N, depending on if there&#39;s a contradiction.</p>