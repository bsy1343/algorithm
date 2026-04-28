# [Platinum II] Tug of War - 10783

[문제 링크](https://www.acmicpc.net/problem/10783)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 107, 정답: 19, 맞힌 사람: 13, 정답 비율: 15.476%

### 분류

너비 우선 탐색, 비트 집합, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 배낭 문제

### 문제 설명

<p>Tug of war is a very popular sport in Byteland. The rules are easy: two teams pull a rope in opposite directions. The annual Byteland tug of war charity is taking place, and a lot of contestants have signed up. As the fair play commissioner, your job is to divide the contestants into two teams, such that the game can go on for a long time.</p>

<p>Since a total of 2n contestants have signed up, each team will consist of n contestants. The rope has n spots on the left side and n spots on the right side. The tug of war elite of Byteland are a picky bunch: each contestant has exactly one spot on the left side of the rope and one spot on the right side that he or she wants to use. Furthermore, you know the strength of each contestant.</p>

<p>The organizer has now asked you the following: Given an integer k, is it possible to create two teams, such that each team has n contestants, each contestant uses a spot that he or she wants to use (of course no two contestants share a spot), and the sums of strengths of the two teams differ by at most k?</p>

### 입력

<p>The first line of input contains a positive integer n, specifying the number of spots on each side of the rope, and an integer k &le; 20n, specifying the maximum difference of teams&rsquo; strengths. For simplicity, we number the contestants from 1 to 2n.</p>

<p>Each of the following 2n lines describes one contestant: the i-th of these lines contains three positive integers l<sub>i</sub>, r<sub>i</sub> and s<sub>i</sub> (1 &le; l<sub>i</sub>, r<sub>i</sub> &le; n, 1 &le; s<sub>i</sub> &le; 20), which specify that contestant i has strength s<sub>i</sub> and wants to use either spot l<sub>i</sub> on the left side of the rope or spot r<sub>i</sub> on the right side of the rope.</p>

### 출력

<p>In the first and only line of output your program should write either YES or NO, depending on whether it is possible to create two teams satisfying the requirements stated above.</p>

### 힌트

<p>In the first example we can assign contestants 1, 3, 6 and 7 to the left side (which results in a team of strength 1 + 8 + 2 + 1 = 12) and contestants 2, 4, 5 and 8 to the right side (which results in a team of strength 2 + 2 + 5 + 2 = 11). The difference of strengths between teams is 1.</p>

<p>In the second example both players of strength 4 have to be in the same team, thus the minimal difference of strengths between teams is 6.</p>