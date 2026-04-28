# [Silver I] Web Navigation - 7353

[문제 링크](https://www.acmicpc.net/problem/7353)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 270, 정답: 45, 맞힌 사람: 32, 정답 비율: 19.048%

### 분류

구현, 자료 구조, 스택

### 문제 설명

<p>Standard web browsers contain features to move backward and forward among the pages recently visited. One way to implement these features is to use two stacks to keep track of the pages that can be reached by moving backward and forward. In this problem, you are asked to implement this.</p>

<p>The following commands need to be supported:</p>

<ul>
	<li>BACK: Push the current page on the top of the forward stack. Pop the page from the top of the backward stack, making it the new current page. If the backward stack is empty, the command is ignored.</li>
	<li>FORWARD: Push the current page on the top of the backward stack. Pop the page from the top of the forward stack, making it the new current page. If the forward stack is empty, the command is ignored.</li>
	<li>VISIT &lt;url&gt;: Push the current page on the top of the backward stack, and make the URL specified the new current page. The forward stack is emptied.</li>
	<li>QUIT: Quit the browser.</li>
</ul>

<p>Assume that the browser initially loads the web page at the URL http://www.acm.org/</p>

### 입력

<p><strong>The input begins with a single positive integer on a line by itself indicating the number of the cases following, each of them as described below. This line is followed by a blank line, and there is also a blank line between two consecutive inputs.</strong></p>

<p>Input is a sequence of commands. The command keywords BACK, FORWARD, VISIT, and QUIT are all in uppercase. URLs have no whitespace and have at most 70 characters. You may assume that no problem instance requires more than 100 elements in each stack at any time. The end of input is indicated by the QUIT command.</p>

### 출력

<p><strong>For each test case, the output must follow the description below. The outputs of two consecutive cases will be separated by a blank line.</strong></p>

<p>For each command other than QUIT, print the URL of the current page after the command is executed if the command is not ignored. Otherwise, print `Ignored&#39;. The output for each command should be printed on its own line. No output is produced for the QUIT command.</p>