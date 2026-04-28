# [Gold III] Good News and Bad News (Small) - 14825

[문제 링크](https://www.acmicpc.net/problem/14825)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>You would like to get your&nbsp;<strong>F</strong>&nbsp;friends to share some news. You know your friends well, so you know which of your friends can talk to which of your other friends. There are&nbsp;<strong>P</strong>&nbsp;such one-way relationships, each of which is an ordered pair (<strong>A<sub>i</sub></strong>,&nbsp;<strong>B<sub>i</sub></strong>) that means that friend&nbsp;<strong>A<sub>i</sub></strong>can talk to friend&nbsp;<strong>B<sub>i</sub></strong>. It does not imply that friend&nbsp;<strong>B<sub>i</sub></strong>&nbsp;can talk to friend&nbsp;<strong>A<sub>i</sub></strong>; however, another of the ordered pairs might make that true.</p>

<p>For&nbsp;<em>every</em>&nbsp;such existing ordered pair (<strong>A<sub>i</sub></strong>,&nbsp;<strong>B<sub>i</sub></strong>), you want friend&nbsp;<strong>A<sub>i</sub></strong>&nbsp;to deliver some news to friend&nbsp;<strong>B<sub>i</sub></strong>. In each case, this news will be represented by an integer value; the magnitude of the news is given by the absolute value, and the type of news (good or bad) is given by the sign. The integer cannot be 0 (or else there would be no news!), and its absolute value cannot be larger than&nbsp;<strong>F</strong><sup>2</sup>&nbsp;(or else the news would be just&nbsp;<em>too</em>&nbsp;exciting!). These integer values may be different for different ordered pairs.</p>

<p>Because you are considerate of your friends&#39; feelings, for each friend, the sum of the values of all news given&nbsp;<em>by</em>&nbsp;that friend must equal the sum of values of all news given&nbsp;<em>to</em>that friend. If no news is given by a friend, that sum is considered to be 0; if no news is given to a friend, that sum is considered to be 0.</p>

<p>Can you find a set of news values for your friends to communicate such that these rules are obeyed, or determine that it is impossible?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each begins with one line with two integers&nbsp;<strong>F</strong>&nbsp;and&nbsp;<strong>P</strong>: the number of friends, and the number of different ordered pairs of friends. Then,&nbsp;<strong>P</strong>&nbsp;more lines follow; the i-th of these lines has two different integers&nbsp;<strong>A<sub>i</sub></strong>&nbsp;and&nbsp;<strong>B<sub>i</sub></strong>&nbsp;representing that friend&nbsp;<strong>A<sub>i</sub></strong>&nbsp;can talk to friend&nbsp;<strong>B<sub>i</sub></strong>. Friends are numbered from 1 to&nbsp;<strong>F</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>A<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>F</strong>, for all i.</li>
	<li>1 &le;&nbsp;<strong>B<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>F</strong>, for all i.</li>
	<li><strong>A<sub>i</sub></strong>&nbsp;&ne;&nbsp;<strong>B<sub>i</sub></strong>, for all i. (A friend does not self-communicate.)</li>
	<li>(<strong>A<sub>i</sub></strong>,&nbsp;<strong>B<sub>i</sub></strong>) &ne; (<strong>A<sub>j</sub></strong>,&nbsp;<strong>B<sub>j</sub></strong>), for all i &ne; j. (No pair of friends is repeated within a test case in the same order.)</li>
	<li>2 &le;&nbsp;<strong>F</strong>&nbsp;&le; 4.</li>
	<li>1 &le;&nbsp;<strong>P</strong>&nbsp;&le; 12.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is either&nbsp;<code>IMPOSSIBLE</code>&nbsp;if there is no arrangement satisfying the rules above, or, if there is such an arrangement,&nbsp;<strong>P</strong>&nbsp;integers, each of which is nonzero and lies inside [-<strong>F</strong><sup>2</sup>,&nbsp;<strong>F</strong><sup>2</sup>]. The i-th of those integers corresponds to the i-th ordered pair from the input, and represents the news value that the first friend in the ordered pair will communicate to the second. The full set of values must satisfy the conditions in the problem statement.</p>

<p>If there are multiple possible answers, you may output any of them.</p>

### 힌트

<p>The sample output shows one possible set of valid answers. Other valid answers are possible.</p>

<p>In Sample Case #1, one acceptable arrangement is to have friend 1 deliver news with value 1 to friend 2, and vice versa.</p>

<p>In Sample Case #2, whatever value of news friend 1 gives to friend 2, it must be nonzero. So, the sum of news values given to friend 2 is not equal to zero. However, friend 2 cannot give any news and so that value is 0. Therefore, the sums of given and received news for friend 2 cannot match, and the case is&nbsp;<code>IMPOSSIBLE</code>.</p>

<p>In Sample Case #3, each of friends 1, 2, and 3 can deliver news with value -1 to the one other friend they can talk to &mdash; an unfortunate circle of bad news! Note that there is a friend 4 who does not give or receive any news; this still obeys the rules.</p>

<p>In Sample Case #4, note that&nbsp;<code>-5 5 5 -10</code>&nbsp;would not have been an acceptable answer, because there are 3 friends, and |-10| &gt; 3<sup>2</sup>.</p>

<p>In Sample Case #5, note that the case cannot be solved without using at least one negative value.</p>