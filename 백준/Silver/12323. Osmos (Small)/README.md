# [Silver III] Osmos (Small) - 12323

[문제 링크](https://www.acmicpc.net/problem/12323)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 27, 맞힌 사람: 25, 정답 비율: 51.020%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘, 정렬, 시뮬레이션

### 문제 설명

<p>Armin is playing Osmos, a physics-based puzzle game developed by Hemisphere Games. In this game, he plays a &quot;mote&quot;, moving around and absorbing smaller motes.</p>

<p>A &quot;mote&quot; in English is a small particle. In this game, it&#39;s a thing that absorbs (or is absorbed by) other things! The game in this problem has a similar idea to Osmos, but does not assume you have played the game.</p>

<p>When Armin&#39;s mote absorbs a smaller mote, his mote becomes bigger by the smaller mote&#39;s size. Now that it&#39;s bigger, it might be able to absorb even more motes. For example: suppose Armin&#39;s mote has size 10, and there are other motes of sizes 9, 13 and 19. At the start, Armin&#39;s mote can only absorb the mote of size 9. When it absorbs that, it will have size 19. Then it can only absorb the mote of size 13. When it absorbs that, it&#39;ll have size 32. Now Armin&#39;s mote can absorb the last mote.</p>

<p>Note that Armin&#39;s mote can absorb another mote if and only if the other mote is <em>smaller</em>. If the other mote is the same size as his, his mote can&#39;t absorb it.</p>

<p>You are responsible for the program that creates motes for Armin to absorb. The program has already created some motes, of various sizes, and has created Armin&#39;s mote. Unfortunately, given his mote&#39;s size and the list of other motes, it&#39;s possible that there&#39;s no way for Armin&#39;s mote to absorb them all.</p>

<p>You want to fix that. There are two kinds of operations you can perform, in any order, any number of times: you can add a mote of any positive integer size to the game, or you can remove any one of the existing motes. What is the minimum number of times you can perform those operations in order to make it possible for Armin&#39;s mote to absorb every other mote?</p>

<p>For example, suppose Armin&#39;s mote is of size 10 and the other motes are of sizes [9, 20, 25, 100]. This game isn&#39;t currently solvable, but by adding a mote of size 3 and removing the mote of size 100, you can make it solvable in only 2 operations. The answer here is 2.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. The first line of each test case gives the size of Armin&#39;s mote, <strong>A</strong>, and the number of other motes, <strong>N</strong>. The second line contains the <strong>N</strong> sizes of the other motes. All the mote sizes given will be integers.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; <strong>A</strong> &le; 100.</li>
	<li>1 &le; all mote sizes &le; 100.</li>
	<li>1 &le; <strong>N</strong> &le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum number of operations needed to make the game solvable.</p>

### 힌트

<p>Notes</p>

<p>Although the size of motes is limited in the input files, Armin&#39;s mote may grow larger than the provided limits by absorbing other motes.</p>

<p>Osmos was created by Hemisphere Games. Hemisphere Games does not endorse and has no involvement with Google Code Jam.</p>