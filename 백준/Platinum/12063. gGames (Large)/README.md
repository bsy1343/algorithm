# [Platinum IV] gGames (Large) - 12063

[문제 링크](https://www.acmicpc.net/problem/12063)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>The country of elves is planning to hold an elimination tournament, and there are 2<sup><strong>N</strong></sup>&nbsp;elves who would like to take part. At the start of the tournament, they will be given unique ID numbers from 1 to 2<sup><strong>N</strong></sup>, and the Elf President will line them up in some order.</p>

<p>The tournament is a series of matches between two elves, and every match has one winner and one loser (there are no ties). In the first round, the first elf in the line competes against the second elf in the line, the third elf competes against the fourth elf, and so on. After the first round, the 2<sup><strong>N-1</strong></sup>&nbsp;elves who lost leave the line, and the 2<sup><strong>N-1</strong></sup>&nbsp;elves who won remain where they are. Then, the remaining elves play the second round in the same way: the first remaining elf in the line competes against the second remaining elf in the line, the third remaining elf competes against the fourth remaining elf, and so on. After&nbsp;<strong>N</strong>&nbsp;rounds, there will be only one elf remaining, and that elf is the winner.</p>

<p><strong>M</strong>&nbsp;of the elves are sensitive, which means that they will be very sad if they have to compete in matches against their friends during the games. Specifically, the ith elf will be sad if they have to compete with their friends in the first&nbsp;<strong>K<sub>i</sub></strong>&nbsp;rounds. (Note that friendship is not necessarily mutual: if one elf considers another elf to be a friend, the other elf does not necessarily consider that elf to be a friend.)&nbsp;</p>

<p>The Elf President wants to know: is there a way to specify the initial positions of all 2<sup><strong>N</strong></sup>elves to guarantee that no elf will be sad, no matter what happens in the tournament?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of one line with two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>, then&nbsp;<strong>M</strong>&nbsp;sets of two lines each, in which the first line has integers&nbsp;<strong>E<sub>i</sub></strong>,&nbsp;<strong>K<sub>i</sub></strong>, and&nbsp;<strong>B<sub>i</sub></strong>&nbsp;for one elf, and the second has&nbsp;<strong>B<sub>i</sub></strong>&nbsp;integer ID numbers of that elf&#39;s friends.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 200.</li>
	<li>0 &le;&nbsp;<strong>M</strong>&nbsp;&le; 2<sup><strong>N</strong></sup>.</li>
	<li>1 &le;&nbsp;<strong>E<sub>i</sub></strong>&nbsp;&le; 2<sup><strong>N</strong></sup>.</li>
	<li>1 &le;&nbsp;<strong>K<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li><strong>M</strong>&nbsp;&le; sum(<strong>B<sub>i</sub></strong>) &le; min(2 *&nbsp;<strong>M</strong>, 2<sup><strong>N</strong></sup>).</li>
	<li><strong>N</strong>&nbsp;= 4.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: &quot;, where x is the case number (starting from 1), followed by&nbsp;<code>YES</code>&nbsp;or&nbsp;<code>NO</code>.</p>

### 힌트

<p>​</p>