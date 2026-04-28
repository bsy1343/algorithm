# [Silver I] Where is the Boundary - 16805

[문제 링크](https://www.acmicpc.net/problem/16805)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 60, 맞힌 사람: 41, 정답 비율: 68.333%

### 분류

누적 합

### 문제 설명

<p>An island country JAGAN in a certain planet is very long and narrow, and extends east and west. This long country is said to consist of two major cultural areas &mdash; the eastern and the western. Regions in the east tend to have the eastern cultural features and regions in the west tend to have the western cultural features, but, of course, the boundary between the two cultural areas is not clear, which has been an issue.</p>

<p>You are given an assignment estimating the boundary using a given data set.</p>

<p>More precise specification of the assignment is as follows:</p>

<ol>
	<li>JAGAN is divided into $n$ prefectures forming a line in the east-west direction. Each prefecture is numbered 1, 2, ..., $n$ <b>from WEST to EAST</b>.</li>
	<li>Each data set consists of $m$ features, which has &#39;<samp>E</samp>&#39; (east) or &#39;<samp>W</samp>&#39; (west) for each prefecture. These data indicate that each prefecture has eastern or western features from $m$ different point of views, for example, food, clothing, and so on.</li>
	<li>In the estimation, you have to choose a cultural boundary achieving the minimal errors. That is, you have to minimize the sum of &#39;<samp>W</samp>&#39;s in the eastern side and &#39;<samp>E</samp>&#39;s in the western side.</li>
	<li>In the estimation, you can choose a cultural boundary only from the boundaries between two prefectures.</li>
</ol>

<p>Sometimes all prefectures may be estimated to be the eastern or the western cultural area. In these cases, to simplify, you must virtually consider that the boundary is placed between prefecture No. 0 and No. 1 or between prefecture No. $n$ and No. $n+1$. When you get multiple minimums, you must output the most western (least-numbered) result.</p>

<p>Write a program to solve the assignment.</p>

### 입력

<p>Each input is formatted as follows:</p>

<pre class="mathjax">
$n$ $m$

$d_{11}$...$d_{1n}$

...

$d_{m1}$...$d_{mn}$</pre>

<p>The first line consists of two integers $n$ ($1 \le n \le 10{,}000$), $m$ ($1 \le m \le 100$), which indicate the number of prefectures and the number of features in the assignment. The following $m$ lines are the given data set in the assignment. Each line contains exactly $n$ characters. The $j$-th character in the $i$-th line $d_{ij}$ is &#39;<samp>E</samp>&#39; (east) or &#39;<samp>W</samp>&#39; (west), which indicates $j$-th prefecture has the eastern or the western feature from the $i$-th point of view.</p>

### 출력

<p>Print the estimated result in a line. The output consists of two integers sorted in the ascending order which indicate two prefectures touching the boundary.</p>