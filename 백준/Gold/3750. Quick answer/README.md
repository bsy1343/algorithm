# [Gold II] Quick answer - 3750

[문제 링크](https://www.acmicpc.net/problem/3750)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 137, 정답: 28, 맞힌 사람: 14, 정답 비율: 25.000%

### 분류

자료 구조, 그래프 이론, 분리 집합

### 문제 설명

<p>Joe is fond of computer games. Now, he must solve a puzzling situation. In front of his eyes lies a huge map with fortified towns. His enemy is a very powerful and tricky character who can connect and disconnect the towns by giving some commands. Two towns are connected if they have been directly connected or interconnected through some other connected towns at some moment in time. When a town is disconnected it gets isolated and clears its own connection history, not the connection history of the other towns. Each connection is bi-directional. Initially the towns are isolated. Joe is asked to answer quickly if two towns are connected, according to the history of the character&rsquo;s commands.</p>

<p>Write a program which based on information input from a text file counts the number of yes answers and the number of no answers to questions of the kind: is town<sub>i</sub> connected with town<sub>j</sub>?&nbsp;</p>

### 입력

<p>The program reads data from a text file. Each data set in the file stands for a particular map and the associated character&rsquo;s commands, as follows:</p>

<ul>
	<li>The number of towns on the map N (N &le; 10000);</li>
	<li>A list of commands of the form:
	<ul style="list-style-type:lower-alpha">
		<li>c town<sub>i</sub> town<sub>j</sub>, where town<sub>i</sub> and town<sub>j</sub> are integers from 1 to no_of_towns. The command means that town<sub>i</sub> and town<sub>j</sub> get connected.</li>
		<li>d town<sub>i</sub>, where town<sub>i</sub> is an integer from 1 to no_of_towns. The command means that town<sub>i</sub> gets disconnected.</li>
		<li>q town<sub>i</sub> town<sub>j</sub>, where town<sub>i</sub> and town<sub>j</sub> are integers from 1 to no_of_towns. The command stands for the question: is town<sub>i</sub> connected with town<sub>j</sub>?</li>
		<li>e, that ends the list of commands</li>
	</ul>
	</li>
</ul>

<p>Each command is on a separate line. Commands (a), (b), (c) can appear in any order. The towns&rsquo; connectivity is updated after each command of type (a) or (b). Each command of type (c) is processed according to the current configuration.&nbsp;</p>

### 출력

<p>For example, the input file illustrated in the figure bellow corresponds to only one data set which stands for a map with 4 fortified towns. The character gives 9 commands. There are N<sub>1</sub> yes answered questions and N<sub>2</sub> no answered questions. The program prints these two numbers to the standard output on the same line, in the order: N<sub>1</sub> , N<sub>2</sub> as shown in the figure:&nbsp;</p>