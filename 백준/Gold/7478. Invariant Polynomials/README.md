# [Gold II] Invariant Polynomials - 7478

[문제 링크](https://www.acmicpc.net/problem/7478)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

수학

### 문제 설명

<p>Consider a real polynomial P(x, y) in two variables. It is called invariant with respect to the rotation by an angle &alpha; if P(x cos &alpha; &minus; y sin &alpha;, x sin &alpha; + y cos &alpha;) = P(x, y) for all real x and y. Let&rsquo;s consider the real vector space formed by all polynomials in two variables of degree not greater than <em>d</em> invariant with respect to the rotation by 2&pi;/<em>n</em>. Your task is to calculate the dimension of this vector space.</p>

<p>You might find useful the following remark: Any polynomial of degree not greater than <em>d</em> can be uniquely written in form $P(x, y)=\displaystyle\sum_{i,j\ge 0\atop i+j\le d} a_{ij} x^iy^j$&nbsp;for some real coefficients a<sub>ij</sub>.</p>

### 입력

<p>The input file contains two positive integers <em>d</em> and <em>n</em> separated by one space. It is guaranteed that they are less than one thousand.</p>

### 출력

<p>Output a single integer <em>M</em> which is the dimension of the vector space described.</p>