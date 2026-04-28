# [Silver IV] Rasvjeta - 15360

[문제 링크](https://www.acmicpc.net/problem/15360)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 112, 정답: 68, 맞힌 사람: 54, 정답 비율: 56.250%

### 분류

수학, 구현, 그리디 알고리즘

### 문제 설명

<p>It is Advent season. There are M street lights in a street N metres long (the meters of the street are denoted with numbers from 1 to N). Each of the lights lights up the meter of the street it&rsquo;s located in and K meters to the left and to the right of that location. In other words, if the light is located at meter X, it lights up all metres of the street from X - K to X + K, inclusively. Of course, it is possible for a meter of the street to be lit up by multiple street lights. All lights have distinct locations.</p>

<p>The problem is that there is a possibility that the lights don&rsquo;t light up all N metres of the street. It is your task to determine the minimal amount of additional lights needed to be put up (at position from 1 to N) so that the entire street is lit up.</p>

### 입력

<p>The first line of input contains the number N (1 &le; N &le; 1000).</p>

<p>The second line of input contains the number M (1 &le; M &le; N).</p>

<p>The third line contains the number K (0 &le; K &le; N).</p>

<p>Each of the following M lines contains a number. The numbers are sorted in ascending order and represent the positions of each of the M street lights.</p>

<p>The positions will be distinct and from the interval [1, N].</p>

### 출력

<p>You must output the required number from the task.</p>

### 힌트

<p>Clarification of the first test case: It&rsquo;s not necessary to add lights to the street, since all N meters are already lit up.</p>

<p>Clarification of the third test case: It is necessary to add one lamp, for example at location 13.</p>