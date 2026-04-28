# [Silver III] Least Common Multiple - 16261

[문제 링크](https://www.acmicpc.net/problem/16261)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 177, 정답: 100, 맞힌 사람: 47, 정답 비율: 61.039%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>Least common multiple is a well known term in math, it is the smallest number that is divisible by any of the given numbers. The concept of least common multiple can be generalized to other objects in math, for example to fractions.</p>

<p>You are given two irreducible fractions. Find their least common multiple &mdash; the smallest positive irreducible fraction p&thinsp;/&thinsp;q such that the result of the division of p&thinsp;/&thinsp;q to any of the given fractions is integer.</p>

### 입력

<p>Input contains several test cases. The first line of input contains integer t &mdash; the number of test cases (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;50&thinsp;000).</p>

<p>Each test case is described as a single line that contains four positive integers a, b, c, d, that correspond to irreducible fractions a&thinsp;/&thinsp;b and c&thinsp;/&thinsp;d (1&thinsp;&le;&thinsp;a,&thinsp;b,&thinsp;c,&thinsp;d&thinsp;&le;&thinsp;10<sup>9</sup>). It is guaranteed that a&thinsp;/&thinsp;b and c&thinsp;/&thinsp;d are both irreducible.</p>

### 출력

<p>For each test case output one line. Print two integers: numerator and denominator of the fraction that is a least common multiple of the given a&thinsp;/&thinsp;b and c&thinsp;/&thinsp;d fractions.</p>