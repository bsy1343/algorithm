# [Gold III] R & J - 6866

[문제 링크](https://www.acmicpc.net/problem/6866)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 10, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

수학, 기하학, 이분 탐색, 3차원 기하학, 삼분 탐색

### 문제 설명

<p>Years ago, Romy and Jules were separated by their parents and forbidden to see each other ever again. However, using a tin-can telephone, their love survived and they were able to maintain their relationship. But, as time passed, some things changed and some things remained the same. Romy&#39;s great (times 6) grand-child, Julia (from the planet Mars), is in love with Romian (from the planet Epsilon 186-Beta), but because of their parents hatred is not able to speak with him. To prevent Julia and Romian from seeing each other, their parents put them both on spaceships with no long-range communication facilities. Thus, Julia and Romian must use a laser to send each other messages using morse-code. In Romian and Julia&#39;s time, messages can be sent infinite distances through space using a laser, as long as the route between the sender and receiver is not blocked. Since this is the future, lasers travel instantly across the universe. Therefore, you may assume that planets and spaceships are stationary.</p>

<p>For this question, you are to determine whether Romian and Julia can communicate with each other (by laser) when give the 3-dimensional grid coordinates of their spaceships. The problem is that their communication laser is often blocked by intervening planets. Thus, they are truly star-crossed lovers.</p>

### 입력

<p>For input you will be given, on two lines, the grid coordinates of Romian&#39;s and Julia&#39;s spaceships. Each coordinate will consist of three, whitespace separated, integer values. Then, following the locations of their spaceships, the input will consist of a line containing a single integer, n (1 &le; n &le; 2000), indication the number of planets in their current sector of space. The coordinates of the n planets follow on the next n lines. Each planet is represented by 4 integer values, separated by whitespace. The first three are the coordinates of the planet&#39;s center and the fourth is the planet&#39;s radius. It may be helpful to know that a planet with centre (a, b, c) and radius r can be specified by the equation (x-a)<sup>2</sup> + (y-b)<sup>2</sup> + (z-c)<sup>2</sup> = r<sup>2</sup>. You may assume that 0 &le; r &le; 5000 and that for any coordinate (a, b, c), 0 &le; |a|, |b|, |c| &le; 5000.</p>

<p>You may also make the following assumptions:</p>

<ul>
	<li>Neither Romian nor Julia are within 10<sup>-8</sup> units of a planet (since they would crash into it), nor are they within a planet (since that is impossible).</li>
	<li>Romian and Julia do not occupy the same position in space (otherwise, their spaceships have crashed into each other and they will be consumed by an intergalactic explosion of epic proportions).</li>
	<li>If the laser hits a planet, it would also have hit a planet with a radius which is 10<sup>-8</sup> units smaller. If the laser misses a planet, it would have avoided a planet which was 10<sup>-8</sup> units larger.</li>
</ul>

### 출력

<p>As output, you are to print a single integer value, b, where 0 &le; b &le; n. This value indicates the number of planets that block the laser. Output a zero if no planets block the laser.</p>