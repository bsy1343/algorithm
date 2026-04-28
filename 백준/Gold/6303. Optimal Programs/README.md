# [Gold III] Optimal Programs - 6303

[문제 링크](https://www.acmicpc.net/problem/6303)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

구현, 브루트포스 알고리즘, 정렬, 시뮬레이션, 백트래킹

### 문제 설명

<p>As you know, writing programs is often far from being easy. Things become even harder if your programs have to be as fast as possible. And sometimes there is reason for them to be. Many large programs such as operating systems or databases have &ldquo;bottlenecks&rdquo; &ndash; segments of code that get executed over and over again, and make up for a large portion of the total running time. Here it usually pays to rewrite that code portion in assembly language, since even small gains in running time will matter a lot if the code is executed billions of times.</p>

<p>In this problem we will consider the task of automating the generation of optimal assembly code. Given a function (as a series of input/output pairs), you are to come up with the shortest assembly program that computes this function.</p>

<p>The programs you produce will have to run on a stack based machine, that supports only five commands: ADD, SUB, MUL, DIV and DUP. The first four commands pop the two top elements from the stack and push their sum, difference, product or integer quotient, respectively, on the stack. The DUP command pushes an additional copy of the top-most stack element on the stack.</p>

<p>So if the commands are applied to a stack with the two top elements a and b (shown to the left), the resulting stacks look as follows:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6303.%E2%80%85Optimal%E2%80%85Programs/0a4e81e3.png" data-original-src="https://www.acmicpc.net/upload/images2/stack.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:262px; width:497px" /></p>

<p>At the beginning of the execution of a program, the stack will contain a single integer only: the input. At the end of the computation, the stack must also contain only one integer; this number is the result of the computation.</p>

<p>There are three cases in which the stack machine enters an error state:</p>

<ul>
	<li>A DIV-command is executed, and the top-most element of the stack is 0.</li>
	<li>A ADD, SUB, MUL or DIV-command is executed when the stack contains only one element.</li>
	<li>An operation produces a value greater than 30000 in absolute value.</li>
</ul>

### 입력

<p>The input consists of a series of function descriptions. Each description starts with a line containing a single integer n (n &le; 10), the number of input/output pairs to follow. The following two lines contains n integers each: x1, x2, ..., xn in the first line (all different), and y1, y2, ..., yn in the second line. The numbers will be no more than 30000 in absolute value.</p>

<p>The input is terminated by a test case starting with n = 0. This test case should not be processed.</p>

### 출력

<p>You are to find the shortest program that computes a function f, such that f(x) = yi for all i &isin; {1, ..., n}. This implies that the program you output may not enter an error state if executed on the inputs xi (although it may enter an error state for other inputs). Consider only programs that have at most 10 statements.</p>

<p>For each function description, output first the number of the description. Then print out the se- quence of commands that make up the shortest program to compute the given function. If there is more than one such program, print the lexicographically smallest. If there is no program of at most 10 statements that computes the function, print the string &ldquo;Impossible&rdquo;. If the shortest program consists of zero commands, print &ldquo;Empty Sequence&rdquo;.</p>

<p>Output a blank line after each test case.</p>