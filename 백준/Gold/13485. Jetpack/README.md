# [Gold II] Jetpack - 13485

[문제 링크](https://www.acmicpc.net/problem/13485)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 257, 정답: 85, 맞힌 사람: 61, 정답 비율: 35.465%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Little Mirko got a new mobile phone for his birthday! As all kids nowadays, he quickly&nbsp;downloaded all of the popular mobile games, including Jetpack Joyride.</p>

<p>In the game, the protagonist Barry is running across a field consisting of 10 rows and N&nbsp;columns of squares of equal size. Initially, Barry is located in the center of the square in the&nbsp;lower left corner. Barry is constantly running to the right at the speed of one square per&nbsp;second. Additionally, he must avoid obstacles that are in his way.</p>

<p>When Mirko presses the phone screen, Barry turns on his super-duper special jetpack and&nbsp;starts his ascent at the speed of one square per second (still moving to the right, now&nbsp;moving diagonally up at an angle of 45&deg;, until he reaches the ceiling, when he will continue&nbsp;moving to the right until Mirko releases the screen). When Mirko releases the phone screen,&nbsp;Barry starts falling down at the speed of one square per second (now moving diagonally&nbsp;again, but this time facing down, until he reaches the floor, when he will continue moving to&nbsp;the right).</p>

<p>Mirko just started playing the game recently and he&rsquo;s still not good at it. He saw on YouTube&nbsp;that someone managed to complete the game by crossing all N columns, so he is asking&nbsp;you for your help. He will give you the layout of the fields in the game, and you must output&nbsp;the moves he has to play in order to win.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 10<sup>5</sup>), the size of the field.<br />
Each of the following 10 lines contains N characters &lsquo;.&rsquo; and &lsquo;X&rsquo;, the layout of the field in the&nbsp;game. The characters &lsquo;X&rsquo; denote obstacles, and &lsquo;.&rsquo; walkable fields.&nbsp;</p>

### 출력

<p>The first line of output must contain the integer P (0 &le; P &le; 5&sdot;10<sup>4</sup>), the number of moves&nbsp;Mirko has to make.&nbsp;</p>

<p>In the following P lines, output any series of P moves, each in its own line, such that it solves&nbsp;Mirko&rsquo;s problem from the task.&nbsp;</p>

<p>A move is determined by two integers​ t<sub>i</sub>&nbsp;and x<sub>i</sub>, where t<sub>i</sub>&nbsp;denotes the second in which Mirko&nbsp;has to press the screen, and x<sub>i</sub>&nbsp;denotes how long he needs to keep the screen pressed.</p>

<p>A series of moves must be sorted in chronological order. In other words, it must hold t<sub>i</sub>+ x<sub>i</sub>&nbsp;&le;&nbsp;t<sub>i+1</sub>.</p>

<p>Also, no move should begin after the end of the game, t<sub>i</sub> &lt; N.</p>

<p>The input data will be such that a solution will surely exist.&nbsp;</p>