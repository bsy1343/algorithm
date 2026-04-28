# [Silver IV] Grave - 10378

[문제 링크](https://www.acmicpc.net/problem/10378)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 179, 정답: 95, 맞힌 사람: 89, 정답 비율: 54.601%

### 분류

기하학

### 문제 설명

<p>Gerard develops a Halloween computer game. The game is played on a rectangular graveyard with a rectangular chapel in it. During the game, the player places new rectangular graves on the graveyard. The grave should completely fit inside graveyard territory and should not overlap with the chapel. The grave may touch borders of the graveyard or the chapel.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10378.%E2%80%85Grave/fe0591fe.png" data-original-src="https://www.acmicpc.net/upload/images2/grave.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:225px; width:282px" /></p>

<p>Gerard asked you to write a program that determines whether it is possible to place a new grave of given size or there is no enough space for it.</p>

### 입력

<p>The first line of the input file contains two pairs of integers: x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> (&minus;10<sup>9</sup> &le; x<sub>1</sub> &lt; x<sub>2</sub> &le; 10<sup>9</sup>; &minus;10<sup>9</sup> &le; y<sub>1</sub> &lt; y<sub>2</sub> &le; 10<sup>9</sup>) &mdash; coordinates of bottom left and top right corners of the graveyard. The second line also contains two pairs of integers x<sub>3</sub>, y<sub>3</sub>, x<sub>4</sub>, y<sub>4</sub> (x<sub>1</sub> &lt; x<sub>3</sub> &lt; x<sub>4</sub> &lt; x<sub>2</sub>; y<sub>1</sub> &lt; y<sub>3</sub> &lt; y<sub>4</sub> &lt; y<sub>2</sub>) &mdash; coordinates of bottom left and top right corners of the chapel.</p>

<p>The third line contains two integers w, h &mdash; width and height of the new grave (1 &le; w, h &le; 10<sup>9</sup>). Side with length w should be placed along OX axis, side with length h &mdash; along OY axis.</p>

### 출력

<p>The only line of the output file should contain single word: &ldquo;Yes&rdquo;, if it is possible to place the new grave, or &ldquo;No&rdquo;, if there is not enough space for it.</p>