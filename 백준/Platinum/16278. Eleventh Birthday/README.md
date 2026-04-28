# [Platinum I] Eleventh Birthday - 16278

[문제 링크](https://www.acmicpc.net/problem/16278)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 7, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>It is Borya&#39;s eleventh birthday, and he has got a great present: n cards with numbers. The i-th card has the number ai written on it. Borya wants to put his cards in a row to get one greater number. For example, if Borya has cards with numbers 1, 31, and 12, and he puts them in a row in this order, he would get a number 13112.</p>

<p>He is only 11, but he already knows that there are n! ways to put his cards in a row. But today is a special day, so he is only interested in such ways that the resulting big number is divisible by eleven. So, the way from the previous paragraph is good, because 13112&thinsp;=&thinsp;1192&thinsp;&times;&thinsp;11, but if he puts the cards in the following order: 31, 1, 12, he would get a number 31112, it is not divisible by 11, so this way is not good for Borya. Help Borya to find out how many good ways to put the cards are there.</p>

<p>Borya considers all cards different, even if some of them contain the same number. For example, if Borya has two cards with 1 on it, there are two good ways.</p>

<p>Help Borya, find the number of good ways to put the cards. This number can be large, so output it modulo 998244353.</p>

### 입력

<p>Input data contains multiple test cases. The first line of the input data contains an integer t &mdash; the number of test cases (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;100). The descriptions of test cases follow.</p>

<p>Each test is described by two lines.</p>

<p>The first line contains an integer n (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;2000) &mdash; the number of cards in Borya&#39;s present.</p>

<p>The second line contains n integers a<sub>i</sub> (1&thinsp;&le;&thinsp;a<sub>i</sub>&thinsp;&le;&thinsp;10<sup>9</sup>) &mdash; numbers written on the cards.</p>

<p>It is guaranteed that the total number of cards in all tests of one input data doesn&#39;t exceed 2000.</p>

### 출력

<p>For each test case output one line: the number of ways to put the cards to the table so that the resulting big number was divisible by 11, print the number modulo 998244353.</p>