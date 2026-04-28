# [Platinum II] Fruit Slicer - 16628

[문제 링크](https://www.acmicpc.net/problem/16628)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 14, 맞힌 사람: 13, 정답 비율: 35.135%

### 분류

기하학

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/e57f39e3-fd0c-40f9-bacb-5051dfd49738/-/preview/" style="width: 241px; height: 192px; float: right;" />John, a student who is taking the game development course, recently developed a mobile game called Fruit Slicer for his coursework. In the game the player slices fruits that are throw into the air by swiping the touch screen. However the game is quite simple because John was not able to write code for the geometry required for a more complex version. In the game each slice is a straight line of infinite length, and all fruits have the same shape of a circle with unit radius. The figure shows a cool snapshot of John&rsquo;s game.</p>

<p>John introduces his game to his best friend Sean, who soon gets bored of playing the simple game. But as a teaching assistant of the algorithm course, Sean decides to turn the game into a homework assignment. He asks the students in the algorithms course to write a program that can compute the best slice at any given moment of the game. Given the locations of the fruits, the program should determine the maximum number of fruits that can be sliced with a single straight-line swipe.</p>

<p>As a student in Sean&rsquo;s class, you are now the one who is facing this challenge.</p>

### 입력

<p>The first line has a single integer n (1 &le; n &le; 100). The next n lines each have two real numbers giving the x and y coordinates of a fruit. All coordinates have an absolute value no larger than 10<sup>4</sup> and are given with exactly two digits after the decimal point. Fruits may overlap.</p>

### 출력

<p>Output the maximum number of fruits that can be sliced with one straight-line swipe. A swipe slices a fruit if the line intersects the inner part or the boundary of the fruit.</p>