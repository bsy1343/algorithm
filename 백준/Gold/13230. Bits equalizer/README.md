# [Gold III] Bits equalizer - 13230

[문제 링크](https://www.acmicpc.net/problem/13230)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 195, 정답: 70, 맞힌 사람: 60, 정답 비율: 39.474%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>You are given two non&shy;empty strings S and T of equal lengths. S contains the characters &lsquo;0&rsquo;, &lsquo;1&rsquo; and &lsquo;?&rsquo;, whereas T contains &lsquo;0&rsquo; and &lsquo;1&rsquo; only. Your task is to convert S into T in minimum number of moves. In each move, you can do one of these changes:</p>

<ol>
	<li>change a &lsquo;0&rsquo;in S to &lsquo;1&rsquo;</li>
	<li>change a &lsquo;?&rsquo; in S to &lsquo;0&rsquo; or &lsquo;1&rsquo;</li>
	<li>swap any two characters in S</li>
</ol>

<p>As an example, suppose S = &ldquo;01??00&rdquo; and T = &ldquo;001010&rdquo;. We can transform S into T in 3 moves:</p>

<ul>
	<li>Initially S = &ldquo;01??00&rdquo;</li>
	<li>Move 1 &ndash; change S[2] to &lsquo;1&rsquo;. S becomes &ldquo;011?00&rdquo;</li>
	<li>Move 2 &ndash; change S[3] to &lsquo;0&rsquo;. S becomes &ldquo;011000&rdquo;</li>
	<li>Move 3 &ndash; swap S[1] with S[4]. S becomes &ldquo;001010&rdquo;</li>
	<li>S is now equal to T.</li>
</ul>

### 입력

<p>The first line of input is an integer C (C &le; 200) that indicates the number of test cases. Each case consists of two lines. The first line is the string S consisting of &lsquo;0&rsquo;, &lsquo;1&rsquo; and &lsquo;?&rsquo;. The second line is the string T consisting of &lsquo;0&rsquo; and &lsquo;1&rsquo;. The lengths of the strings won&rsquo;t be larger than 100.</p>

### 출력

<p>For each case, output the case number first followed by the minimum number of moves required to convert S into T. If the transition is impossible, output &minus;1 instead. Check the output example for the exact format.</p>