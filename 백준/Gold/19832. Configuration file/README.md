# [Gold IV] Configuration file - 19832

[문제 링크](https://www.acmicpc.net/problem/19832)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 28, 맞힌 사람: 21, 정답 비율: 25.610%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 파싱, 시뮬레이션, 스택, 문자열, 집합과 맵

### 문제 설명

<p>Vadim develops a parser for configuration files of his project. A configuration file consists of blocks delimited with braces: &quot;<code>{</code>&quot; marks the beginning of the block, and &quot;}&quot; marks the end of the block. Blocks can be nested. One block can contains several other blocks.</p>

<p>There are variables in the configuration file. Each variable has a name that consists of at most ten lowercase English letters. Each variable has an integer value, initially all variables are set to $0$.&nbsp;</p>

<p>New values can be assigned to variables. Assigning a constant value to a variable is specified as &quot;<code>&lt;variable&gt;=&lt;number&gt;</code>&quot;, here <code>&lt;variable&gt;</code> is the variable&#39;s name, and <code>&lt;number&gt;</code> is an integer, its absolute value doesn&#39;t exceed $10^9$. The parser reads the file line after line. As it reads the assignment operation, it assigns the new value to the variable. This value is used until the end of the current block, after that the previous value is restored. If the current block has some nested blocks following the assignment, the new value of the variable is used inside those blocks.</p>

<p>A variable can also be assigned the value of another variable. Such operation is specified as &quot;<code>&lt;variable1&gt;=&lt;variable2&gt;</code>&quot;. When the parser reads such line, it assigns the current value of <code>variable2</code> to <code>variable1</code>. Similarly to the case of a constant value assignment, the new value is used until the end of the current block. After the end of the current block, the value that the variable had at the beginning of the block is restored.</p>

<p>For debugging purpose Vadim wants to print all values that are assigned when processing lines of the form &quot;<code>&lt;variable1&gt;=&lt;variable2&gt;</code>&quot;. Help him to debug the parser.</p>

### 입력

<p>Input data contains at least $1$ and at most $10^5$ lines. Each line has one of four types:</p>

<ul>
	<li><code>{</code> --- beginning of the block;</li>
	<li>} --- end of block;</li>
	<li><code>&lt;variable&gt;=&lt;number&gt;</code> --- assigning a constant value to a variable;</li>
	<li><code>&lt;variable1&gt;=&lt;variable2&gt;</code> --- assigning one variable to another, here <code>&lt;variable1&gt;</code> and <code>&lt;variable2&gt;</code> can be the same.</li>
</ul>

<p>It is guaranteed that the input is correct and corresponds to the statement. Input doesn&#39;t contain spaces.</p>

### 출력

<p>For each line that has the form &quot;<code>&lt;variable1&gt;=&lt;variable2&gt;</code>&quot; print the value that is assigned.</p>