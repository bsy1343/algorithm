# [Silver IV] Treating Fractions Irrationally - 15084

[문제 링크](https://www.acmicpc.net/problem/15084)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 52, 맞힌 사람: 37, 정답 비율: 34.906%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Anna has a big report to write concerning the voting habits of left-handed Democrats who own one or more kitchen blenders. She has a lot of statistics to report. For example, did you know that 56 out of every 87 left-handed Democrats who own one or more kitchen blenders can not name any of the current Supreme Court justices (yes, we were a bit shocked by this too.)</p>

<p>Now Anna is a bit irrational when it comes to fractions. She hates writing them as &ldquo;56/87&rdquo; but prefers the floating point version &ldquo;0.64367816091954022...&rdquo;</p>

<p>But this presents two problems. The first is that for most fractions, the floating point version will have to be truncated at some point. And this leads to the second problem: this truncated version is never equal to the original fraction. To minimize this second problem, Anna has decided that she will print the floating point version up to (but not including) the first 0 or 9 encountered, rounding down or up appropriately. So the above fraction would be written as &ldquo;0.64367816&rdquo;, while the fraction 55/87 (which is equal to 0.6321839080459...) would be written as &ldquo;0.632184&rdquo;. If the very first digit after the decimal point is 0 (as with the fraction 1/87) then Anna just writes &ldquo;0&rdquo;; if the first digit after the decimal point is 9 (as with the fraction 86/87) then Anna just writes &ldquo;1&rdquo;. Finally if a 0 or 9 never appears in the floating point version (as with the fraction 58/87) then Anna just throws out that data (so the world will never know, for example, that 58 out of every 87 left-handed Democrats who own one or more kitchen blenders make great fruit smoothies).</p>

### 입력

<p>Input consists of a single line containing two positive integers n d, where n &lt; d &le; 100000.</p>

### 출력

<p>Display Anna&rsquo;s truncated version of the fraction n/d. If the floating point version of n/d does not contain a 0 or 9, display the phrase throw out.</p>