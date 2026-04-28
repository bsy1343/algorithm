# [Bronze III] Hangover - 4655

[문제 링크](https://www.acmicpc.net/problem/4655)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1146, 정답: 662, 맞힌 사람: 570, 정답 비율: 61.688%

### 분류

수학, 구현

### 문제 설명

<p>How far can you make a stack of cards overhang a table? If you have one card, you can create a maximum overhang of half a card length. (We&#39;re assuming that the cards must be perpendicular to the table.) With two cards you can make the top card overhang the bottom one by half a card length, and the bottom one overhang the table by a third of a card length, for a total maximum overhang of 1/2&nbsp;<code>+</code>&nbsp;1/3&nbsp;<code>=</code>&nbsp;5/6 card lengths. In general you can make&nbsp;<em>n</em>&nbsp;cards overhang by 1/2&nbsp;<code>+</code>&nbsp;1/3&nbsp;<code>+</code>&nbsp;1/4&nbsp;<code>+</code>&nbsp;...&nbsp;<code>+</code>&nbsp;1/(<em>n</em>&nbsp;<code>+</code>&nbsp;1) card lengths, where the top card overhangs the second by 1/2, the second overhangs tha third by 1/3, the third overhangs the fourth by 1/4, etc., and the bottom card overhangs the table by 1/(<em>n</em>&nbsp;<code>+</code>&nbsp;1). This is illustrated in the figure below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/4655.%E2%80%85Hangover/67942f8b.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/4655.%E2%80%85Hangover/67942f8b.jpg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4655/1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:115px; width:424px" /></p>

### 입력

<p>The input consists of one or more test cases, followed by a line containing the number 0.00 that signals the end of the input. Each test case is a single line containing a positive floating-point number&nbsp;<em>c</em>&nbsp;whose value is at least 0.01 and at most 5.20;&nbsp;<em>c</em>&nbsp;will contain exactly three digits.</p>

### 출력

<p>For each test case, output the minimum number of cards necessary to achieve an overhang of at least&nbsp;<em>c</em>&nbsp;card lengths. Use the exact output format shown in the examples.</p>