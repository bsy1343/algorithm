# [Silver IV] Test Passing Probability (Small) - 12683

[문제 링크](https://www.acmicpc.net/problem/12683)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 45, 맞힌 사람: 27, 정답 비율: 67.500%

### 분류

수학, 그리디 알고리즘, 브루트포스 알고리즘, 정렬, 확률론

### 문제 설명

<p>Dave is taking a multiple choice test on the Internet. Dave possibly gets many opportunities to submit his answers to the test, but he passes only if he gets all the questions correct. He must answer every question on the test to make a submission. The only information he receives after he submits is whether he has passed.</p>

<p>For each question, he estimates the probability that each of 4 responses is correct, independent of his responses to other questions. Given a fixed number of submissions he can make, Dave wants to choose his responses so that he maximizes the probability of passing the test.</p>

<p>What is the probability that Dave will pass the test if he chooses his responses optimally?</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>C</strong>.&nbsp;<strong>C</strong>&nbsp;test cases follow.</p>

<p>Each test case starts with a line containing&nbsp;<strong>M</strong>&nbsp;and&nbsp;<strong>Q</strong>. Dave is allowed to make&nbsp;<strong>M</strong>submissions to solve the test. There are&nbsp;<strong>Q</strong>&nbsp;questions on the test.&nbsp;<strong>Q</strong>&nbsp;lines follow, each containing 4 probabilities of correctness. There will be at most 6 digits after the decimal point. The probabilities for each line are non-negative and sum to 1.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100&nbsp;</li>
	<li>1 &le;&nbsp;<strong>Q</strong>&nbsp;&le; 6&nbsp;</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 1000&nbsp;</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>X</strong>:&nbsp;<strong>Y</strong>&quot; where&nbsp;<strong>X</strong>&nbsp;is the number of the test case (starting from 1), and&nbsp;<strong>Y</strong>&nbsp;is the probability of success.&nbsp;<br />
Answers with a relative or absolute error of at most 10<sup>&minus;6</sup>&nbsp;will be considered correct.</p>