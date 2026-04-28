# [Silver I] The Secret Number - 22812

[문제 링크](https://www.acmicpc.net/problem/22812)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 21, 맞힌 사람: 18, 정답 비율: 69.231%

### 분류

다이나믹 프로그래밍, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Your job is to find out the secret number hidden in a matrix, each of whose element is a digit (&#39;0&#39;-&#39;9&#39;) or a letter (&#39;A&#39;-&#39;Z&#39;). You can see an example matrix in Figure 1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22812.%E2%80%85The%E2%80%85Secret%E2%80%85Number/c4c0743e.png" data-original-src="https://upload.acmicpc.net/22f6177a-c9d6-4bdd-aa93-92b249baf90b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure 1: A Matrix</p>

<p>The secret number and other non-secret ones are coded in a matrix as sequences of digits in a decimal format. You should only consider sequences of digits&nbsp;<i>D</i><sub>1</sub>&nbsp;<i>D</i><sub>2</sub>&nbsp;...&nbsp;<i>D</i><sub><i>n</i></sub>&nbsp;such that&nbsp;<i>D</i><sub><i>k</i>+1</sub>&nbsp;(1 &lt;=&nbsp;<i>k</i>&nbsp;&lt;&nbsp;<i>n</i>) is either right next to or immediately below&nbsp;<i>D</i><sub><i>k</i></sub>&nbsp;in the matrix. The secret you are seeking is the largest number coded in this manner.</p>

<p>Four coded numbers in the matrix in Figure 1, i.e., 908820, 23140037, 23900037, and 9930, are depicted in Figure 2. As you may see, in general, two or more coded numbers may share a common subsequence. In this case, the secret number is 23900037, which is the largest among the set of all coded numbers in the matrix.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22812.%E2%80%85The%E2%80%85Secret%E2%80%85Number/8d225894.png" data-original-src="https://upload.acmicpc.net/707be2a1-e57e-4fcf-98ee-f6464f44ac5b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure 2: Coded Numbers</p>

<p>In contrast, the sequences illustrated in Figure 3 should be excluded: 908A2 includes a letter; the fifth digit of 23149930 is above the fourth; the third digit of 90037 is below right of the second.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22812.%E2%80%85The%E2%80%85Secret%E2%80%85Number/665c198a.png" data-original-src="https://upload.acmicpc.net/9fd5b7fe-dc13-43b4-9d5f-49b4ed6eae8d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure 3: Inappropriate Sequences</p>

<p>Write a program to figure out the secret number from a given matrix.</p>

### 입력

<p>The input consists of multiple data sets, each data set representing a matrix. The format of each data set is as follows.</p>

<pre>
<i>W</i>&nbsp;<i>H</i>
<i>C</i><sub>11</sub><i>C</i><sub>12</sub>&nbsp;...&nbsp;<i>C</i><sub>1<i>W</i></sub>
<i>C</i><sub>21</sub><i>C</i><sub>22</sub>&nbsp;...&nbsp;<i>C</i><sub>2<i>W</i></sub>
...
<i>C</i><sub><i>H</i>1</sub><i>C</i><sub><i>H</i>2</sub>&nbsp;...&nbsp;<i>C</i><sub><i>HW</i></sub>
</pre>

<p>In the first line of a data set, two positive integers&nbsp;<i>W</i>&nbsp;and&nbsp;<i>H</i>&nbsp;are given.&nbsp;<i>W</i>&nbsp;indicates the width (the number of columns) of the matrix, and&nbsp;<i>H</i>&nbsp;indicates the height (the number of rows) of the matrix.&nbsp;<i>W+H</i>&nbsp;is less than or equal to 70.</p>

<p><i>H</i>&nbsp;lines follow the first line, each of which corresponds to a row of the matrix in top to bottom order. The&nbsp;<i>i</i>-th row consists of&nbsp;<i>W</i>&nbsp;characters&nbsp;<i>C</i><sub><i>i</i>1</sub><i>C</i><sub><i>i</i>2</sub>&nbsp;...&nbsp;<i>C</i><sub><i>iW</i></sub>&nbsp;in left to right order. You may assume that the matrix includes at least one non-zero digit.</p>

<p>Following the last data set, two zeros in a line indicate the end of the input.</p>

### 출력

<p>For each data set, print the secret number on a line. Leading zeros should be suppressed.</p>