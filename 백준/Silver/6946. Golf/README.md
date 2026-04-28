# [Silver I] Golf - 6946

[문제 링크](https://www.acmicpc.net/problem/6946)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 79, 정답: 34, 맞힌 사람: 31, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Roberta the Robot plays a perfect game of golf. When she hits the golf ball it always goes directly towards the hole on the green, and she always hits exactly the distance that is specified for the club. Each such action is known as a stroke, and the object of golf is to hit the ball from the tee to the hole in the fewest number of strokes. Roberta needs a program to select the best combination of clubs to reach the hole in the fewest strokes. She also needs to decide if the task is impossible, in which case she graciously acknowledges the loss. Roberta can carry up to $32$ clubs, and the total distance from the tee to the hole does not exceed $5\,280$ metres.</p>

### 입력

<p>The first line of input gives the distance from the tee to the hole, an integral number of metres between $1$ and $5\,280$. The next line states the number of clubs, between $1$ and $32$. For each club, a line follows giving the distance, in metres, that the club will hit the ball, an integer between $1$ and $100$. No two clubs have the same distance.</p>

### 출력

<p>If Roberta can get the ball from the tee to the hole, without passing the hole, print <code>Roberta wins in n strokes.</code> where $n$ is minimized. If Roberta cannot get the ball from the tee to the hole, print <code>Roberta acknowledges defeat.</code>.</p>