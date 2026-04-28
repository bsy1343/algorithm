# [Gold IV] Death to Binary? - 6671

[문제 링크](https://www.acmicpc.net/problem/6671)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 27, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

수학

### 문제 설명

<p>The group of Absurd Calculation Maniacs has discovered a great new way how to count. Instead of using the ordinary decadic numbers, they use Fibonacci base numbers. Numbers in this base are expressed as sequences of zeros and ones similarly to the binary numbers, but the weights of bits (fits?) in the representation are not powers of two, but the elements of the Fibonacci progression (1, 2, 3, 5, 8,... - the progression is defined by F<sub>0</sub> = 1, F<sub>1</sub> = 2 and the recursive relation F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub> for n &gt;= 2).</p>

<p>For example 1101001<sub>Fib</sub> = F<sub>0</sub> + F<sub>3</sub> + F<sub>5</sub> + F<sub>6</sub> = 1 + 5 + 13 + 21 = 40.</p>

<p>You may observe that every integer can be expressed in this base, but not necessarily in a unique way - for example 40 can be also expressed as 10001001Fib. However, for any integer there is a unique representation that does not contain two adjacent digits 1 - we call this representation canonical. For example 10001001<sub>Fib</sub> is a canonical Fibonacci representation of 40.</p>

<p>To prove that this representation of numbers is superior to the others, ACM have decided to create a computer that will compute in Fibonacci base. Your task is to create a program that takes two numbers in Fibonacci base (not necessarily in the canonical representation) and adds them together.</p>

### 입력

<p>The input consists of several instances, each of them consisting of a single line. Each line of the input contains two numbers X and Y in Fibonacci base separated by a single space. Each of the numbers has at most 40 digits. The end of input is not marked in any special way.</p>

<p>&nbsp;</p>

### 출력

<p>The output for each instance should be formated as follows:</p>

<p>The first line contains the number X in the canonical representation, possibly padded from left by spaces. The second line starts with a plus sign followed by the number Y in the canonical representation, possibly padded from left by spaces. The third line starts by two spaces followed by a string of minus signs of the same length as the result of the addition. The fourth line starts by two spaces immediately followed by the canonical representation of X + Y. Both X and Y are padded from left by spaces so that the least significant digits of X, Y and X + Y are in the same column of the output. The output for each instance is followed by an empty line.</p>