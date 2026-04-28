# [Gold II] Crushing blow - 20774

[문제 링크](https://www.acmicpc.net/problem/20774)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Khodislav is playing D&amp;D. At the moment, his character is fighting a monster and Khodislav, who is for some reason very sure in his attack, wants to destroy the enemy with the last crushing blow. His character has different weapons; the damage these weapons can cause is defined by rolling dice and characterized by three numbers $n$, $f$, and $m$, where $n$ is the number of dice, $f$ is the number of faces on each die, and $m$ is a modifier. For instance, if $n = 3$, $f = 8$, $m = 5$, then you will need to roll three eight-faced dice, sum the results, and add five to the sum to define the damage; this is usually written as $3d8 + 5$.</p>

<p>To destroy the monster, a weapon must inflict damage of $D$ or greater. Help Khodislav to choose a weapon for his character that will help him to kill the monster with maximum probability.</p>

<p>Dice rolls are independent; it is equally likely to roll each of the faces on a die. There are all numbers from $1$ to $f$ written on the faces of the die.</p>

### 입력

<p>In the first line of the input file, there is a single integer $T$ --- the number of tests ($1 \le T \le 5\,000$). It is followed by the description of $T$ tests.</p>

<p>The first line of a test contains two integers: $W$ --- the number of character&#39;s weapons and $D$ --- the minimum required damage to the monster ($1 \le W \le 5\,000$, $1 \le D \le 250$).</p>

<p>The following $W$ lines describe the weapons. Each line contains three integers: $n$ --- the number of the dice, $f$ --- the number of faces on each die, and $m$ --- the modifier ($1 \le n \le 10$, $2 \le f \le 20$, $-10 \le m \le 10$).</p>

<p>It is guaranteed that the total number of weapons in all tests is not greater than $5\,000$.</p>

### 출력

<p>For each test, print a single real number on a separate line --- the maximum probability of inflicting damage no less than $D$ with a single blow. The absolute error of the answers must not exceed $10^{-11}$.</p>