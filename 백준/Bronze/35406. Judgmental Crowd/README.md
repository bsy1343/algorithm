# [Bronze II] Judgmental Crowd - 35406

[문제 링크](https://www.acmicpc.net/problem/35406)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 84, 정답: 73, 맞힌 사람: 71, 정답 비율: 87.654%

### 분류

구현, 문자열

### 문제 설명

<p>After a glorious night of stand-up comedy, a comedian wants to measure their success. Not with surveys, not with likes, but with real crowd noises! Luckily, the mic captured all the reactions during the routine. The audio has been converted into a single string $S$ full of mashed-up sounds, such as applause, laughs, boos, etc.</p>

<p>The comedian uses a powerful tool for evaluating their show: the Instant Comedian Performance Calculator (ICPC). The ICPC is able to analyze $S$ and calculate the emotional score of the performance, which reflects how well the comedian did on stage.</p>

<p>The score is based on the occurrence of three specific substrings within the string $S$:</p>

<ul>
<li>each occurrence of “<code>ha</code>” increases the score by 1,</li>
<li>each occurrence of “<code>boooo</code>” <u>decreases</u> the score by 1, and</li>
<li>• each occurrence of “<code>bravo</code>” increases the score by 3.</li>
</ul>

<p>Any other substrings in $S$ (such as “<code>ahhh</code>”, “<code>woohoo</code>” or random gibberish) are ignored and do not affect the score. Your mission is to simulate the ICPC by calculating the emotional score of the performance.</p>

### 입력

<p>The input consists of a single line that contains a string $S$ ($1 \le |S| \le 1000$) made of lowercase letters, representing the sequence of crowd sounds picked up by the mic.</p>

### 출력

<p>Output a single line with an integer indicating the emotional score of the performance.</p>