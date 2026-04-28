# [Gold III] Paasa Numbers - 15378

[문제 링크](https://www.acmicpc.net/problem/15378)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 8, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

백트래킹, 이분 탐색, 다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Pafall numbers are positive integers for which every digit is strictly less than the digit on its immediate left (if such a digit exists). These numbers get their namesake from the fact that the values of the digit seem to &lsquo;fall&rsquo; as you read them from left to right. For example, 987654321 is a pafall number.</p>

<p>Paasa numbers are positive integers closely related to Pafall numbers. However, they sometimes go &lsquo;steady&rsquo; when you read them from left to right. Formally speaking, a paasa number is an integer for which every digit is less than or equal to the digit on its immediate left (if such a digit exists). For example, Carly&rsquo;s number, 9987765321, is a paasa number.</p>

<p>As you would have discovered from experience by now, a number may be paasa but not pafall. But it is sure that when it is pafall, then it&rsquo;s certainly paasa.</p>

<p>Paasa numbers are generally to be avoided. That&rsquo;s why you decide to make a list of all the paasa numbers in the world so that people would be aware which ones to avoid. And you list them in increasing order. This will be a very nice list to have, especially considering the date today. We wouldn&rsquo;t ask you for the whole list because in doing so, you will need some space. We will just ask you what the Nth paasa number is.</p>

### 입력

<p>The first line of input contains T, the number of test cases. The following lines describe the test cases.</p>

<p>Each test case consists of one line containing a single integer, N.</p>

<p>Constraints</p>

<ul>
	<li>1 &le; T &le; 10<sup>4</sup></li>
	<li>1 &le; N &le; 10<sup>18</sup></li>
</ul>

### 출력

<p>For each test case, print a single integer, the Nth paasa number.</p>