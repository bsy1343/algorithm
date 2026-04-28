# [Gold III] TOWER - 3261

[문제 링크](https://www.acmicpc.net/problem/3261)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 20, 맞힌 사람: 19, 정답 비율: 82.609%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>There are empty plastic glasses marked with numbers from 1 to N which can be put one into another, standing on the table.</p>

<p>You are given number of moves a&rarr;b that mean that you should move the bunch containing glass a to the bunch containing glass b. If a is equal to b, or glasses a and b are in the same bunch, than that move does nothing.</p>

<p>For example, we have 7 glasses and moves 1&rarr;3, 2&rarr;6, 3&rarr;6, 4&rarr;7 and 4&rarr;2, then situation on the table will change as follows:</p>

<pre style="text-align: center;">
                                                                        4
                                                                        7
                                                    1         1         1
                                                    3         3         3
                    1             1     2           2         2 4       2
1 2 3 4 5 6 7 --&gt; 2 3 4 5 6 7 --&gt; 3 4 5 6 7 --&gt; 4 5 6 7 --&gt; 5 6 7 --&gt; 5 6</pre>

<p>Moves must be made in the given order.</p>

<p>Write a program that will choose zero move, which is move that should be made before the first move in the given order. You should choose such zero move that will maximize the number of glasses in the largest bunch.</p>

### 입력

<p>In the first line of input there are two integers N and M, 2 &le; N &le; 10000, 0 &le; M &le; 100000. N is the number of glasses standing at the table and M is the number of moves to be made.</p>

<p>Next M lines contain moves to be made. In each of those lines are two integers a and b which represent move a&rarr;b.</p>

### 출력

<p>One and only line of output file should contain zero move a&rarr;b represented by two integers a and b separated by one space.</p>

<p>Note: solution need not to be unique.</p>