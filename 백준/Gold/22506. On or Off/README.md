# [Gold I] On or Off - 22506

[문제 링크](https://www.acmicpc.net/problem/22506)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 10, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 최소 공통 조상

### 문제 설명

<p>Saving electricity is very important!</p>

<p>You are in the office represented as&nbsp;<var><i>R</i>&times;<i>C</i></var>&nbsp;grid that consists of walls and rooms. It is guaranteed that, for any pair of rooms in the office, there exists exactly one route between the two rooms. It takes 1 unit of time for you to move to the next room (that is, the grid adjacent to the current room). Rooms are so dark that you need to switch on a light when you enter a room. When you leave the room, you can either leave the light on, or of course you can switch off the light. Each room keeps consuming electric power while the light is on.</p>

<p>Today you have a lot of tasks across the office. Tasks are given as a list of coordinates, and they need to be done in the specified order. To save electricity, you want to finish all the tasks with the minimal amount of electric power.</p>

<p>The problem is not so easy though, because you will consume electricity not only when light is on, but also when you switch on/off the light. Luckily, you know the cost of power consumption per unit time and also the cost to switch on/off the light for all the rooms in the office. Besides, you are so smart that you don&#39;t need any time to do the tasks themselves. So please figure out the optimal strategy to minimize the amount of electric power consumed.</p>

<p>After you finished all the tasks, please DO NOT leave the light on at any room. It&#39;s obviously wasting!</p>

### 입력

<p>The first line of the input contains three positive integers&nbsp;<var><i>R</i></var>&nbsp;(<var>0&lt;<i>R</i>&le;50</var>),&nbsp;<var><i>C</i></var>&nbsp;(<var>0&lt;<i>C</i>&le;50</var>) and&nbsp;<var><i>M</i></var>&nbsp;(<var>2&le;<i>M</i>&le;1000</var>). The following&nbsp;<var><i>R</i></var>&nbsp;lines, which contain&nbsp;<var><i>C</i></var>&nbsp;characters each, describe the layout of the office. &#39;.&#39; describes a room and &#39;#&#39; describes a wall.</p>

<p>This is followed by three matrices with&nbsp;<var><i>R</i></var>&nbsp;rows,&nbsp;<var><i>C</i></var>&nbsp;columns each. Every elements of the matrices are positive integers. The&nbsp;<var>(<i>r</i>,<i>c</i>)</var>&nbsp;element in the first matrix describes the power consumption per unit of time for the room at the coordinate&nbsp;<var>(<i>r</i>,<i>c</i>)</var>. The&nbsp;<var>(<i>r</i>,<i>c</i>)</var>&nbsp;element in the second matrix and the third matrix describe the cost to turn on the light and the cost to turn off the light, respectively, in the room at the coordinate&nbsp;<var>(<i>r</i>,<i>c</i>)</var>.</p>

<p>Each of the last&nbsp;<var><i>M</i></var>&nbsp;lines contains two positive integers, which describe the coodinates of the room for you to do the task.</p>

<p>Note that you cannot do the&nbsp;<var><i>i</i></var>-th task if any of the&nbsp;<var><i>j</i></var>-th task (<var>0&le;<i>j</i>&le;<i>i</i></var>) is left undone.</p>

### 출력

<p>Print one integer that describes the minimal amount of electric power consumed when you finished all the tasks.</p>