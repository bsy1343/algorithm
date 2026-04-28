# [Platinum IV] STOGOVI - 10555

[문제 링크](https://www.acmicpc.net/problem/10555)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 74, 정답: 31, 맞힌 사람: 26, 정답 비율: 48.148%

### 분류

자료 구조, 최소 공통 조상, 희소 배열, 스택, 트리

### 문제 설명

<p>Mirko is playing with stacks. In the beginning of the game, he has an empty stack denoted with number 0. In the ith step of the game he will choose an existing stack denoted with v, copy it and do one of the following actions:</p>

<ol style="list-style-type:lower-alpha">
	<li>place number i on top of the new stack</li>
	<li>remove the number from the top of the new stack</li>
	<li>choose another stack denoted with w and count how many different numbers exist that are in the new stack and in the stack denoted with w</li>
</ol>

<p>The newly created stack is denoted with i.</p>

<p>Mirko doesn&rsquo;t like to work with stacks so he wants you to write a programme that will do it for him. For each operation of type b output the number removed from stack and for each operation of type c count the required numbers and output how many of them there are.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 300 000), the number of steps in Mirko&rsquo;s game.</p>

<p>The steps of the game are chronologically denoted with the first N integers.</p>

<p>The ith of the following N lines contains the description of the ith step of the game in one of the following three forms:</p>

<ul>
	<li>&quot;a v&quot; for operation of type a.</li>
	<li>&quot;b v&quot; for operation of type b.</li>
	<li>&quot;c v w&quot; for operation of type c.</li>
</ul>

<p>The first character in the line denotes the type of operation and the following one or two denote the accompanying stack labels that will always be integers from the interval [0, i &minus; 1].</p>

<p>For each operation of type b, the stack we&rsquo;re removing the element from will not be empty.</p>

### 출력

<p>For each operation type b or c output the required number, each in their own line, in the order the operations were given in the input.</p>

### 힌트

<p>Clarification of the first example: In the beginning, we have the stack S0 = {}. In the first step, we copy S0 and place number 1 on top, so S1 = {1}. In the second step, we copy S1 and place 2 on top of it, S2 = {1, 2}. In the third step we copy S2 and remove number 2 from it, S3 = {1}. In the fourth step we copy S2 and denote the copy with S4, then count the numbers appearing in the newly created stack S4 and stack S3, the only such number is number 1 so the solution is 1. In the fifth step we copy S4 and remove number 2 from it, S5 = {1}.</p>