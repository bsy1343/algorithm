# [Gold I] homework - 25037

[문제 링크](https://www.acmicpc.net/problem/25037)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 7, 정답 비율: 30.435%

### 분류

이분 탐색

### 문제 설명

<p>There are $N$ ($2 \le N \le 1000$) students in line, name them $s_0, s_1, \cdots, s_{N-1}$ by their order.</p>

<p>For each student, you have to check whether he/she did the homework or not, and you can ask:</p>

<ul>
	<li><code>Q1</code> defined as <code>0</code> standing for &quot;Have you finished the homework?&quot; or</li>
	<li><code>Q2</code> defined as <code>1</code> standing for &quot;Are you late for the homework?&quot;.</li>
</ul>

<p>However, due to the weird culture in the school, if a student has to answer &quot;<strong>no</strong>&quot; then he/she will hesitate to answer until the class ends. (Of course, you know that this student expressed &quot;<strong>no</strong>&quot;.)</p>

<p>You prepare the questions $q_0, q_1, \cdots, q_{N-1}$ for the students and they will come to answer in order, and you have to wait for their answers.</p>

<ul>
	<li>i.e., if $s_0, s_1, \cdots s_{M-1}$ answer <strong>YES</strong> and $s_M$ expresses &quot;<strong>no</strong>&quot;, then you will only receive $M$ <strong>YES</strong>&#39;s.</li>
	<li>so if $s_0, s_1, \cdots s_{N-1}$ answer <strong>YES</strong> then you will receive $N$ <strong>YES</strong>&#39;s.</li>
</ul>

<p>Here, for the COVID-19 situation, you write the questions on the computer and upload them online and what you receive is a big <strong>YES</strong> on the monitor. You can only get the sequence of answers.</p>

<p>However, the online system was broken so the questions get arranged by a pre-chosen order $i_0, i_1, \cdots, i_{N-1}$.</p>

<ul>
	<li>i.e., if you input $q_0, q_1, \cdots, q_{N-1}$, then the questions will be asked by the order $q_{i_0}, q_{i_1}, \cdots, q_{i_{N-1}}$.</li>
</ul>

<p>You can have at most $\lceil N + N\log_2 N \rceil$ classes to ask the questions.</p>

<p>Write a function <u><code>question</code></u>:</p>

<ul>
	<li>input parameter: a <code>Student</code> object containing the information of the students&#39; state and the order</li>
	<li>$\cdot$<code>.n()</code> returns the number of students; i.e., $N$
	<ul>
		<li>$\cdot$<code>.ask(Q)</code> returns the list of <code>&#39;YES&#39;</code>&rsquo;s (need not be a length of $N$) based on the question list <code>Q</code>
		<ul>
			<li>input parameter: a list of length $N$, consisting of <code>Q1</code> and <code>Q2</code></li>
			<li>return value: <code>[&#39;YES&#39;&nbsp;for j in range(</code>$M$<code>)]</code> where $M$ is the number of <strong>YES</strong>&#39;s: i.e., $M = \max\{m \le N \,\vert\, j &lt; m \Longrightarrow s_j \textrm{ answers } $<strong>YES</strong>$\textrm{ on } $<code>Q[</code>$i_j$<code>]</code>$\}$</li>
		</ul>
		</li>
	</ul>
	</li>
	<li>output: the list of input questions $q_0, q_1, \cdots, q_{N-1}$ that gets $N$ <strong>YES</strong>&#39;s and the order $i_0, i_1, \cdots, i_{N-1}$
	<ul>
		<li>in the order that you need to input to computer, and the order that $q_i$ is asked, respectively.</li>
	</ul>
	</li>
</ul>

<p>Assume every student either finished or was late for the homework, and the states do not change as the classes proceed.</p>

<p>Caution: The protected attributes in <code>Student</code> are named differently in the judging code.</p>

### 입력



### 출력

