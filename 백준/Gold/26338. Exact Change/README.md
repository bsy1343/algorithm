# [Gold III] Exact Change - 26338

[문제 링크](https://www.acmicpc.net/problem/26338)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 39, 맞힌 사람: 35, 정답 비율: 76.087%

### 분류

그리디 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>Whenever the UCF Programming Team travels to World Finals, Glenn likes having the exact amount of money necessary for any purchase, so that he doesn&rsquo;t have to count and receive change. Of course, most countries don&rsquo;t have many different denominations of coins, so Glenn creates different &ldquo;packages&rdquo; with him, each with some particular amount of money, in cents. Glenn would like to know which amount of money (in cents), is the smallest that he can&rsquo;t pay for exactly, with some combination of his packages.</p>

<p>Given a list of positive integers, determine the smallest integer that can&rsquo;t be represented as the sum of some subset of the integers on the list.</p>

### 입력

<p>The first input line contains a single positive integer, n (1 &lt; n &le; 100), indicating the number of sets of coin packages to evaluate. Each of the n input sets follows. The first line of each input set contains only an integer, c (1 &le; c &lt; 31), representing the number of different packages of coin for that input set. The following line contains exactly c positive integers, each separated by a single space, representing the value of each of the c packages in cents. The sum of these c integers is guaranteed not to exceed 10<sup>9</sup>. Note that the package values are not necessarily distinct, i.e., there may be multiple packages with the same value.</p>

### 출력

<p>For each set of packages, first output &ldquo;Set #i: &rdquo; where i is the input data set number, starting with 1. Follow this with a single positive integer, the smallest value that can&rsquo;t be represented as a sum of the values of a subset of the packages given. Note that a package value can be used at most once in a subset unless there are multiple packages with that value (if there are m occurrences of a package value, up to m occurrences of that value can be used in a subset). Leave a blank line after the output for each test case. Follow the format illustrated in Sample Output.</p>