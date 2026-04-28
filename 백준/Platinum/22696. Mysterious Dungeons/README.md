# [Platinum V] Mysterious Dungeons - 22696

[문제 링크](https://www.acmicpc.net/problem/22696)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹, 격자 그래프

### 문제 설명

<p>The Kingdom of Aqua Canora Mystica is a very affluent and peaceful country, but around the kingdom, there are many evil monsters that kill people. So the king gave an order to you to kill the master monster.</p>

<p>You came to the dungeon where the monster lived. The dungeon consists of a grid of square cells. You explored the dungeon moving up, down, left and right. You finally found, fought against, and killed the monster.</p>

<p>Now, you are going to get out of the dungeon and return home. However, you found strange carpets and big rocks are placed in the dungeon, which were not there until you killed the monster. They are caused by the final magic the monster cast just before its death! Every rock occupies one whole cell, and you cannot go through that cell. Also, each carpet covers exactly one cell. Each rock is labeled by an uppercase letter and each carpet by a lowercase. Some of the rocks and carpets may have the same label.</p>

<p>While going around in the dungeon, you observed the following behaviors. When you enter into the cell covered by a carpet, all the rocks labeled with the corresponding letter (e.g., the rocks with &lsquo;A&rsquo; for the carpets with &lsquo;a&rsquo;) disappear. After the disappearance, you can enter the cells where the rocks disappeared, but if you enter the same carpet cell again or another carpet cell with the same label, the rocks revive and prevent your entrance again. After the revival, you have to move on the corresponding carpet cell again in order to have those rocks disappear again.</p>

<p>Can you exit from the dungeon? If you can, how quickly can you exit? Your task is to write a program that determines whether you can exit the dungeon, and computes the minimum required time.</p>

### 입력

<p>The input consists of some data sets.</p>

<p>Each data set begins with a line containing two integers,&nbsp;<i>W</i>&nbsp;and&nbsp;<i>H</i>&nbsp;(3 &le;&nbsp;<i>W</i>,&nbsp;<i>H</i>&nbsp;&le; 30). In each of the following&nbsp;<i>H</i>&nbsp;lines, there are&nbsp;<i>W</i>&nbsp;characters, describing the map of the dungeon as&nbsp;<i>W</i>&nbsp;&times;&nbsp;<i>H</i>&nbsp;grid of square cells. Each character is one of the following:</p>

<ul>
	<li>&lsquo;@&rsquo; denoting your current position,</li>
	<li>&lsquo;&lt;&rsquo; denoting the exit of the dungeon,</li>
	<li>A lowercase letter denoting a cell covered by a carpet with the label of that letter,</li>
	<li>An uppercase letter denoting a cell occupied by a rock with the label of that letter,</li>
	<li>&lsquo;#&rsquo; denoting a wall, and</li>
	<li>&lsquo;.&rsquo; denoting an empty cell.</li>
</ul>

<p>Every dungeon is surrounded by wall cells (&lsquo;#&rsquo;), and has exactly one &lsquo;@&rsquo; cell and one &lsquo;&lt;&rsquo; cell. There can be up to eight distinct uppercase labels for the rocks and eight distinct lowercase labels for the carpets.</p>

<p>You can move to one of adjacent cells (up, down, left, or right) in one second. You cannot move to wall cells or the rock cells.</p>

<p>A line containing two zeros indicates the end of the input, and should not be processed.</p>

### 출력

<p>For each data set, output the minimum time required to move from the &lsquo;@&rsquo; cell to the &lsquo;&lt;&rsquo; cell, in seconds, in one line. If you cannot exit, output -1.</p>