# [Silver I] Time Warp - 10393

[문제 링크](https://www.acmicpc.net/problem/10393)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 16, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

수학, 구현, 기하학, 많은 조건 분기

### 문제 설명

<p>Tim Ang is a bit of a nerd. Check that &ndash; he&rsquo;s a HUGE nerd. When you ask him the time, he might say something like &ldquo;20 after 8&rdquo;, which seems normal, but other times he&rsquo;ll say things like &ldquo;90 after 8&rdquo; or &ldquo;126 til 4&rdquo;, which gives you pause. When you ask him about this, Tim say that &ldquo;20 after 8&rdquo; means the first time after 8 that the hour and minute hands of the clock make an angle of 20 degrees; &ldquo;126 til 4&rdquo; means the closest time before 4 that the hands make an angle of 126 degrees. As Tim walks away snickering, you resolve that you will write a program that will automatically convert Tim&rsquo;s times to our more normal, non-nerdy times. That&rsquo;ll show the little geek!</p>

### 입력

<p>The input file starts with an integer n indicating the number of test cases. Each test case consists of a single line of the form a after b or a til b, where a and b are integers satisfying 0 &le; a &lt; 360, and 1 &le; b &le; 12. All angles are measured starting at the hour hand and moving clockwise until reaching the minute hand (so, for example, at 9 o&rsquo;clock the hands make an angle of 90 degrees and at 3 o&rsquo;clock they make an angle of 270).</p>

### 출력

<p>For each test case, output the time in the format h:m:s, where h, m and s are the hour, minutes and seconds closest to the given angle and hour and 1 &le; h &le; 12. Always use two digits to represent the number of minutes and seconds.</p>