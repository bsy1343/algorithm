# [Platinum V] Sweets - 7048

[문제 링크](https://www.acmicpc.net/problem/7048)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 128, 정답: 34, 맞힌 사람: 29, 정답 비율: 32.222%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 생성 함수

### 문제 설명

<p>John has got n jars with candies. Each of the jars contains a different kind of candies (i.e. candies from the same jar are of the same kind, and candies from different jars are of different kinds). The i-th jar contains m<sub>i</sub> candies. John has&nbsp;decided to eat some of his candies. He would like to eat at least a of them but no more than b. The problem is that John can&rsquo;t decide how many candies and of what kinds he would like to eat. In how many ways can he do it?</p>

<p>Your task is to write a program that:</p>

<ul>
	<li>reads from the standard input the amount of candies in each of the jars, and integers a and b,</li>
	<li>determines the number of ways John can choose the candies he will eat (satisfying the above conditions),</li>
	<li>writes the result to the standard output</li>
</ul>

### 입력

<p>The first line of input contains three integers: n, a&nbsp;and b, separated by single spaces (1 &le; n &le; 10, 0 &le; a &le; b &le; 10 000 000). Each of the following n lines contains one integer. Line i+1 contains integer m<sub>i</sub>&nbsp;the amount of candies in the i-th jar (0 &le; m<sub>i</sub> &le; 1 000 000).</p>

### 출력

<p>Let k be the number of different ways John can choose the candies to be eaten. The first and only line of output should contain one integer: k mod 2004 (i.e.the remainder of k divided by 2004).</p>

### 힌트

<p>John can choose candies in the following ways:</p>

<p style="text-align: center;">(1, 0), (2, 0), (3, 0), (0, 1), (0, 2), (0, 3), (1, 1), (1, 2), (2, 1)</p>