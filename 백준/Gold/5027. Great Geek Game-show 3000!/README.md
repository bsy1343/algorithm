# [Gold I] Great Geek Game-show 3000! - 5027

[문제 링크](https://www.acmicpc.net/problem/5027)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 16, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 수학, 누적 합, 확률론

### 문제 설명

<p>Yes! You&rsquo;ve finally been chosen to participate in the &rdquo;Great Geek Game-show 3000&rdquo;. This is the moment you&rsquo;ve been waiting for, ever since you puzzled out how to maximise your chances of winning. You will finally be rich, and able to buy all the algorithm books you want! Of course you will have to share the winnings with the other contestants, but since your algorithm is vastly superior to the randomness of all the other numb-skulls you are certain you will be able to keep most of the prize money for yourself, in exchange for telling them how you can all maximise your chances of winning.</p>

<p>The rules of the game are the following: There is a stage with N boxes, each containing the name of one of the N contestants, and such that each contestant has their name in exactly one box. The contestants enter the stage one at a time, and each one is allowed to peek inside K of the boxes. If they find their own name inside one of these boxes they can get off the stage, and the game continues with the next contestant. If all contestants find their own name, everyone wins. But if one contestant fails to find theirs, everyone loses. After the game has begun, no communication between the contestants is allowed. However you are all allowed to agree upon a strategy before the game begins, and this is where you explain to all the others that the algorithm of everyone choosing K boxes at random is a very bad one, since it gives a chance of winning only equal to K<sup>N</sup>/N. Instead you suggest the following algorithm:</p>

<p>Assign to each player and each box a unique number in the range 1, . . . , N. Then each player starts with opening the box with the same number as themselves. The next box the player opens is the box whose number is found inside the first box, then the box whose number is found inside the second box, and so on. The process goes on until the player has opened K boxes, or found their own number.</p>

<p>Now to bring home your point of how superior your algorithm is, you will need to calculate the exact odds of winning if all the contestants follow your directions. Unfortunately, this is the only thing you haven&rsquo;t figured out yet . . .</p>

### 입력

<p>One line with the following numbers:</p>

<p>1 &le; N &le; 10000000 &ndash; the number of contestants.</p>

<p>1 &le; K &le; N &ndash; the number of boxes each contestant may check.</p>

### 출력

<p>The chances you have of winning if everyone follows your algorithm.</p>