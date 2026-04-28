# [Platinum III] Searching for Strings - 19608

[문제 링크](https://www.acmicpc.net/problem/19608)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 811, 정답: 174, 맞힌 사람: 102, 정답 비율: 18.053%

### 분류

해싱, 라빈–카프, 문자열

### 문제 설명

<p>You&rsquo;re given a string N, called the needle, and a string H, called the haystack, both of which contain only lowercase letters &ldquo;a&rdquo;..&ldquo;z&rdquo;.</p>

<p>Write a program to count the number of distinct permutations of N which appear as a substring of H at least once. Note that N can have anywhere between 1 and |N|! distinct permutations in total &ndash; for example, the string &ldquo;aab&rdquo; has 3 distinct permutations (&ldquo;aab&rdquo;, &ldquo;aba&rdquo;, and &ldquo;baa&rdquo;).</p>

### 입력

<p>The first line contains N (1 &le; |N| &le; 200 000), the needle string.</p>

<p>The second line contains H (1 &le; |H| &le; 200 000), the haystack string.</p>

### 출력

<p>Output consists of one integer, the number of distinct permutations of N which appear as a substring of H.</p>