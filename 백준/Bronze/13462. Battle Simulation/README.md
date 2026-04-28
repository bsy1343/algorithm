# [Bronze II] Battle Simulation - 13462

[문제 링크](https://www.acmicpc.net/problem/13462)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 398, 정답: 229, 맞힌 사람: 179, 정답 비율: 54.908%

### 분류

구현, 문자열

### 문제 설명

<p>A terrible monster is rampaging through Neo Tokyo 5! The Earth Defense Force<br />
(EDF) has sent a mech unit to defeat the monster. Because there is only a single mech unit available after previous monster rampages, the EDF has decided to simulate the upcoming battle between the mech and the monster before launching an assault. The EDF noted that the monster&rsquo;s attack pattern can be simulated by a series of moves that it performs in succession. When denoting each of its moves with a single letter, the attack pattern can be simulated as a single string, which should be read from left to right. The monster has the following moves:</p>

<ul>
	<li>Rake, denoted by the letter &lsquo;R&rsquo;;</li>
	<li>Bite, denoted by the letter &lsquo;B&rsquo;;</li>
	<li>Laser breath, denoted by the letter &lsquo;L&rsquo;.</li>
</ul>

<p>In order to defeat the monster, the mech must perform a counter move per move that the monster makes:</p>

<ul>
	<li>Slice, denoted by the letter &lsquo;S&rsquo;, counters the monster&rsquo;s rake;</li>
	<li>Kick, denoted by the letter &lsquo;K&rsquo;, counters the monster&rsquo;s bite;</li>
	<li>Shield, denoted by the letter &lsquo;H&rsquo;, counters the monster&rsquo;s laser breath;</li>
</ul>

<p>However, there is one catch. When the monster performs a subsequent combination of the three moves Rake, Bite and Laser breath, in any order, it becomes a very powerful attack for which the mech must perform a single counter move called Combo breaker, denoted by the letter &lsquo;C&rsquo;. A single Combo breaker absorbs the entire combination of three moves. Any following moves from the monster will have to be countered separately or as part of a new combination. A move of the monster can never be part of more than one combination.</p>

<p>Through extensive analysis of the monster&rsquo;s past behaviour, the EDF is now able to reliably predict the actions of the monster ahead of time. You are given a string representing the moves that the monster will use when battling the mech. The EDF needs you to write a program that outputs the sequence of moves that the mech must perform in order to defeat the monster.</p>

### 입력

<p>A single line containing a string of at least 1 and at most 1 000 000 characters, consisting of&nbsp;the letters &lsquo;R&rsquo;, &lsquo;B&rsquo; and &lsquo;L&rsquo;.<br />
&nbsp;</p>

### 출력

<p>Output a single string consisting of the letters denoting the moves that are to be made in&nbsp;succession by the mech in order to defeat the monster.</p>