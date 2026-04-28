# [Silver III] tomo - 3189

[문제 링크](https://www.acmicpc.net/problem/3189)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 316, 정답: 112, 맞힌 사람: 91, 정답 비율: 37.143%

### 분류

수학, 구현, 정수론, 시뮬레이션, 비둘기집 원리

### 문제 설명

<p>The most advanced feature of Tom&rsquo;s old calculator is that when he multiplies two numbers and continues to press the button &#39;=&#39;, calculator continues to multiply the displayed number with the second of the two entered numbers. For example, if he multiplies 2 and 3, the number 6 will appear on the display. Further pressing the button &#39;=&#39; will result in numbers 18, 54, 162, etc. being displayed.&nbsp;</p>

<p>Tom is playing one interesting game &ndash; he wants to know how many times does he need to press the &#39;=&#39; button in order for some given number to appear as suffix of the number displayed on the calculator.&nbsp;</p>

<p>More precisely, Tom enters a number A, presses the button &#39;*&#39;, enters the number B and presses the button &#39;=&#39;. After that, product of the numbers A and B appears on the display. If the number C is not a suffix of the number displayed, Tom continues to press the button &#39;=&#39;, until a number whose suffix is C is displayed.&nbsp;</p>

<p>We say that number X is suffix of number Y if the decimal representation of number Y ends with the decimal representation of number X (for example, 46 is suffix of 1246, but 70 is not suffix of 4701). We assume that the calculator can handle numbers with arbitrary many digits and that it can display all those digits.&nbsp;</p>

<p>Write a program that will, given numbers A, B and C, calculate the total number of times the button &#39;=&#39; will be pressed.&nbsp;</p>

### 입력

<p>First and only line of input contains integers A, B and C, 0 &le; A, C &le; 100,000, 0 &le; B &le; 1000. There will be no leading zeros in the representation of number C.&nbsp;</p>

### 출력

<p>First and only line of output should contain the number of times the button &#39;=&#39; will be pressed, or the word &#39;NIKAD&#39; if there is no solution.&nbsp;</p>