# [Bronze III] Automated Telephone Exchange - 3507

[문제 링크](https://www.acmicpc.net/problem/3507)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1339, 정답: 1042, 맞힌 사람: 974, 정답 비율: 78.422%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>In St Petersburg phone numbers are formatted as &ldquo;XXX&ndash;XX&ndash;XX&rdquo;, where the first three digits represent index of the Automated Telephone Exchange (ATE). Each ATE has exactly 10 000 unique phone numbers.</p>

<p>Peter has just bought a new flat and now he wants to install a telephone line. He thinks that a phone number is lucky if the arithmetic expression represented by that phone number is equal to zero. For example, the phone number 102&ndash;40&ndash;62 is lucky (102 &minus; 40 &minus; 62 = 0), and the number 157&ndash;10&ndash;47 is not lucky (157 &minus; 10 &minus; 47 = 100 &ne; 0).</p>

<p>Peter knows the index of the ATE that serves his house. To get an idea of his chances to get a lucky number he wants to know how many lucky numbers his ATE has.</p>

### 입력

<p>The input file contains a single integer number n &mdash; the index of Peter&rsquo;s ATE (100 &le; n &le; 999).</p>

### 출력

<p>Output a single integer number &mdash; the number of lucky phone numbers Peter&rsquo;s ATE has.</p>