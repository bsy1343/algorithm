# [Bronze III] Sir Bedavere’s Bogus Division Solutions - 9161

[문제 링크](https://www.acmicpc.net/problem/9161)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1024, 정답: 474, 맞힌 사람: 375, 정답 비율: 44.537%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>The wise Sir Bedavere often uses non-standard logic, yet achieves positive results. Well, it seems he has been at it again, this time with division. He has determined that canceling the common digit of a numerator and denominator produces the correct answer. Of course, Sir Bedavere only tried this on a small sample of three digit numbers. An example of what he did is shown in the following division problem (in which he canceled the common 6):</p>

<p>\( \frac {166}{664} = \frac {16}{64} \)<br />
If you divide this fraction, 6 of 16&rdquo;6&rdquo; and 6 of &ldquo;6&rdquo;64 are cancel out.</p>

<p>Your task is to find all three digit number combinations with the following property:</p>

<p>number combinations where removing the rightmost digit from the top number (numerator) and the identical leftmost digit from the bottom number (denominator) leaves the result of the calculation unchanged.</p>

<p>Omit all of the trivial cases &mdash; xxx/xxx = xx/xx (222/222 = 22/22). The solutions are to be shown in increasing order of the top number (the numerator).</p>

### 입력

<p>NONE! There is no input for this problem.</p>

### 출력

<p>Show the bogus division problems one to a line in the format shown below (which gives a sample merely to show the format) &mdash; single spaces separate the non-blank characters.</p>