# [Platinum V] Janitor Troubles - 16313

[문제 링크](https://www.acmicpc.net/problem/16313)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 177, 정답: 144, 맞힌 사람: 130, 정답 비율: 84.416%

### 분류

수학, 기하학

### 문제 설명

<p>While working a night shift at the university as a janitor, you absent-mindedly erase a blackboard covered with equations, only to realize afterwards that these were no ordinary equations! They were the notes of the venerable Professor E. I. N. Stein who earlier in the day solved the elusive maximum quadrilateral problem! Quick, you have to redo his work so no one noticed what happened.</p>

<p>The maximum quadrilateral problem is quite easy to state: given four side lengths s<sub>1</sub>, s<sub>2</sub>, s<sub>3</sub> and s<sub>4</sub>, find the maxiumum area of any quadrilateral that can be constructed using these lengths. A quadrilateral is a polygon with four vertices.</p>

### 입력

<p>The input consists of a single line with four positive integers, the four side lengths s<sub>1</sub>, s<sub>2</sub>, s<sub>3</sub>, and s<sub>4</sub>.</p>

<p>It is guaranteed that 2s<sub>i</sub> &lt; &Sigma;<sup>4</sup><sub>j=1</sub> s<sub>j</sub>, for all i, and that 1 &le; s<sub>i</sub> &le; 1000</p>

### 출력

<p>Output a single floating point number, the maximal area as described above. Your answer must be accurate to an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>