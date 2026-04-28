# [Platinum V] Generalized Roman Numerals - 10389

[문제 링크](https://www.acmicpc.net/problem/10389)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 83, 정답: 19, 맞힌 사람: 16, 정답 비율: 28.571%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>The ancient Romans developed a terrible numbering system in which I, V, X, L and C stood for 1, 5, 10, 50 and 100, respectively. So XXXVII represents 37 (10+10+10+5+1+1). They typically wrote the numerals in non-increasing order. However, when a single Roman numeral is written before one that is larger, we subtract the smaller from the larger. So we can write IV and IX to represent 4 and 9 (subtracting 1), or XL and XC to represent 40 and 90 (subtracting 10). To represent 94, we would write XCIV.</p>

<p>VIC is generally not considered a traditional Roman numeral, but we can interpret this as another representation of 94: VI is 6, so VIC is 100-6. In general, if we have two expressions a and b representing values v(a) and v(b), then we say that v(ab) is v(a) + v(b) if v(a) &ge; v(b), and v(b) &minus; v(a) otherwise.</p>

<p>Unfortunately, this generalization introduces some ambiguity, since different orders of evaluation may result in different values. For example, consider IVX: IV is 4 and X is 10, so by that reasoning IVX is 6. However, I is 1 and VX is 5, so this suggests that IVX is actually 4. To remedy this ambiguity, we allow the addition of parentheses. The question arises: for a given string of Roman numeral characters, how many different values can be obtained using different placements of parentheses?</p>

### 입력

<p>Each test case consists of a single string containing only the characters I, V, X, L and C. The length of this string will be &le; 50. A line containing of a single 0 will terminate input.</p>

### 출력

<p>For each test case, output all possible distinct values that can be represented by the string via the addition of parentheses. Display these values in increasing order.</p>