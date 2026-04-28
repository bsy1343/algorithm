# [Platinum IV] Virus - 11099

[문제 링크](https://www.acmicpc.net/problem/11099)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 91, 정답: 16, 맞힌 사람: 9, 정답 비율: 26.471%

### 분류

수학, 이분 탐색, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>Some mad chemistry dude has made a new atomic virus bomb that will kill everybody. It works like this:</p>

<p>The virus has N different forms. Every second, a virus in one form will transform into one or more viruses of the same or different forms. Furthermore, each form will produce a certain number of tritium atoms during the second it takes to transform. When the total number of such atoms reaches the critical limit L, they explode as a hydrogen bomb.</p>

<p>We want to know how long time it takes from a poor guy gets infected until he blows up.</p>

<p>A simple example would be a virus with only one form, which will transform into two viruses of the same form every second, and will produce one tritium atom in one second. Let&rsquo;s say that L = 15. After one second there are two viruses and one atom. After two seconds there are four viruses and three atoms. After three seconds there are eight viruses and seven atoms. After four seconds the bomb goes off.</p>

<p>Let&rsquo;s look at a little more complex example with a virus with two forms A and B, and L = 500. Every second a virus of form A will transform into three viruses of form A and one virus of form B, and produce one tritium atom. A virus of form B will transform into two viruses of form B, and produce one hundred tritium atoms. If we start with one virus of form A, then after one second we have 3 A, 1 B, and 1 atom. After two seconds we have 9 A, 5 B, and 104 atoms. After three seconds we have 27 A, 19 B, and 613 atoms. So the answer is three seconds.</p>

### 입력

<p>The first line of the input gives the number of test cases T &le; 100. The first line of each test case contains 1 &le; N &le; 20 and 1 &le; L &le; 1000000000. Then follow N lines, one for each form. The description of a form contains N + 1 non-negative integers less than 1000. The first N describe how many viruses of the different forms it transforms into. The last describes how many tritium atoms it produces in the process.</p>

### 출력

<p>Output one line for each test case. We assume that the patient is infected with one virus of the first form. If the virus bomb will never go off, print &ldquo;lucky&rdquo;. Otherwise, print the number of seconds it takes before the patient blows up.</p>