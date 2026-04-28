# [Gold III] Bode Plot - 6370

[문제 링크](https://www.acmicpc.net/problem/6370)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 57, 맞힌 사람: 42, 정답 비율: 80.769%

### 분류

수학, 미적분학, 물리학

### 문제 설명

<p>Consider the AC circuit below. We will assume that the circuit is in steady-state. Thus, the voltage at nodes 1 and 2 are given by v<sub>1</sub> = V<sub>S</sub> cos &omega; t and v<sub>2</sub> = V<sub>R</sub> cos ( &omega;t + &theta; ) where VS is the voltage of the source, &omega; is the frequency (in radians per second), and t is time. V<sub>R</sub> is the magnitude of the voltage drop across the resistor, and &theta; is its phase.</p>

<p><img alt="" src="/upload/images/bode.png" style="height:193px; width:259px" /></p>

<p>You are to write a program to determine V<sub>R</sub> for different values of &omega;. You will need two laws of electricity to solve this problem. The first is Ohm&rsquo;s Law, which states v<sub>2</sub> = i R where i is the current in the circuit, oriented clockwise. The second is i = C d/dt (v<sub>1</sub> &ndash; v<sub>2</sub>) which relates the current to the voltage on either side of the capacitor. &ldquo;d/dt&rdquo; indicates the derivative with respect to t.</p>

### 입력

<p>The input will consist of one or more lines. The first line contains three real numbers and a non-negative integer. The real numbers are V<sub>S</sub>, R, and C, in that order. The integer, n, is the number of test cases. The following n lines of the input will have one real number per line. Each of these numbers is the angular frequency, &omega;.</p>

### 출력

<p>For each angular frequency in the input you are to output its corresponding V<sub>R</sub> on a single line. Each V<sub>R</sub> value output should be rounded to three digits after the decimal point.</p>