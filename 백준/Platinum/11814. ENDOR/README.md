# [Platinum I] ENDOR - 11814

[문제 링크](https://www.acmicpc.net/problem/11814)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 33, 정답: 19, 맞힌 사람: 18, 정답 비율: 62.069%

### 분류

다이나믹 프로그래밍, 애드 혹

### 문제 설명

<p>On the forest-filled moon of Endor there is, if we are to believe the Guinness Book of Records, the longest stick in the whole galaxy. On that stick of L meters in length there are N cheerful chameleons. Each chameleon is moving along the stick with constant speed of 1 m/s in one of two possible directions (left or right) and is colored in one of the possible K colors.</p>

<p>It is known that the chameleons of Endor worship the ancient ant laws that dictate that the walk along the stick must be continued until the end of the stick is reached (which means getting off it), and when a collision with another chameleon takes place, you must turn 180 degrees and continue the walk in the opposite direction. Additionally, after a chameleon colored in a moving to the left collides with a chameleon colored in b moving to the right, the chameleon moving to the left before the collision takes the color of the chameleon moving to the right before the collision (so, color b), while the chameleon moving to the right before the collision takes a new color (a + b) mod K.</p>

<p>If you are given the initial positions, colors and directions of movement of all the chameleons, for each color determine the total trip taken by the chameleons in that color before getting off the stick.</p>

### 입력

<p>The first line of input contains the integers N, K and L (1 &le; N &le; 100 000, 1 &le; K &le; 40, 1 &le; L &le; 1 000 000) from the task. The i th of the following N lines contains the integer d<sub>i</sub> (0 &le; d<sub>i</sub> &le; L) that denotes the distance between the i th chameleon and the left end of the stick, then the integer b<sub>i</sub> (0 &le; b<sub>i</sub> &le; K &minus; 1) that denotes the color of the i th chameleon and the character &lsquo;L&rsquo; (left) or &lsquo;D&rsquo; (right) that denote the direction of movement of the i th chameleon. All integers di will be unique and given in strictly ascending order.</p>

### 출력

<p>The output must contain K lines, the i th line containing the total trip taken by the chameleons in color i.</p>

### 힌트

<p>Clarification of the first example: The chameleons collide after 5 travelled meters in the middle of the stick. After that, both chameleons change their direction of movement. The chameleon moving to the right after collision is colored in 0, whereas the chameleon moving to the left after collision is colored in 1.</p>