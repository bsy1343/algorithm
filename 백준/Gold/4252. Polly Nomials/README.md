# [Gold V] Polly Nomials - 4252

[문제 링크](https://www.acmicpc.net/problem/4252)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 15, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>The Avian Computation Mission of the International Ornithologists Union is dedicated to the study of intelligence in birds, and specifically the study of computational ability. One of the most promising projects so far is the &ldquo;Polly Nomial&rdquo; project on parrot intelligence, run by Dr. Albert B. Tross and his assistants, Clifford Swallow and Perry Keet. In the ACM, parrots are trained to carry out simple polynomial computations involving integers, variables, and simple arithmetic operators.</p>

<p>When shown a formula consisting of a polynomial with non-negative integer coefficients and one variable x, each parrot uses a special beak-operated PDA, or &ldquo;Parrot Digital Assistant,&rdquo; to tap out a sequence of operations for computing the polynomial. The PDA operates much like a calculator. It has keys marked with the following symbols: the digits from 0 through 9, the symbol &lsquo;x&rsquo;, and the operators &lsquo;+&rsquo;, &lsquo;&times;&rsquo;, and &lsquo;=&rsquo;. (The x key is internally associated with an integer constant by Al B. Tross for testing purposes, but the parrot sees only the &lsquo;x&rsquo;.)</p>

<p>For instance, if the parrot were presented with the polynomial</p>

<p>x<sup>3</sup> + x + 11</p>

<p>the parrot might tap the following sequence of symbols:</p>

<p>x, &times;, x, &times;, x, +, x, +, 1, 1, =</p>

<p>The PDA has no extra memory, so each &times; or + operation is applied to the previous contents of the display and whatever succeeding operand is entered. If the polynomial had been</p>

<p>x<sup>3</sup> + 2x<sup>2</sup> + 11</p>

<p>then the parrot would not have been able to &ldquo;save&rdquo; the value of x<sup>3</sup> while calculating the value of 2x<sup>2</sup>.</p>

<p>Instead, a different order of operations would be needed, for instance:</p>

<p>The cost of a calculation is the number of key presses. The cost of computing x<sup>3</sup> + x + 11 in the example above is 11 (four presses of the x key, two presses of &lsquo;&times;&rsquo;, two presses of &lsquo;+&rsquo;, two presses of the digit &lsquo;1&rsquo;, and the &lsquo;=&rsquo; key). It so happens that this is the minimal cost for this particular expression using the PDA.</p>

<p>You are to write a program that finds the least costly way for a parrot to compute a number of polynomial expressions. Because parrots are, after all, just bird-brains, they are intimidated by polynomials whose high-order coefficient is any value except 1, so this condition is always imposed.</p>

### 입력

<p>Input consists of a sequence of lines, each containing a polynomial and an x value. Each polynomial a<sub>n</sub>x<sup>n</sup>+a<sub>n&minus;1</sub>x<sup>n&minus;1</sup>+&middot; &middot; &middot;+a<sub>0</sub> is represented by its degree followed by the non-negative coefficients a<sub>n</sub>, . . . , a<sub>0</sub> of decreasing powers of x, where an is always 1. Degrees are between 1 and 100. The coefficients are followed on the same line by an integer value for the variable x, which is always either 1 or -1. The input is terminated by a single line containing the values 0 0.</p>

### 출력

<p>For each polynomial, print the polynomial number followed by the value of the polynomial at the given integer value x and the minimum cost of computing the polynomial; imitate the formatting in the sample output.</p>