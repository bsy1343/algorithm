# [Gold V] Buffcraft - 10373

[문제 링크](https://www.acmicpc.net/problem/10373)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 188, 정답: 50, 맞힌 사람: 41, 정답 비율: 24.848%

### 분류

브루트포스 알고리즘, 정렬, 누적 합

### 문제 설명

<p>Brenda enjoys a new role-playing game Buffcraft. Shields, swords, books and other carry-on items do not affects character stats in Buffcraft. The only way to increase the stats of your character is to buff her.</p>

<p>There are two types of buffs in Buffcraft. Direct buffs increase a base value of the stat, while percentage buffs increase stats by the fraction of the base value. To be precise, if unbuffed base value of your character stat is b, you have buffed her using n direct buffs of strength d1, d2, ...dn and m percentage buffs of strength p<sub>1</sub>, p<sub>2</sub>, ..., p<sub>m</sub>, the resulting stat will be equal to (b + d<sub>1</sub> + d<sub>2</sub> + &middot; &middot; &middot; + d<sub>n</sub>)(100 + p<sub>1</sub> + p<sub>2</sub> + &middot; &middot; &middot; + p<sub>m</sub>)/100. Note that the resulting stat may be fractional.</p>

<p>Unfortunately, your character has only k buff slots and if you apply more than k buffs on her, only the last k buffs remains active. Thus, there is no reason to apply more than k buffs simultaneously. You cannot apply the same buff more than once.</p>

<p>Brenda is going to send his character to raid and wants to buff her health to maximal possible value. She has some direct and some percentage buffs at her disposal and needs your help to select the set of buffs that leads to maximal possible total health.</p>

### 입력

<p>The first line of the input file contains four integers b, k, c<sub>d</sub> and c<sub>p</sub> &mdash; the base health of the character, the number of buff slots, the number of available directs buffs, and the number of available percentage buffs.</p>

<p>The following line contains c<sub>d</sub> integers d<sub>i</sub> &mdash; strengths of direct buffs.</p>

<p>The last line of the input file contains c<sub>p</sub> integer numbers p<sub>i</sub> &mdash; strengths of percentage buffs.</p>

<p>All numbers in the input file are greater than or equal to zero, and less than or equal to fifty thousand.</p>

### 출력

<p>The first line of the output file must contain two integers n and m &mdash; the number of direct and percentage buffs to use (0 &le; n &le; c<sub>d</sub>; 0 &le; m &le; c<sub>p</sub>; 0 &le; n + m &le; k).</p>

<p>The following line must contain n different numbers &mdash; indices of direct buffs to apply (buffs are numbered from one).</p>

<p>The last line of the output must contain m different numbers &mdash; indices of percentage buffs to apply (also numbered from one).</p>

<p>The resulting total health after application of all n + m buffs must be maximal possible.</p>