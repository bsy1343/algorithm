# [Gold V] Pianissimo - 32852

[문제 링크](https://www.acmicpc.net/problem/32852)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 16, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

구현, 정렬

### 문제 설명

<p>Composers use dynamics in sheet music to indicate how loud or soft the notes shall be played. Consider an $8$-scale dynamic system:</p>

<ul>
	<li><em>ppp</em>: pianississimo (the softest)</li>
	<li><em>pp</em>: pianissimo (very soft)</li>
	<li><em>p</em>: piano (soft)</li>
	<li><em>mp</em>: mezzopiano (moderately soft)</li>
	<li><em>mf</em>: mezzoforte (moderately loud)</li>
	<li><em>f</em>: forte (loud)</li>
	<li><em>ff</em>: fortissimo (very loud)</li>
	<li><em>fff</em>: fortississimo (the loudest)</li>
</ul>

<p>When a musician performs, it practically does not matter how absolutely loud or soft a note is played. The audience only hear their relative difference. Suppose we use numbers to describe the absolute power of a note, where larger numbers indicate larger absolute power. Consider a musician who plays all her notes with power up to $100$. When she goes from power $40$ to $70$, some audience may think that she goes from <em>p</em> to <em>f</em>, while some others may think that she goes from <em>pp</em> to <em>mf</em>.</p>

<p>The musician’s interpretation must be consistent throughout the entire piece. That is, between two notes of different dynamics, the note with a louder dynamic must always have a <em>strictly</em> larger absolute power. Between two notes of the same dynamic, their power can vary (usually slightly, but there is no strict requirement).</p>

<p>You just heard a musician perform a piece with $n$ notes. You know the piece very well and you remember all the dynamics that the composer wrote. How consistent is the musician’s performance according to the written dynamics? You would like to count the unordered pairs of notes that violate the dynamics. Such a pair of notes is not necessarily consecutive and could be far from each other in the sheet music.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($1 ≤ m ≤ n ≤ 2 \cdot 10^5$), the number of notes and the number of dynamic changes.</p>

<p>The next $n$ lines each have an integer between $1$ and $10^9$, giving the absolute power of a note played by the musician. Larger numbers indicate larger absolute power.</p>

<p>The next $m$ lines each have a $1$-based index $i$ and a dynamic $d$, which mean the composer wrote that starting from note $i$ the dynamic should change to $d$. Each dynamic is a string from the $8$ dynamics: <code>ppp</code>, <code>pp</code>, <code>p</code>, <code>mp</code>, <code>mf</code>, <code>f</code>, <code>ff</code>, <code>fff</code>. The dynamics have distinct indices and are given in increasing order of their index. The first dynamic always starts from note $1$.</p>

### 출력

<p>Output a single integer, the number of unordered pairs of notes that violate the dynamics.</p>