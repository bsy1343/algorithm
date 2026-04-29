# [Gold I] Mingle - 34641

[문제 링크](https://www.acmicpc.net/problem/34641)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

모듈로 곱셈 역원, 분할 정복을 이용한 거듭제곱, 수학, 정수론, 조합론

### 문제 설명

<p>You and your friends are playing the popular childhood game, Mingle.</p>

<p>In the game of Mingle, $n$ players start by standing on a spinning circular platform in the middle of a circular arena. Each player has a unique number ranging from $1$ to $n$, and there are $n$ rooms also with unique numbers from $1$ to $n$ arranged on the perimeter of the arena. The rooms are in numerical order, with room $n$ also being adjacent to room $1$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34641.%E2%80%85Mingle/d4bf4857.png" data-original-src="https://boja.mercury.kr/assets/problem/34641-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>Cheerful music plays for a few seconds, and then the music stops, the circular platform stops spinning, and everyone has to run into a room. Initially, each player tries to target the room with the same number as their number, but because of the spinning, everyone is disoriented. As a result, player $i$ might enter a different room. Notably, the players have a disorientation factor of $k$, which is the same for all players, and player $i$ might enter a room that is up to $k$ rooms away from their target room. All $2k+1$ candidate rooms are equally likely for each player and all players select their rooms independently. Every player who ends up alone in a room is a winner in that round of Mingle, even if the room’s number is not the same as the player’s number.</p>

<p>Compute the expected number of winners in a single round of Mingle.</p>

### 입력

<p>The first and only line of input contains two integers, $n$ $(3 \leq n \leq 456)$, and $k$ $(1 \le k \le \frac{n-1}{2})$, where $n$ is the number of players playing, and $k$ is the disorientation factor of the players.</p>

### 출력

<p>Let $w$ be the expected number of winners in a single round of Mingle. It can be shown that $w$ can be written as $\frac{a}{b}$ for relatively prime positive integers $a$ and $b$. Output $ab^{-1} \pmod{998244353}$.</p>