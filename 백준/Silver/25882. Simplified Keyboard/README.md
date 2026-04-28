# [Silver IV] Simplified Keyboard - 25882

[문제 링크](https://www.acmicpc.net/problem/25882)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 47, 맞힌 사람: 39, 정답 비율: 70.909%

### 분류

구현, 문자열

### 문제 설명

<p>Consider a simplified keyboard consisting of the 26 lowercase letters as illustrated below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25882.%E2%80%85Simplified%E2%80%85Keyboard/9b8d654d.png" data-original-src="https://upload.acmicpc.net/0ebf61c2-5efa-4446-bd24-643c024cc529/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 216px; height: 68px;" /></p>

<p>We define the neighbors of a key (letter) as all the letters adjacent to it. For example, the neighbors of &lsquo;a&rsquo; are {b, k, j}, neighbors of &lsquo;b&rsquo; are {a, c, l, k, j}, neighbors of &lsquo;n&rsquo; are {d, e, f, o, x, w, v, m}, and neighbors of &lsquo;z&rsquo; are {p, q, r, y}.</p>

<p>Given two words consisting of lowercase letters only, you are to determine which of the following three cases applies to them:</p>

<ol>
	<li>identical: this is when the two words are of the same length and they match letter-byletter. For example, &ldquo;cool&rdquo; and &ldquo;cool&rdquo; are identical, &ldquo;cool&rdquo; and &ldquo;col&rdquo; are not, and &ldquo;cool&rdquo; and &ldquo;colo&rdquo; are not</li>
	<li>similar: this is when the two words are of the same length, they are not identical words, and each corresponding two letters either match or are neighbors. For example, &ldquo;aaaaa&rdquo; and &ldquo;abkja&rdquo; are similar, &ldquo;moon&rdquo; and &ldquo;done&rdquo; are similar, &ldquo;knq&rdquo; and &ldquo;bxz&rdquo; are similar, but &ldquo;ab&rdquo; and &ldquo;cb&rdquo; are not (because of &lsquo;a&rsquo; in the first word and the corresponding &lsquo;c&rsquo; in the second word).</li>
	<li>different: this is when neither of the above two cases applies to the two words, i.e., they are not identical and they are not similar. For example, &ldquo;ab&rdquo; and &ldquo;abc&rdquo; are different, &ldquo;ab&rdquo; and &ldquo;az&rdquo; are different, and &ldquo;az&rdquo; and &ldquo;za&rdquo; are different.</li>
</ol>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of test cases to process. Each of the following n input lines represents a test case, consisting of two words separated by one space. Each word consists of lowercase letters only and will be between 1 and 20 letters, inclusive.</p>

### 출력

<p>For each test case, output one line. That line should contain the digit (number) 1, 2, or 3, to indicate which of the above three cases applies to the two input words.</p>