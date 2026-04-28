# [Platinum II] Berilij - 26394

[문제 링크](https://www.acmicpc.net/problem/26394)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 5, 맞힌 사람: 5, 정답 비율: 21.739%

### 분류

기하학, 그래프 이론, 그래프 탐색, 수학

### 문제 설명

<p>Little sheep Be (short for Berilij) was kidnapped by the aliens, and they have a rather unusual request for her. They want to hire her.</p>

<p>Precisely on Saturday, November 5th, the aliens plan to visit Earth with n spaceships and reward the best COCI contestants (and maybe hire them too). Their spaceships are perfect circles.</p>

<p>Due to safety reasons, they chose m pairs of spaceships that have to touch externally when they land. They have already determined the landing coordinates of the center point for each of the spaceships, and Be&rsquo;s task is to determine the radius of each of the spaceships, so the conditions are satisfied.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26394.%E2%80%85Berilij/8d75615d.png" data-original-src="https://upload.acmicpc.net/7d8b711a-4770-4cc8-8c20-caba4fd1b962/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 368px; height: 184px;" /></p>

<p style="text-align: center;">In the image, the left and the right pairs of spaceships do not satisfy the condition of touching externally. The pair of spaceships in the middle fulfills the condition of touching externally.</p>

<p>Spaceships are very expensive, and their cost is equal to their area, so the aliens are asking Be to determine the radii with the minimum cost of the spaceships.</p>

<p>Their advanced technology allows spaceships to overlap, and, even more interestingly, they know how to make a spaceship with radius equal to 0.</p>

<p>If there is no set of radii that satisfies the conditions, aliens expect Be to inform them about it. If Be doesn&rsquo;t succeed in determining the radii, they will hire her as lunch.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n, m &le; 10<sup>5</sup>), the number of spaceships, and the number of conditions.</p>

<p>The following n lines contain real numbers x<sub>i</sub> and y<sub>i</sub> (&minus;10 000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 10 000), the coordinates of the center point of the i-th spaceship. Each of the numbers will be given with 10 decimal places.</p>

<p>The following m lines contain two integers a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n, a<sub>i</sub> &ne; b<sub>i</sub>), representing the condition that the a<sub>i</sub>-th and b<sub>i</sub>-th spaceship must touch externally after landing. For each unordered pair (a<sub>i</sub>, b<sub>i</sub>) there will be at most one such condition.</p>

### 출력

<p>If there is no solution, in the first and only line print <code>NE</code>. Otherwise, in the first line print <code>DA</code>, and in the i-th of the following n lines print the radius of the i-th spaceship.</p>

### 힌트

<p>Clarification of the first example: This is the only solution that satisfies all the touching conditions. Please note that solution (0.585700, 1.414357, 1.414357) is also considered correct, even though spaceships 2 and 3 aren&rsquo;t touching, because the absolute error doesn&rsquo;t exceed 10<sup>&minus;4</sup>.</p>

<p>Clarification of the third example: There is no arrangement of the radii that satisfies all conditions.</p>