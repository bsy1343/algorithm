# [Gold I] Space Turtle - 6895

[문제 링크](https://www.acmicpc.net/problem/6895)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

기하학, 3차원 기하학, 삼분 탐색

### 문제 설명

<p>Space Turtle is a fearless space adventurer. His spaceship, the <em>Tortoise</em>, is a little outdated, but still gets him where he needs to go.</p>

<p>The <em>Tortoise</em> can do only two things &ndash; move forward an integer number of light-years, and turn in one of four directions (relative to the current orientation): right, left, up and down. In fact, strangely enough, we can even think of the Tortoise as a ship which travels along a 3-dimensional coordinate grid, measured in light-years.</p>

<p>In today&#39;s adventure, Space Turtle is searching for the fabled Golden Shell, which lies on a deserted planet somewhere in uncharted space. Space Turtle plans to fly around randomly looking for the planet, hoping that his turtle instincts will lead him to the treasure.</p>

<p>You have the lonely job of being the keeper of the fabled Golden Shell. Being lonely, your only hobby is to observe and record how close various treasure-seekers come to finding the deserted planet and its hidden treasure. Given your observations of Space Turtle&#39;s movements, determine the closest distance Space Turtle comes to reaching the Golden Shell.</p>

### 입력

<p>The first line consists of three integers $sx$, $sy$, and $sz$, which give the coordinates of SpaceTurtle&#39;s starting point. Space Turtle is originally oriented in the positive $x$ direction, with the top of his spaceship pointing in the positive $z$ direction, and with the positive $y$ direction to his left. Each of these integers are between $-100$ and $100$. The second line consists of three integers $tx$, $ty$, and $tz$, which give the coordinates of the deserted planet. Each of these integers are between $-10\,000$ and $10\,000$. The rest of the lines describe Space Turtle&#39;s flight plan in his search for the Golden Shell. Each line consists of an integer, $d$, $0 \le d \le 100$, and a letter $c$, separated by a space. The integer indicates the distance in light-years that the Tortoise moves forward, and the letter indicates the direction the ship turns after having moved forward. <code>L</code>, <code>R</code>, <code>U</code>, and <code>D</code> stand for left, right, up and down, respectively. There will be no more than 100 such lines.</p>

<p>On the last line of input, instead of one of the four direction letters, the letter <code>E</code> is given instead, indicating the end of today&#39;s adventure.</p>

### 출력

<p>Output the closest distance that Space Turtle gets to the hidden planet, rounded to 2 decimal places. If Space Turtle&#39;s coordinates coincide with the planet&#39;s coordinates during his flight indicate that with a distance of $0.00$. He safely lands on the planet and finds the Golden Shell.</p>