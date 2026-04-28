# [Gold IV] Smith Numbers - 6333

[문제 링크](https://www.acmicpc.net/problem/6333)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 28, 맞힌 사람: 22, 정답 비율: 34.921%

### 분류

수학, 브루트포스 알고리즘, 정수론, 소수 판정

### 문제 설명

<p>While skimming his phone directory in 1982, Albert Wilansky, a mathematician of Lehigh University, noticed that the telephone number of his brother-in-law H. Smith had the following peculiar property: The sum of the digits of that number was equal to the sum of the digits of the prime factors of that number. Got it? Smith&rsquo;s telephone number was 493-7775. This number can be written as the product of its prime factors in the following way:</p>

<p>4937775 = 3 &middot; 5 &middot; 5 &middot; 65837</p>

<p>The sum of all digits of the telephone number is 4 + 9 + 3 + 7 + 7 + 7 + 5 = 42&dagger; , and the sum of the digits of its prime factors is equally 3+5+5+6+5+8+3+7 = 42. Wilansky was so amazed by his discovery that he named this kind of numbers after his brother-in-law: Smith numbers.</p>

<p>As this observation is also true for every prime number, Wilansky decided later that a (simple and unsophisticated) prime number is not worth being a Smith number, so he excluded them from the definition.</p>

<p>Wilansky published an article about Smith numbers in the Two Year College Mathematics Journal and was able to present a whole collection of different Smith numbers: For example, 9985 is a Smith number and so is 6036. However, Wilansky was not able to find a Smith number that was larger than the telephone number of his brother-in-law. It is your task to find Smith numbers that are larger than 4937775!</p>

### 입력

<p>The input file consists of a sequence of positive integers, one integer per line. Each integer will have at most 8 digits. The input is terminated by a line containing the number 0.</p>

### 출력

<p>For every number n &gt; 0 in the input, you are to compute the smallest Smith number which is larger than n, and print it on a line by itself. You can assume that such a number exists.</p>