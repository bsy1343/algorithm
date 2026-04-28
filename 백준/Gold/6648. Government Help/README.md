# [Gold IV] Government Help - 6648

[문제 링크](https://www.acmicpc.net/problem/6648)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 14, 맞힌 사람: 13, 정답 비율: 46.429%

### 분류

그리디 알고리즘

### 문제 설명

<p>Two major banks in our country are knee-deep in troubles. We will call them &ldquo;Bank A&rdquo; and &ldquo;Bank B&rdquo; &mdash; hopefully you understand we absolutely cannot tell you their real names. It might ruin them.</p>

<p>As a logical consequence of their troubles, government comes to rescue them, preparing a set of financial &ldquo;packages&rdquo; that will be distributed between these two banks. However, there is one important condition: the packages will be given to the banks one by one and we need to minimize the difference between the amount given to both banks in any particular moment. Otherwise, one of the banks would gain a big advantage over the other.</p>

<p>For example, imagine that we have four packages with the values of 100 000, 110 000, 120 000, and 150 000. If we give the first package to the Bank A, then the second one to the Bank B, the third one to the Bank B, and the fourth package to the Bank A, the difference between the help provided to the banks will be +100 000 after the first package, -10 000 after the second one, -130 000 after the third one, and +20 000 after the last package. The maximal difference is therefore 130 000.</p>

<p>There is a better solution, with the maximal difference of 100 000 only: first, give 100 000 to the Bank A, then 120 000 to the Bank B, then 110 000 to the Bank A, and then 150 000 to the Bank B.</p>

### 입력

<p>The input contains multiple sets of financial packages. Each set begins with a line containing a single positive integer N: the number of financial packages (1 &le; N &le; 50 000). The second line is a set of N positive integers separated by a space, all of them between 100 000 and 199 999 inclusive. These numbers specify the amount of money in individual packages. Packages can be assigned in any order, the order of numbers on the second line is therefore not important.</p>

<p>The last set will be followed by a line containing single zero.</p>

### 출력

<p>For each set of financial packages, output one line containing the order of assignments of packages to the banks, such as the maximal difference is as low as possible. If there are more possible solutions, you may print any of them.</p>

<p>Assignments must be separated by a space, each assignment consists of one number (the package size), one dash character (&ldquo;-&rdquo;), and an uppercase letter (&ldquo;A&rdquo; or &ldquo;B&rdquo;) specifying the bank.</p>