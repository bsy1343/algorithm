# [Platinum V] Gangs - 4226

[문제 링크](https://www.acmicpc.net/problem/4226)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 9, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

수학, 다이나믹 프로그래밍, 문자열, 조합론, 재귀

### 문제 설명

<p>The downtown core of Inner City is laid out as a grid, with numbered streets running north-south from 1st Street in the west to 20th Street in the east, and numbered avenues running east-west from 1st Avenue in the north to 20th Avenue in the south. The area is controlled by two gangs, the Blips and the Cruds. The boundary between their territory is the Green Line, running diagonally from the intersection of 1st Street and 1st Avenue to the intersection of 20th Street and 20th Avenue. The Blips control the area to the southwest of the Green Line, and the Cruds the area to the northeast.</p>

<p>To prove their virility, the Blips go on &quot;runs&quot; through Crud territory, starting at 1st Avenue and 1st Street and ending at a point on the Green Line that varies from night to night. A run may return to the Green Line in between but never crosses it. A run uses avenues only in the east direction and streets only in the south direction. Thus a run can be described by a string of E&#39;s and S&#39;s of length 2N-2; such a run ends at Nth Street and Nth Avenue.</p>

<p>The Blips judge the runs made on a given night (all of which have the same length) by how &quot;OG&quot; they are. A run R1 is more OG than a run R2 if and only if:</p>

<ul>
	<li>R2 returns to the Green Line for the first time at an earlier point than when R1 returns to the Green Line, or</li>
	<li>R1 and R2 return to the Green Line at the same point, but the portion of R1 to that point (ignoring the initial E and final S) is more OG than the portion of R2 to that point (also ignoring the initial E and final S), or</li>
	<li>R1 and R2 return to the Green Line at the same point and are identical to that point, but the rest of R1 is more OG than the rest of R2.</li>
</ul>

<p>Examples corresponding to these three cases:</p>

<ul>
	<li>EESS is more OG than ESES.</li>
	<li>EEESSS is more OG than EESESS</li>
	<li>EESSEESS is more OG than EESSESES.</li>
</ul>

<p>If all the runs of a given length are ordered according to how OG they are, then the rank of a run is its position in the resulting list. EESS has rank 1 and ESES has rank 2.</p>

<p>Your task is to write a program to help the Blips plan and judge their nightly activities.</p>

### 입력

<p>The input to the program is a series of instances followed by 0 0. An instance consists of a line containing a positive integer N, representing the terminus of that night&#39;s run (Nth Street and Nth Avenue), followed by positive integer M.</p>

### 출력

<p>The output corresponding to each instance is the run of length 2N-2 of rank M, or ERROR if there are fewer than M runs of length 2N-2.</p>