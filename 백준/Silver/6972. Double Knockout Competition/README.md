# [Silver III] Double Knockout Competition - 6972

[문제 링크](https://www.acmicpc.net/problem/6972)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 117, 정답: 17, 맞힌 사람: 16, 정답 비율: 18.391%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>In a number of sports, a championship may be determined by a double knockout competition. A team is eliminated on its second loss, so the winner is the last remaining team with one or fewer losses. The competition is played is a series of rounds: in each round, teams that have not been eliminated are paired subject to the constraint that an undefeated team never plays a team with one loss. As many teams as possible are paired in each round. After a number of rounds only two teams remain. These teams play in a round by themselves, although one is undefeated and the other is not. If neither is eliminated, they play again in a final round. For our analysis we assume that this extra round is always necessary.</p>

<p>Write a program to report on a Double Knockout Competition.</p>

### 입력

<p>The first line of input contains one positive integer n which is the number of test cases which follow it. The next n lines each contain one positive integer t, t &lt; 32768, which is the number of teams in the competition for that test case.</p>

### 출력

<p>For each case there should be an initial line which has the form: Round 0:</p>

<p>2 undefeated, 0 one-loss, 0 eliminated</p>

<p>This is followed by a similar line for each round of the competition, followed by a single line saying how my rounds were played. The output for different test cases is to be separated by a single blank line.</p>

### 힌트

<p>And,</p>

<p>b) If there are t = 2^(2^k) teams, where k is an integer, how many rounds are played in the tournament?</p>

<p>c) How many games are played in an t team competition?</p>