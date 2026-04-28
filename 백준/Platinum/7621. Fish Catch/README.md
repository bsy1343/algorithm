# [Platinum II] Fish Catch - 7621

[문제 링크](https://www.acmicpc.net/problem/7621)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 14, 맞힌 사람: 12, 정답 비율: 46.154%

### 분류

이분 탐색, 자료 구조, 기하학, 수학, 우선순위 큐, 삼분 탐색

### 문제 설명

<p>Fishermen of New England like to catch so called &rdquo;SLSS&rdquo; fish. SLSS stands for &rdquo;straight line same speed fish&rdquo;, because such fish is very lazy and rarely changes its speed and direction of travel. Fishermen bring a net in a shape of a circle, that has an adjustable radius. They locate the best position for the center of the net, based on their visual observation of high concentration of fish. There are N fish. They also write down the initial position and the direction of travel of each fish. Their plan is to catch K fish in order to make a nice dinner for their families. However, they don not want to catch many more fish, so that there is enough fish left in the Ocean. They need to set a proper radius length of the net, which leads them to a hard computational problem. As a fishermen&rsquo;s friend, please help them to find the smallest radius of the net such that there is a moment when they can dip the net into the Ocean and catch at least K fish.</p>

### 입력

<p>The first line of the input contains two integers Cx and Cy separated by a space character (1 &le; Cx, Cy &le; 10<sup>4</sup>), that represent the coordinates of the center of the net. The second line of the input contains two integers N and K separated by a space character (5 &le; N &le; 1000, 1 &le; K &le; N). Each of the next N lines contain four integers Ax, Ay, Bx, By separated by a space character (0 &le; Ax, Ay, Bx, By &le; 10<sup>4</sup>). Ax and Ay represent the initial coordinates of a fish (at time zero), while Bx and By represent the estimated coordinates of a fish after 1 second. Note that fishermen can use the net at any moment starting from time zero.</p>

### 출력

<p>In the first line of the output write one real number R using exactly 5 decimal digits of precision &ndash; which is the desired radius of the net. It should be followed by a newline.</p>