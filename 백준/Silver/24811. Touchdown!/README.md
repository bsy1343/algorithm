# [Silver IV] Touchdown! - 24811

[문제 링크](https://www.acmicpc.net/problem/24811)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 28, 맞힌 사람: 24, 정답 비율: 47.059%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>In a game of American Football, there are several factors to take into consideration when detailing the rules of the game. The goal of the game is to move the football across the field into the endzone of the defending team through a series of plays, which form a drive. &nbsp;In each play, the attacking team may either gain or lose a number of yards, that is, their position on the field moves either towards or away from the defending team&#39;s endzone.</p>

<p>In the simplified version of football that we will consider, a team has four chances (in up to four plays) to advance the ball $10$ yards downfield; if they are successful, they will have achieved a &quot;first down&quot; and keep possession of the ball. &nbsp;If they achieve a first down, they have another up to four plays to continue their drive towards the defending team&#39;s endzone. &nbsp;If they keep possession and reach the defending team&#39;s endzone, they will have achieved a Touchdown. &nbsp;If they are pushed back into their own endzone, a Safety occurs and ends the drive. Otherwise the team loses possession of the ball and Nothing happens.</p>

<p>Sadly, the outcome of a drive has been lost, and all that remains is the yards gained or lost on each play! Your job is to determine whether or not a Touchdown, Safety, or Nothing occurred on the given drive.</p>

<p>For simplicity, we will assume that the team starts the drive on their own $20$ yard line on a $100$ yard field (with $0$ being the team&#39;s own endzone, and $100$ being the defending team&#39;s endzone). This means that a touchdown is scored if at least $80$ yards are gained in total, relative to the starting position, and without losing possession due to failing to get a first down. &nbsp;(If a team gains $80$ yards on the first play, they will have achieved a Touchdown even though they didn&#39;t achieve a first down in between.) A safety occurs if the team is pushed back $20$ yards from their original starting position, which would place them in their own endzone. &nbsp;Nothing occurs if neither of these events occurs.</p>

### 입력

<p>The input consists of a line containing one integer $N$ ($1 \le N \le 15$), which is the number of plays that this given drive recorded. Following this line are $N$ numbers representing the numbers of yards gained or lost on each particular play. Each given number will be between $-100$ and $100$ yards since that is the length of the football field.&nbsp;</p>

### 출력

<p>Output a single word, the result of the drive! If a touchdown is achieved, output &quot;<code>Touchdown</code>&quot;, if a safety is achieved, output &quot;<code>Safety</code>&quot;, else output &quot;<code>Nothing</code>&quot;. &nbsp;(Do not add a period at the end.) Once the outcome has been determined, your program should ignore the remaining yards listed in the drive.</p>