# [Platinum II] Subsequence Reversal - 14448

[문제 링크](https://www.acmicpc.net/problem/14448)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 423, 정답: 75, 맞힌 사람: 53, 정답 비율: 14.804%

### 분류

다이나믹 프로그래밍, 무작위화, 휴리스틱, 가장 긴 증가하는 부분 수열 문제, 담금질 기법

### 문제 설명

<p>&nbsp;</p>

<p>Farmer John is arranging his&nbsp;N&nbsp;cows in a line to take a photo (1 &le; N &le; 50). The height of the&nbsp;iith cow in sequence is&nbsp;a(i), and Farmer John thinks it would make for an aesthetically pleasing photo if the cow lineup has a large increasing subsequence of cows by height.</p>

<p>To recall, a subsequence is a subset&nbsp;a(i<sub>1</sub>),a(i<sub>2</sub>),&hellip;,a(i<sub>k</sub>) of elements from the cow sequence, found at some series of indices&nbsp;i<sub>1&nbsp;</sub>&lt; i<sub>2&nbsp;</sub>&lt; &hellip; &lt; i<sub>k</sub>. We say the subsequence is increasing if&nbsp;a(i<sub>1</sub>) &le; a(i<sub>2</sub>) &le; &hellip; &le; a(i<sub>k</sub>).</p>

<p>FJ would like there to be a long increasing subsequence within his ordering of the cows. In order to ensure this, he allows himself initially to choose any subsequence and reverse its elements.</p>

<p>For example, if we had the list</p>

<pre>
1 6 2 3 4 3 5 3 4
</pre>

<p>We can reverse the chosen elements</p>

<pre>
1 6 2 3 4 3 5 3 4
  ^         ^ ^ ^
</pre>

<p>to get</p>

<pre>
1 4 2 3 4 3 3 5 6
  ^         ^ ^ ^
</pre>

<p>Observe how the subsequence being reversed ends up using the same indices as it initially occupied, leaving the other elements unchanged.</p>

<p>Please find the maximum possible length of an increasing subsequence, given that you can choose to reverse an arbitrary subsequence once.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of input contains&nbsp;N. The remaining&nbsp;N&nbsp;lines contain&nbsp;a(1)&hellip;a(N), each an integer in the range&nbsp;1&hellip;50.</p>

### 출력

<p>Output the number of elements that can possibly form a longest increasing subsequence after reversing the contents of at most one subsequence.</p>

<p>&nbsp;</p>