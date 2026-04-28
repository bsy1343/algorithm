# [Gold III] Möbius Strip - 14186

[문제 링크](https://www.acmicpc.net/problem/14186)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 16, 맞힌 사람: 13, 정답 비율: 59.091%

### 분류

수학, 애드 혹

### 문제 설명

<p>A M&ouml;bius strip is obtained by taking a long strip of paper, twisting the paper through 180 degrees (or in other words, a half-twist) and then, joining one end back to the other end of the strip. A m&ouml;bius strip is shown in the figure to the right.</p>

<p>Instead of performing only one half-twist, we can also do zero, two, three, four, or more half-twists, and then tape the two ends. The resulting shape for three, four, and five half-twists respectively looks like below:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14186.%E2%80%85M%C3%B6bius%E2%80%85Strip/79e93135.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14186.%E2%80%85M%C3%B6bius%E2%80%85Strip/79e93135.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14186/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-29%20%EC%98%A4%ED%9B%84%201.17.09.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:65px; width:200px" /></p>

<p>The &ldquo;type&rdquo; of each strip is a non-negative integer denoting the number of its halftwists. Now given a strip, consider a line along the length of the strip that lies one-third of the width away from one edge of the strip. Next, cut the strip along that line using scissors as shown in the figure to the right. The cutting is continued until it reaches its starting point.</p>

<p>After we cut the strip as above, we get a number of strips each with some number of half-twists. For example, if we begin with a strip of type 2, we get two strips of type 2. We are allowed to cut again and again some of the resulting strips if we wish. Some of the resulting strips may be intertwined. In that case, we consider them as two distinct strips and can cut each of the strips independently and separately from the other strip(s).</p>

<p>Now here is the question: Given two sets of strips, can we cut some strips in the two sets such that the two sets of strips are transformed into two new sets of strips with equal number of strips of each type?</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains two space-separated integers a and b (1 &le; a, b &le; 100), as the number of strips in each of the two sets of strips. The following two lines contain a and b non-negative integers respectively, as the types of strips in each set. All the given strip types are at most 100. The input terminates with a line containing -1 -1 which should not be processed.</p>

### 출력

<p>For each test case, on a separate line, write either the character &ldquo;Y&rdquo; denoting that we can make the required transformation or the character &ldquo;N&rdquo; denoting otherwise.</p>