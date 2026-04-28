# [Gold I] Pokemon Go Go - 16385

[문제 링크](https://www.acmicpc.net/problem/16385)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 144, 정답: 71, 맞힌 사람: 56, 정답 비율: 53.333%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>Always Catch your Mon, Inc., (also know as ACM), wants to create a new product, called Pok&eacute;mon Go Go. Users can purchase this application to help them play Pok&eacute;mon go. The software accesses the pok&eacute; stop locations near the current location as well as a list of Pok&eacute;mon that can be found at each stop. The application then computes the shortest route one can follow to catch all the unique Pok&eacute;mon, and return to the starting point.</p>

<p>The program assumes that the user is in a city where travel is restricted to moving only in the north&ndash;south and east&ndash;west directions. The program also assumes that all pok&eacute; stops are on the intersection of two roads.</p>

<p>For example, consider a case where the application finds five nearby pok&eacute; stops. Each stop&rsquo;s location is indicated by two integers, (r,c), where r is the number of blocks north of your starting position and c is the number of blocks west of your starting position. Consider if the locations of the five pok&eacute; stops are (5, 9), (20, 20), (1, 1), (1, 8) and (2, 8) while the names of the Pok&eacute;mon found at these stops are Evevee, Flareon, Flareon, Jolteon, and Umbreon, respectively. It is clear that one does not have to visit both the second and third stops, since the same Pok&eacute;mon can be caught at either of them. The best route is to visit the first, fifth, fourth, and third stops (in that order) for a total distance of 28 blocks, since:</p>

<ul>
	<li>The distance from (0, 0) to (5, 9) is 14.</li>
	<li>The distance from (5, 9) to (2, 8) is 4.</li>
	<li>The distance from (2, 8) to (1, 8) is 1.</li>
	<li>The distance from (1, 8) to (1, 1) is 7.</li>
	<li>The distance from (1, 1) to (0, 0) is 2.</li>
</ul>

### 입력

<p>The input holds a single test case. The test case begins with a single integer n, 0 &lt; n &le; 20, which indicates the number of pok&eacute; stops to consider. Each of the next n lines specifies the location of a pok&eacute; stop and the name of a Pok&eacute;mon that can be found there. The location is specified by two integers r and c separated by a single space, &minus;100 &le; r, c &le; 100. The integers r and c indicate that the stop is r blocks north and c blocks east of the starting point. The location is followed by a single space and followed by the string p indicating the name of the Pok&eacute;mon that can be caught there. Names have between 1 and 25 letters (using only a&ndash;z and A&ndash;Z). The number of unique Pok&eacute;mon is always less than or equal to 15. Multiple pok&eacute;mon can reside at a single pok&eacute; stop and are listed on separate lines.</p>

### 출력

<p>Give the shortest distance, in blocks, required to catch all the unique Pok&eacute;mon.</p>