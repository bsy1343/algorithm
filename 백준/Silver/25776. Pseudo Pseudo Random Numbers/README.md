# [Silver IV] Pseudo Pseudo Random Numbers - 25776

[문제 링크](https://www.acmicpc.net/problem/25776)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 71, 맞힌 사람: 50, 정답 비율: 86.207%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>It turns out that if numbers were truly random, then each possible bit string (string of 0&rsquo;s and 1&rsquo;s) of length n would be equally likely. For example, <code>111111</code> would be just as likely as <code>010110</code> to occur. Unfortunately, most people believe that any time they see the same bit over and over again, that the process can&#39;t be truly random.</p>

<p>You are in charge of generating random bit strings of length n for use in a video game. However, the producer of the game has asked you to remove all possibilities where there are <u><strong>more than k</strong></u> 0&rsquo;s or 1&rsquo;s in a row. For example, if n = 4 and k = 2, then the 10 valid bit strings would be <code>0010</code>, <code>0011</code>, <code>0100</code>, <code>0101</code>, <code>0110</code>, <code>1001</code>, <code>1010</code>, <code>1011</code>, <code>1100</code>, and <code>1101</code> (the other 6 strings of 4 bits either have more than two 0&rsquo;s in a row or more than two 1&rsquo;s in a row, so they are not valid).</p>

<p>Given the values of n and k, determine the number of n bit strings that do not contain any runs of 0&rsquo;s or 1&rsquo;s of length greater than k.</p>

### 입력

<p>There is only one input line; it contains two integers: n (2 &le; n &le; 20), indicating the length of the bit string for the problem, and k (1 &le; k &le; n), indicating the maximal length of a run of 0&rsquo;s or 1&rsquo;s for the bit strings to be created.</p>

### 출력

<p>Print the number of valid bit strings of length n that do not contain any runs of the same bit of length greater than k.</p>