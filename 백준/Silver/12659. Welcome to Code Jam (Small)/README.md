# [Silver II] Welcome to Code Jam (Small) - 12659

[문제 링크](https://www.acmicpc.net/problem/12659)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 173, 정답: 115, 맞힌 사람: 102, 정답 비율: 71.329%

### 분류

다이나믹 프로그래밍, 백트래킹

### 문제 설명

<p>So you&#39;ve registered. We sent you a welcoming email, to welcome you to code jam. But it&#39;s possible that you still don&#39;t feel welcomed to code jam. That&#39;s why we decided to name a problem &quot;welcome to code jam.&quot; After solving this problem, we hope that you&#39;ll feel very welcome. Very welcome, that is, to code jam.</p>

<p>If you read the previous paragraph, you&#39;re probably wondering why it&#39;s there. But if you read it very carefully, you might notice that we have written the words &quot;welcome to code jam&quot; several times: 400263727 times in total. After all, it&#39;s easy to look through the paragraph and find a &#39;w&#39;; then find an &#39;e&#39; later in the paragraph; then find an &#39;l&#39; after that, and so on. Your task is to write a program that can take any text and print out how many times that text contains the phrase &quot;welcome to code jam&quot;.</p>

<p>To be more precise, given a text string, you are to determine how many times the string &quot;welcome to code jam&quot; appears as a sub-sequence of that string. In other words, find a sequence&nbsp;<em>s</em>&nbsp;of increasing indices into the input string such that the concatenation of input[s[0]], input[s[1]], ..., input[s[18]] is the string &quot;welcome to code jam&quot;.</p>

<p>The result of your calculation might be huge, so for convenience we would only like you to find the last 4 digits.</p>

### 입력

<p>The first line of input gives the number of test cases,&nbsp;<strong>N</strong>. The next N lines of input contain one test case each. Each test case is a single line of text, containing only lower-case letters and spaces. No line will start with a space, and no line will end with a space.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100</li>
	<li>Each line will be no longer than 30 characters.</li>
</ul>

<div>&nbsp;</div>

### 출력

<p>For each test case, &quot;Case #x: dddd&quot;, where x is the case number, and dddd is the last four digits of the answer. If the answer has fewer than 4 digits, please add zeroes at the front of your answer to make it exactly 4 digits long.</p>