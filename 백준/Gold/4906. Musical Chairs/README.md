# [Gold I] Musical Chairs - 4906

[문제 링크](https://www.acmicpc.net/problem/4906)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 15, 맞힌 사람: 12, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>In the traditional game of Musical Chairs, N + 1 children run around N chairs (placed in a circle) as long as music is playing. The moment the music stops, children run and try to sit on an available chair. The child still standing leaves the game, a chair is removed, and the game continues with N children. The last child to sit is the winner.</p>

<p>In an attempt to create a similar game on these days&rsquo; game consoles, you modify the game in the following manner: N Children are seated on N chairs arranged around a circle. The chairs are numbered from 1 to N. Your program pre-selects a positive number D. The program starts going in circles counting the children starting with the first chair. Once the count reaches D, that child leaves the game, removing his/her chair. The program starts counting again, beginning with the next chair in the circle. The last child remaining in the circle is the winner.</p>

<p>For example, consider the game illustrated in the the adjacent figure for N = 5 and D = 3. In the figure, the dot indicates where counting starts and &times; indicates the child leaving. Starting off, child #3 leaves the game, and counting restarts with child #4. Child #1 is the second child to leave and counting restart with child #2 resulting in child #5 leaving. Child #2 is the last to leave, and child #4 is the winner. Write a program to determine the winning child given both N and D.</p>

### 입력

<p>Your program will be tested on one or more test cases. Each test case specifies two positive integers N and D on a single line, separated by one or more spaces, where N, D &lt; 1, 000, 000.</p>

<p>The last line of the input file contains two 0&rsquo;s and is not part of the test cases.</p>

### 출력

<p>For each test case, write the winner using the following format:</p>

<p>N␣D␣W</p>

<p>Where N and D are as above, ␣ is a space character, and W is the winner of that game.</p>