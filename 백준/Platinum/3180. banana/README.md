# [Platinum III] banana - 3180

[문제 링크](https://www.acmicpc.net/problem/3180)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 20, 맞힌 사람: 19, 정답 비율: 45.238%

### 분류

다이나믹 프로그래밍, 트리, 이분 탐색, 트리에서의 다이나믹 프로그래밍, 매개 변수 탐색

### 문제 설명

<p>The traffic network in a country consists of N cities (labeled with integers 1 to N) and N-1 roads connecting the cities. There is a unique path between each pair of different cities.&nbsp;</p>

<p>Because of the many years of lazy maintenance the roads are pretty damaged and for each road two numbers A and B are known &ndash; the integer A represents the current time (in seconds) needed to travel along the road, and the integer B represents the smallest possible time (in seconds) needed to travel along this road if we repair all the damage.&nbsp;</p>

<p>We want to invest a certain amount of money into road repair. For a particular road, the result will be proportional to the amount of invested money. For each euro invested in some road, the time needed to travel along that road will be reduced by one second (the amount of money invested in some road has to be an integer). The travel time cannot be reduced beyond the smallest possible time B described above.&nbsp;</p>

<p>We are given a certain amount of money. We want to distribute this money along different roads in such a way that the time needed to travel from the city 1 to the most distant city (after all the repairs) is as small as possible.&nbsp;</p>

<p>Write a program that will find this smallest time.&nbsp;</p>

### 입력

<p>The first line of input contains two integers N and K, 2 &le; N &le; 100 000, 0 &le; K &le; 1 000 000, the number of cities and the total amount of money (in euros).&nbsp;</p>

<p>Each of the next N-1 lines contains four integers X, Y, A and B, 0 &le; B &le; A &le; 10 000. It means that there is a road between cities X and Y, with the numbers A and B representing the current time and the minimum time as described above.</p>

### 출력

<p>The first and only line of output should contain a single integer &ndash; the minimum time from the task description.&nbsp;</p>