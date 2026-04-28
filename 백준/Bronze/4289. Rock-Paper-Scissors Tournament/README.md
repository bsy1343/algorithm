# [Bronze I] Rock-Paper-Scissors Tournament - 4289

[문제 링크](https://www.acmicpc.net/problem/4289)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 612, 정답: 103, 맞힌 사람: 75, 정답 비율: 17.202%

### 분류

수학, 구현, 사칙연산, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Rock-Paper-Scissors is game for two players, A and B, who each choose, independently of the other, one of <em>rock, paper,</em> or <em>scissors</em>. A player chosing <em>paper</em> wins over a player chosing <em>rock</em>; a player chosing <em>scissors</em> wins over a player chosing <em>paper</em>; a player chosing <em>rock</em> wins over a player chosing <em>scissors</em>. A player chosing the same thing as the other player neither wins nor loses.</p>

<p>A tournament has been organized in which each of <em>n</em> players plays <em>k</em> rock-scissors-paper games with each of the other players - <em>k*n*(n-1)/2</em> games in total. Your job is to compute the <em>win average</em> for each player, defined as <em>w / (w + l)</em> where <em>w</em> is the number of games won, and <em>l</em> is the number of games lost, by the player.</p>

### 입력

<p>Input consists of several test cases. The first line of input for each case contains <em>1 &le; n &le; 100</em> <em>1 &le; k &le; 100</em> as defined above. For each game, a line follows containing p<sub>1</sub>, m<sub>1</sub>, p<sub>2</sub>, m<sub>2</sub>. 1 &le; p<sub>1</sub> &le; <em>n</em> and 1 &le; p<sub>2</sub> &le; <em>n</em> are distinct integers identifying two players; m<sub>1</sub> and m<sub>2</sub> are their respective moves (&quot;rock&quot;, &quot;scissors&quot;, or &quot;paper&quot;). A line containing 0 follows the last test case.</p>

### 출력

<p>Output one line each for player 1, player 2, and so on, through player <em>n</em>, giving the player&#39;s win average rounded to three decimal places. If the win average is undefined, output &quot;-&quot;. Output an empty line between cases.</p>