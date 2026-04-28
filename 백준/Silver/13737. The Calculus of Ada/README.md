# [Silver I] The Calculus of Ada - 13737

[문제 링크](https://www.acmicpc.net/problem/13737)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 45, 맞힌 사람: 43, 정답 비율: 78.182%

### 분류

수학

### 문제 설명

<p>While mostly known for the programs she wrote for Charles Babbage&rsquo;s Analytic Engine, Augusta Ada KingNoel, Countess of Lovelace, described how the method of finite differences could be used to solve all types of problems involving number sequences and series. These techniques were implemented in Babbage&rsquo;s Difference Engine.</p>

<p>The algorithm: If we compute the difference between consecutive values in a numeric sequence, we will obtain a new sequence which is related to the derivative of the function implied by the original sequence. For sequences generated from first-order polynomials (linear functions) the successive differences will be a list of identical values, (i.e., a constant difference). For second-order polynomial functions the lists of differences will be a new sequence whose values change linearly. In turn, the list of differences of the values in this generated list (i.e., the finite differences of the list of differences) will be constant, and so on for higher-order polynomials. In general the n th row of differences will be constant for an n th degree polynomial.</p>

<p>For example, the first-order polynomial 3x+ 3 produces the sequence below at x = 0, 1, 2, 3, 4, and the first differences are shown on the following line.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13737/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-06%20%EC%98%A4%ED%9B%84%208.30.39.png" style="height:37px; width:203px" /></p>

<p>As another example, the polynomial x 2 , if evaluated at inputs x = 3, 5, 7, 9, produces the sequence below.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13737/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-06%20%EC%98%A4%ED%9B%84%208.30.49.png" style="height:54px; width:154px" /></p>

<p>Furthermore, if we consider a minimum-order polynomial that produces the original sequence, its value at the next regularly spaced input can be predicted by extending the difference table.</p>

### 입력

<p>The input consists of a value n, designating the number of polynomial evaluations given with 2 &le; n &le; 10, follwed by n values v<sub>1</sub>, v<sub>2</sub>, . . . v<sub>n</sub> which represent the value of a polynomial when evaluated at n regularly spaced input values. Each v<sub>j</sub> will satisfy &minus;2 000 000 &le; v<sub>j</sub> &le; 2 000 000 and at least two of those values will differ from each other.</p>

### 출력

<p>Output two integer values d and v<sub>n+1</sub>, separated by a space. The value d must be the degree of a minimaldegree polynomial producing the original sequence, and v<sub>n+1</sub> must be the value of the polynomial if evaluated at the next regularly spaced input value.</p>