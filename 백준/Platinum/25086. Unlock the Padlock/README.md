# [Platinum IV] Unlock the Padlock - 25086

[문제 링크](https://www.acmicpc.net/problem/25086)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 26, 맞힌 사람: 22, 정답 비율: 47.826%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Imagine you have a padlock, which is a combination lock consisting of&nbsp;$N$&nbsp;dials, set initially to a random combination. The dials of the padlock are of size&nbsp;$D$, which means that they can have values between&nbsp;$0$&nbsp;and $D-1$, inclusive, and can be rotated upwards or downwards. They are also ordered from left to right, with the leftmost and rightmost dials at positions&nbsp;$1$&nbsp;and&nbsp;$N$, respectively. The padlock can be unlocked by setting the values of all its dials to&nbsp;$0$.</p>

<p>You can perform zero or more operations of this kind:</p>

<ul>
	<li>Pick any range&nbsp;$[l,r]$&nbsp;such that&nbsp;$1&le;l&le;r&le;N$&nbsp;and rotate all the dials in&nbsp;$[l,r]$&nbsp;together, upwards or downwards. Rotating up increases the value of each dial in the range&nbsp;$[l,r]$&nbsp;by&nbsp;$1$, and rotating down decreases its value by&nbsp;$1$. Note that a dial with value $D-1$&nbsp;becomes&nbsp;$0$&nbsp;when increased (rotated up) and a dial with value&nbsp;$0$&nbsp;becomes&nbsp;$D-1$&nbsp;when decreased (rotated down).</li>
</ul>

<p>The series of operations must satisfy the following condition:</p>

<ul>
	<li>The range&nbsp;$[l_{i-1}, r_{i-1}]$&nbsp;chosen in the&nbsp;$(i-1)$-th operation needs to be completely contained within the range $[l_i,r_i]$&nbsp;chosen in the&nbsp;$i$-th operation; that is, $l_i&le;l_{i-1}&le;r_{i-1}&le;r_i$. The initial range ($[l_1,r_1]$) can be chosen arbitrarily.</li>
</ul>

<p>Example of a valid sequence of operations to unlock a padlock with initial combination&nbsp;$[1,1,2,2,3,3]$:</p>

<ol>
	<li>Rotate range&nbsp;$[5,6]$&nbsp;downwards.</li>
	<li>Rotate range&nbsp;$[3,6]$&nbsp;downwards.</li>
	<li>Rotate range&nbsp;$[1,6]$&nbsp;downwards.</li>
</ol>

<p>The following are some operations that cannot be performed:</p>

<ol>
	<li>Rotating range&nbsp;$[1,4]$&nbsp;after&nbsp;$[6,9]$, because&nbsp;$[6,9]$&nbsp;is not completely contained in $[1,4]$&nbsp;(does not satisfy&nbsp;$r_{i-1}&le;r_i$&nbsp;where&nbsp;$r_{i-1}=9$&nbsp;and&nbsp;$r_i=4$).</li>
	<li>Rotating range&nbsp;$[3,6]$&nbsp;after&nbsp;$[2,7]$.</li>
</ol>

<p>The goal for you is to output the&nbsp;<i>minimum</i>&nbsp;number of valid operations needed to make all dials in the padlock set to&nbsp;$0$.</p>

### 입력

<p>The first line of the input contains the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>Each test case consists of two lines.</p>

<p>The first line of each test case contains two integers&nbsp;$N$&nbsp;and&nbsp;$D$, representing the number of dials in the padlock and the size of the dials, respectively.</p>

<p>The second line of each test case contains&nbsp;$N$&nbsp;integers&nbsp;$V_1,V_2,\dots ,V_N$, where the&nbsp;$i$-th integer represents the value of the&nbsp;$i$-th dial in the initial combination of the padlock.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;$x$ is the test case number (starting from&nbsp;$1$) and&nbsp;$y$&nbsp;is the minimum number of operations needed to unlock the padlock as described in the statement.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$0&le;V_i&le;D-1$, for all $i$.</li>
</ul>