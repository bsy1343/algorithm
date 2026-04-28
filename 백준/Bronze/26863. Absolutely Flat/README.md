# [Bronze III] Absolutely Flat - 26863

[문제 링크](https://www.acmicpc.net/problem/26863)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 502, 정답: 334, 맞힌 사람: 297, 정답 비율: 68.119%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Alice is a proud owner of a four-legged table, and she wants her table to be flat. Alice considers the table to be flat if its four legs have equal lengths. </p>

<p>Alice measured the table&#39;s current leg lengths and got $a_1, a_2, a_3$, and $a_4$. She also has a pad of length $b$. Alice can attach the pad to one of the legs, in which case the length of that leg will increase by $b$. She can also decide not to attach the pad, in which case the lengths of the legs will not change. Note that Alice has just a single pad, so she can neither apply it twice to the same leg nor apply it to two different legs.</p>

<p>Find out whether Alice can make her table flat.</p>

### 입력

<p>The input contains five positive integers $a_1, a_2, a_3, a_4$, and $b$, each on a separate line --- the lengths of the table&#39;s legs, and the length of the pad Alice has ($1 \le a_i, b \le 100$).</p>

### 출력

<p>Print $1$ if Alice can make her table flat, and $0$ otherwise.</p>

### 힌트

<p>In the first example test, the table is already flat, no pad is needed.</p>

<p>In the second example test, Alice can apply the pad to the third leg to make the table flat.</p>

<p>In the third and the fourth example tests, Alice can not make her table flat.</p>